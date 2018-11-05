package lexer;

import org.junit.Assert;
import org.junit.Test;

public class TestInteger {
    @Test
    public void testIntegers() {
        var tokens = LexerUtil.getTokens("123 456");
        LexerUtil.assertTotalTokens(tokens, 3);

        // todo create token asserter
        Assert.assertEquals("123", tokens.get(0).getText());
        Assert.assertEquals("456", tokens.get(1).getText());
        Assert.assertEquals("<EOF>", tokens.get(2).getText());
    }
}
