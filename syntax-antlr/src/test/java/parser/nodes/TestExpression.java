package parser.nodes;

import bazolang.LazoParser;
import org.junit.Test;
import parser.NodeUtil;
import parser.ParserUtil;

public class TestExpression {

    @Test
    public void testPostfixIncrement(){
        var expression = getExpression("x.y++");

        NodeUtil.assertExpression(getSubExpression(expression, 0), "x.y");
        NodeUtil.assertTerminalNode(expression.getChild(1), "++");
    }

    @Test
    public void testArrayIndexAccess(){
        var expression = getExpression("x.y[z--]");
        NodeUtil.assertExpression(getSubExpression(expression, 0), "x.y");
        NodeUtil.assertTerminalNode(expression.getChild(1), "++");
    }

    private LazoParser.ExpressionContext getExpression(String input){
        var parser = ParserUtil.getParserForInput(input);
        var expression = parser.expression();
        ParserUtil.assertNoErrors(parser);
        return expression;
    }

    private LazoParser.ExpressionContext getSubExpression(LazoParser.ExpressionContext exp, int index){
        return exp.getChild(LazoParser.ExpressionContext.class, index);
    }

}
