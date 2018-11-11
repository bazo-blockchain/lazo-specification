package parser.nodes;

import org.junit.Test;
import parser.NodeUtil;
import parser.ParserUtil;

import java.io.IOException;

public class TestContract {

    @Test
    public void testEmptyContract() throws IOException {
        var program = ParserUtil.getProgramFromFile("parser/empty_contract.lz");
        NodeUtil.assertVersion(program.versionDirective(), 1, 0);
        NodeUtil.assertContract(program.contractDeclaration(), "EmptyContract");
    }
}
