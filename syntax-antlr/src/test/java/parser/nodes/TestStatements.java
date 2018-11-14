package parser.nodes;

import bazolang.LazoParser;
import org.junit.Test;
import parser.NodeUtil;
import parser.ParserUtil;

public class TestStatements {

    @Test
    public void testAssignmentStatement() {
        NodeUtil.assertAssignmentStatement(
                getAssignmentStatement("x.y = 5\n"),
                "x.y", "5", null);

        NodeUtil.assertAssignmentStatement(
                getAssignmentStatement("x += 5\n"),
                "x", "5", "+");
    }

    @Test
    public void testEmptyReturnStatement() {
        NodeUtil.assertReturnStatement(getReturnStatement("return \n"));
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
        var forEachStatement = getForEachStatement("foreach(int a : numbers) {}\n");
        NodeUtil.assertForEachStatement(forEachStatement, "int", "a", "numbers", 0);
    }

    @Test
    public void testForEachStatementWithStatements() {
        var forEachStatement = getForEachStatement("foreach(int a : numbers) {int a = 5\n}\n");
        NodeUtil.assertForEachStatement(forEachStatement, "int", "a", "numbers", 1);
    }

    @Test
    public void testForStatement() {
        var forStatement = getForStatement("for (a : 0 to 5 by 1) {}\n");
        NodeUtil.assertForStatement(forStatement, "a", "0to5by1", 0);
    }

    @Test
    public void testForStatementWithStatements() {
        var forStatement = getForStatement("for (a : 0 to 5 by 1) {int a = 5 \n}\n");
        NodeUtil.assertForStatement(forStatement, "a", "0to5by1", 1);
    }

    @Test
    public void testRangeStatement() {
        var rangeStatement = getRangeStatement("0 to 5\n");
        NodeUtil.assertRangeStatement(rangeStatement, "0", "5", null);
    }

    @Test
    public void testRangeStatementOnlyTo() {
        var rangeStatement = getRangeStatement("to 5\n");
        NodeUtil.assertRangeStatement(rangeStatement, null, "5", null);
    }

    @Test
    public void testRangeStatementBy() {
        var rangeStatement = getRangeStatement("0 to 5 by 1\n");
        NodeUtil.assertRangeStatement(rangeStatement, "0", "5", "1");
    }

    @Test
    public void testMapForEachStatement() {
        var mapForEachStatement = getMapForEachStatement("foreach(int k, int v : a) {}\n");
        NodeUtil.assertMapForEachStatement(mapForEachStatement, "int", "k", "int", "v", "a", 0);
    }

    @Test
    public void testMapForEachStatementWithStatements() {
        var mapForEachStatement = getMapForEachStatement("foreach(int k, int v : a) { int a = 5\n}\n");
        NodeUtil.assertMapForEachStatement(mapForEachStatement, "int", "k", "int", "v", "a", 1);
    }

    @Test
    public void testMapForEachStatementKeyWithoutType() {
        var mapForEachStatement = getMapForEachStatement("foreach(k, int v : a) {}\n");
        NodeUtil.assertMapForEachStatement(mapForEachStatement, null, "k", "int", "v", "a", 0);
    }

    @Test
    public void testMapForEachStatementOnlyValue() {
        var mapForEachStatement = getMapForEachStatement("foreach(int v : a) {}\n");
        NodeUtil.assertMapForEachStatement(mapForEachStatement, null, null, "int", "v", "a", 0);
    }


    private LazoParser getParser(String input) {
        var parser = ParserUtil.getParserForInput(input);
        ParserUtil.assertNoErrors(parser);
        return parser;
    }

    private LazoParser.AssignmentStatementContext getAssignmentStatement(String input) {
        return getParser(input).assignmentStatement();
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

    private LazoParser.RangeStatementContext getRangeStatement(String input) {
        return getParser(input).rangeStatement();
    }

    private LazoParser.ForStatementContext getForStatement(String input) {
        return getParser(input).forStatement();
    }

    private LazoParser.ForEachStatementContext getForEachStatement(String input) {
        return getParser(input).forEachStatement();
    }

    private LazoParser.MapForEachStatementContext getMapForEachStatement(String input) {
        return getParser(input).mapForEachStatement();
    }
}
