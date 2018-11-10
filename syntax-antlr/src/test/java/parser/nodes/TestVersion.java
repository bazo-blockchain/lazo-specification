package parser.nodes;

import org.junit.Test;
import parser.NodeUtil;
import parser.ParserUtil;

public class TestVersion {

    @Test
    public void testVersion() {
        var parser = ParserUtil.getParserForInput("version 1.2;");
        NodeUtil.assertVersion(parser.versionDirective(), 1, 2);
    }
}
