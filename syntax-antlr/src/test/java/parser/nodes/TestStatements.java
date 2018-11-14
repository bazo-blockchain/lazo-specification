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

    }

    @Test
    public void testEmitStatement() {

    }

    @Test
    public void testVariableDeclarationStatement() {

    }

    @Test
    public void testIfStatement() {

    }

    @Test
    public void testForEachStatement() {

    }

    @Test
    public void testForStatement() {

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

}
