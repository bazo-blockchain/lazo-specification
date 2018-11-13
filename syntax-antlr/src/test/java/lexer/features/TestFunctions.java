package lexer.features;

import lexer.LexerUtil;
import org.antlr.v4.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestFunctions {
    @Test
    public void TestTokens() throws IOException {
        var tokens = LexerUtil.getTokensFromFile("lexer/functions.bl");
        var expected = new String[]{
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

        LexerUtil.assertTokens(tokens, expected, true);
    }
}