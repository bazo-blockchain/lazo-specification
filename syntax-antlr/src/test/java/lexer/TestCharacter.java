package lexer;

import bazolang.BazoLangLexer;
import org.antlr.v4.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestCharacter {
    @Test
    public void TestChar() throws IOException {
        var tokens = LexerUtil.getTokensFromFile("lexer/characters.bl");
        LexerUtil.assertTotalTokens(tokens, 15);

        var lastToken = tokens.remove(tokens.size() - 1);

        for (int i = 0; i < tokens.size(); i += 2) {
            Assert.assertEquals(BazoLangLexer.CHARACTER, tokens.get(i).getType());
        }
        Assert.assertEquals(Token.EOF, lastToken.getType());
    }
}
