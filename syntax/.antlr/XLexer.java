// Generated from /Users/rpfister/Documents/hsr/sem7/SA/sa-bazo/syntax/grammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VERSION_DIRECTIVE=1, THROW=2, EXCEPTION_CREATION=3, EXCEPTION_DECLARATION=4, 
		IDENTIFIER=5, ADDRESS=6, INTEGER=7, BOOL=8, STRING=9, CHARACTER=10, WS=11, 
		CHARCODE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VERSION_DIRECTIVE", "THROW", "EXCEPTION_CREATION", "EXCEPTION_DECLARATION", 
		"IDENTIFIER", "ADDRESS", "INTEGER", "BOOL", "STRING", "CHARACTER", "WS", 
		"CHARCODE"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VERSION_DIRECTIVE", "THROW", "EXCEPTION_CREATION", "EXCEPTION_DECLARATION", 
		"IDENTIFIER", "ADDRESS", "INTEGER", "BOOL", "STRING", "CHARACTER", "WS", 
		"CHARCODE"
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


	public XLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16r\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\7\6@\n\6\f\6\16\6C\13\6\3\7\3\7\3\7\3\7\6\7I"+
		"\n\7\r\7\16\7J\3\b\6\bN\n\b\r\b\16\bO\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t[\n\t\3\n\3\n\7\n_\n\n\f\n\16\nb\13\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\6\fk\n\f\r\f\16\fl\3\f\3\f\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\b\4\2C\\c|\5\2\62;C\\c|\4\2\62"+
		";ch\3\2\62;\7\2CCEGJJQQTT\5\2\13\f\17\17\"\"\2w\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2"+
		"\2\2\5\'\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13=\3\2\2\2\rD\3\2\2\2\17M\3"+
		"\2\2\2\21Z\3\2\2\2\23\\\3\2\2\2\25e\3\2\2\2\27j\3\2\2\2\31p\3\2\2\2\33"+
		"\34\7x\2\2\34\35\7g\2\2\35\36\7t\2\2\36\37\7u\2\2\37 \7k\2\2 !\7q\2\2"+
		"!\"\7p\2\2\"#\3\2\2\2#$\5\17\b\2$%\7\60\2\2%&\5\17\b\2&\4\3\2\2\2\'(\7"+
		"v\2\2()\7j\2\2)*\7t\2\2*+\7q\2\2+,\7y\2\2,-\3\2\2\2-.\5\7\4\2.\6\3\2\2"+
		"\2/\60\3\2\2\2\60\b\3\2\2\2\61\62\7g\2\2\62\63\7z\2\2\63\64\7e\2\2\64"+
		"\65\7g\2\2\65\66\7r\2\2\66\67\7v\2\2\678\7k\2\289\7q\2\29:\7p\2\2:;\3"+
		"\2\2\2;<\5\13\6\2<\n\3\2\2\2=A\t\2\2\2>@\t\3\2\2?>\3\2\2\2@C\3\2\2\2A"+
		"?\3\2\2\2AB\3\2\2\2B\f\3\2\2\2CA\3\2\2\2DE\7\62\2\2EF\7z\2\2FH\3\2\2\2"+
		"GI\t\4\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\16\3\2\2\2LN\t\5\2"+
		"\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\20\3\2\2\2QR\7v\2\2RS\7t\2"+
		"\2ST\7w\2\2T[\7g\2\2UV\7h\2\2VW\7c\2\2WX\7n\2\2XY\7u\2\2Y[\7g\2\2ZQ\3"+
		"\2\2\2ZU\3\2\2\2[\22\3\2\2\2\\`\7$\2\2]_\t\6\2\2^]\3\2\2\2_b\3\2\2\2`"+
		"^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7$\2\2d\24\3\2\2\2ef\7)\2\2"+
		"fg\5\31\r\2gh\7)\2\2h\26\3\2\2\2ik\t\7\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2"+
		"\2lm\3\2\2\2mn\3\2\2\2no\b\f\2\2o\30\3\2\2\2pq\3\2\2\2q\32\3\2\2\2\t\2"+
		"AJOZ`l\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}