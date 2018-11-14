package parser.nodes;

import bazolang.LazoParser;
import org.junit.Test;
import parser.NodeUtil;
import parser.ParserUtil;

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
    public void testEvent() {
        NodeUtil.assertEventDecl(getEvent("event X (int a, int b)\n"), "X", 2);
    }

    // todo test other types from document

    // struct fields

    // read only variables

    private LazoParser.VariableDeclarationContext getType(String input) {
        var parser = ParserUtil.getParserForInput(input);
        ParserUtil.assertNoErrors(parser);
        return parser.variableDeclaration();
    }

    private LazoParser.StructDeclarationContext getStruct(String input) {
        var parser = ParserUtil.getParserForInput(input);
        ParserUtil.assertNoErrors(parser);
        return parser.structDeclaration();
    }

    private LazoParser.EnumDeclarationContext getEnum(String input) {
        var parser = ParserUtil.getParserForInput(input);
        ParserUtil.assertNoErrors(parser);
        return parser.enumDeclaration();
    }

    private LazoParser.InterfaceDeclarationContext getInterface(String input) {
        var parser = ParserUtil.getParserForInput(input);
        ParserUtil.assertNoErrors(parser);
        return parser.interfaceDeclaration();
    }

    private LazoParser.ArrayCreationContext getNewArrayCreation(String input) {
        var parser = ParserUtil.getParserForInput(input);
        ParserUtil.assertNoErrors(parser);
        return parser.arrayCreation();
    }

    private LazoParser.MapCreationContext getNewMapCreation(String input) {
        var parser = ParserUtil.getParserForInput(input);
        ParserUtil.assertNoErrors(parser);
        return parser.mapCreation();
    }

    private LazoParser.EventDeclarationContext getEvent(String input) {
        var parser = ParserUtil.getParserForInput(input);
        ParserUtil.assertNoErrors(parser);
        return parser.eventDeclaration();
    }
}
