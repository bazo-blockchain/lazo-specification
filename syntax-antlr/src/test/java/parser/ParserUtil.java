package parser;

import bazolang.LazoLexer;
import bazolang.LazoParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Assert;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ParserUtil {

    public static LazoParser.ProgramContext getProgramFromFile(String path) throws IOException {
        return getProgram(getParserForFile(path));
    }

    public static LazoParser getParserForInput(String input) {
        return getParser(CharStreams.fromString(input));
    }

    public static LazoParser getParserForFile(String path) throws IOException {
        return getParser(
                CharStreams.fromFileName(
                        "src/test/resources/test_files/" + path,
                        StandardCharsets.UTF_8
                ));
    }

    private static LazoParser.ProgramContext getProgram(LazoParser parser) {
        var program = parser.program();
        assertNoErrors(parser);
        return program;
    }

    private static LazoParser getParser(CharStream cs) {
        var lex = new LazoLexer(cs);
        var tokens = new CommonTokenStream(lex);
        return new LazoParser(tokens);
    }

    public static void assertNoErrors(LazoParser p) {
        Assert.assertEquals(0, p.getNumberOfSyntaxErrors());
    }
}
