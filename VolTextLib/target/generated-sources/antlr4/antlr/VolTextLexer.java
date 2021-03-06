// Generated from VolText.g4 by ANTLR 4.4

    package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VolTextLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__46=1, T__45=2, T__44=3, T__43=4, T__42=5, T__41=6, T__40=7, T__39=8, 
		T__38=9, T__37=10, T__36=11, T__35=12, T__34=13, T__33=14, T__32=15, T__31=16, 
		T__30=17, T__29=18, T__28=19, T__27=20, T__26=21, T__25=22, T__24=23, 
		T__23=24, T__22=25, T__21=26, T__20=27, T__19=28, T__18=29, T__17=30, 
		T__16=31, T__15=32, T__14=33, T__13=34, T__12=35, T__11=36, T__10=37, 
		T__9=38, T__8=39, T__7=40, T__6=41, T__5=42, T__4=43, T__3=44, T__2=45, 
		T__1=46, T__0=47, NOTVAL=48, UNIT=49, FORMATVAL=50, ORIENTATION=51, TXTATF=52, 
		COLORVAL=53, ALIGNVAL=54, TFVAL=55, POSVAL=56, NVAL=57, ENDLINE=58, ENDNLINE=59, 
		O=60, A=61, C=62, STRING=63, WS=64;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'", "'='", "'>'", "'?'", "'@'"
	};
	public static final String[] ruleNames = {
		"T__46", "T__45", "T__44", "T__43", "T__42", "T__41", "T__40", "T__39", 
		"T__38", "T__37", "T__36", "T__35", "T__34", "T__33", "T__32", "T__31", 
		"T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", "T__23", 
		"T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", 
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "NOTVAL", "UNIT", "FORMATVAL", 
		"ORIENTATION", "TXTATF", "COLORVAL", "ALIGNVAL", "TFVAL", "POSVAL", "NVAL", 
		"ENDLINE", "ENDNLINE", "O", "A", "C", "STRING", "WS"
	};


	public VolTextLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VolText.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2B\u02ad\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3"+
		".\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\5\62\u0211"+
		"\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\5\63\u0221\n\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0229\n\64\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\5\65\u023f\n\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\7\66\u024a\n\66\f\66\16\66\u024d\13\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0265\n\67\38\38\38\38\38\38\38\3"+
		"8\38\58\u0270\n8\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\59\u0284\n9\3:\6:\u0287\n:\r:\16:\u0288\3:\3:\6:\u028d\n:\r:\16:\u028e"+
		"\5:\u0291\n:\3;\3;\3;\3<\3<\3=\3=\3=\3>\3>\3?\3?\3@\3@\6@\u02a1\n@\r@"+
		"\16@\u02a2\3@\3@\3A\6A\u02a8\nA\rA\16A\u02a9\3A\3A\2\2B\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\3\2\6\5\2\62;CHch\3\2\62;\4\2\13\f\17\17\5\2\13\f\17\17"+
		"\"\"\u02c9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3"+
		"\2\2\2\5\u008a\3\2\2\2\7\u0094\3\2\2\2\t\u0098\3\2\2\2\13\u009c\3\2\2"+
		"\2\r\u00ab\3\2\2\2\17\u00bc\3\2\2\2\21\u00c2\3\2\2\2\23\u00c7\3\2\2\2"+
		"\25\u00d2\3\2\2\2\27\u00db\3\2\2\2\31\u00e0\3\2\2\2\33\u00ee\3\2\2\2\35"+
		"\u00f9\3\2\2\2\37\u0100\3\2\2\2!\u0106\3\2\2\2#\u010c\3\2\2\2%\u0114\3"+
		"\2\2\2\'\u011d\3\2\2\2)\u012a\3\2\2\2+\u0132\3\2\2\2-\u013a\3\2\2\2/\u0141"+
		"\3\2\2\2\61\u014a\3\2\2\2\63\u0159\3\2\2\2\65\u015e\3\2\2\2\67\u0168\3"+
		"\2\2\29\u016d\3\2\2\2;\u0175\3\2\2\2=\u0177\3\2\2\2?\u017e\3\2\2\2A\u0184"+
		"\3\2\2\2C\u0195\3\2\2\2E\u019d\3\2\2\2G\u01a5\3\2\2\2I\u01b2\3\2\2\2K"+
		"\u01b4\3\2\2\2M\u01b9\3\2\2\2O\u01bf\3\2\2\2Q\u01c5\3\2\2\2S\u01c9\3\2"+
		"\2\2U\u01d4\3\2\2\2W\u01dc\3\2\2\2Y\u01e7\3\2\2\2[\u01ed\3\2\2\2]\u01f3"+
		"\3\2\2\2_\u0200\3\2\2\2a\u0209\3\2\2\2c\u0210\3\2\2\2e\u0220\3\2\2\2g"+
		"\u0228\3\2\2\2i\u023e\3\2\2\2k\u0240\3\2\2\2m\u0264\3\2\2\2o\u026f\3\2"+
		"\2\2q\u0283\3\2\2\2s\u0286\3\2\2\2u\u0292\3\2\2\2w\u0295\3\2\2\2y\u0297"+
		"\3\2\2\2{\u029a\3\2\2\2}\u029c\3\2\2\2\177\u029e\3\2\2\2\u0081\u02a7\3"+
		"\2\2\2\u0083\u0084\7j\2\2\u0084\u0085\7g\2\2\u0085\u0086\7k\2\2\u0086"+
		"\u0087\7i\2\2\u0087\u0088\7j\2\2\u0088\u0089\7v\2\2\u0089\4\3\2\2\2\u008a"+
		"\u008b\7T\2\2\u008b\u008c\7G\2\2\u008c\u008d\7E\2\2\u008d\u008e\7V\2\2"+
		"\u008e\u008f\7C\2\2\u008f\u0090\7P\2\2\u0090\u0091\7I\2\2\u0091\u0092"+
		"\7N\2\2\u0092\u0093\7G\2\2\u0093\6\3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096"+
		"\7o\2\2\u0096\u0097\7i\2\2\u0097\b\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a"+
		"\7f\2\2\u009a\u009b\7<\2\2\u009b\n\3\2\2\2\u009c\u009d\7e\2\2\u009d\u009e"+
		"\7q\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7t\2\2\u00a1"+
		"\u00a2\7V\2\2\u00a2\u00a3\7/\2\2\u00a3\u00a4\7d\2\2\u00a4\u00a5\7w\2\2"+
		"\u00a5\u00a6\7n\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9"+
		"\7v\2\2\u00a9\u00aa\7<\2\2\u00aa\f\3\2\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad"+
		"\7q\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7/\2\2\u00b0"+
		"\u00b1\7h\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7k\2\2"+
		"\u00b4\u00b5\7n\2\2\u00b5\u00b6\7{\2\2\u00b6\u00b7\7/\2\2\u00b7\u00b8"+
		"\7q\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7<\2\2\u00bb"+
		"\16\3\2\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7g\2\2\u00bf"+
		"\u00c0\7o\2\2\u00c0\u00c1\7<\2\2\u00c1\20\3\2\2\2\u00c2\u00c3\7q\2\2\u00c3"+
		"\u00c4\7q\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6\7<\2\2\u00c6\22\3\2\2\2\u00c7"+
		"\u00c8\7u\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7{\2\2\u00ca\u00cb\7n\2\2"+
		"\u00cb\u00cc\7g\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7j\2\2\u00ce\u00cf"+
		"\7g\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7v\2\2\u00d1\24\3\2\2\2\u00d2\u00d3"+
		"\7q\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7f\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\u00d7\7t\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7f\2\2\u00d9\u00da\7<\2\2"+
		"\u00da\26\3\2\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7"+
		"u\2\2\u00de\u00df\7v\2\2\u00df\30\3\2\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2"+
		"\7q\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7t\2\2\u00e5"+
		"\u00e6\7/\2\2\u00e6\u00e7\7d\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7n\2\2"+
		"\u00e9\u00ea\7n\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed"+
		"\7<\2\2\u00ed\32\3\2\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1"+
		"\7f\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7n\2\2\u00f4"+
		"\u00f5\7k\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7<\2\2"+
		"\u00f8\34\3\2\2\2\u00f9\u00fa\7e\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7"+
		"n\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7<\2\2\u00ff\36"+
		"\3\2\2\2\u0100\u0101\7h\2\2\u0101\u0102\7k\2\2\u0102\u0103\7v\2\2\u0103"+
		"\u0104\7/\2\2\u0104\u0105\7{\2\2\u0105 \3\2\2\2\u0106\u0107\7r\2\2\u0107"+
		"\u0108\7q\2\2\u0108\u0109\7u\2\2\u0109\u010a\7/\2\2\u010a\u010b\7z\2\2"+
		"\u010b\"\3\2\2\2\u010c\u010d\7h\2\2\u010d\u010e\7q\2\2\u010e\u010f\7t"+
		"\2\2\u010f\u0110\7o\2\2\u0110\u0111\7c\2\2\u0111\u0112\7v\2\2\u0112\u0113"+
		"\7<\2\2\u0113$\3\2\2\2\u0114\u0115\7k\2\2\u0115\u0116\7v\2\2\u0116\u0117"+
		"\7c\2\2\u0117\u0118\7n\2\2\u0118\u0119\7k\2\2\u0119\u011a\7e\2\2\u011a"+
		"\u011b\7u\2\2\u011b\u011c\7<\2\2\u011c&\3\2\2\2\u011d\u011e\7q\2\2\u011e"+
		"\u011f\7t\2\2\u011f\u0120\7k\2\2\u0120\u0121\7g\2\2\u0121\u0122\7p\2\2"+
		"\u0122\u0123\7v\2\2\u0123\u0124\7c\2\2\u0124\u0125\7v\2\2\u0125\u0126"+
		"\7k\2\2\u0126\u0127\7q\2\2\u0127\u0128\7p\2\2\u0128\u0129\7<\2\2\u0129"+
		"(\3\2\2\2\u012a\u012b\7r\2\2\u012b\u012c\7a\2\2\u012c\u012d\7y\2\2\u012d"+
		"\u012e\7k\2\2\u012e\u012f\7f\2\2\u012f\u0130\7v\2\2\u0130\u0131\7j\2\2"+
		"\u0131*\3\2\2\2\u0132\u0133\7u\2\2\u0133\u0134\7j\2\2\u0134\u0135\7c\2"+
		"\2\u0135\u0136\7r\2\2\u0136\u0137\7g\2\2\u0137\u0138\7<\2\2\u0138\u0139"+
		"\7$\2\2\u0139,\3\2\2\2\u013a\u013b\7v\2\2\u013b\u013c\7k\2\2\u013c\u013d"+
		"\7v\2\2\u013d\u013e\7n\2\2\u013e\u013f\7g\2\2\u013f\u0140\7<\2\2\u0140"+
		".\3\2\2\2\u0141\u0142\7V\2\2\u0142\u0143\7T\2\2\u0143\u0144\7K\2\2\u0144"+
		"\u0145\7C\2\2\u0145\u0146\7P\2\2\u0146\u0147\7I\2\2\u0147\u0148\7N\2\2"+
		"\u0148\u0149\7G\2\2\u0149\60\3\2\2\2\u014a\u014b\7c\2\2\u014b\u014c\7"+
		"p\2\2\u014c\u014d\7i\2\2\u014d\u014e\7n\2\2\u014e\u014f\7g\2\2\u014f\u0150"+
		"\7/\2\2\u0150\u0151\7t\2\2\u0151\u0152\7q\2\2\u0152\u0153\7v\2\2\u0153"+
		"\u0154\7c\2\2\u0154\u0155\7v\2\2\u0155\u0156\7k\2\2\u0156\u0157\7q\2\2"+
		"\u0157\u0158\7p\2\2\u0158\62\3\2\2\2\u0159\u015a\7r\2\2\u015a\u015b\7"+
		"c\2\2\u015b\u015c\7i\2\2\u015c\u015d\7g\2\2\u015d\64\3\2\2\2\u015e\u015f"+
		"\7r\2\2\u015f\u0160\7q\2\2\u0160\u0161\7u\2\2\u0161\u0162\7k\2\2\u0162"+
		"\u0163\7v\2\2\u0163\u0164\7k\2\2\u0164\u0165\7q\2\2\u0165\u0166\7p\2\2"+
		"\u0166\u0167\7<\2\2\u0167\66\3\2\2\2\u0168\u0169\7W\2\2\u0169\u016a\7"+
		"T\2\2\u016a\u016b\7N\2\2\u016b\u016c\7<\2\2\u016c8\3\2\2\2\u016d\u016e"+
		"\7e\2\2\u016e\u016f\7q\2\2\u016f\u0170\7n\2\2\u0170\u0171\7q\2\2\u0171"+
		"\u0172\7t\2\2\u0172\u0173\7V\2\2\u0173\u0174\7<\2\2\u0174:\3\2\2\2\u0175"+
		"\u0176\7<\2\2\u0176<\3\2\2\2\u0177\u0178\7E\2\2\u0178\u0179\7K\2\2\u0179"+
		"\u017a\7T\2\2\u017a\u017b\7E\2\2\u017b\u017c\7N\2\2\u017c\u017d\7G\2\2"+
		"\u017d>\3\2\2\2\u017e\u017f\7y\2\2\u017f\u0180\7k\2\2\u0180\u0181\7f\2"+
		"\2\u0181\u0182\7v\2\2\u0182\u0183\7j\2\2\u0183@\3\2\2\2\u0184\u0185\7"+
		"h\2\2\u0185\u0186\7q\2\2\u0186\u0187\7p\2\2\u0187\u0188\7v\2\2\u0188\u0189"+
		"\7/\2\2\u0189\u018a\7h\2\2\u018a\u018b\7c\2\2\u018b\u018c\7o\2\2\u018c"+
		"\u018d\7k\2\2\u018d\u018e\7n\2\2\u018e\u018f\7{\2\2\u018f\u0190\7/\2\2"+
		"\u0190\u0191\7v\2\2\u0191\u0192\7v\2\2\u0192\u0193\7h\2\2\u0193\u0194"+
		"\7<\2\2\u0194B\3\2\2\2\u0195\u0196\7d\2\2\u0196\u0197\7w\2\2\u0197\u0198"+
		"\7n\2\2\u0198\u0199\7n\2\2\u0199\u019a\7g\2\2\u019a\u019b\7v\2\2\u019b"+
		"\u019c\7<\2\2\u019cD\3\2\2\2\u019d\u019e\7u\2\2\u019e\u019f\7v\2\2\u019f"+
		"\u01a0\7t\2\2\u01a0\u01a1\7k\2\2\u01a1\u01a2\7p\2\2\u01a2\u01a3\7i\2\2"+
		"\u01a3\u01a4\7<\2\2\u01a4F\3\2\2\2\u01a5\u01a6\7h\2\2\u01a6\u01a7\7q\2"+
		"\2\u01a7\u01a8\7p\2\2\u01a8\u01a9\7v\2\2\u01a9\u01aa\7/\2\2\u01aa\u01ab"+
		"\7h\2\2\u01ab\u01ac\7c\2\2\u01ac\u01ad\7o\2\2\u01ad\u01ae\7k\2\2\u01ae"+
		"\u01af\7n\2\2\u01af\u01b0\7{\2\2\u01b0\u01b1\7<\2\2\u01b1H\3\2\2\2\u01b2"+
		"\u01b3\7B\2\2\u01b3J\3\2\2\2\u01b4\u01b5\7v\2\2\u01b5\u01b6\7g\2\2\u01b6"+
		"\u01b7\7z\2\2\u01b7\u01b8\7v\2\2\u01b8L\3\2\2\2\u01b9\u01ba\7r\2\2\u01ba"+
		"\u01bb\7q\2\2\u01bb\u01bc\7u\2\2\u01bc\u01bd\7/\2\2\u01bd\u01be\7{\2\2"+
		"\u01beN\3\2\2\2\u01bf\u01c0\7h\2\2\u01c0\u01c1\7k\2\2\u01c1\u01c2\7v\2"+
		"\2\u01c2\u01c3\7/\2\2\u01c3\u01c4\7z\2\2\u01c4P\3\2\2\2\u01c5\u01c6\7"+
		"f\2\2\u01c6\u01c7\7k\2\2\u01c7\u01c8\7x\2\2\u01c8R\3\2\2\2\u01c9\u01ca"+
		"\7h\2\2\u01ca\u01cb\7q\2\2\u01cb\u01cc\7p\2\2\u01cc\u01cd\7v\2\2\u01cd"+
		"\u01ce\7/\2\2\u01ce\u01cf\7u\2\2\u01cf\u01d0\7k\2\2\u01d0\u01d1\7|\2\2"+
		"\u01d1\u01d2\7g\2\2\u01d2\u01d3\7<\2\2\u01d3T\3\2\2\2\u01d4\u01d5\7c\2"+
		"\2\u01d5\u01d6\7w\2\2\u01d6\u01d7\7v\2\2\u01d7\u01d8\7j\2\2\u01d8\u01d9"+
		"\7q\2\2\u01d9\u01da\7t\2\2\u01da\u01db\7<\2\2\u01dbV\3\2\2\2\u01dc\u01dd"+
		"\7c\2\2\u01dd\u01de\7n\2\2\u01de\u01df\7k\2\2\u01df\u01e0\7i\2\2\u01e0"+
		"\u01e1\7p\2\2\u01e1\u01e2\7o\2\2\u01e2\u01e3\7g\2\2\u01e3\u01e4\7p\2\2"+
		"\u01e4\u01e5\7v\2\2\u01e5\u01e6\7<\2\2\u01e6X\3\2\2\2\u01e7\u01e8\7r\2"+
		"\2\u01e8\u01e9\7c\2\2\u01e9\u01ea\7v\2\2\u01ea\u01eb\7j\2\2\u01eb\u01ec"+
		"\7<\2\2\u01ecZ\3\2\2\2\u01ed\u01ee\7d\2\2\u01ee\u01ef\7q\2\2\u01ef\u01f0"+
		"\7n\2\2\u01f0\u01f1\7f\2\2\u01f1\u01f2\7<\2\2\u01f2\\\3\2\2\2\u01f3\u01f4"+
		"\7e\2\2\u01f4\u01f5\7t\2\2\u01f5\u01f6\7q\2\2\u01f6\u01f7\7u\2\2\u01f7"+
		"\u01f8\7u\2\2\u01f8\u01f9\7/\2\2\u01f9\u01fa\7r\2\2\u01fa\u01fb\7q\2\2"+
		"\u01fb\u01fc\7k\2\2\u01fc\u01fd\7p\2\2\u01fd\u01fe\7v\2\2\u01fe\u01ff"+
		"\7<\2\2\u01ff^\3\2\2\2\u0200\u0201\7r\2\2\u0201\u0202\7a\2\2\u0202\u0203"+
		"\7j\2\2\u0203\u0204\7g\2\2\u0204\u0205\7k\2\2\u0205\u0206\7i\2\2\u0206"+
		"\u0207\7j\2\2\u0207\u0208\7v\2\2\u0208`\3\2\2\2\u0209\u020a\7/\2\2\u020a"+
		"b\3\2\2\2\u020b\u020c\7o\2\2\u020c\u0211\7o\2\2\u020d\u0211\7\'\2\2\u020e"+
		"\u020f\7r\2\2\u020f\u0211\7v\2\2\u0210\u020b\3\2\2\2\u0210\u020d\3\2\2"+
		"\2\u0210\u020e\3\2\2\2\u0211d\3\2\2\2\u0212\u0213\7C\2\2\u0213\u0221\7"+
		"\62\2\2\u0214\u0215\7C\2\2\u0215\u0221\7\63\2\2\u0216\u0217\7C\2\2\u0217"+
		"\u0221\7\64\2\2\u0218\u0219\7C\2\2\u0219\u0221\7\65\2\2\u021a\u021b\7"+
		"C\2\2\u021b\u0221\7\66\2\2\u021c\u021d\7C\2\2\u021d\u0221\7\67\2\2\u021e"+
		"\u021f\7C\2\2\u021f\u0221\78\2\2\u0220\u0212\3\2\2\2\u0220\u0214\3\2\2"+
		"\2\u0220\u0216\3\2\2\2\u0220\u0218\3\2\2\2\u0220\u021a\3\2\2\2\u0220\u021c"+
		"\3\2\2\2\u0220\u021e\3\2\2\2\u0221f\3\2\2\2\u0222\u0223\7j\2\2\u0223\u0224"+
		"\7q\2\2\u0224\u0229\7t\2\2\u0225\u0226\7x\2\2\u0226\u0227\7g\2\2\u0227"+
		"\u0229\7t\2\2\u0228\u0222\3\2\2\2\u0228\u0225\3\2\2\2\u0229h\3\2\2\2\u022a"+
		"\u022b\7d\2\2\u022b\u022c\7q\2\2\u022c\u022d\7n\2\2\u022d\u023f\7f\2\2"+
		"\u022e\u022f\7k\2\2\u022f\u0230\7v\2\2\u0230\u0231\7c\2\2\u0231\u0232"+
		"\7n\2\2\u0232\u0233\7k\2\2\u0233\u0234\7e\2\2\u0234\u023f\7u\2\2\u0235"+
		"\u0236\7w\2\2\u0236\u0237\7p\2\2\u0237\u0238\7f\2\2\u0238\u0239\7g\2\2"+
		"\u0239\u023a\7t\2\2\u023a\u023b\7n\2\2\u023b\u023c\7k\2\2\u023c\u023d"+
		"\7p\2\2\u023d\u023f\7g\2\2\u023e\u022a\3\2\2\2\u023e\u022e\3\2\2\2\u023e"+
		"\u0235\3\2\2\2\u023fj\3\2\2\2\u0240\u0241\7%\2\2\u0241\u0242\t\2\2\2\u0242"+
		"\u0243\t\2\2\2\u0243\u0244\t\2\2\2\u0244\u0245\t\2\2\2\u0245\u0246\t\2"+
		"\2\2\u0246\u024b\t\2\2\2\u0247\u0248\t\2\2\2\u0248\u024a\t\2\2\2\u0249"+
		"\u0247\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2"+
		"\2\2\u024cl\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u024f\7n\2\2\u024f\u0250"+
		"\7g\2\2\u0250\u0251\7h\2\2\u0251\u0265\7v\2\2\u0252\u0253\7e\2\2\u0253"+
		"\u0254\7g\2\2\u0254\u0255\7p\2\2\u0255\u0256\7v\2\2\u0256\u0257\7g\2\2"+
		"\u0257\u0265\7t\2\2\u0258\u0259\7t\2\2\u0259\u025a\7k\2\2\u025a\u025b"+
		"\7i\2\2\u025b\u025c\7j\2\2\u025c\u0265\7v\2\2\u025d\u025e\7l\2\2\u025e"+
		"\u025f\7w\2\2\u025f\u0260\7u\2\2\u0260\u0261\7v\2\2\u0261\u0262\7k\2\2"+
		"\u0262\u0263\7h\2\2\u0263\u0265\7{\2\2\u0264\u024e\3\2\2\2\u0264\u0252"+
		"\3\2\2\2\u0264\u0258\3\2\2\2\u0264\u025d\3\2\2\2\u0265n\3\2\2\2\u0266"+
		"\u0267\7v\2\2\u0267\u0268\7t\2\2\u0268\u0269\7w\2\2\u0269\u0270\7g\2\2"+
		"\u026a\u026b\7h\2\2\u026b\u026c\7c\2\2\u026c\u026d\7n\2\2\u026d\u026e"+
		"\7u\2\2\u026e\u0270\7g\2\2\u026f\u0266\3\2\2\2\u026f\u026a\3\2\2\2\u0270"+
		"p\3\2\2\2\u0271\u0272\7n\2\2\u0272\u0284\7v\2\2\u0273\u0274\7e\2\2\u0274"+
		"\u0284\7v\2\2\u0275\u0276\7t\2\2\u0276\u0284\7v\2\2\u0277\u0278\7n\2\2"+
		"\u0278\u0284\7e\2\2\u0279\u027a\7e\2\2\u027a\u0284\7e\2\2\u027b\u027c"+
		"\7t\2\2\u027c\u0284\7e\2\2\u027d\u027e\7n\2\2\u027e\u0284\7d\2\2\u027f"+
		"\u0280\7e\2\2\u0280\u0284\7d\2\2\u0281\u0282\7t\2\2\u0282\u0284\7d\2\2"+
		"\u0283\u0271\3\2\2\2\u0283\u0273\3\2\2\2\u0283\u0275\3\2\2\2\u0283\u0277"+
		"\3\2\2\2\u0283\u0279\3\2\2\2\u0283\u027b\3\2\2\2\u0283\u027d\3\2\2\2\u0283"+
		"\u027f\3\2\2\2\u0283\u0281\3\2\2\2\u0284r\3\2\2\2\u0285\u0287\t\3\2\2"+
		"\u0286\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289"+
		"\3\2\2\2\u0289\u0290\3\2\2\2\u028a\u028c\7\60\2\2\u028b\u028d\t\3\2\2"+
		"\u028c\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f"+
		"\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u028a\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"t\3\2\2\2\u0292\u0293\7$\2\2\u0293\u0294\7=\2\2\u0294v\3\2\2\2\u0295\u0296"+
		"\7=\2\2\u0296x\3\2\2\2\u0297\u0298\7<\2\2\u0298\u0299\7}\2\2\u0299z\3"+
		"\2\2\2\u029a\u029b\7}\2\2\u029b|\3\2\2\2\u029c\u029d\7\177\2\2\u029d~"+
		"\3\2\2\2\u029e\u02a0\7$\2\2\u029f\u02a1\n\4\2\2\u02a0\u029f\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\3\2"+
		"\2\2\u02a4\u02a5\7$\2\2\u02a5\u0080\3\2\2\2\u02a6\u02a8\t\5\2\2\u02a7"+
		"\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2"+
		"\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\bA\2\2\u02ac\u0082\3\2\2\2\20\2\u0210"+
		"\u0220\u0228\u023e\u024b\u0264\u026f\u0283\u0288\u028e\u0290\u02a2\u02a9"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}