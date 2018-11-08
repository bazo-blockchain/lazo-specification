package lexer;

import org.antlr.v4.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestEnum {
    @Test
    public void TestTokens() throws IOException {
        var tokens = LexerUtil.getTokensFromFile("lexer/enum.bl");
        LexerUtil.assertTotalTokens(tokens, 17);

        var lastToken = tokens.remove(tokens.size() - 1);

        var chars = new String[]{
            "version",
            "1",
            ".",
            "1",
            ";",
            "contract",
            "EnumContract",
            "{",
            "enum",
            "TestEnum",
            "{",
            "TEST1",
            ",",
            "TEST2",
            "}",
            ";",
            "}",
        };
        for (int i = 0; i < tokens.size(); i += 1) {
            LexerUtil.assertTokenContent(tokens.get(i), chars[i]);
        }
        Assert.assertEquals(Token.EOF, lastToken.getType());
    }

    // todo test now allowed chars
}
