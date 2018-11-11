package parser.nodes;

import org.junit.Test;
import parser.NodeUtil;
import parser.ParserUtil;

import java.io.IOException;

public class TestContract {

    @Test
    public void testContractVersion() {
        var parser = ParserUtil.getParserForInput("version 1.2\n");
        NodeUtil.assertVersion(parser.versionDirective(), 1, 2);
        ParserUtil.assertNoErrors(parser);
    }

    @Test
    public void testEmptyContract() {
        var parser = ParserUtil.getParserForInput("contract EmptyContract{ }");
        NodeUtil.assertContractDecl(parser.contractDeclaration(), "EmptyContract");
        ParserUtil.assertNoErrors(parser);
    }

    @Test
    public void testSimpleContract() throws IOException {
        var program = ParserUtil.getProgramFromFile("parser/simple_contract.lz");
        NodeUtil.assertVersion(program.versionDirective(), 1, 0);
        NodeUtil.assertContractDecl(program.contractDeclaration(), "SimpleContract", "AInterface", "BInterface");
        NodeUtil.assertInterfaceDecl(program.interfaceDeclaration(0), "AInterface");
        NodeUtil.assertInterfaceDecl(program.interfaceDeclaration(1), "BInterface");
    }
}
