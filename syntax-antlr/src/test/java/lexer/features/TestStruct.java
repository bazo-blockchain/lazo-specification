package lexer.features;

import lexer.LexerUtil;
import org.antlr.v4.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestStruct {
    @Test
    public void TestTokens() throws IOException {
        var tokens = LexerUtil.getTokensFromFile("lexer/struct.bl");
        var expected = new String[]{
                "version",
                "1",
                ".",
                "1",
                ";",
                "contract",
                "StructContract",
                "{",
                "struct",
                "TestStruct",
                "{",
                "int",
                "testA",
                ";",
                "bool",
                "testB",
                ";",
                "}",
                "function",
                "void",
                "testA",
                "(",
                ")",
                "{",
                "TestStruct",
                "a",
                "=",
                "new",
                "TestStruct",
                "(",
                "1",
                ",",
                "true",
                ")",
                ";",
                "TestStruct",
                "b",
                "=",
                "new",
                "TestStruct",
                "(",
                "1",
                ",",
                "testB",
                "=",
                "true",
                ")",
                ";",
                "TestStruct",
                "c",
                "=",
                "new",
                "TestStruct",
                "(",
                "testA",
                "=",
                "1",
                ",",
                "testB",
                "=",
                "true",
                ")",
                ";",
                "}",
                "}",
        };
        LexerUtil.assertTokens(tokens, expected, true);
    }
}
