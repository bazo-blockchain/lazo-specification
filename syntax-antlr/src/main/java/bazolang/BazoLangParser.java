// Generated from BazoLang.g4 by ANTLR 4.7.1

    package bazolang;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BazoLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, KEYWORD=3, BOOL=4, IDENTIFIER=5, HEX_DIGIT=6, INTEGER=7, 
		STRING=8, CHARACTER=9, CHARCODE=10, NL=11, WS=12, LINE_COMMENT=13, BLOCK_COMMENT=14;
	public static final int
		RULE_program = 0, RULE_versionDirective = 1;
	public static final String[] ruleNames = {
		"program", "versionDirective"
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

	@Override
	public String getGrammarFileName() { return "BazoLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BazoLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public VersionDirectiveContext versionDirective() {
			return getRuleContext(VersionDirectiveContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BazoLangParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BazoLangListener ) ((BazoLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BazoLangListener ) ((BazoLangListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			versionDirective();
			setState(5);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionDirectiveContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(BazoLangParser.WS, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(BazoLangParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(BazoLangParser.INTEGER, i);
		}
		public VersionDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BazoLangListener ) ((BazoLangListener)listener).enterVersionDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BazoLangListener ) ((BazoLangListener)listener).exitVersionDirective(this);
		}
	}

	public final VersionDirectiveContext versionDirective() throws RecognitionException {
		VersionDirectiveContext _localctx = new VersionDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_versionDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			match(T__0);
			setState(8);
			match(WS);
			setState(9);
			match(INTEGER);
			setState(10);
			match(T__1);
			setState(11);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\20\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\2\2\4\2\4\2\2\2\r\2\6\3\2"+
		"\2\2\4\t\3\2\2\2\6\7\5\4\3\2\7\b\7\2\2\3\b\3\3\2\2\2\t\n\7\3\2\2\n\13"+
		"\7\16\2\2\13\f\7\t\2\2\f\r\7\4\2\2\r\16\7\t\2\2\16\5\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}