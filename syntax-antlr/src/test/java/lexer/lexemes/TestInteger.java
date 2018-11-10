package lexer.lexemes;

import lexer.LexerUtil;
import org.junit.Test;

public class TestInteger {
    @Test
    public void testDecimalDigits() {
        var tokens = LexerUtil.getTokens("0 123 456");
        LexerUtil.assertTotalTokens(tokens, 3);

        LexerUtil.assertInteger(tokens.get(0), 0);
        LexerUtil.assertInteger(tokens.get(1), 123);
        LexerUtil.assertInteger(tokens.get(2), 456);
        LexerUtil.assertEOF(tokens.get(3));
    }

    @Test
    public void testHexDigits() {
        var tokens = LexerUtil.getTokens("0x123 0xaf 0x123af");
        LexerUtil.assertTotalTokens(tokens, 3);

        LexerUtil.assertInteger(tokens.get(0), "0x123");
        LexerUtil.assertInteger(tokens.get(1), "0xaf");
        LexerUtil.assertInteger(tokens.get(2), "0x123af");
        LexerUtil.assertEOF(tokens.get(3));
    }
}
