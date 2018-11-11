package parser.nodes;

import org.junit.Test;
import parser.NodeUtil;
import parser.ParserUtil;

public class TestInterface {

    @Test
    public void testEmptyInterface() {
        var parser = ParserUtil.getParserForInput("interface EmptyInterface { \n } \n");
        NodeUtil.assertInterfaceDecl(parser.interfaceDeclaration(), "EmptyInterface");
        ParserUtil.assertNoErrors(parser);
    }

    @Test
    public void testInterfaceParts() {
        var code = "interface SimpleInterface { \n" +
                "function void test() \n" +
                "function void test2() \n" +
                "} \n";
        var parser = ParserUtil.getParserForInput(code);
        var interfaceNode = parser.interfaceDeclaration();
        NodeUtil.assertInterfaceDecl(interfaceNode, "SimpleInterface");
        NodeUtil.assertFunctionHead(interfaceNode.interfacePart(0).functionHead(),
                "test", 0, "void");
        NodeUtil.assertFunctionHead(interfaceNode.interfacePart(1).functionHead(),
                "test2", 0, "void");
        ParserUtil.assertNoErrors(parser);
    }

}
