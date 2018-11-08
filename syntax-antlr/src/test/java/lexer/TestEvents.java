package lexer;

import org.antlr.v4.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestEvents {
    @Test
    public void TestTokens() throws IOException {
        var tokens = LexerUtil.getTokensFromFile("lexer/events.bl");
        LexerUtil.assertTotalTokens(tokens, 28);

        var lastToken = tokens.remove(tokens.size() - 1);

        var chars = new String[]{
                "version",
                "1",
                ".",
                "1",
                ";",
                "contract",
                "EventContract",
                "{",
                "event",
                "TestEvent",
                "(",
                "string",
                "msg",
                ")",
                ";",
                "function",
                "void",
                "emitEvent",
                "()",
                "{",
                "emit",
                "TestEvent",
                "(",
                "\"This is a test!\"",
                ")",
                ";",
                "}",
                "}",
        };
        for (int i = 0; i < tokens.size(); i += 1) {
            LexerUtil.assertTokenContent(tokens.get(i), chars[i]);
        }
        Assert.assertEquals(Token.EOF, lastToken.getType());
    }

    // todo test now allowed chars
}
