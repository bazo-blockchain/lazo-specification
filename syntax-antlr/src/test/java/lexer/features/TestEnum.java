package lexer.features;

import lexer.LexerUtil;
import org.junit.Test;

import java.io.IOException;

public class TestEnum {
    @Test
    public void TestTokens() throws IOException {
        var tokens = LexerUtil.getTokensFromFile("lexer/enum.bl");
        var expected = new String[]{
                "version",
                "1",
                ".",
                "1",
                ";",
                "contract",
                "EnumContract",
                "{",
                "enum",
                "TestEnum",
                "{",
                "TEST1",
                ",",
                "TEST2",
                "}",
                ";",
                "}",
        };

        LexerUtil.assertTokens(tokens, expected, true);
    }
}
