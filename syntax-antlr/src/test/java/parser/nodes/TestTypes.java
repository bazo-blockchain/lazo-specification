package parser.nodes;

import org.junit.Test;
import parser.NodeUtil;
import parser.ParserUtil;

public class TestTypes {
    @Test
    public void testInteger() {
        var parser = ParserUtil.getParserForInput("int x = 5\n");
        NodeUtil.assertVariableDecl(parser.variableDeclaration(), "x", "int", "5");
        ParserUtil.assertNoErrors(parser);
    }

    // todo test other types from document

    // struct fields

    // read only variables

}
