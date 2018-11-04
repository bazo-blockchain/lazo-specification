package ParserTests;
import bazolang.BazoLangLexer;
import bazolang.BazoLangParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Assert;
import org.junit.Test;

public class TestMain {

    @Test
    public void test() {
        BazoLangLexer lex = new BazoLangLexer(CharStreams.fromString("version 1.2"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        BazoLangParser parser = new BazoLangParser(tokens);
        BazoLangParser.ProgramContext context = parser.program();

        Assert.assertEquals("1", context.versionDirective().INTEGER(0).getText());
        Assert.assertEquals("2", context.versionDirective().INTEGER(1).getText());
    }
}
