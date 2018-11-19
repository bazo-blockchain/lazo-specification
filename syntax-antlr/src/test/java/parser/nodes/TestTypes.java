package parser.nodes;

import bazolang.LazoParser;
import org.junit.Test;
import parser.NodeUtil;
import parser.ParserUtil;

import java.util.List;
import java.util.function.Function;

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
    public void testInterface() {
        NodeUtil.assertInterfaceDecl(getInterface("interface X {}\n"), "X");
    }

    @Test
    public void testEmptyEvent() {
        NodeUtil.assertEventDecl(getEvent("event X ()\n"), "X", 0);
    }

    @Test
    public void testStructField() {
        var fields = getStruct("struct X { int a\n }\n").structField();
        for (var field : fields) {
            NodeUtil.assertField(field, "int", "a");
        }
    }

    @Test
    public void testStructFields() {
        var fields = getStruct("struct X { int a\n bool b\n }\n").structField();
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

    private <R> R getDeclaration(String input, Function<LazoParser, R> func) {
        var parser = ParserUtil.getParserForInput(input);
        R result = func.apply(parser);
        ParserUtil.assertNoErrors(parser);
        return result;
    }

    private LazoParser.VariableDeclarationContext getType(String input) {
        return getDeclaration(input, (p) -> p.variableDeclaration());
    }

    private LazoParser.StructDeclarationContext getStruct(String input) {
        return getDeclaration(input, (p) -> p.structDeclaration());
    }

    private LazoParser.EnumDeclarationContext getEnum(String input) {
        return getDeclaration(input, (p) -> p.enumDeclaration());
    }

    private LazoParser.InterfaceDeclarationContext getInterface(String input) {
        return getDeclaration(input, (p) -> p.interfaceDeclaration());
    }

    private LazoParser.EventDeclarationContext getEvent(String input) {
        return getDeclaration(input, (p) -> p.eventDeclaration());
    }

    private List<LazoParser.ParameterContext> getFields(LazoParser.EventDeclarationContext eventDeclNode) {
        return eventDeclNode.paramList().parameter();
    }
}
