package lexer;

import bazolang.BazoLangLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.junit.Assert;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class LexerUtil {
    public static List<Token> getTokens(String input) {
        return getTokensFromStream(CharStreams.fromString(input));
    }

    public static List<Token> getTokensFromFile(String path) throws IOException {
        return getTokensFromStream(
                CharStreams.fromFileName(
                        "src/test/resources/test_files/" + path,
                        StandardCharsets.UTF_8
                ));
    }

    private static List<Token> getTokensFromStream(CharStream cs) {
        var lex = new BazoLangLexer(cs);
        var tokens = new CommonTokenStream(lex);
        tokens.fill();
        return tokens.getTokens();
    }

    /**
     * @param tokens   list of tokens
     * @param expected expected number of tokens without EOF
     */
    public static void assertTotalTokens(List<Token> tokens, int expected) {
        Assert.assertEquals(expected + 1, tokens.size());
    }

    public static void printTokens(List<Token> tokens) {
        tokens.forEach(System.out::println);
    }
}
