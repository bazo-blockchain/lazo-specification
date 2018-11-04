package lexer;

import bazolang.BazoLangLexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

public class TestTokens {
    @Test
    public void test() {
        BazoLangLexer lex = new BazoLangLexer(CharStreams.fromString("version 1.2"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        tokens.fill();

        for(Token t : tokens.getTokens()){
            System.out.println(t);
        }
    }
}
