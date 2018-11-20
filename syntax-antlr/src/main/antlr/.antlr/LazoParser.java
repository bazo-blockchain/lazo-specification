// Generated from /Users/rpfister/Documents/hsr/sem7/SA/lazo-specification/syntax-antlr/src/main/antlr/Lazo.g4 by ANTLR 4.7.1

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
public class LazoParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_versionDirective = 1, RULE_interfaceDeclaration = 2, 
		RULE_interfacePart = 3, RULE_functionSignature = 4, RULE_contractDeclaration = 5, 
		RULE_contractPart = 6, RULE_variableDeclaration = 7, RULE_structDeclaration = 8, 
		RULE_errorDeclaration = 9, RULE_structField = 10, RULE_eventDeclaration = 11, 
		RULE_enumDeclaration = 12, RULE_constructorDeclaration = 13, RULE_functionDeclaration = 14, 
		RULE_functionHead = 15, RULE_annotation = 16, RULE_paramList = 17, RULE_parameter = 18, 
		RULE_defaultParameter = 19, RULE_type = 20, RULE_arrayType = 21, RULE_mapType = 22, 
		RULE_statementBlock = 23, RULE_statement = 24, RULE_emitStatement = 25, 
		RULE_ifStatement = 26, RULE_forStatement = 27, RULE_forEachStatement = 28, 
		RULE_mapForEachStatement = 29, RULE_breakStatement = 30, RULE_continueStatement = 31, 
		RULE_rangeStatement = 32, RULE_expressionStatement = 33, RULE_sendStatement = 34, 
		RULE_argumentList = 35, RULE_namedArgument = 36, RULE_assignmentStatement = 37, 
		RULE_assignment = 38, RULE_designator = 39, RULE_throwStatement = 40, 
		RULE_returnStatement = 41, RULE_expression = 42, RULE_newCreation = 43, 
		RULE_structCreation = 44, RULE_arrayCreation = 45, RULE_mapCreation = 46, 
		RULE_operand = 47, RULE_literal = 48;
	public static final String[] ruleNames = {
		"program", "versionDirective", "interfaceDeclaration", "interfacePart", 
		"functionSignature", "contractDeclaration", "contractPart", "variableDeclaration", 
		"structDeclaration", "errorDeclaration", "structField", "eventDeclaration", 
		"enumDeclaration", "constructorDeclaration", "functionDeclaration", "functionHead", 
		"annotation", "paramList", "parameter", "defaultParameter", "type", "arrayType", 
		"mapType", "statementBlock", "statement", "emitStatement", "ifStatement", 
		"forStatement", "forEachStatement", "mapForEachStatement", "breakStatement", 
		"continueStatement", "rangeStatement", "expressionStatement", "sendStatement", 
		"argumentList", "namedArgument", "assignmentStatement", "assignment", 
		"designator", "throwStatement", "returnStatement", "expression", "newCreation", 
		"structCreation", "arrayCreation", "mapCreation", "operand", "literal"
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

	@Override
	public String getGrammarFileName() { return "Lazo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LazoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public VersionDirectiveContext versionDirective() {
			return getRuleContext(VersionDirectiveContext.class,0);
		}
		public ContractDeclarationContext contractDeclaration() {
			return getRuleContext(ContractDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LazoParser.EOF, 0); }
		public List<InterfaceDeclarationContext> interfaceDeclaration() {
			return getRuleContexts(InterfaceDeclarationContext.class);
		}
		public InterfaceDeclarationContext interfaceDeclaration(int i) {
			return getRuleContext(InterfaceDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			versionDirective();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTERFACE) {
				{
				{
				setState(99);
				interfaceDeclaration();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			contractDeclaration();
			setState(106);
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
		public List<TerminalNode> INTEGER() { return getTokens(LazoParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(LazoParser.INTEGER, i);
		}
		public TerminalNode NLS() { return getToken(LazoParser.NLS, 0); }
		public VersionDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionDirective; }
	}

	public final VersionDirectiveContext versionDirective() throws RecognitionException {
		VersionDirectiveContext _localctx = new VersionDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_versionDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(VERSION);
			setState(109);
			match(INTEGER);
			setState(110);
			match(DOT);
			setState(111);
			match(INTEGER);
			setState(112);
			match(NLS);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public List<TerminalNode> NLS() { return getTokens(LazoParser.NLS); }
		public TerminalNode NLS(int i) {
			return getToken(LazoParser.NLS, i);
		}
		public List<InterfacePartContext> interfacePart() {
			return getRuleContexts(InterfacePartContext.class);
		}
		public InterfacePartContext interfacePart(int i) {
			return getRuleContext(InterfacePartContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(INTERFACE);
			setState(115);
			match(IDENTIFIER);
			setState(116);
			match(LBRACE);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NLS) {
				{
				{
				setState(117);
				match(NLS);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (MAP - 27)) | (1L << (LPAREN - 27)) | (1L << (LBRACK - 27)) | (1L << (IDENTIFIER - 27)))) != 0)) {
				{
				{
				setState(123);
				interfacePart();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(RBRACE);
			setState(130);
			match(NLS);
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

	public static class InterfacePartContext extends ParserRuleContext {
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public TerminalNode NLS() { return getToken(LazoParser.NLS, 0); }
		public InterfacePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfacePart; }
	}

	public final InterfacePartContext interfacePart() throws RecognitionException {
		InterfacePartContext _localctx = new InterfacePartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_interfacePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			functionSignature();
			setState(133);
			match(NLS);
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

	public static class FunctionSignatureContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSignature; }
	}

	public final FunctionSignatureContext functionSignature() throws RecognitionException {
		FunctionSignatureContext _localctx = new FunctionSignatureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(135);
				annotation();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case IDENTIFIER:
				{
				setState(141);
				type();
				}
				break;
			case LPAREN:
				{
				setState(142);
				match(LPAREN);
				setState(143);
				type();
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(144);
					match(COMMA);
					setState(145);
					type();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(155);
			match(IDENTIFIER);
			setState(156);
			match(LPAREN);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAP || _la==IDENTIFIER) {
				{
				setState(157);
				paramList();
				}
			}

			setState(160);
			match(RPAREN);
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

	public static class ContractDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(LazoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LazoParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NLS() { return getTokens(LazoParser.NLS); }
		public TerminalNode NLS(int i) {
			return getToken(LazoParser.NLS, i);
		}
		public List<ContractPartContext> contractPart() {
			return getRuleContexts(ContractPartContext.class);
		}
		public ContractPartContext contractPart(int i) {
			return getRuleContext(ContractPartContext.class,i);
		}
		public ContractDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDeclaration; }
	}

	public final ContractDeclarationContext contractDeclaration() throws RecognitionException {
		ContractDeclarationContext _localctx = new ContractDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_contractDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(CONTRACT);
			setState(163);
			match(IDENTIFIER);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(164);
				match(IS);
				setState(165);
				match(IDENTIFIER);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(166);
					match(COMMA);
					setState(167);
					match(IDENTIFIER);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(175);
			match(LBRACE);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << CONSTRUCTOR) | (1L << FUNCTION) | (1L << INTERNAL) | (1L << MAP) | (1L << READONLY) | (1L << STRUCT) | (1L << LBRACK))) != 0) || _la==IDENTIFIER || _la==NLS) {
				{
				setState(178);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NLS:
					{
					setState(176);
					match(NLS);
					}
					break;
				case T__0:
				case T__1:
				case T__2:
				case CONSTRUCTOR:
				case FUNCTION:
				case INTERNAL:
				case MAP:
				case READONLY:
				case STRUCT:
				case LBRACK:
				case IDENTIFIER:
					{
					setState(177);
					contractPart();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(RBRACE);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NLS) {
				{
				setState(184);
				match(NLS);
				}
			}

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

	public static class ContractPartContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public ErrorDeclarationContext errorDeclaration() {
			return getRuleContext(ErrorDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public EventDeclarationContext eventDeclaration() {
			return getRuleContext(EventDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ContractPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractPart; }
	}

	public final ContractPartContext contractPart() throws RecognitionException {
		ContractPartContext _localctx = new ContractPartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_contractPart);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				structDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				errorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				enumDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				eventDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(192);
				constructorDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(193);
				functionDeclaration();
				}
				break;
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public TerminalNode NLS() { return getToken(LazoParser.NLS, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==READONLY) {
				{
				setState(196);
				match(READONLY);
				}
			}

			setState(199);
			type();
			setState(200);
			match(IDENTIFIER);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(201);
				assignment();
				}
			}

			setState(204);
			match(NLS);
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public List<TerminalNode> NLS() { return getTokens(LazoParser.NLS); }
		public TerminalNode NLS(int i) {
			return getToken(LazoParser.NLS, i);
		}
		public List<StructFieldContext> structField() {
			return getRuleContexts(StructFieldContext.class);
		}
		public StructFieldContext structField(int i) {
			return getRuleContext(StructFieldContext.class,i);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(STRUCT);
			setState(207);
			match(IDENTIFIER);
			setState(208);
			match(LBRACE);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NLS) {
				{
				{
				setState(209);
				match(NLS);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAP || _la==IDENTIFIER) {
				{
				{
				setState(215);
				structField();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(RBRACE);
			setState(222);
			match(NLS);
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

	public static class ErrorDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public List<TerminalNode> NLS() { return getTokens(LazoParser.NLS); }
		public TerminalNode NLS(int i) {
			return getToken(LazoParser.NLS, i);
		}
		public List<StructFieldContext> structField() {
			return getRuleContexts(StructFieldContext.class);
		}
		public StructFieldContext structField(int i) {
			return getRuleContext(StructFieldContext.class,i);
		}
		public ErrorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorDeclaration; }
	}

	public final ErrorDeclarationContext errorDeclaration() throws RecognitionException {
		ErrorDeclarationContext _localctx = new ErrorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_errorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__0);
			setState(225);
			match(IDENTIFIER);
			setState(226);
			match(LBRACE);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NLS) {
				{
				{
				setState(227);
				match(NLS);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAP || _la==IDENTIFIER) {
				{
				{
				setState(233);
				structField();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(RBRACE);
			setState(240);
			match(NLS);
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

	public static class StructFieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public TerminalNode NLS() { return getToken(LazoParser.NLS, 0); }
		public StructFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structField; }
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_structField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			type();
			setState(243);
			match(IDENTIFIER);
			setState(244);
			match(NLS);
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

	public static class EventDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public TerminalNode NLS() { return getToken(LazoParser.NLS, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public EventDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDeclaration; }
	}

	public final EventDeclarationContext eventDeclaration() throws RecognitionException {
		EventDeclarationContext _localctx = new EventDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eventDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__1);
			setState(247);
			match(IDENTIFIER);
			setState(248);
			match(LPAREN);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAP || _la==IDENTIFIER) {
				{
				setState(249);
				paramList();
				}
			}

			setState(252);
			match(RPAREN);
			setState(253);
			match(NLS);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(LazoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LazoParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NLS() { return getTokens(LazoParser.NLS); }
		public TerminalNode NLS(int i) {
			return getToken(LazoParser.NLS, i);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__2);
			setState(256);
			match(IDENTIFIER);
			setState(257);
			match(LBRACE);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NLS) {
				{
				{
				setState(258);
				match(NLS);
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			match(IDENTIFIER);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(265);
				match(COMMA);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NLS) {
					{
					{
					setState(266);
					match(NLS);
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				match(IDENTIFIER);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NLS) {
				{
				{
				setState(278);
				match(NLS);
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
			match(RBRACE);
			setState(285);
			match(NLS);
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(287);
				annotation();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(CONSTRUCTOR);
			setState(294);
			match(LPAREN);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAP || _la==IDENTIFIER) {
				{
				setState(295);
				paramList();
				}
			}

			setState(298);
			match(RPAREN);
			setState(299);
			statementBlock();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionHeadContext functionHead() {
			return getRuleContext(FunctionHeadContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(301);
				annotation();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			functionHead();
			setState(308);
			statementBlock();
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

	public static class FunctionHeadContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHead; }
	}

	public final FunctionHeadContext functionHead() throws RecognitionException {
		FunctionHeadContext _localctx = new FunctionHeadContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERNAL) {
				{
				setState(310);
				match(INTERNAL);
				}
			}

			setState(313);
			match(FUNCTION);
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case IDENTIFIER:
				{
				setState(314);
				type();
				}
				break;
			case LPAREN:
				{
				setState(315);
				match(LPAREN);
				setState(316);
				type();
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(317);
					match(COMMA);
					setState(318);
					type();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(324);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(328);
			match(IDENTIFIER);
			setState(329);
			match(LPAREN);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAP || _la==IDENTIFIER) {
				{
				setState(330);
				paramList();
				}
			}

			setState(333);
			match(RPAREN);
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public TerminalNode NLS() { return getToken(LazoParser.NLS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(LBRACK);
			setState(336);
			match(IDENTIFIER);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(337);
				match(T__3);
				setState(338);
				expression(0);
				}
			}

			setState(341);
			match(RBRACK);
			setState(342);
			match(NLS);
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

	public static class ParamListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<DefaultParameterContext> defaultParameter() {
			return getRuleContexts(DefaultParameterContext.class);
		}
		public DefaultParameterContext defaultParameter(int i) {
			return getRuleContext(DefaultParameterContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_paramList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			parameter();
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(345);
					match(COMMA);
					setState(346);
					parameter();
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(352);
				match(COMMA);
				setState(353);
				defaultParameter();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			type();
			setState(360);
			match(IDENTIFIER);
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

	public static class DefaultParameterContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DefaultParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultParameter; }
	}

	public final DefaultParameterContext defaultParameter() throws RecognitionException {
		DefaultParameterContext _localctx = new DefaultParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_defaultParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			parameter();
			setState(363);
			assignment();
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

	public static class TypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				arrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				mapType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(IDENTIFIER);
				}
				break;
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(IDENTIFIER);
			setState(371);
			match(LBRACK);
			setState(372);
			match(RBRACK);
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

	public static class MapTypeContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public MapTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapType; }
	}

	public final MapTypeContext mapType() throws RecognitionException {
		MapTypeContext _localctx = new MapTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mapType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(MAP);
			setState(375);
			match(LT);
			setState(376);
			type();
			setState(377);
			match(COMMA);
			setState(378);
			type();
			setState(379);
			match(GT);
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

	public static class StatementBlockContext extends ParserRuleContext {
		public List<TerminalNode> NLS() { return getTokens(LazoParser.NLS); }
		public TerminalNode NLS(int i) {
			return getToken(LazoParser.NLS, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(LBRACE);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << BREAK) | (1L << CONTINUE) | (1L << EMIT) | (1L << MAP) | (1L << READONLY) | (1L << RETURN) | (1L << THROW) | (1L << BOOL) | (1L << LPAREN) | (1L << PLUS) | (1L << MIN) | (1L << NOT) | (1L << TILDE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IDENTIFIER - 64)) | (1L << (INTEGER - 64)) | (1L << (STRING - 64)) | (1L << (CHARACTER - 64)) | (1L << (NLS - 64)))) != 0)) {
				{
				setState(384);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NLS:
					{
					setState(382);
					match(NLS);
					}
					break;
				case T__4:
				case T__7:
				case T__8:
				case T__13:
				case T__14:
				case T__16:
				case BREAK:
				case CONTINUE:
				case EMIT:
				case MAP:
				case READONLY:
				case RETURN:
				case THROW:
				case BOOL:
				case LPAREN:
				case PLUS:
				case MIN:
				case NOT:
				case TILDE:
				case IDENTIFIER:
				case INTEGER:
				case STRING:
				case CHARACTER:
					{
					setState(383);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(RBRACE);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SendStatementContext sendStatement() {
			return getRuleContext(SendStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForEachStatementContext forEachStatement() {
			return getRuleContext(ForEachStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public MapForEachStatementContext mapForEachStatement() {
			return getRuleContext(MapForEachStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		try {
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				returnStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(394);
				sendStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(395);
				emitStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(396);
				variableDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(397);
				ifStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(398);
				forEachStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(399);
				forStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(400);
				mapForEachStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(401);
				breakStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(402);
				continueStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(403);
				throwStatement();
				}
				break;
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

	public static class EmitStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NLS() { return getToken(LazoParser.NLS, 0); }
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(EMIT);
			setState(407);
			expression(0);
			setState(408);
			match(NLS);
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

	public static class IfStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementBlockContext> statementBlock() {
			return getRuleContexts(StatementBlockContext.class);
		}
		public StatementBlockContext statementBlock(int i) {
			return getRuleContext(StatementBlockContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(T__4);
			setState(411);
			match(LPAREN);
			setState(412);
			expression(0);
			setState(413);
			match(RPAREN);
			setState(414);
			statementBlock();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(415);
				match(T__5);
				setState(416);
				match(LPAREN);
				setState(417);
				expression(0);
				setState(418);
				match(RPAREN);
				setState(419);
				statementBlock();
				}
			}

			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(423);
				match(T__6);
				setState(424);
				statementBlock();
				}
			}

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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public RangeStatementContext rangeStatement() {
			return getRuleContext(RangeStatementContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(T__7);
			setState(428);
			match(LPAREN);
			setState(429);
			match(IDENTIFIER);
			setState(430);
			match(T__3);
			setState(431);
			rangeStatement();
			setState(432);
			match(RPAREN);
			setState(433);
			statementBlock();
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

	public static class ForEachStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(LazoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LazoParser.IDENTIFIER, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public ForEachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachStatement; }
	}

	public final ForEachStatementContext forEachStatement() throws RecognitionException {
		ForEachStatementContext _localctx = new ForEachStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_forEachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(T__8);
			setState(436);
			match(LPAREN);
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(437);
				match(IDENTIFIER);
				setState(438);
				match(COMMA);
				}
				break;
			}
			setState(441);
			type();
			setState(442);
			match(IDENTIFIER);
			setState(443);
			match(T__3);
			setState(444);
			expression(0);
			setState(445);
			match(RPAREN);
			setState(446);
			statementBlock();
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

	public static class MapForEachStatementContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(LazoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LazoParser.IDENTIFIER, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public MapForEachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapForEachStatement; }
	}

	public final MapForEachStatementContext mapForEachStatement() throws RecognitionException {
		MapForEachStatementContext _localctx = new MapForEachStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mapForEachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(T__8);
			setState(449);
			match(LPAREN);
			setState(450);
			type();
			setState(451);
			match(IDENTIFIER);
			setState(452);
			match(COMMA);
			setState(453);
			type();
			setState(454);
			match(IDENTIFIER);
			setState(455);
			match(T__3);
			setState(456);
			expression(0);
			setState(457);
			match(RPAREN);
			setState(458);
			statementBlock();
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode NLS() { return getToken(LazoParser.NLS, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(BREAK);
			setState(461);
			match(NLS);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode NLS() { return getToken(LazoParser.NLS, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(CONTINUE);
			setState(464);
			match(NLS);
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

	public static class RangeStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RangeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeStatement; }
	}

	public final RangeStatementContext rangeStatement() throws RecognitionException {
		RangeStatementContext _localctx = new RangeStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_rangeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__14 - 14)) | (1L << (T__16 - 14)) | (1L << (BOOL - 14)) | (1L << (LPAREN - 14)) | (1L << (PLUS - 14)) | (1L << (MIN - 14)) | (1L << (NOT - 14)) | (1L << (TILDE - 14)) | (1L << (IDENTIFIER - 14)) | (1L << (INTEGER - 14)) | (1L << (STRING - 14)) | (1L << (CHARACTER - 14)))) != 0)) {
				{
				setState(466);
				expression(0);
				}
			}

			setState(469);
			match(T__9);
			setState(470);
			expression(0);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(471);
				match(T__10);
				setState(472);
				expression(0);
				}
			}

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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NLS() { return getToken(LazoParser.NLS, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			expression(0);
			setState(476);
			match(NLS);
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

	public static class SendStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NLS() { return getToken(LazoParser.NLS, 0); }
		public SendStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sendStatement; }
	}

	public final SendStatementContext sendStatement() throws RecognitionException {
		SendStatementContext _localctx = new SendStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_sendStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			expression(0);
			setState(479);
			match(DOT);
			setState(480);
			match(T__11);
			setState(481);
			match(LPAREN);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__14 - 14)) | (1L << (T__16 - 14)) | (1L << (BOOL - 14)) | (1L << (LPAREN - 14)) | (1L << (PLUS - 14)) | (1L << (MIN - 14)) | (1L << (NOT - 14)) | (1L << (TILDE - 14)) | (1L << (IDENTIFIER - 14)) | (1L << (INTEGER - 14)) | (1L << (STRING - 14)) | (1L << (CHARACTER - 14)))) != 0)) {
				{
				setState(482);
				expression(0);
				}
			}

			setState(485);
			match(RPAREN);
			setState(486);
			match(NLS);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<NamedArgumentContext> namedArgument() {
			return getRuleContexts(NamedArgumentContext.class);
		}
		public NamedArgumentContext namedArgument(int i) {
			return getRuleContext(NamedArgumentContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_argumentList);
		int _la;
		try {
			int _alt;
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				expression(0);
				setState(493);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(489);
						match(COMMA);
						setState(490);
						expression(0);
						}
						} 
					}
					setState(495);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(496);
					match(COMMA);
					setState(497);
					namedArgument();
					}
					}
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				namedArgument();
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(504);
					match(COMMA);
					setState(505);
					namedArgument();
					}
					}
					setState(510);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	public static class NamedArgumentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArgument; }
	}

	public final NamedArgumentContext namedArgument() throws RecognitionException {
		NamedArgumentContext _localctx = new NamedArgumentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(IDENTIFIER);
			setState(514);
			match(T__12);
			setState(515);
			expression(0);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode NLS() { return getToken(LazoParser.NLS, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			expression(0);
			setState(518);
			assignment();
			setState(519);
			match(NLS);
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

	public static class AssignmentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(T__12);
			setState(522);
			expression(0);
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

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_designator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(IDENTIFIER);
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public TerminalNode NLS() { return getToken(LazoParser.NLS, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_throwStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(THROW);
			setState(527);
			match(IDENTIFIER);
			setState(528);
			match(LBRACE);
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__14 - 14)) | (1L << (T__16 - 14)) | (1L << (BOOL - 14)) | (1L << (LPAREN - 14)) | (1L << (PLUS - 14)) | (1L << (MIN - 14)) | (1L << (NOT - 14)) | (1L << (TILDE - 14)) | (1L << (IDENTIFIER - 14)) | (1L << (INTEGER - 14)) | (1L << (STRING - 14)) | (1L << (CHARACTER - 14)))) != 0)) {
				{
				setState(529);
				argumentList();
				}
			}

			setState(532);
			match(RBRACE);
			setState(533);
			match(NLS);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode NLS() { return getToken(LazoParser.NLS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(RETURN);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__14 - 14)) | (1L << (T__16 - 14)) | (1L << (BOOL - 14)) | (1L << (LPAREN - 14)) | (1L << (PLUS - 14)) | (1L << (MIN - 14)) | (1L << (NOT - 14)) | (1L << (TILDE - 14)) | (1L << (IDENTIFIER - 14)) | (1L << (INTEGER - 14)) | (1L << (STRING - 14)) | (1L << (CHARACTER - 14)))) != 0)) {
				{
				setState(536);
				expression(0);
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(537);
					match(COMMA);
					setState(538);
					expression(0);
					}
					}
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(546);
			match(NLS);
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

	public static class ExpressionContext extends ParserRuleContext {
		public NewCreationContext newCreation() {
			return getRuleContext(NewCreationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TILDE() { return getToken(LazoParser.TILDE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(549);
				newCreation();
				}
				break;
			case 2:
				{
				setState(550);
				match(LPAREN);
				setState(551);
				expression(0);
				setState(552);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(554);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << PLUS) | (1L << MIN) | (1L << NOT) | (1L << TILDE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(555);
				expression(16);
				}
				break;
			case 4:
				{
				setState(556);
				match(LPAREN);
				setState(557);
				type();
				setState(558);
				match(RPAREN);
				setState(559);
				expression(15);
				}
				break;
			case 5:
				{
				setState(561);
				operand();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(625);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(623);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(564);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(565);
						match(EXP);
						setState(566);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(567);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(568);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(569);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(570);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(571);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MIN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(572);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(573);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(574);
						_la = _input.LA(1);
						if ( !(_la==LSHIFT || _la==RSHIFT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(575);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(576);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(577);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GT_EQ) | (1L << LT) | (1L << LT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(578);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(579);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(580);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(581);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(582);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(583);
						match(BITWISE_AND);
						setState(584);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(585);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(586);
						match(CARET);
						setState(587);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(588);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(589);
						match(BITWISE_OR);
						setState(590);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(591);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(592);
						match(AND);
						setState(593);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(594);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(595);
						match(OR);
						setState(596);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(597);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(598);
						match(T__15);
						setState(599);
						expression(0);
						setState(600);
						match(T__3);
						setState(601);
						expression(3);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(603);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(604);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MIN) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << EXP) | (1L << LSHIFT) | (1L << RSHIFT) | (1L << BITWISE_AND) | (1L << BITWISE_OR) | (1L << CARET))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(605);
						match(T__12);
						setState(606);
						expression(2);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(607);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(608);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(609);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(610);
						match(LBRACK);
						setState(611);
						expression(0);
						setState(612);
						match(RBRACK);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(614);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(615);
						match(DOT);
						setState(616);
						match(IDENTIFIER);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(617);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(618);
						match(LPAREN);
						setState(620);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__14 - 14)) | (1L << (T__16 - 14)) | (1L << (BOOL - 14)) | (1L << (LPAREN - 14)) | (1L << (PLUS - 14)) | (1L << (MIN - 14)) | (1L << (NOT - 14)) | (1L << (TILDE - 14)) | (1L << (IDENTIFIER - 14)) | (1L << (INTEGER - 14)) | (1L << (STRING - 14)) | (1L << (CHARACTER - 14)))) != 0)) {
							{
							setState(619);
							argumentList();
							}
						}

						setState(622);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NewCreationContext extends ParserRuleContext {
		public StructCreationContext structCreation() {
			return getRuleContext(StructCreationContext.class,0);
		}
		public ArrayCreationContext arrayCreation() {
			return getRuleContext(ArrayCreationContext.class,0);
		}
		public MapCreationContext mapCreation() {
			return getRuleContext(MapCreationContext.class,0);
		}
		public NewCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newCreation; }
	}

	public final NewCreationContext newCreation() throws RecognitionException {
		NewCreationContext _localctx = new NewCreationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_newCreation);
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				structCreation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				arrayCreation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(630);
				mapCreation();
				}
				break;
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

	public static class StructCreationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public StructCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structCreation; }
	}

	public final StructCreationContext structCreation() throws RecognitionException {
		StructCreationContext _localctx = new StructCreationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_structCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(T__16);
			setState(634);
			match(IDENTIFIER);
			setState(635);
			match(LPAREN);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__14 - 14)) | (1L << (T__16 - 14)) | (1L << (BOOL - 14)) | (1L << (LPAREN - 14)) | (1L << (PLUS - 14)) | (1L << (MIN - 14)) | (1L << (NOT - 14)) | (1L << (TILDE - 14)) | (1L << (IDENTIFIER - 14)) | (1L << (INTEGER - 14)) | (1L << (STRING - 14)) | (1L << (CHARACTER - 14)))) != 0)) {
				{
				setState(636);
				argumentList();
				}
			}

			setState(639);
			match(RPAREN);
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

	public static class ArrayCreationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LazoParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreation; }
	}

	public final ArrayCreationContext arrayCreation() throws RecognitionException {
		ArrayCreationContext _localctx = new ArrayCreationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_arrayCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(T__16);
			setState(642);
			match(IDENTIFIER);
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(643);
				match(LBRACK);
				setState(644);
				expression(0);
				setState(645);
				match(RBRACK);
				setState(648);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(646);
					match(LBRACE);
					setState(647);
					match(RBRACE);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(650);
				match(LBRACK);
				setState(651);
				match(RBRACK);
				setState(652);
				match(LBRACE);
				setState(653);
				expression(0);
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(654);
					match(COMMA);
					setState(655);
					expression(0);
					}
					}
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(661);
				match(RBRACE);
				}
				break;
			}
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

	public static class MapCreationContext extends ParserRuleContext {
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public MapCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapCreation; }
	}

	public final MapCreationContext mapCreation() throws RecognitionException {
		MapCreationContext _localctx = new MapCreationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_mapCreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(T__16);
			setState(666);
			mapType();
			setState(667);
			match(LPAREN);
			setState(668);
			match(RPAREN);
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

	public static class OperandContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_operand);
		try {
			setState(672);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INTEGER:
			case STRING:
			case CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				designator();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(LazoParser.INTEGER, 0); }
		public TerminalNode CHARACTER() { return getToken(LazoParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(LazoParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(LazoParser.BOOL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_la = _input.LA(1);
			if ( !(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (BOOL - 33)) | (1L << (INTEGER - 33)) | (1L << (STRING - 33)) | (1L << (CHARACTER - 33)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 42:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 22);
		case 14:
			return precpred(_ctx, 21);
		case 15:
			return precpred(_ctx, 20);
		case 16:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u02a7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\7\2g\n\2"+
		"\f\2\16\2j\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7"+
		"\4y\n\4\f\4\16\4|\13\4\3\4\7\4\177\n\4\f\4\16\4\u0082\13\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\7\6\u008b\n\6\f\6\16\6\u008e\13\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\u0095\n\6\f\6\16\6\u0098\13\6\3\6\3\6\5\6\u009c\n\6\3\6\3\6\3\6\5"+
		"\6\u00a1\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ab\n\7\f\7\16\7\u00ae"+
		"\13\7\5\7\u00b0\n\7\3\7\3\7\3\7\7\7\u00b5\n\7\f\7\16\7\u00b8\13\7\3\7"+
		"\3\7\5\7\u00bc\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c5\n\b\3\t\5\t\u00c8"+
		"\n\t\3\t\3\t\3\t\5\t\u00cd\n\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00d5\n\n\f"+
		"\n\16\n\u00d8\13\n\3\n\7\n\u00db\n\n\f\n\16\n\u00de\13\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\7\13\u00e7\n\13\f\13\16\13\u00ea\13\13\3\13\7\13\u00ed"+
		"\n\13\f\13\16\13\u00f0\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\5\r\u00fd\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0106\n\16\f"+
		"\16\16\16\u0109\13\16\3\16\3\16\3\16\7\16\u010e\n\16\f\16\16\16\u0111"+
		"\13\16\3\16\7\16\u0114\n\16\f\16\16\16\u0117\13\16\3\16\7\16\u011a\n\16"+
		"\f\16\16\16\u011d\13\16\3\16\3\16\3\16\3\17\7\17\u0123\n\17\f\17\16\17"+
		"\u0126\13\17\3\17\3\17\3\17\5\17\u012b\n\17\3\17\3\17\3\17\3\20\7\20\u0131"+
		"\n\20\f\20\16\20\u0134\13\20\3\20\3\20\3\20\3\21\5\21\u013a\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u0142\n\21\f\21\16\21\u0145\13\21\3\21"+
		"\3\21\5\21\u0149\n\21\3\21\3\21\3\21\5\21\u014e\n\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\5\22\u0156\n\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u015e"+
		"\n\23\f\23\16\23\u0161\13\23\3\23\3\23\7\23\u0165\n\23\f\23\16\23\u0168"+
		"\13\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u0173\n\26\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\7"+
		"\31\u0183\n\31\f\31\16\31\u0186\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0197\n\32\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u01a8\n\34\3\34\3\34\5\34\u01ac\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\5\36\u01ba\n\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3\"\5\"\u01d6\n\"\3\"\3\"\3\"\3\"\5\"\u01dc\n\"\3#"+
		"\3#\3#\3$\3$\3$\3$\3$\5$\u01e6\n$\3$\3$\3$\3%\3%\3%\7%\u01ee\n%\f%\16"+
		"%\u01f1\13%\3%\3%\7%\u01f5\n%\f%\16%\u01f8\13%\3%\3%\3%\7%\u01fd\n%\f"+
		"%\16%\u0200\13%\5%\u0202\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3"+
		")\3*\3*\3*\3*\5*\u0215\n*\3*\3*\3*\3+\3+\3+\3+\7+\u021e\n+\f+\16+\u0221"+
		"\13+\5+\u0223\n+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0235"+
		"\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u026f\n,\3,\7,\u0272\n,\f,\16,\u0275"+
		"\13,\3-\3-\3-\5-\u027a\n-\3.\3.\3.\3.\5.\u0280\n.\3.\3.\3/\3/\3/\3/\3"+
		"/\3/\3/\5/\u028b\n/\3/\3/\3/\3/\3/\3/\7/\u0293\n/\f/\16/\u0296\13/\3/"+
		"\3/\5/\u029a\n/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\5\61\u02a3\n\61\3\62"+
		"\3\62\3\62\2\3V\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\13\6\2\20\21-.\67\67;;\3\2/\61\3\2"+
		"-.\3\2\63\64\3\2>A\3\2<=\4\2-\648:\3\2\20\21\5\2##CCFG\2\u02d6\2d\3\2"+
		"\2\2\4n\3\2\2\2\6t\3\2\2\2\b\u0086\3\2\2\2\n\u008c\3\2\2\2\f\u00a4\3\2"+
		"\2\2\16\u00c4\3\2\2\2\20\u00c7\3\2\2\2\22\u00d0\3\2\2\2\24\u00e2\3\2\2"+
		"\2\26\u00f4\3\2\2\2\30\u00f8\3\2\2\2\32\u0101\3\2\2\2\34\u0124\3\2\2\2"+
		"\36\u0132\3\2\2\2 \u0139\3\2\2\2\"\u0151\3\2\2\2$\u015a\3\2\2\2&\u0169"+
		"\3\2\2\2(\u016c\3\2\2\2*\u0172\3\2\2\2,\u0174\3\2\2\2.\u0178\3\2\2\2\60"+
		"\u017f\3\2\2\2\62\u0196\3\2\2\2\64\u0198\3\2\2\2\66\u019c\3\2\2\28\u01ad"+
		"\3\2\2\2:\u01b5\3\2\2\2<\u01c2\3\2\2\2>\u01ce\3\2\2\2@\u01d1\3\2\2\2B"+
		"\u01d5\3\2\2\2D\u01dd\3\2\2\2F\u01e0\3\2\2\2H\u0201\3\2\2\2J\u0203\3\2"+
		"\2\2L\u0207\3\2\2\2N\u020b\3\2\2\2P\u020e\3\2\2\2R\u0210\3\2\2\2T\u0219"+
		"\3\2\2\2V\u0234\3\2\2\2X\u0279\3\2\2\2Z\u027b\3\2\2\2\\\u0283\3\2\2\2"+
		"^\u029b\3\2\2\2`\u02a2\3\2\2\2b\u02a4\3\2\2\2dh\5\4\3\2eg\5\6\4\2fe\3"+
		"\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\5\f\7\2lm\7"+
		"\2\2\3m\3\3\2\2\2no\7\"\2\2op\7C\2\2pq\7,\2\2qr\7C\2\2rs\7H\2\2s\5\3\2"+
		"\2\2tu\7\32\2\2uv\7B\2\2vz\7&\2\2wy\7H\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2"+
		"\2z{\3\2\2\2{\u0080\3\2\2\2|z\3\2\2\2}\177\5\b\5\2~}\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0084\7\'\2\2\u0084\u0085\7H\2\2\u0085\7\3\2\2\2"+
		"\u0086\u0087\5\n\6\2\u0087\u0088\7H\2\2\u0088\t\3\2\2\2\u0089\u008b\5"+
		"\"\22\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u009b\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u009c\5*"+
		"\26\2\u0090\u0091\7$\2\2\u0091\u0096\5*\26\2\u0092\u0093\7+\2\2\u0093"+
		"\u0095\5*\26\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009a\7%\2\2\u009a\u009c\3\2\2\2\u009b\u008f\3\2\2\2\u009b\u0090\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7B\2\2\u009e\u00a0\7$\2\2\u009f\u00a1"+
		"\5$\23\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\7%\2\2\u00a3\13\3\2\2\2\u00a4\u00a5\7\27\2\2\u00a5\u00af\7B\2\2"+
		"\u00a6\u00a7\7\34\2\2\u00a7\u00ac\7B\2\2\u00a8\u00a9\7+\2\2\u00a9\u00ab"+
		"\7B\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00a6\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b6\7&\2\2\u00b2"+
		"\u00b5\7H\2\2\u00b3\u00b5\5\16\b\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2"+
		"\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\7\'\2\2\u00ba\u00bc\7H"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\r\3\2\2\2\u00bd\u00c5"+
		"\5\20\t\2\u00be\u00c5\5\22\n\2\u00bf\u00c5\5\24\13\2\u00c0\u00c5\5\32"+
		"\16\2\u00c1\u00c5\5\30\r\2\u00c2\u00c5\5\34\17\2\u00c3\u00c5\5\36\20\2"+
		"\u00c4\u00bd\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0"+
		"\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\17\3\2\2\2\u00c6\u00c8\7\36\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2"+
		"\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\5*\26\2\u00ca\u00cc\7B\2\2\u00cb\u00cd"+
		"\5N(\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\7H\2\2\u00cf\21\3\2\2\2\u00d0\u00d1\7 \2\2\u00d1\u00d2\7B\2\2\u00d2"+
		"\u00d6\7&\2\2\u00d3\u00d5\7H\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2"+
		"\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00dc\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d9\u00db\5\26\f\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2"+
		"\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e0\7\'\2\2\u00e0\u00e1\7H\2\2\u00e1\23\3\2\2\2\u00e2"+
		"\u00e3\7\3\2\2\u00e3\u00e4\7B\2\2\u00e4\u00e8\7&\2\2\u00e5\u00e7\7H\2"+
		"\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00ee\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\5\26\f\2"+
		"\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\'\2\2\u00f2"+
		"\u00f3\7H\2\2\u00f3\25\3\2\2\2\u00f4\u00f5\5*\26\2\u00f5\u00f6\7B\2\2"+
		"\u00f6\u00f7\7H\2\2\u00f7\27\3\2\2\2\u00f8\u00f9\7\4\2\2\u00f9\u00fa\7"+
		"B\2\2\u00fa\u00fc\7$\2\2\u00fb\u00fd\5$\23\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7%\2\2\u00ff\u0100\7H\2"+
		"\2\u0100\31\3\2\2\2\u0101\u0102\7\5\2\2\u0102\u0103\7B\2\2\u0103\u0107"+
		"\7&\2\2\u0104\u0106\7H\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u010a\u0115\7B\2\2\u010b\u010f\7+\2\2\u010c\u010e\7H\2\2\u010d\u010c"+
		"\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0114\7B\2\2\u0113\u010b\3\2"+
		"\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u011b\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\7H\2\2\u0119\u0118\3\2"+
		"\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7\'\2\2\u011f\u0120\7H"+
		"\2\2\u0120\33\3\2\2\2\u0121\u0123\5\"\22\2\u0122\u0121\3\2\2\2\u0123\u0126"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0127\u0128\7\25\2\2\u0128\u012a\7$\2\2\u0129\u012b\5$"+
		"\23\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\7%\2\2\u012d\u012e\5\60\31\2\u012e\35\3\2\2\2\u012f\u0131\5\"\22"+
		"\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\5 \21\2\u0136"+
		"\u0137\5\60\31\2\u0137\37\3\2\2\2\u0138\u013a\7\33\2\2\u0139\u0138\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0148\7\31\2\2\u013c"+
		"\u0149\5*\26\2\u013d\u013e\7$\2\2\u013e\u0143\5*\26\2\u013f\u0140\7+\2"+
		"\2\u0140\u0142\5*\26\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0147\7%\2\2\u0147\u0149\3\2\2\2\u0148\u013c\3\2\2\2\u0148\u013d\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014b\7B\2\2\u014b\u014d\7$\2\2\u014c\u014e"+
		"\5$\23\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0150\7%\2\2\u0150!\3\2\2\2\u0151\u0152\7(\2\2\u0152\u0155\7B\2\2\u0153"+
		"\u0154\7\6\2\2\u0154\u0156\5V,\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2"+
		"\2\u0156\u0157\3\2\2\2\u0157\u0158\7)\2\2\u0158\u0159\7H\2\2\u0159#\3"+
		"\2\2\2\u015a\u015f\5&\24\2\u015b\u015c\7+\2\2\u015c\u015e\5&\24\2\u015d"+
		"\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0166\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7+\2\2\u0163"+
		"\u0165\5(\25\2\u0164\u0162\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167%\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a"+
		"\5*\26\2\u016a\u016b\7B\2\2\u016b\'\3\2\2\2\u016c\u016d\5&\24\2\u016d"+
		"\u016e\5N(\2\u016e)\3\2\2\2\u016f\u0173\5,\27\2\u0170\u0173\5.\30\2\u0171"+
		"\u0173\7B\2\2\u0172\u016f\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2"+
		"\2\2\u0173+\3\2\2\2\u0174\u0175\7B\2\2\u0175\u0176\7(\2\2\u0176\u0177"+
		"\7)\2\2\u0177-\3\2\2\2\u0178\u0179\7\35\2\2\u0179\u017a\7@\2\2\u017a\u017b"+
		"\5*\26\2\u017b\u017c\7+\2\2\u017c\u017d\5*\26\2\u017d\u017e\7>\2\2\u017e"+
		"/\3\2\2\2\u017f\u0184\7&\2\2\u0180\u0183\7H\2\2\u0181\u0183\5\62\32\2"+
		"\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187"+
		"\u0188\7\'\2\2\u0188\61\3\2\2\2\u0189\u0197\5L\'\2\u018a\u0197\5T+\2\u018b"+
		"\u0197\5D#\2\u018c\u0197\5F$\2\u018d\u0197\5\64\33\2\u018e\u0197\5\20"+
		"\t\2\u018f\u0197\5\66\34\2\u0190\u0197\5:\36\2\u0191\u0197\58\35\2\u0192"+
		"\u0197\5<\37\2\u0193\u0197\5> \2\u0194\u0197\5@!\2\u0195\u0197\5R*\2\u0196"+
		"\u0189\3\2\2\2\u0196\u018a\3\2\2\2\u0196\u018b\3\2\2\2\u0196\u018c\3\2"+
		"\2\2\u0196\u018d\3\2\2\2\u0196\u018e\3\2\2\2\u0196\u018f\3\2\2\2\u0196"+
		"\u0190\3\2\2\2\u0196\u0191\3\2\2\2\u0196\u0192\3\2\2\2\u0196\u0193\3\2"+
		"\2\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2\2\2\u0197\63\3\2\2\2\u0198\u0199"+
		"\7\30\2\2\u0199\u019a\5V,\2\u019a\u019b\7H\2\2\u019b\65\3\2\2\2\u019c"+
		"\u019d\7\7\2\2\u019d\u019e\7$\2\2\u019e\u019f\5V,\2\u019f\u01a0\7%\2\2"+
		"\u01a0\u01a7\5\60\31\2\u01a1\u01a2\7\b\2\2\u01a2\u01a3\7$\2\2\u01a3\u01a4"+
		"\5V,\2\u01a4\u01a5\7%\2\2\u01a5\u01a6\5\60\31\2\u01a6\u01a8\3\2\2\2\u01a7"+
		"\u01a1\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01aa\7\t"+
		"\2\2\u01aa\u01ac\5\60\31\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\67\3\2\2\2\u01ad\u01ae\7\n\2\2\u01ae\u01af\7$\2\2\u01af\u01b0\7B\2\2"+
		"\u01b0\u01b1\7\6\2\2\u01b1\u01b2\5B\"\2\u01b2\u01b3\7%\2\2\u01b3\u01b4"+
		"\5\60\31\2\u01b49\3\2\2\2\u01b5\u01b6\7\13\2\2\u01b6\u01b9\7$\2\2\u01b7"+
		"\u01b8\7B\2\2\u01b8\u01ba\7+\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2"+
		"\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\5*\26\2\u01bc\u01bd\7B\2\2\u01bd\u01be"+
		"\7\6\2\2\u01be\u01bf\5V,\2\u01bf\u01c0\7%\2\2\u01c0\u01c1\5\60\31\2\u01c1"+
		";\3\2\2\2\u01c2\u01c3\7\13\2\2\u01c3\u01c4\7$\2\2\u01c4\u01c5\5*\26\2"+
		"\u01c5\u01c6\7B\2\2\u01c6\u01c7\7+\2\2\u01c7\u01c8\5*\26\2\u01c8\u01c9"+
		"\7B\2\2\u01c9\u01ca\7\6\2\2\u01ca\u01cb\5V,\2\u01cb\u01cc\7%\2\2\u01cc"+
		"\u01cd\5\60\31\2\u01cd=\3\2\2\2\u01ce\u01cf\7\24\2\2\u01cf\u01d0\7H\2"+
		"\2\u01d0?\3\2\2\2\u01d1\u01d2\7\26\2\2\u01d2\u01d3\7H\2\2\u01d3A\3\2\2"+
		"\2\u01d4\u01d6\5V,\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01d8\7\f\2\2\u01d8\u01db\5V,\2\u01d9\u01da\7\r\2\2\u01da"+
		"\u01dc\5V,\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dcC\3\2\2\2\u01dd"+
		"\u01de\5V,\2\u01de\u01df\7H\2\2\u01dfE\3\2\2\2\u01e0\u01e1\5V,\2\u01e1"+
		"\u01e2\7,\2\2\u01e2\u01e3\7\16\2\2\u01e3\u01e5\7$\2\2\u01e4\u01e6\5V,"+
		"\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8"+
		"\7%\2\2\u01e8\u01e9\7H\2\2\u01e9G\3\2\2\2\u01ea\u01ef\5V,\2\u01eb\u01ec"+
		"\7+\2\2\u01ec\u01ee\5V,\2\u01ed\u01eb\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f6\3\2\2\2\u01f1\u01ef\3\2"+
		"\2\2\u01f2\u01f3\7+\2\2\u01f3\u01f5\5J&\2\u01f4\u01f2\3\2\2\2\u01f5\u01f8"+
		"\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u0202\3\2\2\2\u01f8"+
		"\u01f6\3\2\2\2\u01f9\u01fe\5J&\2\u01fa\u01fb\7+\2\2\u01fb\u01fd\5J&\2"+
		"\u01fc\u01fa\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff"+
		"\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u01ea\3\2\2\2\u0201"+
		"\u01f9\3\2\2\2\u0202I\3\2\2\2\u0203\u0204\7B\2\2\u0204\u0205\7\17\2\2"+
		"\u0205\u0206\5V,\2\u0206K\3\2\2\2\u0207\u0208\5V,\2\u0208\u0209\5N(\2"+
		"\u0209\u020a\7H\2\2\u020aM\3\2\2\2\u020b\u020c\7\17\2\2\u020c\u020d\5"+
		"V,\2\u020dO\3\2\2\2\u020e\u020f\7B\2\2\u020fQ\3\2\2\2\u0210\u0211\7!\2"+
		"\2\u0211\u0212\7B\2\2\u0212\u0214\7&\2\2\u0213\u0215\5H%\2\u0214\u0213"+
		"\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\7\'\2\2\u0217"+
		"\u0218\7H\2\2\u0218S\3\2\2\2\u0219\u0222\7\37\2\2\u021a\u021f\5V,\2\u021b"+
		"\u021c\7+\2\2\u021c\u021e\5V,\2\u021d\u021b\3\2\2\2\u021e\u0221\3\2\2"+
		"\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f"+
		"\3\2\2\2\u0222\u021a\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0225\7H\2\2\u0225U\3\2\2\2\u0226\u0227\b,\1\2\u0227\u0235\5X-\2\u0228"+
		"\u0229\7$\2\2\u0229\u022a\5V,\2\u022a\u022b\7%\2\2\u022b\u0235\3\2\2\2"+
		"\u022c\u022d\t\2\2\2\u022d\u0235\5V,\22\u022e\u022f\7$\2\2\u022f\u0230"+
		"\5*\26\2\u0230\u0231\7%\2\2\u0231\u0232\5V,\21\u0232\u0235\3\2\2\2\u0233"+
		"\u0235\5`\61\2\u0234\u0226\3\2\2\2\u0234\u0228\3\2\2\2\u0234\u022c\3\2"+
		"\2\2\u0234\u022e\3\2\2\2\u0234\u0233\3\2\2\2\u0235\u0273\3\2\2\2\u0236"+
		"\u0237\f\20\2\2\u0237\u0238\7\62\2\2\u0238\u0272\5V,\20\u0239\u023a\f"+
		"\17\2\2\u023a\u023b\t\3\2\2\u023b\u0272\5V,\20\u023c\u023d\f\16\2\2\u023d"+
		"\u023e\t\4\2\2\u023e\u0272\5V,\17\u023f\u0240\f\r\2\2\u0240\u0241\t\5"+
		"\2\2\u0241\u0272\5V,\16\u0242\u0243\f\f\2\2\u0243\u0244\t\6\2\2\u0244"+
		"\u0272\5V,\r\u0245\u0246\f\13\2\2\u0246\u0247\t\7\2\2\u0247\u0272\5V,"+
		"\f\u0248\u0249\f\n\2\2\u0249\u024a\78\2\2\u024a\u0272\5V,\13\u024b\u024c"+
		"\f\t\2\2\u024c\u024d\7:\2\2\u024d\u0272\5V,\n\u024e\u024f\f\b\2\2\u024f"+
		"\u0250\79\2\2\u0250\u0272\5V,\t\u0251\u0252\f\7\2\2\u0252\u0253\7\65\2"+
		"\2\u0253\u0272\5V,\b\u0254\u0255\f\6\2\2\u0255\u0256\7\66\2\2\u0256\u0272"+
		"\5V,\7\u0257\u0258\f\5\2\2\u0258\u0259\7\22\2\2\u0259\u025a\5V,\2\u025a"+
		"\u025b\7\6\2\2\u025b\u025c\5V,\5\u025c\u0272\3\2\2\2\u025d\u025e\f\4\2"+
		"\2\u025e\u025f\t\b\2\2\u025f\u0260\7\17\2\2\u0260\u0272\5V,\4\u0261\u0262"+
		"\f\30\2\2\u0262\u0272\t\t\2\2\u0263\u0264\f\27\2\2\u0264\u0265\7(\2\2"+
		"\u0265\u0266\5V,\2\u0266\u0267\7)\2\2\u0267\u0272\3\2\2\2\u0268\u0269"+
		"\f\26\2\2\u0269\u026a\7,\2\2\u026a\u0272\7B\2\2\u026b\u026c\f\25\2\2\u026c"+
		"\u026e\7$\2\2\u026d\u026f\5H%\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2"+
		"\2\u026f\u0270\3\2\2\2\u0270\u0272\7%\2\2\u0271\u0236\3\2\2\2\u0271\u0239"+
		"\3\2\2\2\u0271\u023c\3\2\2\2\u0271\u023f\3\2\2\2\u0271\u0242\3\2\2\2\u0271"+
		"\u0245\3\2\2\2\u0271\u0248\3\2\2\2\u0271\u024b\3\2\2\2\u0271\u024e\3\2"+
		"\2\2\u0271\u0251\3\2\2\2\u0271\u0254\3\2\2\2\u0271\u0257\3\2\2\2\u0271"+
		"\u025d\3\2\2\2\u0271\u0261\3\2\2\2\u0271\u0263\3\2\2\2\u0271\u0268\3\2"+
		"\2\2\u0271\u026b\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274W\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u027a\5Z.\2\u0277"+
		"\u027a\5\\/\2\u0278\u027a\5^\60\2\u0279\u0276\3\2\2\2\u0279\u0277\3\2"+
		"\2\2\u0279\u0278\3\2\2\2\u027aY\3\2\2\2\u027b\u027c\7\23\2\2\u027c\u027d"+
		"\7B\2\2\u027d\u027f\7$\2\2\u027e\u0280\5H%\2\u027f\u027e\3\2\2\2\u027f"+
		"\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\7%\2\2\u0282[\3\2\2\2\u0283"+
		"\u0284\7\23\2\2\u0284\u0299\7B\2\2\u0285\u0286\7(\2\2\u0286\u0287\5V,"+
		"\2\u0287\u028a\7)\2\2\u0288\u0289\7&\2\2\u0289\u028b\7\'\2\2\u028a\u0288"+
		"\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u029a\3\2\2\2\u028c\u028d\7(\2\2\u028d"+
		"\u028e\7)\2\2\u028e\u028f\7&\2\2\u028f\u0294\5V,\2\u0290\u0291\7+\2\2"+
		"\u0291\u0293\5V,\2\u0292\u0290\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292"+
		"\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0297\3\2\2\2\u0296\u0294\3\2\2\2\u0297"+
		"\u0298\7\'\2\2\u0298\u029a\3\2\2\2\u0299\u0285\3\2\2\2\u0299\u028c\3\2"+
		"\2\2\u029a]\3\2\2\2\u029b\u029c\7\23\2\2\u029c\u029d\5.\30\2\u029d\u029e"+
		"\7$\2\2\u029e\u029f\7%\2\2\u029f_\3\2\2\2\u02a0\u02a3\5b\62\2\u02a1\u02a3"+
		"\5P)\2\u02a2\u02a0\3\2\2\2\u02a2\u02a1\3\2\2\2\u02a3a\3\2\2\2\u02a4\u02a5"+
		"\t\n\2\2\u02a5c\3\2\2\2?hz\u0080\u008c\u0096\u009b\u00a0\u00ac\u00af\u00b4"+
		"\u00b6\u00bb\u00c4\u00c7\u00cc\u00d6\u00dc\u00e8\u00ee\u00fc\u0107\u010f"+
		"\u0115\u011b\u0124\u012a\u0132\u0139\u0143\u0148\u014d\u0155\u015f\u0166"+
		"\u0172\u0182\u0184\u0196\u01a7\u01ab\u01b9\u01d5\u01db\u01e5\u01ef\u01f6"+
		"\u01fe\u0201\u0214\u021f\u0222\u0234\u026e\u0271\u0273\u0279\u027f\u028a"+
		"\u0294\u0299\u02a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}