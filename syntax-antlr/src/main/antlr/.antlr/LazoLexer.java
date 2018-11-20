// Generated from /Users/rpfister/Documents/hsr/sem7/SA/lazo-specification/syntax-antlr/src/main/antlr/Lazo.g4 by ANTLR 4.7.1

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
public class LazoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		BREAK=18, CONSTRUCTOR=19, CONTINUE=20, CONTRACT=21, EMIT=22, FUNCTION=23, 
		INTERFACE=24, INTERNAL=25, IS=26, MAP=27, READONLY=28, RETURN=29, STRUCT=30, 
		THROW=31, VERSION=32, BOOL=33, LPAREN=34, RPAREN=35, LBRACE=36, RBRACE=37, 
		LBRACK=38, RBRACK=39, SEMI=40, COMMA=41, DOT=42, PLUS=43, MIN=44, MUL=45, 
		DIV=46, MOD=47, EXP=48, LSHIFT=49, RSHIFT=50, AND=51, OR=52, NOT=53, BITWISE_AND=54, 
		BITWISE_OR=55, CARET=56, TILDE=57, EQ=58, NEQ=59, GT=60, GT_EQ=61, LT=62, 
		LT_EQ=63, IDENTIFIER=64, INTEGER=65, HEX_DIGIT_LIT=66, DEC_DIGIT_LIT=67, 
		STRING=68, CHARACTER=69, NLS=70, WHITE_SPACE=71, LINE_COMMENT=72, BLOCK_COMMENT=73;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"BREAK", "CONSTRUCTOR", "CONTINUE", "CONTRACT", "EMIT", "FUNCTION", "INTERFACE", 
		"INTERNAL", "IS", "MAP", "READONLY", "RETURN", "STRUCT", "THROW", "VERSION", 
		"BOOL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", 
		"COMMA", "DOT", "PLUS", "MIN", "MUL", "DIV", "MOD", "EXP", "LSHIFT", "RSHIFT", 
		"AND", "OR", "NOT", "BITWISE_AND", "BITWISE_OR", "CARET", "TILDE", "EQ", 
		"NEQ", "GT", "GT_EQ", "LT", "LT_EQ", "IDENTIFIER", "ALPHA_LETTER", "INTEGER", 
		"HEX_DIGIT_LIT", "HEX_DIGIT", "DEC_DIGIT_LIT", "DEC_DIGIT", "STRING", 
		"CHARACTER", "ESCAPED_CHAR", "UNICODE_CHAR", "NLS", "NL", "WHITE_SPACE", 
		"LINE_COMMENT", "BLOCK_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'error'", "'event'", "'enum'", "':'", "'if'", "'else if'", "'else'", 
		"'for'", "'foreach'", "'to'", "'by'", "'send'", "'='", "'++'", "'--'", 
		"'?'", "'new'", "'break'", "'constructor'", "'continue'", "'contract'", 
		"'emit'", "'function'", "'interface'", "'internal'", "'is'", "'Map'", 
		"'readonly'", "'return'", "'struct'", "'throw'", "'version'", null, "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'**'", "'<<'", "'>>'", "'&&'", "'||'", "'!'", "'&'", 
		"'|'", "'^'", null, "'=='", "'!='", "'>'", "'>='", "'<'", "'<='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "BREAK", "CONSTRUCTOR", "CONTINUE", 
		"CONTRACT", "EMIT", "FUNCTION", "INTERFACE", "INTERNAL", "IS", "MAP", 
		"READONLY", "RETURN", "STRUCT", "THROW", "VERSION", "BOOL", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"PLUS", "MIN", "MUL", "DIV", "MOD", "EXP", "LSHIFT", "RSHIFT", "AND", 
		"OR", "NOT", "BITWISE_AND", "BITWISE_OR", "CARET", "TILDE", "EQ", "NEQ", 
		"GT", "GT_EQ", "LT", "LT_EQ", "IDENTIFIER", "INTEGER", "HEX_DIGIT_LIT", 
		"DEC_DIGIT_LIT", "STRING", "CHARACTER", "NLS", "WHITE_SPACE", "LINE_COMMENT", 
		"BLOCK_COMMENT"
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


	public LazoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lazo.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u0210\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\5\"\u0164\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\38\38\39\39\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3>\3>\3>\3?\3?\3@\3@\3"+
		"@\3A\3A\5A\u01ad\nA\3A\3A\3A\7A\u01b2\nA\fA\16A\u01b5\13A\3B\3B\3C\3C"+
		"\5C\u01bb\nC\3D\3D\3D\3D\6D\u01c1\nD\rD\16D\u01c2\3E\3E\3F\6F\u01c8\n"+
		"F\rF\16F\u01c9\3G\3G\3H\3H\7H\u01d0\nH\fH\16H\u01d3\13H\3H\3H\3I\3I\3"+
		"I\5I\u01da\nI\3I\3I\3J\3J\3J\3K\3K\3L\6L\u01e4\nL\rL\16L\u01e5\3M\5M\u01e9"+
		"\nM\3N\6N\u01ec\nN\rN\16N\u01ed\3N\3N\3O\3O\3O\3O\7O\u01f6\nO\fO\16O\u01f9"+
		"\13O\3O\7O\u01fc\nO\fO\16O\u01ff\13O\3O\3O\3P\3P\3P\3P\7P\u0207\nP\fP"+
		"\16P\u020a\13P\3P\3P\3P\3P\3P\3\u0208\2Q\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"\2\u0085C\u0087D\u0089\2\u008bE\u008d\2\u008fF\u0091G\u0093\2\u0095\2"+
		"\u0097H\u0099\2\u009bI\u009dJ\u009fK\3\2\t\3\2\u0080\u0080\4\2C\\c|\5"+
		"\2\62;CHch\3\2\62;\7\2$$))\62\62^^pp\4\2\f\f\17\17\5\2\13\13\16\17\"\""+
		"\2\u0218\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0085\3"+
		"\2\2\2\2\u0087\3\2\2\2\2\u008b\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2"+
		"\2\u0097\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\3\u00a1"+
		"\3\2\2\2\5\u00a7\3\2\2\2\7\u00ad\3\2\2\2\t\u00b2\3\2\2\2\13\u00b4\3\2"+
		"\2\2\r\u00b7\3\2\2\2\17\u00bf\3\2\2\2\21\u00c4\3\2\2\2\23\u00c8\3\2\2"+
		"\2\25\u00d0\3\2\2\2\27\u00d3\3\2\2\2\31\u00d6\3\2\2\2\33\u00db\3\2\2\2"+
		"\35\u00dd\3\2\2\2\37\u00e0\3\2\2\2!\u00e3\3\2\2\2#\u00e5\3\2\2\2%\u00e9"+
		"\3\2\2\2\'\u00ef\3\2\2\2)\u00fb\3\2\2\2+\u0104\3\2\2\2-\u010d\3\2\2\2"+
		"/\u0112\3\2\2\2\61\u011b\3\2\2\2\63\u0125\3\2\2\2\65\u012e\3\2\2\2\67"+
		"\u0131\3\2\2\29\u0135\3\2\2\2;\u013e\3\2\2\2=\u0145\3\2\2\2?\u014c\3\2"+
		"\2\2A\u0152\3\2\2\2C\u0163\3\2\2\2E\u0165\3\2\2\2G\u0167\3\2\2\2I\u0169"+
		"\3\2\2\2K\u016b\3\2\2\2M\u016d\3\2\2\2O\u016f\3\2\2\2Q\u0171\3\2\2\2S"+
		"\u0173\3\2\2\2U\u0175\3\2\2\2W\u0177\3\2\2\2Y\u0179\3\2\2\2[\u017b\3\2"+
		"\2\2]\u017d\3\2\2\2_\u017f\3\2\2\2a\u0181\3\2\2\2c\u0184\3\2\2\2e\u0187"+
		"\3\2\2\2g\u018a\3\2\2\2i\u018d\3\2\2\2k\u0190\3\2\2\2m\u0192\3\2\2\2o"+
		"\u0194\3\2\2\2q\u0196\3\2\2\2s\u0198\3\2\2\2u\u019a\3\2\2\2w\u019d\3\2"+
		"\2\2y\u01a0\3\2\2\2{\u01a2\3\2\2\2}\u01a5\3\2\2\2\177\u01a7\3\2\2\2\u0081"+
		"\u01ac\3\2\2\2\u0083\u01b6\3\2\2\2\u0085\u01ba\3\2\2\2\u0087\u01bc\3\2"+
		"\2\2\u0089\u01c4\3\2\2\2\u008b\u01c7\3\2\2\2\u008d\u01cb\3\2\2\2\u008f"+
		"\u01cd\3\2\2\2\u0091\u01d6\3\2\2\2\u0093\u01dd\3\2\2\2\u0095\u01e0\3\2"+
		"\2\2\u0097\u01e3\3\2\2\2\u0099\u01e8\3\2\2\2\u009b\u01eb\3\2\2\2\u009d"+
		"\u01f1\3\2\2\2\u009f\u0202\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7t\2"+
		"\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7t\2\2\u00a6\4\3"+
		"\2\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7x\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\u00ab\7p\2\2\u00ab\u00ac\7v\2\2\u00ac\6\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		"\u00af\7p\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7o\2\2\u00b1\b\3\2\2\2\u00b2"+
		"\u00b3\7<\2\2\u00b3\n\3\2\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7h\2\2\u00b6"+
		"\f\3\2\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7u\2\2\u00ba"+
		"\u00bb\7g\2\2\u00bb\u00bc\7\"\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7h\2"+
		"\2\u00be\16\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2"+
		"\7u\2\2\u00c2\u00c3\7g\2\2\u00c3\20\3\2\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6"+
		"\7q\2\2\u00c6\u00c7\7t\2\2\u00c7\22\3\2\2\2\u00c8\u00c9\7h\2\2\u00c9\u00ca"+
		"\7q\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7c\2\2\u00cd"+
		"\u00ce\7e\2\2\u00ce\u00cf\7j\2\2\u00cf\24\3\2\2\2\u00d0\u00d1\7v\2\2\u00d1"+
		"\u00d2\7q\2\2\u00d2\26\3\2\2\2\u00d3\u00d4\7d\2\2\u00d4\u00d5\7{\2\2\u00d5"+
		"\30\3\2\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7p\2\2\u00d9"+
		"\u00da\7f\2\2\u00da\32\3\2\2\2\u00db\u00dc\7?\2\2\u00dc\34\3\2\2\2\u00dd"+
		"\u00de\7-\2\2\u00de\u00df\7-\2\2\u00df\36\3\2\2\2\u00e0\u00e1\7/\2\2\u00e1"+
		"\u00e2\7/\2\2\u00e2 \3\2\2\2\u00e3\u00e4\7A\2\2\u00e4\"\3\2\2\2\u00e5"+
		"\u00e6\7p\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7y\2\2\u00e8$\3\2\2\2\u00e9"+
		"\u00ea\7d\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7c\2\2"+
		"\u00ed\u00ee\7m\2\2\u00ee&\3\2\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7q\2"+
		"\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5"+
		"\7t\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7v\2\2\u00f8"+
		"\u00f9\7q\2\2\u00f9\u00fa\7t\2\2\u00fa(\3\2\2\2\u00fb\u00fc\7e\2\2\u00fc"+
		"\u00fd\7q\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7k\2\2"+
		"\u0100\u0101\7p\2\2\u0101\u0102\7w\2\2\u0102\u0103\7g\2\2\u0103*\3\2\2"+
		"\2\u0104\u0105\7e\2\2\u0105\u0106\7q\2\2\u0106\u0107\7p\2\2\u0107\u0108"+
		"\7v\2\2\u0108\u0109\7t\2\2\u0109\u010a\7c\2\2\u010a\u010b\7e\2\2\u010b"+
		"\u010c\7v\2\2\u010c,\3\2\2\2\u010d\u010e\7g\2\2\u010e\u010f\7o\2\2\u010f"+
		"\u0110\7k\2\2\u0110\u0111\7v\2\2\u0111.\3\2\2\2\u0112\u0113\7h\2\2\u0113"+
		"\u0114\7w\2\2\u0114\u0115\7p\2\2\u0115\u0116\7e\2\2\u0116\u0117\7v\2\2"+
		"\u0117\u0118\7k\2\2\u0118\u0119\7q\2\2\u0119\u011a\7p\2\2\u011a\60\3\2"+
		"\2\2\u011b\u011c\7k\2\2\u011c\u011d\7p\2\2\u011d\u011e\7v\2\2\u011e\u011f"+
		"\7g\2\2\u011f\u0120\7t\2\2\u0120\u0121\7h\2\2\u0121\u0122\7c\2\2\u0122"+
		"\u0123\7e\2\2\u0123\u0124\7g\2\2\u0124\62\3\2\2\2\u0125\u0126\7k\2\2\u0126"+
		"\u0127\7p\2\2\u0127\u0128\7v\2\2\u0128\u0129\7g\2\2\u0129\u012a\7t\2\2"+
		"\u012a\u012b\7p\2\2\u012b\u012c\7c\2\2\u012c\u012d\7n\2\2\u012d\64\3\2"+
		"\2\2\u012e\u012f\7k\2\2\u012f\u0130\7u\2\2\u0130\66\3\2\2\2\u0131\u0132"+
		"\7O\2\2\u0132\u0133\7c\2\2\u0133\u0134\7r\2\2\u01348\3\2\2\2\u0135\u0136"+
		"\7t\2\2\u0136\u0137\7g\2\2\u0137\u0138\7c\2\2\u0138\u0139\7f\2\2\u0139"+
		"\u013a\7q\2\2\u013a\u013b\7p\2\2\u013b\u013c\7n\2\2\u013c\u013d\7{\2\2"+
		"\u013d:\3\2\2\2\u013e\u013f\7t\2\2\u013f\u0140\7g\2\2\u0140\u0141\7v\2"+
		"\2\u0141\u0142\7w\2\2\u0142\u0143\7t\2\2\u0143\u0144\7p\2\2\u0144<\3\2"+
		"\2\2\u0145\u0146\7u\2\2\u0146\u0147\7v\2\2\u0147\u0148\7t\2\2\u0148\u0149"+
		"\7w\2\2\u0149\u014a\7e\2\2\u014a\u014b\7v\2\2\u014b>\3\2\2\2\u014c\u014d"+
		"\7v\2\2\u014d\u014e\7j\2\2\u014e\u014f\7t\2\2\u014f\u0150\7q\2\2\u0150"+
		"\u0151\7y\2\2\u0151@\3\2\2\2\u0152\u0153\7x\2\2\u0153\u0154\7g\2\2\u0154"+
		"\u0155\7t\2\2\u0155\u0156\7u\2\2\u0156\u0157\7k\2\2\u0157\u0158\7q\2\2"+
		"\u0158\u0159\7p\2\2\u0159B\3\2\2\2\u015a\u015b\7v\2\2\u015b\u015c\7t\2"+
		"\2\u015c\u015d\7w\2\2\u015d\u0164\7g\2\2\u015e\u015f\7h\2\2\u015f\u0160"+
		"\7c\2\2\u0160\u0161\7n\2\2\u0161\u0162\7u\2\2\u0162\u0164\7g\2\2\u0163"+
		"\u015a\3\2\2\2\u0163\u015e\3\2\2\2\u0164D\3\2\2\2\u0165\u0166\7*\2\2\u0166"+
		"F\3\2\2\2\u0167\u0168\7+\2\2\u0168H\3\2\2\2\u0169\u016a\7}\2\2\u016aJ"+
		"\3\2\2\2\u016b\u016c\7\177\2\2\u016cL\3\2\2\2\u016d\u016e\7]\2\2\u016e"+
		"N\3\2\2\2\u016f\u0170\7_\2\2\u0170P\3\2\2\2\u0171\u0172\7=\2\2\u0172R"+
		"\3\2\2\2\u0173\u0174\7.\2\2\u0174T\3\2\2\2\u0175\u0176\7\60\2\2\u0176"+
		"V\3\2\2\2\u0177\u0178\7-\2\2\u0178X\3\2\2\2\u0179\u017a\7/\2\2\u017aZ"+
		"\3\2\2\2\u017b\u017c\7,\2\2\u017c\\\3\2\2\2\u017d\u017e\7\61\2\2\u017e"+
		"^\3\2\2\2\u017f\u0180\7\'\2\2\u0180`\3\2\2\2\u0181\u0182\7,\2\2\u0182"+
		"\u0183\7,\2\2\u0183b\3\2\2\2\u0184\u0185\7>\2\2\u0185\u0186\7>\2\2\u0186"+
		"d\3\2\2\2\u0187\u0188\7@\2\2\u0188\u0189\7@\2\2\u0189f\3\2\2\2\u018a\u018b"+
		"\7(\2\2\u018b\u018c\7(\2\2\u018ch\3\2\2\2\u018d\u018e\7~\2\2\u018e\u018f"+
		"\7~\2\2\u018fj\3\2\2\2\u0190\u0191\7#\2\2\u0191l\3\2\2\2\u0192\u0193\7"+
		"(\2\2\u0193n\3\2\2\2\u0194\u0195\7~\2\2\u0195p\3\2\2\2\u0196\u0197\7`"+
		"\2\2\u0197r\3\2\2\2\u0198\u0199\t\2\2\2\u0199t\3\2\2\2\u019a\u019b\7?"+
		"\2\2\u019b\u019c\7?\2\2\u019cv\3\2\2\2\u019d\u019e\7#\2\2\u019e\u019f"+
		"\7?\2\2\u019fx\3\2\2\2\u01a0\u01a1\7@\2\2\u01a1z\3\2\2\2\u01a2\u01a3\7"+
		"@\2\2\u01a3\u01a4\7?\2\2\u01a4|\3\2\2\2\u01a5\u01a6\7>\2\2\u01a6~\3\2"+
		"\2\2\u01a7\u01a8\7>\2\2\u01a8\u01a9\7?\2\2\u01a9\u0080\3\2\2\2\u01aa\u01ad"+
		"\7a\2\2\u01ab\u01ad\5\u0083B\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2"+
		"\u01ad\u01b3\3\2\2\2\u01ae\u01b2\7a\2\2\u01af\u01b2\5\u0083B\2\u01b0\u01b2"+
		"\5\u008dG\2\u01b1\u01ae\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b0\3\2\2"+
		"\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u0082"+
		"\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\t\3\2\2\u01b7\u0084\3\2\2\2\u01b8"+
		"\u01bb\5\u008bF\2\u01b9\u01bb\5\u0087D\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9"+
		"\3\2\2\2\u01bb\u0086\3\2\2\2\u01bc\u01bd\7\62\2\2\u01bd\u01be\7z\2\2\u01be"+
		"\u01c0\3\2\2\2\u01bf\u01c1\5\u0089E\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u0088\3\2\2\2\u01c4"+
		"\u01c5\t\4\2\2\u01c5\u008a\3\2\2\2\u01c6\u01c8\5\u008dG\2\u01c7\u01c6"+
		"\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u008c\3\2\2\2\u01cb\u01cc\t\5\2\2\u01cc\u008e\3\2\2\2\u01cd\u01d1\7$"+
		"\2\2\u01ce\u01d0\5\u0095K\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2"+
		"\2\2\u01d4\u01d5\7$\2\2\u01d5\u0090\3\2\2\2\u01d6\u01d9\7)\2\2\u01d7\u01da"+
		"\5\u0093J\2\u01d8\u01da\5\u0095K\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2"+
		"\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\7)\2\2\u01dc\u0092\3\2\2\2\u01dd"+
		"\u01de\7^\2\2\u01de\u01df\t\6\2\2\u01df\u0094\3\2\2\2\u01e0\u01e1\n\7"+
		"\2\2\u01e1\u0096\3\2\2\2\u01e2\u01e4\5\u0099M\2\u01e3\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u0098\3\2"+
		"\2\2\u01e7\u01e9\t\7\2\2\u01e8\u01e7\3\2\2\2\u01e9\u009a\3\2\2\2\u01ea"+
		"\u01ec\t\b\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01eb\3\2"+
		"\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\bN\2\2\u01f0"+
		"\u009c\3\2\2\2\u01f1\u01f2\7\61\2\2\u01f2\u01f3\7\61\2\2\u01f3\u01f7\3"+
		"\2\2\2\u01f4\u01f6\n\7\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fd\3\2\2\2\u01f9\u01f7\3\2"+
		"\2\2\u01fa\u01fc\t\7\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd"+
		"\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fd\3\2"+
		"\2\2\u0200\u0201\bO\2\2\u0201\u009e\3\2\2\2\u0202\u0203\7\61\2\2\u0203"+
		"\u0204\7,\2\2\u0204\u0208\3\2\2\2\u0205\u0207\13\2\2\2\u0206\u0205\3\2"+
		"\2\2\u0207\u020a\3\2\2\2\u0208\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209"+
		"\u020b\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020c\7,\2\2\u020c\u020d\7\61"+
		"\2\2\u020d\u020e\3\2\2\2\u020e\u020f\bP\2\2\u020f\u00a0\3\2\2\2\22\2\u0163"+
		"\u01ac\u01b1\u01b3\u01ba\u01c2\u01c9\u01d1\u01d9\u01e5\u01e8\u01ed\u01f7"+
		"\u01fd\u0208\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}