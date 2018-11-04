package lexer;

import bazolang.BazoLangLexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.util.List;

public class LexerUtil {
    public static List<Token> getToken(String input) {
        BazoLangLexer lex = new BazoLangLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        tokens.fill();
        return tokens.getTokens();
    }
}
