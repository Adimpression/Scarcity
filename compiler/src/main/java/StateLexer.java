// Generated from State.g4 by ANTLR 4.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IS=1, NOT=2, DOT=3, SLA=4, S=5, T=6, P=7, OSQB=8, CSQB=9, CHAR=10, LINE_COMMENT=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'"
	};
	public static final String[] ruleNames = {
		"IS", "NOT", "DOT", "SLA", "S", "T", "P", "OSQB", "CSQB", "CHAR", "LINE_COMMENT"
	};


	public StateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "State.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rN\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\61\n\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fB\n\f\3\f\3\f\3\f\3\f\7\fH\n"+
		"\f\f\f\16\fK\13\f\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\3\2\6\6\2\f\f\17\17\"\"<<\5\2\62;C\\c|\4\2\13\13//\4\2\f"+
		"\f\17\17R\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\3\31\3\2\2\2\5\35\3\2\2\2\7\"\3\2\2\2\t$\3\2\2\2\13&\3\2\2\2"+
		"\r\60\3\2\2\2\17\62\3\2\2\2\21\64\3\2\2\2\23\66\3\2\2\2\258\3\2\2\2\27"+
		"A\3\2\2\2\31\32\7K\2\2\32\33\7u\2\2\33\34\7\"\2\2\34\4\3\2\2\2\35\36\7"+
		"P\2\2\36\37\7q\2\2\37 \7v\2\2 !\7\"\2\2!\6\3\2\2\2\"#\7\60\2\2#\b\3\2"+
		"\2\2$%\7\61\2\2%\n\3\2\2\2&\'\t\2\2\2\'(\3\2\2\2()\b\6\2\2)\f\3\2\2\2"+
		"*\61\7\13\2\2+,\7\"\2\2,-\7\"\2\2-.\7\"\2\2.\61\7\"\2\2/\61\7/\2\2\60"+
		"*\3\2\2\2\60+\3\2\2\2\60/\3\2\2\2\61\16\3\2\2\2\62\63\7~\2\2\63\20\3\2"+
		"\2\2\64\65\7]\2\2\65\22\3\2\2\2\66\67\7_\2\2\67\24\3\2\2\289\t\3\2\29"+
		"\26\3\2\2\2:;\7\"\2\2;<\7\"\2\2<=\7\"\2\2=B\7\"\2\2>B\t\4\2\2?@\7/\2\2"+
		"@B\7\"\2\2A:\3\2\2\2A>\3\2\2\2A?\3\2\2\2BC\3\2\2\2CD\7\61\2\2DE\7\61\2"+
		"\2EI\3\2\2\2FH\n\5\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2"+
		"\2KI\3\2\2\2LM\b\f\2\2M\30\3\2\2\2\6\2\60AI\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}