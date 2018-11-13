package lexer.lexemes;

import lexer.LexerUtil;
import org.junit.Test;

public class TestIdentifier {
    @Test
    public void testIdentifier() {
        var tokens = LexerUtil.getTokens("id test three3 under_score4 _5five");
        LexerUtil.assertTotalTokens(tokens, 5);
        LexerUtil.removeEOFToken(tokens);

        var ids = new String[]{
                "id",
                "test",
                "three3",
                "under_score4",
                "_5five"
        };

        for (int i = 0; i < tokens.size(); i++) {
            LexerUtil.assertIdentifier(tokens.get(i), ids[i]);
        }
    }

    @Test
    public void testDecIntSplit() {
        var tokens = LexerUtil.getTokens("123test");
        LexerUtil.assertTotalTokens(tokens, 2);
        LexerUtil.removeEOFToken(tokens);

        LexerUtil.assertInteger(tokens.get(0), 123);
        LexerUtil.assertIdentifier(tokens.get(1), "test");
    }

    @Test
    public void testHexSplit() {
        var tokens = LexerUtil.getTokens("0xafhello");
        LexerUtil.assertTotalTokens(tokens, 2);
        LexerUtil.removeEOFToken(tokens);

        LexerUtil.assertInteger(tokens.get(0), "0xaf");
        LexerUtil.assertIdentifier(tokens.get(1), "hello");
    }
}
