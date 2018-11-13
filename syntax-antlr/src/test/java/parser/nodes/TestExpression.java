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

    private int[] x() {
        int[] x = new int[2];
        return x;
    }

}
