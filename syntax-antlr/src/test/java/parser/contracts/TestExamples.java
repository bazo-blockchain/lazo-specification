package parser.contracts;

import org.junit.Test;
import parser.ParserUtil;

import java.io.IOException;

public class TestExamples {

    @Test
    public void testOpenAuction() throws IOException {
        parseContract("OpenAuction.lazo");
    }

    @Test
    public void testBlindAuction() throws IOException {
        parseContract("BlindAuction.lazo");
    }

    @Test
    public void testBallot() throws IOException {
        parseContract("Ballot.lazo");
    }

    private void parseContract(String contractName) throws IOException {
        ParserUtil.getProgramFromFile("../examples/" + contractName, false);
    }
}
