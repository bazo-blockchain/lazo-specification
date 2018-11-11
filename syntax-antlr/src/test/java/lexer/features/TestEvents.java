package lexer.features;

import lexer.LexerUtil;
import org.antlr.v4.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestEvents {
    @Test
    public void TestTokens() throws IOException {
        var tokens = LexerUtil.getTokensFromFile("lexer/events.bl");
        var expected = new String[]{
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
                "(",
                ")",
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
        LexerUtil.assertTokens(tokens, expected, true);
    }
}
