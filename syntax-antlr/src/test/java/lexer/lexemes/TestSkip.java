//package lexer;
//
//import bazolang.BazoLangLexer;
//import org.antlr.v4.runtime.Token;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.util.List;
//
//public class TestSkip {
//    @Test
//    public void testLineComments() {
//        var lexemes = LexerUtil.getTokens("// test\n // line2 \n");
//        LexerUtil.assertTotalTokens(lexemes, 0);
//    }
//
//    @Test
//    public void testSkip() throws IOException {
//        char c = '\0';
//        var lexemes = LexerUtil.getTokensFromFile("lexer/skip.bl");
//        LexerUtil.assertTotalTokens(lexemes, 2);
//
//        var lastToken = lexemes.remove(lexemes.size() - 1);
//        lexemes.forEach(t -> Assert.assertEquals(BazoLangLexer.NL, t.getType()));
//        Assert.assertEquals(Token.EOF, lastToken.getType());
//    }
//}
