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
        Assert.assertEquals(5, contractParts.size());

        // Variable Declaration
        var varX = contractParts.get(0).getChild(LazoParser.VariableDeclarationContext.class, 0);
        var varY = contractParts.get(1).getChild(LazoParser.VariableDeclarationContext.class, 0);
        NodeUtil.assertVariableDecl(varX, "x", "int", "3");
        NodeUtil.assertVariableDecl(varY, "b", "bool", null);

        // Struct Declaration
        var structA = contractParts.get(2).getChild(LazoParser.StructDeclarationContext.class, 0);
        NodeUtil.assertStructDecl(structA, "Person", 2);

        // todo test event and enum declarations

        // Constructor Declaration
        var constructor = contractParts.get(3).getChild(LazoParser.ConstructorDeclarationContext.class, 0);
        NodeUtil.assertConstructorDecl(constructor, 0, 0, 0);

        // Function Declaration
        var testFunc = contractParts.get(4).getChild(LazoParser.FunctionDeclarationContext.class, 0);
        Assert.assertEquals(0, testFunc.annotation().size());
        NodeUtil.assertFunctionHead(testFunc.functionHead(), "test", 0, "void");
        Assert.assertEquals(0, testFunc.statementBlock().statement().size());
    }
}
