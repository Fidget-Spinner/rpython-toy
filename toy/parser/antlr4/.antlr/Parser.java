// Generated from /home/ken/Documents/GitHub/rpython-toy/toy/parser/antlr4/Parser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, EQ=4, COMMA=5, SEMI=6, LPAREN=7, RPAREN=8, LCURLY=9, 
		RCURLY=10, DEF=11, WHILE=12, IF=13, ELSE=14, BINOP=15, INT=16, ID=17, 
		WS=18;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_assgn = 2, RULE_whil = 3, RULE_if_els = 4, 
		RULE_func_def = 5, RULE_expr = 6, RULE_func = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "assgn", "whil", "if_els", "func_def", "expr", "func"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'or'", "'not'", "'='", "','", "';'", "'('", "')'", "'{'", 
			"'}'", "'def'", "'while'", "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "NOT", "EQ", "COMMA", "SEMI", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "DEF", "WHILE", "IF", "ELSE", "BINOP", "INT", "ID", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Parser.EOF, 0); }
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case WHILE:
			case IF:
			case INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				stat();
				setState(17);
				match(EOF);
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				func_def();
				setState(20);
				match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public AssgnContext assgn() {
			return getRuleContext(AssgnContext.class,0);
		}
		public WhilContext whil() {
			return getRuleContext(WhilContext.class,0);
		}
		public If_elsContext if_els() {
			return getRuleContext(If_elsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				assgn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				whil();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				if_els();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				expr(0);
				setState(28);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssgnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode EQ() { return getToken(Parser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Parser.SEMI, 0); }
		public AssgnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assgn; }
	}

	public final AssgnContext assgn() throws RecognitionException {
		AssgnContext _localctx = new AssgnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assgn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(ID);
			setState(33);
			match(EQ);
			setState(34);
			expr(0);
			setState(35);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhilContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Parser.RCURLY, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public WhilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whil; }
	}

	public final WhilContext whil() throws RecognitionException {
		WhilContext _localctx = new WhilContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whil);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(WHILE);
			setState(38);
			match(LPAREN);
			setState(39);
			expr(0);
			setState(40);
			match(RPAREN);
			setState(41);
			match(LCURLY);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 208904L) != 0)) {
				{
				{
				setState(42);
				stat();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_elsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public List<TerminalNode> LCURLY() { return getTokens(Parser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(Parser.LCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(Parser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(Parser.RCURLY, i);
		}
		public TerminalNode ELSE() { return getToken(Parser.ELSE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public If_elsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_els; }
	}

	public final If_elsContext if_els() throws RecognitionException {
		If_elsContext _localctx = new If_elsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_els);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(IF);
			setState(51);
			match(LPAREN);
			setState(52);
			expr(0);
			setState(53);
			match(RPAREN);
			setState(54);
			match(LCURLY);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 208904L) != 0)) {
				{
				{
				setState(55);
				stat();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(RCURLY);
			setState(62);
			match(ELSE);
			setState(63);
			match(LCURLY);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 208904L) != 0)) {
				{
				{
				setState(64);
				stat();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(Parser.DEF, 0); }
		public List<TerminalNode> ID() { return getTokens(Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Parser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(Parser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(Parser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(DEF);
			setState(73);
			match(ID);
			setState(74);
			match(LPAREN);
			setState(75);
			match(ID);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(76);
				match(COMMA);
				setState(77);
				match(ID);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(RPAREN);
			setState(84);
			match(LCURLY);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 208904L) != 0)) {
				{
				{
				setState(85);
				stat();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode INT() { return getToken(Parser.INT, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TerminalNode NOT() { return getToken(Parser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Parser.OR, 0); }
		public TerminalNode BINOP() { return getToken(Parser.BINOP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(94);
				match(ID);
				}
				break;
			case 2:
				{
				setState(95);
				match(INT);
				}
				break;
			case 3:
				{
				setState(96);
				func();
				}
				break;
			case 4:
				{
				setState(97);
				match(NOT);
				setState(98);
				expr(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(102);
						match(AND);
						setState(103);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(105);
						match(OR);
						setState(106);
						expr(3);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(108);
						match(BINOP);
						setState(109);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(Parser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(Parser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ID);
			setState(116);
			match(LPAREN);
			setState(117);
			expr(0);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(118);
				match(COMMA);
				setState(119);
				expr(0);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012\u0080\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\u0017\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u001f\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003,\b\u0003\n\u0003\f\u0003"+
		"/\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00049\b\u0004\n\u0004\f\u0004"+
		"<\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"B\b\u0004\n\u0004\f\u0004E\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"O\b\u0005\n\u0005\f\u0005R\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005W\b\u0005\n\u0005\f\u0005Z\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006d\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"o\b\u0006\n\u0006\f\u0006r\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007y\b\u0007\n\u0007\f\u0007|\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0001\f\b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0000\u0000\u0087\u0000\u0016\u0001\u0000\u0000\u0000"+
		"\u0002\u001e\u0001\u0000\u0000\u0000\u0004 \u0001\u0000\u0000\u0000\u0006"+
		"%\u0001\u0000\u0000\u0000\b2\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000"+
		"\u0000\fc\u0001\u0000\u0000\u0000\u000es\u0001\u0000\u0000\u0000\u0010"+
		"\u0011\u0003\u0002\u0001\u0000\u0011\u0012\u0005\u0000\u0000\u0001\u0012"+
		"\u0017\u0001\u0000\u0000\u0000\u0013\u0014\u0003\n\u0005\u0000\u0014\u0015"+
		"\u0005\u0000\u0000\u0001\u0015\u0017\u0001\u0000\u0000\u0000\u0016\u0010"+
		"\u0001\u0000\u0000\u0000\u0016\u0013\u0001\u0000\u0000\u0000\u0017\u0001"+
		"\u0001\u0000\u0000\u0000\u0018\u001f\u0003\u0004\u0002\u0000\u0019\u001f"+
		"\u0003\u0006\u0003\u0000\u001a\u001f\u0003\b\u0004\u0000\u001b\u001c\u0003"+
		"\f\u0006\u0000\u001c\u001d\u0005\u0006\u0000\u0000\u001d\u001f\u0001\u0000"+
		"\u0000\u0000\u001e\u0018\u0001\u0000\u0000\u0000\u001e\u0019\u0001\u0000"+
		"\u0000\u0000\u001e\u001a\u0001\u0000\u0000\u0000\u001e\u001b\u0001\u0000"+
		"\u0000\u0000\u001f\u0003\u0001\u0000\u0000\u0000 !\u0005\u0011\u0000\u0000"+
		"!\"\u0005\u0004\u0000\u0000\"#\u0003\f\u0006\u0000#$\u0005\u0006\u0000"+
		"\u0000$\u0005\u0001\u0000\u0000\u0000%&\u0005\f\u0000\u0000&\'\u0005\u0007"+
		"\u0000\u0000\'(\u0003\f\u0006\u0000()\u0005\b\u0000\u0000)-\u0005\t\u0000"+
		"\u0000*,\u0003\u0002\u0001\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u000001\u0005\n\u0000\u00001\u0007"+
		"\u0001\u0000\u0000\u000023\u0005\r\u0000\u000034\u0005\u0007\u0000\u0000"+
		"45\u0003\f\u0006\u000056\u0005\b\u0000\u00006:\u0005\t\u0000\u000079\u0003"+
		"\u0002\u0001\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000"+
		":8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000"+
		"\u0000<:\u0001\u0000\u0000\u0000=>\u0005\n\u0000\u0000>?\u0005\u000e\u0000"+
		"\u0000?C\u0005\t\u0000\u0000@B\u0003\u0002\u0001\u0000A@\u0001\u0000\u0000"+
		"\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005"+
		"\n\u0000\u0000G\t\u0001\u0000\u0000\u0000HI\u0005\u000b\u0000\u0000IJ"+
		"\u0005\u0011\u0000\u0000JK\u0005\u0007\u0000\u0000KP\u0005\u0011\u0000"+
		"\u0000LM\u0005\u0005\u0000\u0000MO\u0005\u0011\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"ST\u0005\b\u0000\u0000TX\u0005\t\u0000\u0000UW\u0003\u0002\u0001\u0000"+
		"VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000[\\\u0005\n\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]^"+
		"\u0006\u0006\uffff\uffff\u0000^d\u0005\u0011\u0000\u0000_d\u0005\u0010"+
		"\u0000\u0000`d\u0003\u000e\u0007\u0000ab\u0005\u0003\u0000\u0000bd\u0003"+
		"\f\u0006\u0004c]\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000c`\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000dp\u0001\u0000\u0000\u0000"+
		"ef\n\u0003\u0000\u0000fg\u0005\u0001\u0000\u0000go\u0003\f\u0006\u0004"+
		"hi\n\u0002\u0000\u0000ij\u0005\u0002\u0000\u0000jo\u0003\f\u0006\u0003"+
		"kl\n\u0001\u0000\u0000lm\u0005\u000f\u0000\u0000mo\u0003\f\u0006\u0002"+
		"ne\u0001\u0000\u0000\u0000nh\u0001\u0000\u0000\u0000nk\u0001\u0000\u0000"+
		"\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000q\r\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0005"+
		"\u0011\u0000\u0000tu\u0005\u0007\u0000\u0000uz\u0003\f\u0006\u0000vw\u0005"+
		"\u0005\u0000\u0000wy\u0003\f\u0006\u0000xv\u0001\u0000\u0000\u0000y|\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{}\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005\b\u0000\u0000"+
		"~\u000f\u0001\u0000\u0000\u0000\u000b\u0016\u001e-:CPXcnpz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}