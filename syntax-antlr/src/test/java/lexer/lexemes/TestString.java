package lexer.lexemes;

import lexer.LexerUtil;
import org.junit.Test;

import java.io.IOException;

public class TestString {
    @Test
    public void testStrings() throws IOException {
        var tokens = LexerUtil.getTokensFromFile("lexer/strings.bl");
        LexerUtil.assertTotalTokens(tokens, 4);

        var strings = new String[]{
                "\"\"", // empty string ""
                "\"test\"",
                "\"new \\n line\"",
                "\"escaped \\\" apostrophe\""
        };

        for (int i = 0; i < tokens.size() - 1; i += 1) {
            LexerUtil.assertString(tokens.get(i), strings[i]);
        }
    }
}
