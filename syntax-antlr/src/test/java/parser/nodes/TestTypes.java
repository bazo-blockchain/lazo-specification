package parser.nodes;

import bazolang.LazoParser;
import org.antlr.v4.runtime.RuleContext;
import org.junit.Test;
import parser.NodeUtil;
import parser.ParserUtil;

import java.util.List;

public class TestTypes {
    @Test
    public void testInteger() {
        NodeUtil.assertVariableDecl(getType("int x = 5\n"), "x", "int", "5");
    }

    @Test
    public void testIntegerHex() {
        NodeUtil.assertVariableDecl(getType("int x = 0x5\n"), "x", "int", "0x5");
    }

    @Test
    public void TestBoolean() {
        NodeUtil.assertVariableDecl(getType("bool x = true\n"), "x", "bool", "true");
    }

    @Test
    public void testCharacter() {
        NodeUtil.assertVariableDecl(getType("char x = 'c'\n"), "x", "char", "'c'");
    }

    @Test
    public void testString() {
        NodeUtil.assertVariableDecl(getType("String x = \"hello\"\n"), "x", "String", "\"hello\"");
    }

    @Test
    public void testReadonly() {
        NodeUtil.assertModifier(getType("readonly int x = 5\n"), "readonly");
    }

    @Test
    public void testEmptyStruct() {
        NodeUtil.assertStructDecl(getStruct("struct X {}\n"), "X", 0);
    }

    @Test
    public void testStructOneField() {
        NodeUtil.assertStructDecl(getStruct("struct X { int a\n }\n"), "X", 1);
    }

    @Test
    public void testStructMultipleFields() {
        NodeUtil.assertStructDecl(getStruct("struct X { int a\n bool b\n }\n"), "X", 2);
    }

    @Test
    public void testEnumSingle() {
        NodeUtil.assertEnumDecl(getEnum("enum X { TEST }\n"), "X", "TEST");
    }

    @Test
    public void testEnumMultiple() {
        NodeUtil.assertEnumDecl(getEnum("enum X { TEST1, TEST2 }\n"), "X", "TEST1", "TEST2");
    }

    @Test
    public void testMapDecl() {
        NodeUtil.assertVariableDecl(getType("Map<int, int> x\n"), "x", "Map<int,int>", null);
    }

    @Test
    public void testArrayDecl() {
        NodeUtil.assertVariableDecl(getType("int[] x\n"), "x", "int[]", null);
    }

    @Test
    public void testMapCreation() {
        NodeUtil.assertNewMapCreation(getNewMapCreation("new Map<int, int>()\n"), "int", "int");
    }

    @Test
    public void testArrayCreationSingle() {
        NodeUtil.assertNewArrayCreation(getNewArrayCreation("new int[5]\n"), "int", "5");
    }

    @Test
    public void testArrayCreationMultiple() {
        NodeUtil.assertNewArrayCreation(getNewArrayCreation("new int[]{ 1, 2, 3 }\n"), "int", null, "1", "2", "3");
    }

    @Test
    public void testInterface() {
        NodeUtil.assertInterfaceDecl(getInterface("interface X {}\n"), "X");
    }

    @Test
    public void testEmptyEvent() {
        NodeUtil.assertEventDecl(getEvent("event X ()\n"), "X", 0);
    }

    @Test
    public void testStructField() {
        var fields = getFields(getStruct("struct X { int a\n }\n"));
        for (var field : fields) {
            NodeUtil.assertField(field, "int", "a");
        }
    }

    @Test
    public void testStructFields() {
        var fields = getFields(getStruct("struct X { int a\n bool b\n }\n"));
        var types = new String[]{"int", "bool"};
        var names = new String[]{"a", "b"};
        for (int i = 0; i < fields.size(); i++) {
            NodeUtil.assertField(fields.get(i), types[i], names[i]);
        }
    }

    @Test
    public void testEventField() {
        var params = getFields(getEvent("event X (int a)\n"));
        for (var param : params) {
            NodeUtil.assertField(param, "int", "a");
        }
    }

    @Test
    public void testEventFields() {
        var params = getFields(getEvent("event X (int a, bool b)\n"));
        var types = new String[]{"int", "bool"};
        var names = new String[]{"a", "b"};
        for (int i = 0; i < params.size(); i++) {
            NodeUtil.assertField(params.get(i), types[i], names[i]);
        }
    }

    private LazoParser getParser(String input) {
        var parser = ParserUtil.getParserForInput(input);
        ParserUtil.assertNoErrors(parser);
        return parser;
    }

    private LazoParser.VariableDeclarationContext getType(String input) {
        return getParser(input).variableDeclaration();
    }

    private LazoParser.StructDeclarationContext getStruct(String input) {
        return getParser(input).structDeclaration();
    }

    private LazoParser.EnumDeclarationContext getEnum(String input) {
        return getParser(input).enumDeclaration();
    }

    private LazoParser.InterfaceDeclarationContext getInterface(String input) {
        return getParser(input).interfaceDeclaration();
    }

    private LazoParser.ArrayCreationContext getNewArrayCreation(String input) {
        return getParser(input).arrayCreation();
    }

    private LazoParser.MapCreationContext getNewMapCreation(String input) {
        return getParser(input).mapCreation();
    }

    private LazoParser.EventDeclarationContext getEvent(String input) {
        return getParser(input).eventDeclaration();
    }

    private List<LazoParser.StructFieldContext> getFields(LazoParser.StructDeclarationContext structDeclNode) {
        return structDeclNode.structField();
    }

    private List<LazoParser.ParameterContext> getFields(LazoParser.EventDeclarationContext eventDeclNode) {
        return eventDeclNode.paramList().parameter();
    }

}
