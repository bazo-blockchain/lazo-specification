package parser.nodes;

import bazolang.LazoParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import parser.NodeUtil;
import parser.ParserUtil;

public class TestExpression {

    @Test
    public void testPostfixIncrement() {
        var expression = getExpression("x.y++");
        NodeUtil.assertExpression(getSubExpression(expression, 0), "x.y");
        NodeUtil.assertTerminalNode(expression.getChild(1), "++");
    }

    @Test
    public void testIndexAccess() {
        NodeUtil.assertIndexAccessExpression(
                getExpression("x[2]"),
                "x",
                "2");

        NodeUtil.assertIndexAccessExpression(
                getExpression("x.y.z[z--]"),
                "x.y.z",
                "z--");

        NodeUtil.assertIndexAccessExpression(
                getExpression("test()[2]"),
                "test()",
                "2");

        NodeUtil.assertIndexAccessExpression(
                getExpression("test().x[2]"),
                "test().x",
                "2");

        // todo test more complex index access
    }

    @Test
    public void testMemberAccess() {
        NodeUtil.assertMemberAccessExpression(
                getExpression("x.y"),
                "x",
                "y");

        NodeUtil.assertMemberAccessExpression(
                getExpression("this.x"),
                "this",
                "x");

        NodeUtil.assertMemberAccessExpression(
                getExpression("this.x.y.z"),
                "this.x.y",
                "z");

        NodeUtil.assertMemberAccessExpression(
                getExpression("a[2].x"),
                "a[2]",
                "x");

        NodeUtil.assertMemberAccessExpression(
                getExpression("test().x"),
                "test()",
                "x");

        // todo add more complex cases
    }

    @Test
    public void testCall() {
        NodeUtil.assertCallExpression(
                getExpression("test()"),
                "test");

        NodeUtil.assertCallExpression(
                getExpression("x.test()"),
                "x.test");

        NodeUtil.assertCallExpression(
                getExpression("x[2].test()"),
                "x[2].test");

        NodeUtil.assertCallExpression(
                getExpression("test(1, x, x[2], func())"),
                "test",
                "1", "x", "x[2]", "func()");
    }

    @Test
    public void testNewCreation() {

        // new Person(12, s = "test")
        // new int[23]
        // new Map<int, Person>()
    }

    // todo test ( expression )

    @Test
    public void testPrefixIncrement() {
        var expression = getExpression("++x.y[2]");

        NodeUtil.assertTerminalNode(expression.getChild(0), "++");
        NodeUtil.assertExpression(getSubExpression(expression, 0), "x.y[2]");

        var rightAssoc = getExpression("---x");

        NodeUtil.assertTerminalNode(rightAssoc.getChild(0), "--");
        NodeUtil.assertExpression(getSubExpression(rightAssoc, 0), "-x");
    }

    @Test
    public void testUnaryMinus() {
        var expression = getExpression("-test()");

        NodeUtil.assertTerminalNode(expression.getChild(0), "-");
        NodeUtil.assertExpression(getSubExpression(expression, 0), "test()");
    }

    @Test
    public void testUnaryNot() {
        var logicalNot = getExpression("!test().x");

        NodeUtil.assertTerminalNode(logicalNot.getChild(0), "!");
        NodeUtil.assertExpression(getSubExpression(logicalNot, 0), "test().x");

        var bitwiseNot = getExpression("~x++");

        NodeUtil.assertTerminalNode(bitwiseNot.getChild(0), "~");
        NodeUtil.assertExpression(getSubExpression(bitwiseNot, 0), "x++");
    }

    @Test
    public void testCast() {
        NodeUtil.assertCastExpression(
                getExpression("(int) x\n"),
                "int",
                "x");

        NodeUtil.assertCastExpression(
                getExpression("(int) x++\n"),
                "int",
                "x++");

        NodeUtil.assertCastExpression(
                getExpression("(int) x.test()\n"),
                "int",
                "x.test()");
    }

    @Test
    public void testExponentiation() {
        var exp = getExpression("2**4**5");
        NodeUtil.assertBinaryExpression(exp, "2", "4**5", "**");
        NodeUtil.assertBinaryExpression(
                exp.getChild(LazoParser.ExpressionContext.class, 1), "4", "5", "**");
    }

    @Test
    public void testFactor() {
        var mul = getExpression("2 * -3 * 4");
        NodeUtil.assertBinaryExpression(mul, "2*-3", "4", "*");
        NodeUtil.assertBinaryExpression(getSubExpression(mul, 0), "2", "-3", "*");

        var mod = getExpression("2 ** 5 / 4 % 3");
        var div = getSubExpression(mod, 0);
        NodeUtil.assertBinaryExpression(mod, "2**5/4", "3", "%");
        NodeUtil.assertBinaryExpression(div, "2**5", "4", "/");
    }

    @Test
    public void testSummand() {
        NodeUtil.assertBinaryExpression(
                getExpression("2+3*4"),
                "2",
                "3*4",
                "+");
    }

    @Test
    public void testBitwiseShift() {
        NodeUtil.assertBinaryExpression(
                getExpression("2<<3>>4"),
                "2<<3",
                "4",
                ">>"
        );
    }

    @Test
    public void testRelationalComparison() {
        NodeUtil.assertBinaryExpression(
                getExpression("2 < 3 <= 5"),
                "2<3",
                "5",
                "<=");

        NodeUtil.assertBinaryExpression(
                getExpression("2 > 3 + 5"),
                "2",
                "3+5",
                ">");
    }

    @Test
    public void testEqualityComparison() {
        NodeUtil.assertBinaryExpression(
                getExpression("false == 5 > 3"),
                "false",
                "5>3",
                "==");

        NodeUtil.assertBinaryExpression(
                getExpression("x == y == z"),
                "x==y",
                "z",
                "==");
    }

    @Test
    public void testBitwiseOperators() {
        NodeUtil.assertBinaryExpression(
                getExpression("5 & 4 | 3"),
                "5&4",
                "3",
                "|");

        NodeUtil.assertBinaryExpression(
                getExpression("x ^ y + z"),
                "x",
                "y+z",
                "^");
    }

    @Test
    public void testLogicExpressions() {
        NodeUtil.assertBinaryExpression(
                getExpression("x && y || z"),
                "x&&y",
                "z",
                "||");

        NodeUtil.assertBinaryExpression(
                getExpression("x || y && z"),
                "x",
                "y&&z",
                "||");
    }

    @Test
    public void testTernaryExpression() {
        NodeUtil.assertTernaryExpression(
                getExpression("x == 4 ? x + 1 : x + 2"),
                "x==4",
                "x+1",
                "x+2");

        NodeUtil.assertTernaryExpression(
                getExpression("test() ? x > 4 : x ? y : x[2]"),
                "test()",
                "x>4",
                "x?y:x[2]");
    }

    @Test
    public void assertOperandExpression(){
        NodeUtil.assertExpression(getExpression("x"), "x");
    }

    private LazoParser.ExpressionContext getExpression(String input) {
        var parser = ParserUtil.getParserForInput(input);
        var expression = parser.expression();
        ParserUtil.assertNoErrors(parser);
        return expression;
    }

    private <T extends ParseTree> T getExpression(Class<? extends T> ctxType, String input) {
        var expression = getExpression(input);
        return expression.getChild(ctxType, 0);
    }

    private LazoParser.ExpressionContext getSubExpression(LazoParser.ExpressionContext exp, int index) {
        return exp.getChild(LazoParser.ExpressionContext.class, index);
    }
}
