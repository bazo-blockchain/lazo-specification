package lexer;

import org.antlr.v4.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestSimpleContract {
    @Test
    public void TestChar() throws IOException {
        var tokens = LexerUtil.getTokensFromFile("lexer/simple_contract.bl");
        LexerUtil.assertTotalTokens(tokens, 99);

        var lastToken = tokens.remove(tokens.size() - 1);

        var chars = new String[]{
                "version",
                "1",
                ".",
                "1",
                ";",
                "interface",
                "Simple",
                "{",
                "}",
                "contract",
                "SimpleContract",
                "is",
                "Simple",
                "{",
                "int",
                "a",
                "=",
                "1",
                ";",
                "bool",
                "b",
                "=",
                "false",
                ";",
                "enum",
                "TestEnum",
                "{",
                "TEST1",
                ",",
                "TEST2",
                "}",
                ";",
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
                "event",
                "TestEvent",
                "(",
                "int",
                "a",
                ",",
                "int",
                "b",
                ")",
                ";",
                "constructor",
                "(",
                "int",
                "a",
                ")",
                "{",
                "this",
                ".",
                "a",
                "=",
                "a",
                ";",
                "}",
                "function",
                "void",
                "test",
                "(",
                ")",
                "{",
                "int",
                "a",
                "=",
                "1",
                ";",
                "int",
                "b",
                "=",
                "2",
                ";",
                "return",
                "a",
                "+",
                "b",
                ";",
                "}",
                "function",
                "void",
                "test2",
                "(",
                ")",
                "{",
                "test",
                "(",
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
