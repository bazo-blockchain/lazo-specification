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
        var expType = LazoParser.IndexAccessContext.class;
        NodeUtil.assertIndexAccessExpression(
                getExpression(expType, "x[2]"),
                "x",
                "2");

        NodeUtil.assertIndexAccessExpression(
                getExpression(expType, "x.y.z[z--]"),
                "x.y.z",
                "z--");

        NodeUtil.assertIndexAccessExpression(
                getExpression(expType, "test()[2]"),
                "test()",
                "2");

        NodeUtil.assertIndexAccessExpression(
                getExpression(expType, "test().x[2]"),
                "test().x",
                "2");

        // todo test more complex index access
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
