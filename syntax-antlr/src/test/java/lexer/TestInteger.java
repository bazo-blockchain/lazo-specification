package lexer;

import org.antlr.v4.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestInteger {
    @Test
    public void testIntegers() {
        List<Token> tokens = LexerUtil.getTokens("123 456");
        Assert.assertEquals(3, tokens.size()); // incl. EOF
        Assert.assertEquals("123", tokens.get(0).getText());
        Assert.assertEquals("456", tokens.get(1).getText());
        Assert.assertEquals("<EOF>", tokens.get(2).getText());
    }
}
