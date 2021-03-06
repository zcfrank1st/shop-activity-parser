// Generated from /Users/zcfrank1st/Desktop/git-svn/shop-activity-parser/src/main/java/com/dejionline/item/shop/activity/grammar/ShopActivity.g4 by ANTLR 4.5.1
package com.dejionline.item.shop.activity.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShopActivityLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TOTAL_PRICE=2, EXPRESS=3, VALUE=4, FREE=5, NAME=6, WS=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "TOTAL_PRICE", "EXPRESS", "VALUE", "FREE", "NAME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", "'TOTAL_PRICE'", "'EXPRESS'", null, "'FREE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "TOTAL_PRICE", "EXPRESS", "VALUE", "FREE", "NAME", "WS"
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


	public ShopActivityLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ShopActivity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t>\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\6\5*\n\5\r\5\16\5+\3\6\3\6\3\6\3\6\3\6\3\7\6\7\64\n\7\r\7\16\7\65\3"+
		"\b\6\b9\n\b\r\b\16\b:\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2"+
		"\5\3\2\62;\4\2\62;\u0082\0\6\2\13\f\17\17\"\"))@\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21"+
		"\3\2\2\2\5\23\3\2\2\2\7\37\3\2\2\2\t\'\3\2\2\2\13-\3\2\2\2\r\63\3\2\2"+
		"\2\178\3\2\2\2\21\22\7B\2\2\22\4\3\2\2\2\23\24\7V\2\2\24\25\7Q\2\2\25"+
		"\26\7V\2\2\26\27\7C\2\2\27\30\7N\2\2\30\31\7a\2\2\31\32\7R\2\2\32\33\7"+
		"T\2\2\33\34\7K\2\2\34\35\7E\2\2\35\36\7G\2\2\36\6\3\2\2\2\37 \7G\2\2 "+
		"!\7Z\2\2!\"\7R\2\2\"#\7T\2\2#$\7G\2\2$%\7U\2\2%&\7U\2\2&\b\3\2\2\2\')"+
		"\7/\2\2(*\t\2\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\n\3\2\2\2-"+
		".\7H\2\2./\7T\2\2/\60\7G\2\2\60\61\7G\2\2\61\f\3\2\2\2\62\64\t\3\2\2\63"+
		"\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\16\3\2\2\2\67"+
		"9\t\4\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\b\b\2"+
		"\2=\20\3\2\2\2\6\2+\65:\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}