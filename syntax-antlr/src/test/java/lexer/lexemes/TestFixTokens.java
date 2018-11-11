package lexer.lexemes;

import bazolang.LazoLexer;
import lexer.LexerUtil;
import org.junit.Test;

public class TestFixTokens {
    @Test
    public void testParens() {
        var tokens = LexerUtil.getTokens("( ) ()");
        LexerUtil.assertTotalTokens(tokens, 4);

        LexerUtil.assertFixToken(tokens.get(0), LazoLexer.LPAREN, "(");
        LexerUtil.assertFixToken(tokens.get(1), LazoLexer.RPAREN, ")");
        LexerUtil.assertFixToken(tokens.get(2), LazoLexer.LPAREN, "(");
        LexerUtil.assertFixToken(tokens.get(3), LazoLexer.RPAREN, ")");
    }


    @Test
    public void testReservedKeywords() {
        var tokens = LexerUtil.getTokens("contract true continue");
        LexerUtil.assertTotalTokens(tokens, 3);

        LexerUtil.assertFixToken(tokens.get(0), LazoLexer.CONTRACT, "contract");
        LexerUtil.assertFixToken(tokens.get(1), LazoLexer.BOOL, "true");
        LexerUtil.assertFixToken(tokens.get(2), LazoLexer.CONTINUE, "continue");
    }
}
