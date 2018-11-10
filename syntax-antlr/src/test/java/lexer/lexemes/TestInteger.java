package lexer.lexemes;

import lexer.LexerUtil;
import org.junit.Test;

public class TestInteger {
    @Test
    public void testIntegers() {
        var tokens = LexerUtil.getTokens("123 456");
        LexerUtil.assertTotalTokens(tokens, 2);

        LexerUtil.assertInteger(tokens.get(0), 123);
        LexerUtil.assertInteger(tokens.get(1), 456);
        LexerUtil.assertEOF(tokens.get(2));
    }
}
