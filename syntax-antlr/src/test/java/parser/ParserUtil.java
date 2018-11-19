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
        return getProgram(getParserForFile(path, true));
    }

    public static LazoParser.ProgramContext getProgramFromFile(String path, boolean isInTestFiles) throws IOException {
        return getProgram(getParserForFile(path, isInTestFiles));
    }

    public static LazoParser getParserForInput(String input) {
        return getParser(CharStreams.fromString(input));
    }

    private static LazoParser getParserForFile(String path, boolean isInTestFiles) throws IOException {
        String filePath = isInTestFiles ? "src/test/resources/test_files/" + path : path;
        return getParser(
                CharStreams.fromFileName(
                        filePath,
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
