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

    public static void assertFunctionDeclaration(LazoParser.FunctionDeclarationContext functionNode,
                                                 String name, int totalParams, int totalAnnotations,
                                                 int totalStatements, String... returnTypes) {
        assertFunctionHead(functionNode.functionHead(), name, totalParams, returnTypes);
        Assert.assertEquals(totalAnnotations, functionNode.annotation().size());
        assertStatementBlock(functionNode.statementBlock(), totalStatements);
    }

    public static void assertAnnotations(List<LazoParser.AnnotationContext> annotations, String[][] expected) {
        for (int i = 0; i < expected.length; i++) {
            assertAnnotation(annotations.get(i), expected[i][0], expected[i][1]);
        }
    }

    public static void assertAnnotation(LazoParser.AnnotationContext annotationNode,
                                        String identifier, String value) {
        LexerUtil.assertIdentifier(annotationNode.IDENTIFIER().getSymbol(), identifier);
        if (value == null) {
            Assert.assertNull(annotationNode.expression());
        } else {
            assertExpression(annotationNode.expression(), value);
        }
    }

    public static void assertFunctionHead(LazoParser.FunctionHeadContext functionHeadNode,
                                          String name, int totalParams, String... returnTypes) {
        LexerUtil.assertIdentifier(functionHeadNode.IDENTIFIER().getSymbol(), name);
        assertParameterListSize(functionHeadNode.paramList(), totalParams);

        for (int i = 0; i < returnTypes.length; i++) {
            assertType(functionHeadNode.type(i), returnTypes[i]);
        }
    }

    public static void assertParameterListSize(LazoParser.ParamListContext paramsList, int expected) {
        if (expected == 0) {
            Assert.assertNull(paramsList);
        } else {
            int total = paramsList.parameter().size() + paramsList.defaultParameter().size();
            Assert.assertEquals(expected, total);
        }
    }

    public static void assertParameters(LazoParser.ParamListContext paramList, String[][] params) {
        for (int i = 0; i < paramList.children.size(); i += 2) {
            int index = i / 2;
            var expectedParam = params[index];

            LazoParser.ParameterContext param = null;
            if (paramList.getChild(i) instanceof LazoParser.ParameterContext) {
                param = (LazoParser.ParameterContext) paramList.getChild(i);
            } else {
                var defaultParam = (LazoParser.DefaultParameterContext) paramList.getChild(i);
                param = defaultParam.parameter();
                assertExpression(defaultParam.assignment().expression(), expectedParam[2]);
            }
            assertType(param.type(), expectedParam[0]);
            LexerUtil.assertIdentifier(param.IDENTIFIER().getSymbol(), expectedParam[1]);
        }
    }

    public static void assertType(LazoParser.TypeContext typeNode, String expectedType) {
        Assert.assertEquals(expectedType, typeNode.getText());
    }

    public static void assertExpression(LazoParser.ExpressionContext expressionNode, String expected) {
        Assert.assertEquals(expected, expressionNode.getText());
    }

    public static void assertStatementBlock(LazoParser.StatementBlockContext statementBlockNode, int numOfStatements) {
        Assert.assertEquals(numOfStatements, statementBlockNode.statement().size());
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
        assertArgumentList(argList, args);
    }

    private static void assertArgumentList(LazoParser.ArgumentListContext argList,
                                           String... args){
        if (args.length == 0) {
            Assert.assertNull(argList);
        } else {
            int i = 0;
            for (int a = 0; a < argList.expression().size(); a++) {
                assertExpression(argList.getChild(LazoParser.ExpressionContext.class, a), args[a]);
                i++;
            }
            for (int n = 0; n < argList.namedArgument().size(); n++) {
                Assert.assertEquals(args[i], argList.namedArgument(n).getText());
                i++;
            }
            Assert.assertEquals(args.length, i);
        }
    }

    public static void assertStructCreation(LazoParser.StructCreationContext newStructNode,
                                            String type, String... args){
        LexerUtil.assertIdentifier(newStructNode.IDENTIFIER().getSymbol(), type);

        var argList = newStructNode.getChild(LazoParser.ArgumentListContext.class, 0);
        assertArgumentList(argList, args);
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

    public static void assertShorthandAssignment(LazoParser.ExpressionContext assignmentNode,
                                                 String target, String value, String operator) {
        assertExpression(assignmentNode.expression(0), target);
        assertExpression(assignmentNode.expression(1), value);
        Assert.assertEquals(operator, assignmentNode.getChild(1).getText());
    }

    public static void assertTerminalNode(ParseTree tree, String expected) {
        Assert.assertEquals(expected, tree.getText());
    }

    public static void assertAssignmentStatement(LazoParser.AssignmentStatementContext node,
                                                 String target, String value) {
        assertExpression(node.expression(), target);
        assertExpression(node.assignment().expression(), value);
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
        assertForEachStatement(node, type, name, expression, numOfStatements, null);
    }

    public static void assertForEachStatement(LazoParser.ForEachStatementContext node, String type, String name,
                                              String expression, int numOfStatements, String index) {
        Assert.assertEquals(type, node.type().getText());
        assertExpression(node.expression(), expression);
        Assert.assertEquals(numOfStatements, node.statementBlock().getChildCount() - 2);

        if (index == null) {
            Assert.assertEquals(1, node.IDENTIFIER().size());
            LexerUtil.assertIdentifier(node.IDENTIFIER(0).getSymbol(), name);
        } else {
            Assert.assertEquals(2, node.IDENTIFIER().size());
            LexerUtil.assertIdentifier(node.IDENTIFIER(0).getSymbol(), index);
            LexerUtil.assertIdentifier(node.IDENTIFIER(1).getSymbol(), name);
        }
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
