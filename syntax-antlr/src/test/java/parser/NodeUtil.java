package parser;

import bazolang.LazoParser;
import bazolang.LazoParser.VersionDirectiveContext;
import lexer.LexerUtil;
import org.junit.Assert;

public class NodeUtil {
    public static void assertVersion(VersionDirectiveContext versionNode, int major, int minor) {
        Assert.assertEquals(String.valueOf(major), versionNode.INTEGER(0).getText());
        Assert.assertEquals(String.valueOf(minor), versionNode.INTEGER(1).getText());
    }

    public static void assertContractDecl(LazoParser.ContractDeclarationContext contractNode, String... names) {
        for (int i = 0; i < contractNode.IDENTIFIER().size(); i++) {
            LexerUtil.assertIdentifier(contractNode.IDENTIFIER(i).getSymbol(), names[i]);
        }
    }

    public static void assertInterfaceDecl(LazoParser.InterfaceDeclarationContext interfaceNode, String name) {
        LexerUtil.assertIdentifier(interfaceNode.IDENTIFIER().getSymbol(), name);
    }

    public static void assertFunctionHead(LazoParser.FunctionHeadContext functionHeadNode,
                                          String name, int totalParams, String... returnTypes) {
        LexerUtil.assertIdentifier(functionHeadNode.IDENTIFIER().getSymbol(), name);

        if (totalParams == 0) {
            Assert.assertNull(functionHeadNode.paramList());
        } else {
            Assert.assertEquals(totalParams, functionHeadNode.paramList().children.size());
        }
    }
}
