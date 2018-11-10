package parser;

import bazolang.LazoLexer;
import bazolang.LazoParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ParserUtil {

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

    private static LazoParser getParser(CharStream cs) {
        var lex = new LazoLexer(cs);
        var tokens = new CommonTokenStream(lex);
        return new LazoParser(tokens);
    }
}
