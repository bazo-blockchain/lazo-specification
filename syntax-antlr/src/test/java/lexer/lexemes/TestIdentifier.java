package lexer.lexemes;

import lexer.LexerUtil;
import org.junit.Test;

public class TestIdentifier {
    @Test
    public void testIdentifier() {
        var tokens = LexerUtil.getTokens("id test two2 under_score3");
        LexerUtil.assertTotalTokens(tokens, 4);
        LexerUtil.removeEOFToken(tokens);

        var ids = new String[]{
                "id",
                "test",
                "two2",
                "under_score3"
        };

        for (int i = 0; i < tokens.size(); i++) {
            LexerUtil.assertIdentifier(tokens.get(i), ids[i]);
        }
    }
}
