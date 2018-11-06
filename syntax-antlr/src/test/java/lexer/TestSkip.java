package lexer;

import bazolang.BazoLangLexer;
import org.antlr.v4.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class TestSkip {
    @Test
    public void testLineComments() {
        var tokens = LexerUtil.getTokens("// test\n // line2 \n");
        LexerUtil.assertTotalTokens(tokens, 0);
    }

    @Test
    public void testSkip() throws IOException {
        char c = '\0';
        var tokens = LexerUtil.getTokensFromFile("lexer/skip.bl");
        LexerUtil.assertTotalTokens(tokens, 2);

        var lastToken = tokens.remove(tokens.size() - 1);
        tokens.forEach(t -> Assert.assertEquals(BazoLangLexer.NL, t.getType()));
        Assert.assertEquals(Token.EOF, lastToken.getType());
    }
}
