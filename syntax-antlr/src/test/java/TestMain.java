import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestMain {

    @Test
    public void test() throws IOException {
        XLexer lex = new XLexer(CharStreams.fromString("version 1.2"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        XParser parser = new XParser(tokens);
        XParser.ProgramContext context = parser.program();

        Assert.assertEquals("1", context.versionDirective().INTEGER(0).getText());
        Assert.assertEquals("2", context.versionDirective().INTEGER(1).getText());
    }
}
