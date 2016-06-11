// Generated from /home/jorge/Desktop/TP-VF/grammar/Gramatica.g4 by ANTLR 4.5.3
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, NOME=23, ID=24, DATA=25, 
		INT=26, WS=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "NOME", "ID", "DATA", "INT", 
		"WS", "STRING", "ESC_SEQ", "OCTAL_ESC", "UNICODE_ESC", "HEX_DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'if'", "'('", "')'", "'else'", "'while'", "'['", 
		"']'", "'='", "';'", "'+'", "'-'", "'*'", "'/'", "'true'", "'false'", 
		"'&&'", "'||'", "'>'", "'<'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "NOME", 
		"ID", "DATA", "INT", "WS"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00bc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\7\31\u0085\n\31\f\31\16\31\u0088\13\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\6\33\u0091\n\33\r\33\16\33\u0092\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\7\35\u009c\n\35\f\35\16\35\u009f\13\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\5\36\u00a7\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u00b2\n\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\2\2\"\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\2;\2=\2?\2"+
		"A\2\3\2\b\5\2C\\aac|\7\2//\62;C\\aac|\5\2\13\f\17\17\"\"\3\2$$\n\2$$)"+
		")^^ddhhppttvv\5\2\62;CHch\u00be\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\tJ\3\2\2\2\13L\3\2\2"+
		"\2\rN\3\2\2\2\17S\3\2\2\2\21Y\3\2\2\2\23[\3\2\2\2\25]\3\2\2\2\27_\3\2"+
		"\2\2\31a\3\2\2\2\33c\3\2\2\2\35e\3\2\2\2\37g\3\2\2\2!i\3\2\2\2#n\3\2\2"+
		"\2%t\3\2\2\2\'w\3\2\2\2)z\3\2\2\2+|\3\2\2\2-~\3\2\2\2/\u0080\3\2\2\2\61"+
		"\u0082\3\2\2\2\63\u0089\3\2\2\2\65\u0090\3\2\2\2\67\u0094\3\2\2\29\u0098"+
		"\3\2\2\2;\u00a6\3\2\2\2=\u00b1\3\2\2\2?\u00b3\3\2\2\2A\u00ba\3\2\2\2C"+
		"D\7}\2\2D\4\3\2\2\2EF\7\177\2\2F\6\3\2\2\2GH\7k\2\2HI\7h\2\2I\b\3\2\2"+
		"\2JK\7*\2\2K\n\3\2\2\2LM\7+\2\2M\f\3\2\2\2NO\7g\2\2OP\7n\2\2PQ\7u\2\2"+
		"QR\7g\2\2R\16\3\2\2\2ST\7y\2\2TU\7j\2\2UV\7k\2\2VW\7n\2\2WX\7g\2\2X\20"+
		"\3\2\2\2YZ\7]\2\2Z\22\3\2\2\2[\\\7_\2\2\\\24\3\2\2\2]^\7?\2\2^\26\3\2"+
		"\2\2_`\7=\2\2`\30\3\2\2\2ab\7-\2\2b\32\3\2\2\2cd\7/\2\2d\34\3\2\2\2ef"+
		"\7,\2\2f\36\3\2\2\2gh\7\61\2\2h \3\2\2\2ij\7v\2\2jk\7t\2\2kl\7w\2\2lm"+
		"\7g\2\2m\"\3\2\2\2no\7h\2\2op\7c\2\2pq\7n\2\2qr\7u\2\2rs\7g\2\2s$\3\2"+
		"\2\2tu\7(\2\2uv\7(\2\2v&\3\2\2\2wx\7~\2\2xy\7~\2\2y(\3\2\2\2z{\7@\2\2"+
		"{*\3\2\2\2|}\7>\2\2},\3\2\2\2~\177\7#\2\2\177.\3\2\2\2\u0080\u0081\59"+
		"\35\2\u0081\60\3\2\2\2\u0082\u0086\t\2\2\2\u0083\u0085\t\3\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\62\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\5\65\33\2\u008a\u008b\7/\2"+
		"\2\u008b\u008c\5\65\33\2\u008c\u008d\7/\2\2\u008d\u008e\5\65\33\2\u008e"+
		"\64\3\2\2\2\u008f\u0091\4\62;\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2"+
		"\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\66\3\2\2\2\u0094\u0095"+
		"\t\4\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\34\2\2\u00978\3\2\2\2\u0098"+
		"\u009d\7$\2\2\u0099\u009c\5;\36\2\u009a\u009c\n\5\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7$"+
		"\2\2\u00a1:\3\2\2\2\u00a2\u00a3\7^\2\2\u00a3\u00a7\t\6\2\2\u00a4\u00a7"+
		"\5? \2\u00a5\u00a7\5=\37\2\u00a6\u00a2\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7<\3\2\2\2\u00a8\u00a9\7^\2\2\u00a9\u00aa\4\62\65\2"+
		"\u00aa\u00ab\4\629\2\u00ab\u00b2\4\629\2\u00ac\u00ad\7^\2\2\u00ad\u00ae"+
		"\4\629\2\u00ae\u00b2\4\629\2\u00af\u00b0\7^\2\2\u00b0\u00b2\4\629\2\u00b1"+
		"\u00a8\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2>\3\2\2\2"+
		"\u00b3\u00b4\7^\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\5A!\2\u00b6\u00b7\5"+
		"A!\2\u00b7\u00b8\5A!\2\u00b8\u00b9\5A!\2\u00b9@\3\2\2\2\u00ba\u00bb\t"+
		"\7\2\2\u00bbB\3\2\2\2\t\2\u0086\u0092\u009b\u009d\u00a6\u00b1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}