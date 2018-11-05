package lexer;

import org.antlr.v4.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestSkip {
    @Test
    public void testLineComments() {
        List<Token> tokens = LexerUtil.getToken("// test\n // line2 \n");
        Assert.assertEquals(1, tokens.size());
    }
}
