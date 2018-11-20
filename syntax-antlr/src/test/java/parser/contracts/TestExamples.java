package parser.contracts;

import org.junit.Test;
import parser.ParserUtil;

import java.io.IOException;

public class TestExamples {

    @Test
    public void testOpenAuction() throws IOException {
        parseContract("../examples/OpenAuction.lazo");
    }

    private void parseContract(String path) throws IOException {
        ParserUtil.getProgramFromFile(path, false);
    }
}
