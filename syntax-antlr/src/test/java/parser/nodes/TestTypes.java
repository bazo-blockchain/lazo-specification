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

//    @Test
//    public void testMap() {
//        NodeUtil.assertVariableDecl(getType("int x = 5\n"), "x", "int", "5");
//    }
//
//    @Test
//    public void testArray() {
//        NodeUtil.assertVariableDecl(getType("int x = 5\n"), "x", "int", "5");
//    }
//
//    @Test
//    public void testInterface() {
//        NodeUtil.assertVariableDecl(getType("int x = 5\n"), "x", "int", "5");
//    }

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
}
