// Generated from DSL.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ADD=6, MINUS=7, MULT=8, DIV=9, 
		MOD=10, OPAR=11, CPAR=12, LTE=13, LT=14, GTE=15, GT=16, ASSIGN=17, EQ=18, 
		NEQ=19, AND=20, OR=21, NUMBER=22, ID=23, STRING=24, NL=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "ADD", "MINUS", "MULT", "DIV", 
			"MOD", "OPAR", "CPAR", "LTE", "LT", "GTE", "GT", "ASSIGN", "EQ", "NEQ", 
			"AND", "OR", "NUMBER", "ID", "STRING", "NL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'elseif'", "'else'", "'end'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'('", "')'", "'<='", "'<'", "'>='", "'>'", "'='", 
			"'=='", "'!='", "'and'", "'or'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "ADD", "MINUS", "MULT", "DIV", "MOD", 
			"OPAR", "CPAR", "LTE", "LT", "GTE", "GT", "ASSIGN", "EQ", "NEQ", "AND", 
			"OR", "NUMBER", "ID", "STRING", "NL", "WS"
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


	public DSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DSL.g4"; }

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
		"\u0004\u0000\u001a\u00a0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0005\u0015v\b"+
		"\u0015\n\u0015\f\u0015y\t\u0015\u0001\u0015\u0003\u0015|\b\u0015\u0001"+
		"\u0015\u0004\u0015\u007f\b\u0015\u000b\u0015\f\u0015\u0080\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u0085\b\u0016\n\u0016\f\u0016\u0088\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u008c\b\u0017\n\u0017\f\u0017\u008f\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0003\u0018\u0094\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0098\b\u0018\u0001\u0019\u0004\u0019\u009b\b"+
		"\u0019\u000b\u0019\f\u0019\u009c\u0001\u0019\u0001\u0019\u0000\u0000\u001a"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a\u0001\u0000\u0005\u0001\u000009\u0003\u0000AZ__"+
		"az\u0004\u000009AZ__az\u0003\u0000\n\n\r\r\"\"\u0003\u0000\t\n\r\r  \u00a7"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00015\u0001\u0000\u0000\u0000\u00038\u0001\u0000\u0000\u0000"+
		"\u0005=\u0001\u0000\u0000\u0000\u0007D\u0001\u0000\u0000\u0000\tI\u0001"+
		"\u0000\u0000\u0000\u000bM\u0001\u0000\u0000\u0000\rO\u0001\u0000\u0000"+
		"\u0000\u000fQ\u0001\u0000\u0000\u0000\u0011S\u0001\u0000\u0000\u0000\u0013"+
		"U\u0001\u0000\u0000\u0000\u0015W\u0001\u0000\u0000\u0000\u0017Y\u0001"+
		"\u0000\u0000\u0000\u0019[\u0001\u0000\u0000\u0000\u001b^\u0001\u0000\u0000"+
		"\u0000\u001d`\u0001\u0000\u0000\u0000\u001fc\u0001\u0000\u0000\u0000!"+
		"e\u0001\u0000\u0000\u0000#g\u0001\u0000\u0000\u0000%j\u0001\u0000\u0000"+
		"\u0000\'m\u0001\u0000\u0000\u0000)q\u0001\u0000\u0000\u0000+{\u0001\u0000"+
		"\u0000\u0000-\u0082\u0001\u0000\u0000\u0000/\u0089\u0001\u0000\u0000\u0000"+
		"1\u0097\u0001\u0000\u0000\u00003\u009a\u0001\u0000\u0000\u000056\u0005"+
		"i\u0000\u000067\u0005f\u0000\u00007\u0002\u0001\u0000\u0000\u000089\u0005"+
		"t\u0000\u00009:\u0005h\u0000\u0000:;\u0005e\u0000\u0000;<\u0005n\u0000"+
		"\u0000<\u0004\u0001\u0000\u0000\u0000=>\u0005e\u0000\u0000>?\u0005l\u0000"+
		"\u0000?@\u0005s\u0000\u0000@A\u0005e\u0000\u0000AB\u0005i\u0000\u0000"+
		"BC\u0005f\u0000\u0000C\u0006\u0001\u0000\u0000\u0000DE\u0005e\u0000\u0000"+
		"EF\u0005l\u0000\u0000FG\u0005s\u0000\u0000GH\u0005e\u0000\u0000H\b\u0001"+
		"\u0000\u0000\u0000IJ\u0005e\u0000\u0000JK\u0005n\u0000\u0000KL\u0005d"+
		"\u0000\u0000L\n\u0001\u0000\u0000\u0000MN\u0005+\u0000\u0000N\f\u0001"+
		"\u0000\u0000\u0000OP\u0005-\u0000\u0000P\u000e\u0001\u0000\u0000\u0000"+
		"QR\u0005*\u0000\u0000R\u0010\u0001\u0000\u0000\u0000ST\u0005/\u0000\u0000"+
		"T\u0012\u0001\u0000\u0000\u0000UV\u0005%\u0000\u0000V\u0014\u0001\u0000"+
		"\u0000\u0000WX\u0005(\u0000\u0000X\u0016\u0001\u0000\u0000\u0000YZ\u0005"+
		")\u0000\u0000Z\u0018\u0001\u0000\u0000\u0000[\\\u0005<\u0000\u0000\\]"+
		"\u0005=\u0000\u0000]\u001a\u0001\u0000\u0000\u0000^_\u0005<\u0000\u0000"+
		"_\u001c\u0001\u0000\u0000\u0000`a\u0005>\u0000\u0000ab\u0005=\u0000\u0000"+
		"b\u001e\u0001\u0000\u0000\u0000cd\u0005>\u0000\u0000d \u0001\u0000\u0000"+
		"\u0000ef\u0005=\u0000\u0000f\"\u0001\u0000\u0000\u0000gh\u0005=\u0000"+
		"\u0000hi\u0005=\u0000\u0000i$\u0001\u0000\u0000\u0000jk\u0005!\u0000\u0000"+
		"kl\u0005=\u0000\u0000l&\u0001\u0000\u0000\u0000mn\u0005a\u0000\u0000n"+
		"o\u0005n\u0000\u0000op\u0005d\u0000\u0000p(\u0001\u0000\u0000\u0000qr"+
		"\u0005o\u0000\u0000rs\u0005r\u0000\u0000s*\u0001\u0000\u0000\u0000tv\u0007"+
		"\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000z|\u0005.\u0000\u0000{w\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000}\u007f\u0007"+
		"\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081,\u0001\u0000\u0000\u0000\u0082\u0086\u0007\u0001\u0000\u0000\u0083"+
		"\u0085\u0007\u0002\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087.\u0001\u0000\u0000\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0089\u008d\u0005\"\u0000\u0000\u008a\u008c\b"+
		"\u0003\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005\"\u0000\u0000\u00910\u0001\u0000"+
		"\u0000\u0000\u0092\u0094\u0005\r\u0000\u0000\u0093\u0092\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0098\u0005\n\u0000\u0000\u0096\u0098\u0005\r\u0000\u0000"+
		"\u0097\u0093\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u00982\u0001\u0000\u0000\u0000\u0099\u009b\u0007\u0004\u0000\u0000\u009a"+
		"\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0006\u0019\u0000\u0000\u009f"+
		"4\u0001\u0000\u0000\u0000\t\u0000w{\u0080\u0086\u008d\u0093\u0097\u009c"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}