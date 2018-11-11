package parser.nodes;

import bazolang.LazoParser;
import org.junit.Assert;
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
        NodeUtil.assertInterfaceDecl(program.interfaceDeclaration(0), "AInterface");
        NodeUtil.assertInterfaceDecl(program.interfaceDeclaration(1), "BInterface");
        NodeUtil.assertContractDecl(program.contractDeclaration(), "SimpleContract", "AInterface", "BInterface");
    }

    @Test
    public void testContractParts() throws IOException {
        var contractParts = ParserUtil.getProgramFromFile("parser/contract_parts.lz")
                .contractDeclaration()
                .contractPart();
        NodeUtil.removeNewlines(contractParts);
        Assert.assertEquals(2, contractParts.size());

        var varX = contractParts.get(0).getChild(LazoParser.VariableDeclarationContext.class, 0);
        var varY = contractParts.get(1).getChild(LazoParser.VariableDeclarationContext.class, 0);
        NodeUtil.assertVariableDecl(varX, "x", "int");
        NodeUtil.assertVariableDecl(varY, "b", "bool");
    }
}
