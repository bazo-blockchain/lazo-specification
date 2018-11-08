package lexer;

import org.antlr.v4.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestAnnotations {
    @Test
    public void TestTokens() throws IOException {
        var tokens = LexerUtil.getTokensFromFile("lexer/annotations.bl");
        LexerUtil.assertTotalTokens(tokens, 48);

        var lastToken = tokens.remove(tokens.size() - 1);

        var chars = new String[]{
                "version",
                "1",
                ".",
                "1",
                ";",
                "contract",
                "AnnotationContract",
                "{",
                "address",
                "owner",
                ";",
                "constructor",
                "(",
                "address",
                "owner",
                ")",
                "{",
                "this",
                ".",
                "owner",
                "=",
                "owner",
                ";",
                "}",
                "function",
                "bool",
                "isOwner",
                "()",
                "{",
                "return",
                "msg",
                ".",
                "sender",
                "==",
                "this",
                ".",
                "owner",
                ";",
                "}",
                "[",
                "Pre",
                "=",
                "isOwner",
                "]",
                "[",
                "Payable",
                "]",
                "}",
        };
        for (int i = 0; i < tokens.size(); i += 1) {
            LexerUtil.assertTokenContent(tokens.get(i), chars[i]);
        }
        Assert.assertEquals(Token.EOF, lastToken.getType());
    }

    // todo test now allowed chars
}
