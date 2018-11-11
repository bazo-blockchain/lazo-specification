package lexer.lexemes;

import lexer.LexerUtil;
import org.junit.Test;

import java.io.IOException;

public class TestCharacter {
    @Test
    public void testAllowedChars() throws IOException {
        var tokens = LexerUtil.getTokensFromFile("lexer/characters.bl");
        LexerUtil.assertTotalTokens(tokens, 13);
        LexerUtil.removeEOFToken(tokens);

        var chars = new String[]{"'a'", "'\u0B85'", "'0'", "'\\0'", "'\\\\'", "'\\n'", "'\\''"};
        for (int i = 0; i < tokens.size(); i += 2) {
            LexerUtil.assertCharacter(tokens.get(i), chars[i / 2]);
        }
    }
}
