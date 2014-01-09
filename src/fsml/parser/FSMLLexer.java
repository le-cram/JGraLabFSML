package fsml.parser;
// Generated from FSML.egl by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FSMLLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, Name=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'->'", "'initial'", "'{'", "'/'", "'}'", "';'", "'state'", "Name"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "Name", "Letter"
	};


	public FSMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FSML.egl"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4\n\65\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\6\t\60\n\t\r\t\16\t"+
		"\61\3\n\3\n\2\13\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\2\1\3\2\3\7&&\62;C\\aac|\64\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\25\3\2\2\2"+
		"\5\30\3\2\2\2\7 \3\2\2\2\t\"\3\2\2\2\13$\3\2\2\2\r&\3\2\2\2\17(\3\2\2"+
		"\2\21/\3\2\2\2\23\63\3\2\2\2\25\26\7/\2\2\26\27\7@\2\2\27\4\3\2\2\2\30"+
		"\31\7k\2\2\31\32\7p\2\2\32\33\7k\2\2\33\34\7v\2\2\34\35\7k\2\2\35\36\7"+
		"c\2\2\36\37\7n\2\2\37\6\3\2\2\2 !\7}\2\2!\b\3\2\2\2\"#\7\61\2\2#\n\3\2"+
		"\2\2$%\7\177\2\2%\f\3\2\2\2&\'\7=\2\2\'\16\3\2\2\2()\7u\2\2)*\7v\2\2*"+
		"+\7c\2\2+,\7v\2\2,-\7g\2\2-\20\3\2\2\2.\60\5\23\n\2/.\3\2\2\2\60\61\3"+
		"\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\22\3\2\2\2\63\64\t\2\2\2\64\24\3\2"+
		"\2\2\4\2\61";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}