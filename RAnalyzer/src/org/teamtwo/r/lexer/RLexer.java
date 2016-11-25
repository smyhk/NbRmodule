package org.teamtwo.r.lexer;

// Generated from R.g4 by ANTLR 4.5.3
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, HEX=55, INT=56, FLOAT=57, COMPLEX=58, STRING=59, ID=60, 
		USER_OP=61, NL=62, WS=63;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "T__52", "T__53", "HEX", "INT", "HEXDIGIT", 
		"FLOAT", "DIGIT", "EXP", "COMPLEX", "STRING", "ESC", "UNICODE_ESCAPE", 
		"OCTAL_ESCAPE", "HEX_ESCAPE", "ID", "LETTER", "USER_OP", "COMMENT", "NL", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'<-'", "'='", "'<<-'", "'[['", "']'", "'['", "'::'", "':::'", 
		"'$'", "'@'", "'^'", "'-'", "'+'", "':'", "'*'", "'/'", "'>'", "'>='", 
		"'<'", "'<='", "'=='", "'!='", "'!'", "'&'", "'&&'", "'|'", "'||'", "'~'", 
		"'->'", "'->>'", "':='", "'function'", "'('", "')'", "'{'", "'}'", "'if'", 
		"'else'", "'for'", "'in'", "'while'", "'repeat'", "'?'", "'next'", "'break'", 
		"'NULL'", "'NA'", "'Inf'", "'NaN'", "'TRUE'", "'FALSE'", "','", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "HEX", "INT", "FLOAT", "COMPLEX", 
		"STRING", "ID", "USER_OP", "NL", "WS"
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


	public List<SyntaxError> syntaxErrors = new ArrayList<SyntaxError>();

	//@Override
	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
		String message = super.getErrorHeader(e); //getErrorMessage(e, tokenNames);
		SyntaxError syntaxError = new SyntaxError();
		syntaxError.exception = e;
		syntaxError.message = message;
		syntaxErrors.add(syntaxError);
		return message;
	}

	public static class SyntaxError {
		public RecognitionException exception;
		public String message;
		public int line;
		public int charPositionInLine;
	}


	public RLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "R.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }
        
         @Override
        public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
            switch (ruleIndex) {
                case 69:
                    COMMENT_action((RuleContext) _localctx, actionIndex);
                    break;

                case 71:
                    WS_action((RuleContext) _localctx, actionIndex);
                 break;
            }
        }

        private void WS_action(RuleContext _localctx, int actionIndex) {
            switch (actionIndex) {
                case 1:
                    skip();
                    break;
            }
        }

        private void COMMENT_action(RuleContext _localctx, int actionIndex) {
            switch (actionIndex) {
                case 0:
                    _type = NL;
                    break;
            }
        }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2A\u0211\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\38\38\38\68\u0143\n8\r8\168\u0144\38\58\u0148\n8"+
		"\39\69\u014b\n9\r9\169\u014c\39\59\u0150\n9\3:\3:\3;\6;\u0155\n;\r;\16"+
		";\u0156\3;\3;\7;\u015b\n;\f;\16;\u015e\13;\3;\5;\u0161\n;\3;\5;\u0164"+
		"\n;\3;\6;\u0167\n;\r;\16;\u0168\3;\5;\u016c\n;\3;\5;\u016f\n;\3;\3;\6"+
		";\u0173\n;\r;\16;\u0174\3;\5;\u0178\n;\3;\5;\u017b\n;\5;\u017d\n;\3<\3"+
		"<\3=\3=\5=\u0183\n=\3=\3=\3>\3>\3>\3>\3>\3>\5>\u018d\n>\3?\3?\3?\7?\u0192"+
		"\n?\f?\16?\u0195\13?\3?\3?\3?\3?\7?\u019b\n?\f?\16?\u019e\13?\3?\3?\3"+
		"?\3?\7?\u01a4\n?\f?\16?\u01a7\13?\3?\5?\u01aa\n?\3@\3@\3@\3@\3@\5@\u01b1"+
		"\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u01c3\nA\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\5B\u01ce\nB\3C\3C\3C\5C\u01d3\nC\3D\3D\3D\5D\u01d8"+
		"\nD\3D\3D\3D\7D\u01dd\nD\fD\16D\u01e0\13D\3D\3D\3D\3D\7D\u01e6\nD\fD\16"+
		"D\u01e9\13D\5D\u01eb\nD\3E\3E\3F\3F\7F\u01f1\nF\fF\16F\u01f4\13F\3F\3"+
		"F\3G\3G\7G\u01fa\nG\fG\16G\u01fd\13G\3G\5G\u0200\nG\3G\3G\3G\3G\3H\5H"+
		"\u0207\nH\3H\3H\3I\6I\u020c\nI\rI\16I\u020d\3I\3I\7\u0193\u019c\u01a5"+
		"\u01f2\u01fb\2J\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s\2u;w\2y\2{<}=\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		">\u0089\2\u008b?\u008d\2\u008f@\u0091A\3\2\17\4\2ZZzz\4\2NNnn\5\2\62;"+
		"CHch\4\2GGgg\4\2--//\4\2$$^^\4\2))^^\13\2$$))^^cdhhppttvvxx\3\2\62\65"+
		"\3\2\629\4\2\60\60aa\4\2C\\c|\5\2\13\13\16\16\"\"\u0236\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2u\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\u0087\3\2\2\2\2\u008b\3\2"+
		"\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u0093\3\2\2\2\5"+
		"\u0095\3\2\2\2\7\u0098\3\2\2\2\t\u009a\3\2\2\2\13\u009e\3\2\2\2\r\u00a1"+
		"\3\2\2\2\17\u00a3\3\2\2\2\21\u00a5\3\2\2\2\23\u00a8\3\2\2\2\25\u00ac\3"+
		"\2\2\2\27\u00ae\3\2\2\2\31\u00b0\3\2\2\2\33\u00b2\3\2\2\2\35\u00b4\3\2"+
		"\2\2\37\u00b6\3\2\2\2!\u00b8\3\2\2\2#\u00ba\3\2\2\2%\u00bc\3\2\2\2\'\u00be"+
		"\3\2\2\2)\u00c1\3\2\2\2+\u00c3\3\2\2\2-\u00c6\3\2\2\2/\u00c9\3\2\2\2\61"+
		"\u00cc\3\2\2\2\63\u00ce\3\2\2\2\65\u00d0\3\2\2\2\67\u00d3\3\2\2\29\u00d5"+
		"\3\2\2\2;\u00d8\3\2\2\2=\u00da\3\2\2\2?\u00dd\3\2\2\2A\u00e1\3\2\2\2C"+
		"\u00e4\3\2\2\2E\u00ed\3\2\2\2G\u00ef\3\2\2\2I\u00f1\3\2\2\2K\u00f3\3\2"+
		"\2\2M\u00f5\3\2\2\2O\u00f8\3\2\2\2Q\u00fd\3\2\2\2S\u0101\3\2\2\2U\u0104"+
		"\3\2\2\2W\u010a\3\2\2\2Y\u0111\3\2\2\2[\u0113\3\2\2\2]\u0118\3\2\2\2_"+
		"\u011e\3\2\2\2a\u0123\3\2\2\2c\u0126\3\2\2\2e\u012a\3\2\2\2g\u012e\3\2"+
		"\2\2i\u0133\3\2\2\2k\u0139\3\2\2\2m\u013b\3\2\2\2o\u013f\3\2\2\2q\u014a"+
		"\3\2\2\2s\u0151\3\2\2\2u\u017c\3\2\2\2w\u017e\3\2\2\2y\u0180\3\2\2\2{"+
		"\u018c\3\2\2\2}\u01a9\3\2\2\2\177\u01b0\3\2\2\2\u0081\u01c2\3\2\2\2\u0083"+
		"\u01cd\3\2\2\2\u0085\u01cf\3\2\2\2\u0087\u01ea\3\2\2\2\u0089\u01ec\3\2"+
		"\2\2\u008b\u01ee\3\2\2\2\u008d\u01f7\3\2\2\2\u008f\u0206\3\2\2\2\u0091"+
		"\u020b\3\2\2\2\u0093\u0094\7=\2\2\u0094\4\3\2\2\2\u0095\u0096\7>\2\2\u0096"+
		"\u0097\7/\2\2\u0097\6\3\2\2\2\u0098\u0099\7?\2\2\u0099\b\3\2\2\2\u009a"+
		"\u009b\7>\2\2\u009b\u009c\7>\2\2\u009c\u009d\7/\2\2\u009d\n\3\2\2\2\u009e"+
		"\u009f\7]\2\2\u009f\u00a0\7]\2\2\u00a0\f\3\2\2\2\u00a1\u00a2\7_\2\2\u00a2"+
		"\16\3\2\2\2\u00a3\u00a4\7]\2\2\u00a4\20\3\2\2\2\u00a5\u00a6\7<\2\2\u00a6"+
		"\u00a7\7<\2\2\u00a7\22\3\2\2\2\u00a8\u00a9\7<\2\2\u00a9\u00aa\7<\2\2\u00aa"+
		"\u00ab\7<\2\2\u00ab\24\3\2\2\2\u00ac\u00ad\7&\2\2\u00ad\26\3\2\2\2\u00ae"+
		"\u00af\7B\2\2\u00af\30\3\2\2\2\u00b0\u00b1\7`\2\2\u00b1\32\3\2\2\2\u00b2"+
		"\u00b3\7/\2\2\u00b3\34\3\2\2\2\u00b4\u00b5\7-\2\2\u00b5\36\3\2\2\2\u00b6"+
		"\u00b7\7<\2\2\u00b7 \3\2\2\2\u00b8\u00b9\7,\2\2\u00b9\"\3\2\2\2\u00ba"+
		"\u00bb\7\61\2\2\u00bb$\3\2\2\2\u00bc\u00bd\7@\2\2\u00bd&\3\2\2\2\u00be"+
		"\u00bf\7@\2\2\u00bf\u00c0\7?\2\2\u00c0(\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2"+
		"*\3\2\2\2\u00c3\u00c4\7>\2\2\u00c4\u00c5\7?\2\2\u00c5,\3\2\2\2\u00c6\u00c7"+
		"\7?\2\2\u00c7\u00c8\7?\2\2\u00c8.\3\2\2\2\u00c9\u00ca\7#\2\2\u00ca\u00cb"+
		"\7?\2\2\u00cb\60\3\2\2\2\u00cc\u00cd\7#\2\2\u00cd\62\3\2\2\2\u00ce\u00cf"+
		"\7(\2\2\u00cf\64\3\2\2\2\u00d0\u00d1\7(\2\2\u00d1\u00d2\7(\2\2\u00d2\66"+
		"\3\2\2\2\u00d3\u00d4\7~\2\2\u00d48\3\2\2\2\u00d5\u00d6\7~\2\2\u00d6\u00d7"+
		"\7~\2\2\u00d7:\3\2\2\2\u00d8\u00d9\7\u0080\2\2\u00d9<\3\2\2\2\u00da\u00db"+
		"\7/\2\2\u00db\u00dc\7@\2\2\u00dc>\3\2\2\2\u00dd\u00de\7/\2\2\u00de\u00df"+
		"\7@\2\2\u00df\u00e0\7@\2\2\u00e0@\3\2\2\2\u00e1\u00e2\7<\2\2\u00e2\u00e3"+
		"\7?\2\2\u00e3B\3\2\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7"+
		"\7p\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7k\2\2\u00ea"+
		"\u00eb\7q\2\2\u00eb\u00ec\7p\2\2\u00ecD\3\2\2\2\u00ed\u00ee\7*\2\2\u00ee"+
		"F\3\2\2\2\u00ef\u00f0\7+\2\2\u00f0H\3\2\2\2\u00f1\u00f2\7}\2\2\u00f2J"+
		"\3\2\2\2\u00f3\u00f4\7\177\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7k\2\2\u00f6"+
		"\u00f7\7h\2\2\u00f7N\3\2\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7n\2\2\u00fa"+
		"\u00fb\7u\2\2\u00fb\u00fc\7g\2\2\u00fcP\3\2\2\2\u00fd\u00fe\7h\2\2\u00fe"+
		"\u00ff\7q\2\2\u00ff\u0100\7t\2\2\u0100R\3\2\2\2\u0101\u0102\7k\2\2\u0102"+
		"\u0103\7p\2\2\u0103T\3\2\2\2\u0104\u0105\7y\2\2\u0105\u0106\7j\2\2\u0106"+
		"\u0107\7k\2\2\u0107\u0108\7n\2\2\u0108\u0109\7g\2\2\u0109V\3\2\2\2\u010a"+
		"\u010b\7t\2\2\u010b\u010c\7g\2\2\u010c\u010d\7r\2\2\u010d\u010e\7g\2\2"+
		"\u010e\u010f\7c\2\2\u010f\u0110\7v\2\2\u0110X\3\2\2\2\u0111\u0112\7A\2"+
		"\2\u0112Z\3\2\2\2\u0113\u0114\7p\2\2\u0114\u0115\7g\2\2\u0115\u0116\7"+
		"z\2\2\u0116\u0117\7v\2\2\u0117\\\3\2\2\2\u0118\u0119\7d\2\2\u0119\u011a"+
		"\7t\2\2\u011a\u011b\7g\2\2\u011b\u011c\7c\2\2\u011c\u011d\7m\2\2\u011d"+
		"^\3\2\2\2\u011e\u011f\7P\2\2\u011f\u0120\7W\2\2\u0120\u0121\7N\2\2\u0121"+
		"\u0122\7N\2\2\u0122`\3\2\2\2\u0123\u0124\7P\2\2\u0124\u0125\7C\2\2\u0125"+
		"b\3\2\2\2\u0126\u0127\7K\2\2\u0127\u0128\7p\2\2\u0128\u0129\7h\2\2\u0129"+
		"d\3\2\2\2\u012a\u012b\7P\2\2\u012b\u012c\7c\2\2\u012c\u012d\7P\2\2\u012d"+
		"f\3\2\2\2\u012e\u012f\7V\2\2\u012f\u0130\7T\2\2\u0130\u0131\7W\2\2\u0131"+
		"\u0132\7G\2\2\u0132h\3\2\2\2\u0133\u0134\7H\2\2\u0134\u0135\7C\2\2\u0135"+
		"\u0136\7N\2\2\u0136\u0137\7U\2\2\u0137\u0138\7G\2\2\u0138j\3\2\2\2\u0139"+
		"\u013a\7.\2\2\u013al\3\2\2\2\u013b\u013c\7\60\2\2\u013c\u013d\7\60\2\2"+
		"\u013d\u013e\7\60\2\2\u013en\3\2\2\2\u013f\u0140\7\62\2\2\u0140\u0142"+
		"\t\2\2\2\u0141\u0143\5s:\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0148\t\3"+
		"\2\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148p\3\2\2\2\u0149\u014b"+
		"\5w<\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0150\t\3\2\2\u014f\u014e\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150r\3\2\2\2\u0151\u0152\t\4\2\2\u0152t\3\2"+
		"\2\2\u0153\u0155\5w<\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015c\7\60\2\2"+
		"\u0159\u015b\5w<\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015f"+
		"\u0161\5y=\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2"+
		"\2\u0162\u0164\t\3\2\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u017d"+
		"\3\2\2\2\u0165\u0167\5w<\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u016c\5y"+
		"=\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d"+
		"\u016f\t\3\2\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u017d\3\2"+
		"\2\2\u0170\u0172\7\60\2\2\u0171\u0173\5w<\2\u0172\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2"+
		"\2\2\u0176\u0178\5y=\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a"+
		"\3\2\2\2\u0179\u017b\t\3\2\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017d\3\2\2\2\u017c\u0154\3\2\2\2\u017c\u0166\3\2\2\2\u017c\u0170\3\2"+
		"\2\2\u017dv\3\2\2\2\u017e\u017f\4\62;\2\u017fx\3\2\2\2\u0180\u0182\t\5"+
		"\2\2\u0181\u0183\t\6\2\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0185\5q9\2\u0185z\3\2\2\2\u0186\u0187\5q9\2\u0187"+
		"\u0188\7k\2\2\u0188\u018d\3\2\2\2\u0189\u018a\5u;\2\u018a\u018b\7k\2\2"+
		"\u018b\u018d\3\2\2\2\u018c\u0186\3\2\2\2\u018c\u0189\3\2\2\2\u018d|\3"+
		"\2\2\2\u018e\u0193\7$\2\2\u018f\u0192\5\177@\2\u0190\u0192\n\7\2\2\u0191"+
		"\u018f\3\2\2\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0193\u0191\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196"+
		"\u01aa\7$\2\2\u0197\u019c\7)\2\2\u0198\u019b\5\177@\2\u0199\u019b\n\b"+
		"\2\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u019c\3\2"+
		"\2\2\u019f\u01aa\7)\2\2\u01a0\u01a5\7b\2\2\u01a1\u01a4\5\177@\2\u01a2"+
		"\u01a4\n\b\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7\3\2"+
		"\2\2\u01a5\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a8\u01aa\7b\2\2\u01a9\u018e\3\2\2\2\u01a9\u0197\3\2"+
		"\2\2\u01a9\u01a0\3\2\2\2\u01aa~\3\2\2\2\u01ab\u01ac\7^\2\2\u01ac\u01b1"+
		"\t\t\2\2\u01ad\u01b1\5\u0081A\2\u01ae\u01b1\5\u0085C\2\u01af\u01b1\5\u0083"+
		"B\2\u01b0\u01ab\3\2\2\2\u01b0\u01ad\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01af\3\2\2\2\u01b1\u0080\3\2\2\2\u01b2\u01b3\7^\2\2\u01b3\u01b4\7w\2"+
		"\2\u01b4\u01b5\5s:\2\u01b5\u01b6\5s:\2\u01b6\u01b7\5s:\2\u01b7\u01b8\5"+
		"s:\2\u01b8\u01c3\3\2\2\2\u01b9\u01ba\7^\2\2\u01ba\u01bb\7w\2\2\u01bb\u01bc"+
		"\7}\2\2\u01bc\u01bd\5s:\2\u01bd\u01be\5s:\2\u01be\u01bf\5s:\2\u01bf\u01c0"+
		"\5s:\2\u01c0\u01c1\7\177\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01b2\3\2\2\2\u01c2"+
		"\u01b9\3\2\2\2\u01c3\u0082\3\2\2\2\u01c4\u01c5\7^\2\2\u01c5\u01c6\t\n"+
		"\2\2\u01c6\u01c7\t\13\2\2\u01c7\u01ce\t\13\2\2\u01c8\u01c9\7^\2\2\u01c9"+
		"\u01ca\t\13\2\2\u01ca\u01ce\t\13\2\2\u01cb\u01cc\7^\2\2\u01cc\u01ce\t"+
		"\13\2\2\u01cd\u01c4\3\2\2\2\u01cd\u01c8\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce"+
		"\u0084\3\2\2\2\u01cf\u01d0\7^\2\2\u01d0\u01d2\5s:\2\u01d1\u01d3\5s:\2"+
		"\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u0086\3\2\2\2\u01d4\u01d7"+
		"\7\60\2\2\u01d5\u01d8\5\u0089E\2\u01d6\u01d8\t\f\2\2\u01d7\u01d5\3\2\2"+
		"\2\u01d7\u01d6\3\2\2\2\u01d8\u01de\3\2\2\2\u01d9\u01dd\5\u0089E\2\u01da"+
		"\u01dd\5w<\2\u01db\u01dd\t\f\2\2\u01dc\u01d9\3\2\2\2\u01dc\u01da\3\2\2"+
		"\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df"+
		"\3\2\2\2\u01df\u01eb\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e7\5\u0089E"+
		"\2\u01e2\u01e6\5\u0089E\2\u01e3\u01e6\5w<\2\u01e4\u01e6\t\f\2\2\u01e5"+
		"\u01e2\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2"+
		"\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01d4\3\2\2\2\u01ea\u01e1\3\2\2\2\u01eb\u0088\3\2"+
		"\2\2\u01ec\u01ed\t\r\2\2\u01ed\u008a\3\2\2\2\u01ee\u01f2\7\'\2\2\u01ef"+
		"\u01f1\13\2\2\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f3\3"+
		"\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5"+
		"\u01f6\7\'\2\2\u01f6\u008c\3\2\2\2\u01f7\u01fb\7%\2\2\u01f8\u01fa\13\2"+
		"\2\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0200\7\17"+
		"\2\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u0202\7\f\2\2\u0202\u0203\3\2\2\2\u0203\u0204\bG\2\2\u0204\u008e\3\2"+
		"\2\2\u0205\u0207\7\17\2\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0208\3\2\2\2\u0208\u0209\7\f\2\2\u0209\u0090\3\2\2\2\u020a\u020c\t\16"+
		"\2\2\u020b\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020b\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\bI\3\2\u0210\u0092\3\2"+
		"\2\2*\2\u0144\u0147\u014c\u014f\u0156\u015c\u0160\u0163\u0168\u016b\u016e"+
		"\u0174\u0177\u017a\u017c\u0182\u018c\u0191\u0193\u019a\u019c\u01a3\u01a5"+
		"\u01a9\u01b0\u01c2\u01cd\u01d2\u01d7\u01dc\u01de\u01e5\u01e7\u01ea\u01f2"+
		"\u01fb\u01ff\u0206\u020d\4\t@\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}