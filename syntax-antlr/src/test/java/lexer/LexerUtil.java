package lexer;

import bazolang.LazoLexer;
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
        var lex = new LazoLexer(cs);
        var tokens = new CommonTokenStream(lex);
        tokens.fill();
        return tokens.getTokens();
    }

    public static Token removeEOFToken(List<Token> tokens) {
        var lastToken = tokens.remove(tokens.size() - 1);
        assertEOF(lastToken);
        return lastToken;
    }

    /**
     * @param tokens   list of lexemes
     * @param expected expected number of lexemes without EOF
     */
    public static void assertTotalTokens(List<Token> tokens, int expected) {
        Assert.assertEquals(expected, tokens.size() - 1);
    }

    public static void assertTokenContent(Token t, String c) {
        Assert.assertEquals("Token error" + t.toString(), c, t.getText());
    }

    public static void assertCharacter(Token t, String c) {
        Assert.assertEquals(LazoLexer.CHARACTER, t.getType());
        Assert.assertEquals(c, t.getText());
    }

    public static void assertString(Token t, String s) {
        Assert.assertEquals(LazoLexer.STRING, t.getType());
        Assert.assertEquals(s, t.getText());
    }

    public static void assertInteger(Token t, int i) {
        assertInteger(t, String.valueOf(i));
    }

    public static void assertInteger(Token t, String s) {
        Assert.assertEquals(LazoLexer.INTEGER, t.getType());
        Assert.assertEquals(s, t.getText());
    }

    public static void assertIdentifier(Token t, String identifier){
        Assert.assertEquals(LazoLexer.IDENTIFIER, t.getType());
        Assert.assertEquals(identifier, t.getText());
    }

    public static void assertEOF(Token t) {
        Assert.assertEquals("<EOF>", t.getText());
    }

    public static void printTokens(List<Token> tokens) {
        tokens.forEach(System.out::println);
    }
}
