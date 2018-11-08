package lexer;

import org.antlr.v4.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestInterfaces {
    @Test
    public void TestTokens() throws IOException {
        var tokens = LexerUtil.getTokensFromFile("lexer/interfaces.bl");
        LexerUtil.assertTotalTokens(tokens, 45);

        var lastToken = tokens.remove(tokens.size() - 1);

        var chars = new String[]{
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
        for (int i = 0; i < tokens.size(); i += 1) {
            LexerUtil.assertTokenContent(tokens.get(i), chars[i]);
        }
        Assert.assertEquals(Token.EOF, lastToken.getType());
    }

    // todo test now allowed chars
}
