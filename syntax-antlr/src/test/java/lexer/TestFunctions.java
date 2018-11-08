package lexer;

import org.antlr.v4.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestFunctions {
    @Test
    public void TestChar() throws IOException {
        var tokens = LexerUtil.getTokensFromFile("lexer/functions.bl");
        LexerUtil.assertTotalTokens(tokens, 13);

        var lastToken = tokens.remove(tokens.size() - 1);

        var chars = new String[]{"'a'", "'\u0B85'", "'0'", "'\\0'", "'\\\\'", "'\\n'", "'\\''"};
        for (int i = 0; i < tokens.size(); i += 2) {
            LexerUtil.assertCharacter(tokens.get(i), chars[i / 2]);
        }
        Assert.assertEquals(Token.EOF, lastToken.getType());
    }

    // todo test now allowed chars
}
