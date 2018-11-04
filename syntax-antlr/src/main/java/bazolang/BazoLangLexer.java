// Generated from BazoLang.g4 by ANTLR 4.7.1

    package bazolang;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BazoLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, KEYWORD=3, BOOL=4, IDENTIFIER=5, HEX_DIGIT=6, INTEGER=7, 
		STRING=8, CHARACTER=9, CHARCODE=10, NL=11, WS=12, LINE_COMMENT=13, BLOCK_COMMENT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "KEYWORD", "BOOL", "IDENTIFIER", "HEX_DIGIT", "INTEGER", 
		"STRING", "CHARACTER", "CHARCODE", "NL", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'version'", "'.'", null, null, null, null, null, null, null, "'a'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "KEYWORD", "BOOL", "IDENTIFIER", "HEX_DIGIT", "INTEGER", 
		"STRING", "CHARACTER", "CHARCODE", "NL", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public BazoLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BazoLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\7\6A\n\6\f\6\16\6D\13\6\3\7"+
		"\3\7\3\7\3\7\6\7J\n\7\r\7\16\7K\3\b\6\bO\n\b\r\b\16\bP\3\t\3\t\7\tU\n"+
		"\t\f\t\16\tX\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\6\re\n"+
		"\r\r\r\16\rf\3\r\3\r\3\16\3\16\3\16\3\16\7\16o\n\16\f\16\16\16r\13\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\7\17z\n\17\f\17\16\17}\13\17\3\17\3\17"+
		"\3\17\3\17\3\17\3{\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\3\2\n\4\2C\\c|\5\2\62;C\\c|\4\2\62;ch\3\2\62;"+
		"\7\2CCEGJJQQTT\3\2\f\f\5\2\13\13\16\17\"\"\4\2\f\f\17\17\2\u008b\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5\'\3\2\2\2\7\61\3\2\2\2"+
		"\t<\3\2\2\2\13>\3\2\2\2\rE\3\2\2\2\17N\3\2\2\2\21R\3\2\2\2\23[\3\2\2\2"+
		"\25_\3\2\2\2\27a\3\2\2\2\31d\3\2\2\2\33j\3\2\2\2\35u\3\2\2\2\37 \7x\2"+
		"\2 !\7g\2\2!\"\7t\2\2\"#\7u\2\2#$\7k\2\2$%\7q\2\2%&\7p\2\2&\4\3\2\2\2"+
		"\'(\7\60\2\2(\6\3\2\2\2)\62\5\t\5\2*+\7x\2\2+,\7g\2\2,-\7t\2\2-.\7u\2"+
		"\2./\7k\2\2/\60\7q\2\2\60\62\7p\2\2\61)\3\2\2\2\61*\3\2\2\2\62\b\3\2\2"+
		"\2\63\64\7v\2\2\64\65\7t\2\2\65\66\7w\2\2\66=\7g\2\2\678\7h\2\289\7c\2"+
		"\29:\7n\2\2:;\7u\2\2;=\7g\2\2<\63\3\2\2\2<\67\3\2\2\2=\n\3\2\2\2>B\t\2"+
		"\2\2?A\t\3\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\f\3\2\2\2DB\3"+
		"\2\2\2EF\7\62\2\2FG\7z\2\2GI\3\2\2\2HJ\t\4\2\2IH\3\2\2\2JK\3\2\2\2KI\3"+
		"\2\2\2KL\3\2\2\2L\16\3\2\2\2MO\t\5\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2P"+
		"Q\3\2\2\2Q\20\3\2\2\2RV\7$\2\2SU\t\6\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2"+
		"VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7$\2\2Z\22\3\2\2\2[\\\7)\2\2\\]\5\25"+
		"\13\2]^\7)\2\2^\24\3\2\2\2_`\7c\2\2`\26\3\2\2\2ab\t\7\2\2b\30\3\2\2\2"+
		"ce\t\b\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\b\r\2\2"+
		"i\32\3\2\2\2jk\7\61\2\2kl\7\61\2\2lp\3\2\2\2mo\n\t\2\2nm\3\2\2\2or\3\2"+
		"\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\b\16\2\2t\34\3\2\2\2uv"+
		"\7\61\2\2vw\7,\2\2w{\3\2\2\2xz\13\2\2\2yx\3\2\2\2z}\3\2\2\2{|\3\2\2\2"+
		"{y\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7,\2\2\177\u0080\7\61\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\b\17\2\2\u0082\36\3\2\2\2\f\2\61<BKPVfp{\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}