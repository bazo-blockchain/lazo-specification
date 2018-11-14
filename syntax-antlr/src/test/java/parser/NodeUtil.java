package parser;

import bazolang.LazoParser;
import bazolang.LazoParser.VersionDirectiveContext;
import lexer.LexerUtil;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Assert;

import java.util.List;

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

    public static void assertVariableDecl(LazoParser.VariableDeclarationContext variableNode,
                                          String name, String type, String assignment) {
        LexerUtil.assertIdentifier(variableNode.IDENTIFIER().getSymbol(), name);
        Assert.assertEquals(type, variableNode.type().getChild(0).getText());

        if (assignment != null) {
            Assert.assertEquals(assignment, variableNode.assignment().getChild(1).getText());
        } else {
            Assert.assertNull(variableNode.assignment());
        }
    }

    public static void assertNewArrayCreation(LazoParser.ArrayCreationContext arrayCreationContext,
                                              String type, String expression, String... values) {
        Assert.assertEquals(type, arrayCreationContext.IDENTIFIER().getText());
        if (values.length == 0) {
            assertExpression(arrayCreationContext.expression(0), expression);
        } else {
            for (int i = 0; i < arrayCreationContext.expression().size(); i++) {
                assertExpression(arrayCreationContext.expression(i), values[i]);
            }
        }
    }

    public static void assertNewMapCreation(LazoParser.MapCreationContext mapCreationContext,
                                            String keyType, String valueType) {
        Assert.assertEquals(keyType, mapCreationContext.mapType().type(0).getText());
        Assert.assertEquals(valueType, mapCreationContext.mapType().type(1).getText());
    }

    public static void assertStructDecl(LazoParser.StructDeclarationContext structNode,
                                        String name, int totalFields) {
        LexerUtil.assertIdentifier(structNode.IDENTIFIER().getSymbol(), name);
        Assert.assertEquals(totalFields, structNode.structField().size());
    }

    public static void assertEventDecl(LazoParser.EventDeclarationContext eventNode,
                                       String name, int totalFields) {
        LexerUtil.assertIdentifier(eventNode.IDENTIFIER().getSymbol(), name);
        assertParameterListSize(eventNode.paramList(), totalFields);
    }

    public static void assertField(RuleContext node, String type, String name) {
        var fieldType = node.getChild(0).getText();
        var fieldName = node.getChild(1).getText();

        Assert.assertEquals(type, fieldType);
        Assert.assertEquals(name, fieldName);
    }


    public static void assertModifier(RuleContext node, String... modifiers) {
        for (int i = 0; i < modifiers.length; i++) {
            Assert.assertEquals(node.getChild(i).getText(), modifiers[i]);
        }
    }

    public static void assertEnumDecl(LazoParser.EnumDeclarationContext enumNode, String name, String... values) {
        LexerUtil.assertIdentifier(enumNode.IDENTIFIER(0).getSymbol(), name);

        for (int i = 0; i < values.length; i++) {
            LexerUtil.assertIdentifier(enumNode.IDENTIFIER(i + 1).getSymbol(), values[i]);
        }
    }

    public static void assertConstructorDecl(LazoParser.ConstructorDeclarationContext constructorNode,
                                             int totalParams, int totalStatements, int totalAnnotations) {
        assertParameterListSize(constructorNode.paramList(), totalParams);
        Assert.assertEquals(totalStatements, constructorNode.statementBlock().statement().size());
        Assert.assertEquals(totalAnnotations, constructorNode.annotation().size());
    }

    public static void assertFunctionHead(LazoParser.FunctionHeadContext functionHeadNode,
                                          String name, int totalParams, String... returnTypes) {
        LexerUtil.assertIdentifier(functionHeadNode.IDENTIFIER().getSymbol(), name);
        assertParameterListSize(functionHeadNode.paramList(), totalParams);
    }

    public static void assertParameterListSize(LazoParser.ParamListContext paramsList, int expected) {
        if (expected == 0) {
            Assert.assertNull(paramsList);
        } else {
            Assert.assertEquals(expected, paramsList.parameter().size());
        }
    }

    public static void assertType(LazoParser.TypeContext typeNode, String expectedType) {
        Assert.assertEquals(expectedType, typeNode.getText());
    }

    public static void assertExpression(LazoParser.ExpressionContext expressionNode, String expected) {
        Assert.assertEquals(expected, expressionNode.getText());
    }

    public static void assertStatementBlock(LazoParser.StatementBlockContext statementBlockNode, int numOfStatements) {
        // -2 because of '{' and '}'
        Assert.assertEquals(numOfStatements, statementBlockNode.children.size() - 2);
    }

    public static void assertIndexAccessExpression(LazoParser.ExpressionContext indexAccessNode,
                                                   String expectedDesignator, String expectedExpression) {
        assertExpression(indexAccessNode.getChild(LazoParser.ExpressionContext.class, 0), expectedDesignator);
        assertExpression(indexAccessNode.getChild(LazoParser.ExpressionContext.class, 1), expectedExpression);
    }

    public static void assertMemberAccessExpression(LazoParser.ExpressionContext memberAccessNode,
                                                    String expectedParent, String expectedMemberField) {
        assertExpression(memberAccessNode.getChild(LazoParser.ExpressionContext.class, 0), expectedParent);
        LexerUtil.assertIdentifier(memberAccessNode.IDENTIFIER().getSymbol(), expectedMemberField);
    }

    public static void assertCallExpression(LazoParser.ExpressionContext callNode,
                                            String func, String... args) {
        assertExpression(callNode.getChild(LazoParser.ExpressionContext.class, 0), func);

        var argList = callNode.getChild(LazoParser.ArgumentListContext.class, 0);
        if (args.length == 0) {
            Assert.assertNull(argList);
        } else {
            for (int i = 0; i < args.length; i++) {
                assertExpression(argList.getChild(LazoParser.ExpressionContext.class, i), args[i]);
            }
        }
    }

    public static void assertCastExpression(LazoParser.ExpressionContext castNode,
                                            String type, String expression) {
        assertType(castNode.getChild(LazoParser.TypeContext.class, 0), type);
        assertExpression(castNode.getChild(LazoParser.ExpressionContext.class, 0), expression);
    }

    public static void assertBinaryExpression(LazoParser.ExpressionContext binaryNode,
                                              String exp1, String exp2, String operator) {
        assertExpression(binaryNode.getChild(LazoParser.ExpressionContext.class, 0), exp1);
        assertExpression(binaryNode.getChild(LazoParser.ExpressionContext.class, 1), exp2);
        assertTerminalNode(binaryNode.getChild(1), operator);
    }

    public static void assertTernaryExpression(LazoParser.ExpressionContext ternaryNode,
                                               String condition, String trueExp, String falseExp) {
        assertExpression(ternaryNode.getChild(LazoParser.ExpressionContext.class, 0), condition);
        assertExpression(ternaryNode.getChild(LazoParser.ExpressionContext.class, 1), trueExp);
        assertExpression(ternaryNode.getChild(LazoParser.ExpressionContext.class, 2), falseExp);
    }

    public static void assertTerminalNode(ParseTree tree, String expected) {
        Assert.assertEquals(expected, tree.getText());
    }

    public static void assertReturnStatement(LazoParser.ReturnStatementContext node, String... values) {
        if (values != null) {
            for (int i = 1; i < values.length - 1; i += 2) {
                // i=1 as first is "return"
                // values.length -1 as last is "\n"
                // i+=2 to skip the "," between the values
                Assert.assertEquals(node.getChild(i).getText(), values[i - 1]);
            }
        } else {
            Assert.assertEquals(2, node.children.size());
        }
    }

    public static void assertForEachStatement(LazoParser.ForEachStatementContext node, String type, String name,
                                              String expression, int numOfStatements) {
        Assert.assertEquals(type, node.type().getText());
        Assert.assertEquals(name, node.IDENTIFIER().getText());
        assertExpression(node.expression(), expression);
        Assert.assertEquals(numOfStatements, node.statementBlock().getChildCount() - 2);
    }

    public static void assertForStatement(LazoParser.ForStatementContext node, String name,
                                          String range, int numOfStatements) {
        Assert.assertEquals(name, node.IDENTIFIER().getText());
        Assert.assertEquals(range, node.rangeStatement().getText());
        Assert.assertEquals(numOfStatements, node.statementBlock().getChildCount() - 2);

    }

    public static void assertRangeStatement(LazoParser.RangeStatementContext node, String from, String to, String by) {
        if (from == null && by == null) {
            Assert.assertEquals(to, node.getChild(1).getText());

        } else if (from != null && by == null) {
            Assert.assertEquals(from, node.getChild(0).getText());
            Assert.assertEquals(to, node.getChild(2).getText());
        } else if (from == null) {
            Assert.assertEquals(to, node.getChild(1).getText());
            Assert.assertEquals(by, node.getChild(3).getText());
        } else {
            Assert.assertEquals(from, node.getChild(0).getText());
            Assert.assertEquals(to, node.getChild(2).getText());
            Assert.assertEquals(by, node.getChild(4).getText());

        }
    }

    public static void assertMapForEachStatement(LazoParser.MapForEachStatementContext node, String keyType,
                                                 String keyName, String valueType, String valueName, String expression,
                                                 int numOfStatements) {

        if (keyType != null) {
            Assert.assertEquals(keyType, node.type(0).getText());
            Assert.assertEquals(valueType, node.type(1).getText());
        } else {
            Assert.assertEquals(valueType, node.type(0).getText());
        }

        if (keyName != null) {
            Assert.assertEquals(keyName, node.IDENTIFIER(0).getText());
            Assert.assertEquals(valueName, node.IDENTIFIER(1).getText());
        } else {
            Assert.assertEquals(valueName, node.IDENTIFIER(0).getText());
        }

        assertExpression(node.expression(), expression);

        Assert.assertEquals(numOfStatements, node.statementBlock().getChildCount() - 2);
    }

    public static void removeNewlines(List<? extends ParserRuleContext> nodes) {
        var it = nodes.iterator();
        while (it.hasNext()) {
            var item = it.next();
            if (item.getRuleIndex() == LazoParser.NLS) {
                it.remove();
            }
        }
    }
}
