package lexer;

import org.antlr.v4.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestFunctions {
    @Test
    public void TestTokens() throws IOException {
        var tokens = LexerUtil.getTokensFromFile("lexer/functions.bl");
        LexerUtil.assertTotalTokens(tokens, 83);

        var lastToken = tokens.remove(tokens.size() - 1);

        var chars = new String[]{
                "version",
                "1",
                ".",
                "1",
                ";",
                "contract",
                "FunctionContract",
                "{",
                "function",
                "void",
                "emptyFunction",
                "(",
                ")",
                "{",
                "}",
                "internal",
                "function",
                "void",
                "internalFunction",
                "(",
                ")",
                "{",
                "}",
                "function",
                "int",
                "singleReturnValueFunction",
                "(",
                ")",
                "{",
                "}",
                "function",
                "int",
                "singleReturnValueWithParamsFunction",
                "(",
                "int",
                "a",
                ")",
                "{",
                "}",
                "function",
                "(",
                "int",
                ",",
                "int",
                ")",
                "twoReturnValuesFunction",
                "(",
                ")",
                "{",
                "}",
                "function",
                "(",
                "int",
                ",",
                "int",
                ")",
                "twoReturnValuesWithParamsFunction",
                "(",
                "int",
                "a",
                ",",
                "string",
                "b",
                ")",
                "{",
                "}",
                "function",
                "(",
                "int",
                ",",
                "string",
                ")",
                "twoDiffReturnValuesWithParamsFunction",
                "(",
                "int",
                "a",
                ",",
                "string",
                "b",
                ")",
                "{",
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
