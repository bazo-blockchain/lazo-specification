package parser.nodes;

import bazolang.LazoParser;
import org.junit.Test;
import parser.NodeUtil;
import parser.ParserUtil;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;

public class TestStatements {

    @Test
    public void testAssignmentStatement() {
        NodeUtil.assertAssignmentStatement(
                getAssignmentStatement("x.y = 5\n"),
                "x.y", "5");
    }

    @Test
    public void testExpressionStatement() {
        NodeUtil.assertShorthandAssignment(
                getExpressionStatement("x += 5\n").expression(),
                "x", "5", "+");

        NodeUtil.assertExpression(
                getExpressionStatement("x++\n").expression(),
                "x++");
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
        NodeUtil.assertCallExpression(getExpressionStatement("a()\n").expression(), "a");
    }

    @Test
    public void testCallStatementWithParams() {
        NodeUtil.assertCallExpression(
                getExpressionStatement("a('c', x = 45)\n").expression(),
                "a",
                "'c'", "x=45");
    }

    @Test
    public void testNestedCallStatement() {
        NodeUtil.assertCallExpression(getExpressionStatement("a.a()\n").expression(), "a.a");
    }

    @Test
    public void testEmitStatement() {
        NodeUtil.assertCallExpression(getEmitStatement("emit A()\n").expression(), "A");
    }

    @Test
    public void testEmitStatementWithParams() {
        NodeUtil.assertCallExpression(getEmitStatement("emit A(1, 2)\n").expression(), "A", "1", "2");
    }

    @Test
    public void testDeleteStatement() {
        NodeUtil.assertIndexAccessExpression(
                getDeleteStatement("delete map[\"one\"]\n").expression(),
                "map",
                "\"one\"");
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
    public void testForStatement() {
        var forStatement = getForStatement("for (a : to 5) {}\n");
        NodeUtil.assertForStatement(forStatement, "a", "to5", 0);
    }

    @Test
    public void testForStatementWithFrom() {
        var forStatement = getForStatement("for (a : 0 to 5 by 1) {}\n");
        NodeUtil.assertForStatement(forStatement, "a", "0to5by1", 0);
    }

    @Test
    public void testForStatementWithStatements() {
        var forStatement = getForStatement("for (a : 0 to 5 by 1) {int a = 5 \n}\n");
        NodeUtil.assertForStatement(forStatement, "a", "0to5by1", 1);
    }

    @Test
    public void testForStatementWithBreak() {
        var forStatement = getForStatement("for (a : to 5) { break \n}\n");
        NodeUtil.assertForStatement(forStatement, "a", "to5", 1);
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
    public void testRangeStatementToBy() {
        var rangeStatement = getRangeStatement("to 5 by 2\n");
        NodeUtil.assertRangeStatement(rangeStatement, null, "5", "2");
    }

    @Test
    public void testRangeStatementBy() {
        var rangeStatement = getRangeStatement("0 to 5 by 1\n");
        NodeUtil.assertRangeStatement(rangeStatement, "0", "5", "1");
    }

    @Test
    public void testForEachStatement() {
        var forEachStatement = getForEachStatement("foreach(int a : numbers) {}\n");
        NodeUtil.assertForEachStatement(forEachStatement, "int", "a", "numbers", 0);
    }

    @Test
    public void testForEachStatementWithContinue() {
        var forEachStatement = getForEachStatement("foreach(int a : numbers) { continue \n }\n");
        NodeUtil.assertForEachStatement(forEachStatement, "int", "a", "numbers", 1);
    }

    @Test
    public void testForEachStatementWithIndex() {
        var forEachStatement = getForEachStatement("foreach(index, int a : numbers) { continue \n }\n");
        NodeUtil.assertForEachStatement(
                forEachStatement, "int", "a", "numbers", 1, "index");
    }

    @Test
    public void testForEachStatementWithStatements() {
        var forEachStatement = getForEachStatement("foreach(int a : numbers) {int a = 5\n}\n");
        NodeUtil.assertForEachStatement(forEachStatement, "int", "a", "numbers", 1);
    }

    @Test
    public void testMapForEachStatement() {
        var mapForEachStatement = getMapForEachStatement("foreach(int k, int v : a) {}\n");
        NodeUtil.assertMapForEachStatement(
                mapForEachStatement, "int", "k", "int", "v", "a", 0);
    }

    @Test
    public void testMapForEachStatementWithStatements() {
        var mapForEachStatement = getMapForEachStatement("foreach(int k, int v : a) { int a = 5\n}\n");
        NodeUtil.assertMapForEachStatement(
                mapForEachStatement,
                "int", "k", "int", "v", "a", 1);
    }

    @Test
    public void testThrowStatement() throws IOException {
        var function = getFunction(getContractParts("parser/error_handling.lazo").get(1));

        NodeUtil.assertThrowStatement(
                function.statementBlock()
                        .getChild(LazoParser.StatementContext.class, 0)
                        .getChild(LazoParser.ThrowStatementContext.class, 0),
                "MyError", "100", "message=\"test\""
        );
    }

    @Test
    public void testSendStatement() throws IOException {
        var function = getFunction(getContractParts("parser/send_statement.lazo").get(0));

        var sendStatement = function.statementBlock()
                .getChild(LazoParser.StatementContext.class, 1)
                .getChild(LazoParser.SendStatementContext.class, 0);
        NodeUtil.assertCallExpression(sendStatement.expression(0), "person.transfer");
        NodeUtil.assertExpression(sendStatement.expression(1), "args");
    }

    private <R> R getStatementNode(String input, Function<LazoParser, R> func) {
        var parser = ParserUtil.getParserForInput(input);
        R result = func.apply(parser);
        ParserUtil.assertNoErrors(parser);
        return result;
    }

    private LazoParser.AssignmentStatementContext getAssignmentStatement(String input) {
        return getStatementNode(input, (p) -> p.assignmentStatement());
    }

    private LazoParser.ExpressionStatementContext getExpressionStatement(String input) {
        return getStatementNode(input, (p) -> p.expressionStatement());
    }

    private LazoParser.ReturnStatementContext getReturnStatement(String input) {
        return getStatementNode(input, (p) -> p.returnStatement());
    }

    private LazoParser.EmitStatementContext getEmitStatement(String input) {
        return getStatementNode(input, (p) -> p.emitStatement());
    }

    private LazoParser.DeleteStatementContext getDeleteStatement(String input) {
        return getStatementNode(input, (p) -> p.deleteStatement());
    }

    private LazoParser.IfStatementContext getIfStatement(String input) {
        return getStatementNode(input, (p) -> p.ifStatement());
    }

    private LazoParser.RangeStatementContext getRangeStatement(String input) {
        return getStatementNode(input, (p) -> p.rangeStatement());
    }

    private LazoParser.ForStatementContext getForStatement(String input) {
        return getStatementNode(input, (p) -> p.forStatement());
    }

    private LazoParser.ForEachStatementContext getForEachStatement(String input) {
        return getStatementNode(input, (p) -> p.forEachStatement());
    }

    private LazoParser.MapForEachStatementContext getMapForEachStatement(String input) {
        return getStatementNode(input, (p) -> p.mapForEachStatement());
    }

    private List<LazoParser.ContractPartContext> getContractParts(String path) throws IOException {
        return ParserUtil.getProgramFromFile(path)
                .contractDeclaration()
                .contractPart();
    }

    private LazoParser.FunctionDeclarationContext getFunction(LazoParser.ContractPartContext contractPart) {
        return contractPart.getChild(LazoParser.FunctionDeclarationContext.class, 0);
    }
}
