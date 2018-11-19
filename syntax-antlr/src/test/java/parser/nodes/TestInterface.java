package parser.nodes;

import org.junit.Test;
import parser.NodeUtil;
import parser.ParserUtil;

import java.io.IOException;

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
                "void test() \n" +
                "void test2() \n" +
                "} \n";
        var parser = ParserUtil.getParserForInput(code);
        var interfaceNode = parser.interfaceDeclaration();
        NodeUtil.assertInterfaceDecl(interfaceNode, "SimpleInterface");
        NodeUtil.assertFunctionSignature(interfaceNode.interfacePart(0).functionSignature(),
                "test", 0, null,"void");
        NodeUtil.assertFunctionSignature(interfaceNode.interfacePart(1).functionSignature(),
                "test2", 0, null, "void");
        ParserUtil.assertNoErrors(parser);
    }

    @Test
    public void testFunctionAnnotations() throws IOException {
        var testInterface = ParserUtil.getProgramFromFile("parser/interface.lazo").interfaceDeclaration(0);

        var annotations = new String[][]{
                {"Payable", null}
        };
        NodeUtil.assertFunctionSignature(
                testInterface.interfacePart(0).functionSignature(),
                "deposit", 0, annotations, "void"
        );

        NodeUtil.assertFunctionSignature(
                testInterface.interfacePart(1).functionSignature(),
                "withdraw", 0, null, "void"
        );
    }

}
