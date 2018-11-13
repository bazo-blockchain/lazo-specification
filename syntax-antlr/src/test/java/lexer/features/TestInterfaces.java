package lexer.features;

import lexer.LexerUtil;
import org.junit.Test;

import java.io.IOException;

public class TestInterfaces {
    @Test
    public void TestTokens() throws IOException {
        var tokens = LexerUtil.getTokensFromFile("lexer/interfaces.bl");
        var expected = new String[]{
                "version",
                "1",
                ".",
                "1",
                ";",
                "interface",
                "Mortal",
                "{",
                "function",
                "void",
                "kill",
                "(",
                ")",
                "{",
                "}",
                ";",
                "}",
                "interface",
                "Testable",
                "{",
                "function",
                "bool",
                "test",
                "(",
                ")",
                "{",
                "}",
                ";",
                "function",
                "bool",
                "assert",
                "(",
                ")",
                "{",
                "}",
                ";",
                "}",
                "contract",
                "InterfaceContract",
                "is",
                "Mortal",
                ",",
                "Testable",
                "{",
                "}",

        };
        LexerUtil.assertTokens(tokens, expected, true);
    }
}
