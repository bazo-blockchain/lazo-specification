package parser.nodes;

import bazolang.LazoParser;
import org.junit.Test;
import parser.NodeUtil;
import parser.ParserUtil;

import java.util.List;

public class TestStatements {

    @Test
    public void testEmptyReturnStatement() {
        NodeUtil.assertReturnStatement(getReturnStatement("return \n"), null);
    }

    @Test
    public void testReturnStatement() {
        NodeUtil.assertReturnStatement(getReturnStatement("return 1 \n"), "1");
    }

    @Test
    public void testComplexReturnStatement() {
        NodeUtil.assertReturnStatement(getReturnStatement("return a.b \n"), "a.b");
    }

    @Test
    public void testMultipleReturnStatement() {
        NodeUtil.assertReturnStatement(getReturnStatement("return 1, 2, 2 + 3 \n"), "1", "2", "2 + 3");
    }

    @Test
    public void testCallStatement() {
        NodeUtil.assertExpression(getCallStatement("a()\n").expression(), "a()");
    }

    @Test
    public void testNestedCallStatement() {
        NodeUtil.assertExpression(getCallStatement("a.a()\n").expression(), "a.a()");
    }

    @Test
    public void testEmitStatement() {
        NodeUtil.assertExpression(getEmitStatement("emit A()\n").callStatement().expression(), "A()");
    }

    @Test
    public void testEmitStatementWithParams() {
        NodeUtil.assertExpression(getEmitStatement("emit A(1, 2)\n").callStatement().expression(), "A(1,2)");
    }

    @Test
    public void testEmptyIfStatement() {
        var ifStatement = getIfStatement("if (a){}\n");
        NodeUtil.assertExpression(ifStatement.expression(0), "a");
        NodeUtil.assertStatementBlock(ifStatement.statementBlock(0), 0);
    }

    @Test
    public void testIfStatement() {
        var ifStatement = getIfStatement("if (a){ int a = 5\n int b = 6\n}\n");
        NodeUtil.assertExpression(ifStatement.expression(0), "a");
        NodeUtil.assertStatementBlock(ifStatement.statementBlock(0), 2);
    }

    @Test
    public void testEmptyIfElseStatement() {
        var ifStatement = getIfStatement("if (a){} else {}\n");
        NodeUtil.assertExpression(ifStatement.expression(0), "a");
        NodeUtil.assertStatementBlock(ifStatement.statementBlock(0), 0);
        NodeUtil.assertStatementBlock(ifStatement.statementBlock(1), 0);
    }

    @Test
    public void testIfElseStatement() {
        var ifStatement = getIfStatement("if (a){ int a = 5\n} else { int a = 4\n}\n");
        NodeUtil.assertExpression(ifStatement.expression(0), "a");
        NodeUtil.assertStatementBlock(ifStatement.statementBlock(0), 1);
        NodeUtil.assertStatementBlock(ifStatement.statementBlock(1), 1);
    }

    @Test
    public void testEmptyIfElseIfStatement() {
        var ifStatement = getIfStatement("if (a){} else if (b) {}\n");
        NodeUtil.assertExpression(ifStatement.expression(0), "a");
        NodeUtil.assertStatementBlock(ifStatement.statementBlock(0), 0);
        NodeUtil.assertStatementBlock(ifStatement.statementBlock(1), 0);
    }

    @Test
    public void testIfElseIfStatement() {
        var ifStatement = getIfStatement("if (a){ int a = 5\n} else if (b) {int a = 4\n}\n");
        NodeUtil.assertExpression(ifStatement.expression(0), "a");
        NodeUtil.assertStatementBlock(ifStatement.statementBlock(0), 1);
        NodeUtil.assertStatementBlock(ifStatement.statementBlock(1), 1);
    }

    @Test
    public void testEmptyIfElseIfElseStatement() {
        var ifStatement = getIfStatement("if (a){} else if (b) {} else {}\n");
        NodeUtil.assertExpression(ifStatement.expression(0), "a");
        NodeUtil.assertStatementBlock(ifStatement.statementBlock(0), 0);
        NodeUtil.assertStatementBlock(ifStatement.statementBlock(1), 0);
        NodeUtil.assertStatementBlock(ifStatement.statementBlock(2), 0);
    }

    @Test
    public void testIfElseIfElseStatement() {
        var ifStatement = getIfStatement("if (a){ int a = 5\n} else if (b) {int a = 4\n} else { }\n");
        NodeUtil.assertExpression(ifStatement.expression(0), "a");
        NodeUtil.assertStatementBlock(ifStatement.statementBlock(0), 1);
        NodeUtil.assertStatementBlock(ifStatement.statementBlock(1), 1);
        NodeUtil.assertStatementBlock(ifStatement.statementBlock(2), 0);
    }

    @Test
    public void testForEachStatement() {

    }

    @Test
    public void testForStatement() {

    }

    @Test
    public void testRangeStatement() {

    }

    @Test
    public void testMapForEachStatement() {

    }


    private LazoParser getParser(String input) {
        var parser = ParserUtil.getParserForInput(input);
        ParserUtil.assertNoErrors(parser);
        return parser;
    }

    private LazoParser.ReturnStatementContext getReturnStatement(String input) {
        return getParser(input).returnStatement();
    }

    private LazoParser.CallStatementContext getCallStatement(String input) {
        return getParser(input).callStatement();
    }

    private LazoParser.EmitStatementContext getEmitStatement(String input) {
        return getParser(input).emitStatement();
    }

    private LazoParser.IfStatementContext getIfStatement(String input) {
        return getParser(input).ifStatement();
    }
}
