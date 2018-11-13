package lexer.features;

import lexer.LexerUtil;
import org.junit.Test;

import java.io.IOException;

public class TestAnnotations {
    @Test
    public void TestTokens() throws IOException {
        var tokens = LexerUtil.getTokensFromFile("lexer/annotations.bl");
        var expected = new String[]{
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
                "(",
                ")",
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
        LexerUtil.assertTokens(tokens, expected, true);
    }
}
