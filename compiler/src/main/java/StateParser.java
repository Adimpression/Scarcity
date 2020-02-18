// Generated from State.g4 by ANTLR 4.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IS=1, NOT=2, DOT=3, SLA=4, S=5, T=6, P=7, OSQB=8, CSQB=9, CHAR=10, LINE_COMMENT=11;
	public static final String[] tokenNames = {
		"<INVALID>", "'Is '", "'Not '", "'.'", "'/'", "S", "T", "'|'", "'['", 
		"']'", "CHAR", "LINE_COMMENT"
	};
	public static final int
		RULE_main = 0, RULE_state = 1, RULE_dependency = 2, RULE_ded = 3, RULE_did = 4, 
		RULE_dred = 5, RULE_dbored = 6, RULE_red = 7, RULE_bored = 8, RULE_ed = 9, 
		RULE_id = 10;
	public static final String[] ruleNames = {
		"main", "state", "dependency", "ded", "did", "dred", "dbored", "red", 
		"bored", "ed", "id"
	};

	@Override
	public String getGrammarFileName() { return "State.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public DependencyContext dependency(int i) {
			return getRuleContext(DependencyContext.class,i);
		}
		public TerminalNode EOF() { return getToken(StateParser.EOF, 0); }
		public List<DependencyContext> dependency() {
			return getRuleContexts(DependencyContext.class);
		}
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateVisitor ) return ((StateVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); state();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T) {
				{
				{
				setState(23); dependency();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29); match(EOF);
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

	public static class StateContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateVisitor ) return ((StateVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); id();
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

	public static class DependencyContext extends ParserRuleContext {
		public DidContext did() {
			return getRuleContext(DidContext.class,0);
		}
		public DboredContext dbored() {
			return getRuleContext(DboredContext.class,0);
		}
		public DedContext ded() {
			return getRuleContext(DedContext.class,0);
		}
		public DredContext dred() {
			return getRuleContext(DredContext.class,0);
		}
		public DependencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependency; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).enterDependency(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).exitDependency(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateVisitor ) return ((StateVisitor<? extends T>)visitor).visitDependency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependencyContext dependency() throws RecognitionException {
		DependencyContext _localctx = new DependencyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dependency);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(33); did();
				}
				break;

			case 2:
				{
				setState(34); ded();
				}
				break;

			case 3:
				{
				setState(35); dred();
				}
				break;

			case 4:
				{
				setState(36); dbored();
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

	public static class DedContext extends ParserRuleContext {
		public TerminalNode T() { return getToken(StateParser.T, 0); }
		public EdContext ed() {
			return getRuleContext(EdContext.class,0);
		}
		public DedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ded; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).enterDed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).exitDed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateVisitor ) return ((StateVisitor<? extends T>)visitor).visitDed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DedContext ded() throws RecognitionException {
		DedContext _localctx = new DedContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ded);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(T);
			setState(40); ed();
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

	public static class DidContext extends ParserRuleContext {
		public TerminalNode T() { return getToken(StateParser.T, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_did; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).enterDid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).exitDid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateVisitor ) return ((StateVisitor<? extends T>)visitor).visitDid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DidContext did() throws RecognitionException {
		DidContext _localctx = new DidContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_did);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(T);
			setState(43); id();
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

	public static class DredContext extends ParserRuleContext {
		public TerminalNode T() { return getToken(StateParser.T, 0); }
		public RedContext red() {
			return getRuleContext(RedContext.class,0);
		}
		public DredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).enterDred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).exitDred(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateVisitor ) return ((StateVisitor<? extends T>)visitor).visitDred(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DredContext dred() throws RecognitionException {
		DredContext _localctx = new DredContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(T);
			setState(46); red();
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

	public static class DboredContext extends ParserRuleContext {
		public BoredContext bored() {
			return getRuleContext(BoredContext.class,0);
		}
		public TerminalNode T() { return getToken(StateParser.T, 0); }
		public DboredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbored; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).enterDbored(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).exitDbored(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateVisitor ) return ((StateVisitor<? extends T>)visitor).visitDbored(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DboredContext dbored() throws RecognitionException {
		DboredContext _localctx = new DboredContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dbored);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(T);
			setState(49); bored();
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

	public static class RedContext extends ParserRuleContext {
		public EdContext ed() {
			return getRuleContext(EdContext.class,0);
		}
		public TerminalNode CSQB() { return getToken(StateParser.CSQB, 0); }
		public TerminalNode OSQB() { return getToken(StateParser.OSQB, 0); }
		public RedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_red; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).enterRed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).exitRed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateVisitor ) return ((StateVisitor<? extends T>)visitor).visitRed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RedContext red() throws RecognitionException {
		RedContext _localctx = new RedContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_red);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(OSQB);
			setState(52); ed();
			setState(53); match(CSQB);
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

	public static class BoredContext extends ParserRuleContext {
		public List<EdContext> ed() {
			return getRuleContexts(EdContext.class);
		}
		public TerminalNode P(int i) {
			return getToken(StateParser.P, i);
		}
		public EdContext ed(int i) {
			return getRuleContext(EdContext.class,i);
		}
		public List<TerminalNode> P() { return getTokens(StateParser.P); }
		public BoredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bored; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).enterBored(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).exitBored(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateVisitor ) return ((StateVisitor<? extends T>)visitor).visitBored(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoredContext bored() throws RecognitionException {
		BoredContext _localctx = new BoredContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bored);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); ed();
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56); match(P);
				setState(57); ed();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==P );
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

	public static class EdContext extends ParserRuleContext {
		public TerminalNode SLA() { return getToken(StateParser.SLA, 0); }
		public List<TerminalNode> DOT() { return getTokens(StateParser.DOT); }
		public TerminalNode CHAR(int i) {
			return getToken(StateParser.CHAR, i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> CHAR() { return getTokens(StateParser.CHAR); }
		public TerminalNode DOT(int i) {
			return getToken(StateParser.DOT, i);
		}
		public EdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).enterEd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).exitEd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateVisitor ) return ((StateVisitor<? extends T>)visitor).visitEd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdContext ed() throws RecognitionException {
		EdContext _localctx = new EdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62); match(CHAR);
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHAR );
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67); match(DOT);
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(68); match(CHAR);
					}
					}
					setState(71); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CHAR );
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
			setState(77); match(SLA);
			setState(78); id();
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(StateParser.NOT, 0); }
		public TerminalNode IS() { return getToken(StateParser.IS, 0); }
		public TerminalNode CHAR(int i) {
			return getToken(StateParser.CHAR, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(StateParser.CHAR); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StateListener ) ((StateListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StateVisitor ) return ((StateVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==IS || _la==NOT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81); match(CHAR);
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHAR );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\rY\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\5\4(\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\6\n=\n\n\r\n\16\n>\3\13\6\13B\n\13\r\13\16\13C\3"+
		"\13\3\13\6\13H\n\13\r\13\16\13I\6\13L\n\13\r\13\16\13M\3\13\3\13\3\13"+
		"\3\f\3\f\6\fU\n\f\r\f\16\fV\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3"+
		"\2\3\4V\2\30\3\2\2\2\4!\3\2\2\2\6\'\3\2\2\2\b)\3\2\2\2\n,\3\2\2\2\f/\3"+
		"\2\2\2\16\62\3\2\2\2\20\65\3\2\2\2\229\3\2\2\2\24A\3\2\2\2\26R\3\2\2\2"+
		"\30\34\5\4\3\2\31\33\5\6\4\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2"+
		"\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\2\2\3 \3\3\2\2\2!\"\5"+
		"\26\f\2\"\5\3\2\2\2#(\5\n\6\2$(\5\b\5\2%(\5\f\7\2&(\5\16\b\2\'#\3\2\2"+
		"\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\7\3\2\2\2)*\7\b\2\2*+\5\24\13\2+"+
		"\t\3\2\2\2,-\7\b\2\2-.\5\26\f\2.\13\3\2\2\2/\60\7\b\2\2\60\61\5\20\t\2"+
		"\61\r\3\2\2\2\62\63\7\b\2\2\63\64\5\22\n\2\64\17\3\2\2\2\65\66\7\n\2\2"+
		"\66\67\5\24\13\2\678\7\13\2\28\21\3\2\2\29<\5\24\13\2:;\7\t\2\2;=\5\24"+
		"\13\2<:\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\23\3\2\2\2@B\7\f\2\2A@"+
		"\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DK\3\2\2\2EG\7\5\2\2FH\7\f\2\2G"+
		"F\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KE\3\2\2\2LM\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\6\2\2PQ\5\26\f\2Q\25\3\2\2\2RT\t\2"+
		"\2\2SU\7\f\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\27\3\2\2\2\t\34"+
		"\'>CIMV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}