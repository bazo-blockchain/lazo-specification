package lexer.features;

import lexer.LexerUtil;
import org.antlr.v4.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestNamedParams {
    @Test
    public void TestChar() throws IOException {
        var tokens = LexerUtil.getTokensFromFile("lexer/named_params.bl");
        LexerUtil.assertTotalTokens(tokens, 62);

        var lastToken = tokens.remove(tokens.size() - 1);

        var chars = new String[]{
                "version",
                "1",
                ".",
                "1",
                ";",
                "contract",
                "NamedParamContract",
                "{",
                "function",
                "int",
                "testNamedParams",
                "(",
                "int",
                "a",
                "=",
                "5",
                ",",
                "int",
                "b",
                "=",
                "3",
                ")",
                "{",
                "return",
                "a",
                "+",
                "b",
                ";",
                "}",
                "function",
                "void",
                "callTestNamedParamsWithoutNames",
                "(",
                ")",
                "{",
                "testNamedParams",
                "(",
                "1",
                ",",
                "1",
                ")",
                ";",
                "}",
                "function",
                "void",
                "callTestNamedParamsWithNames",
                "(",
                ")",
                "{",
                "testNamedParams",
                "(",
                "a",
                "=",
                "1",
                ",",
                "b",
                "=",
                "1",
                ")",
                ";",
                "}",
                "}",
        };
        for (int i = 0; i < tokens.size(); i += 1) {
            LexerUtil.assertTokenContent(tokens.get(i), chars[i]);
        }
        Assert.assertEquals(Token.EOF, lastToken.getType());
    }

    // todo test now allowed chars
}
