package parser.nodes;

import bazolang.LazoParser;
import org.junit.Test;
import parser.NodeUtil;
import parser.ParserUtil;

import java.util.List;

public class TestStatements {
    @Test
    public void testAssignmentStatement() {

    }

    @Test
    public void testReturnStatement() {

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

}
