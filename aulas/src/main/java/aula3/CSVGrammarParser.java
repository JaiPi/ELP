// Generated from java-escape by ANTLR 4.11.1
package aula3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CSVGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, QUOTE=2, BOOLEAN=3, NUMERIC=4, TEXT=5, SEPARATOR=6, EOF_=7;
	public static final int
		RULE_line = 0, RULE_field = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"line", "field"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "QUOTE", "BOOLEAN", "NUMERIC", "TEXT", "SEPARATOR", "EOF_"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSVGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode EOF_() { return getToken(CSVGrammarParser.EOF_, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(CSVGrammarParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(CSVGrammarParser.SEPARATOR, i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVGrammarListener ) ((CSVGrammarListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVGrammarListener ) ((CSVGrammarListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVGrammarVisitor ) return ((CSVGrammarVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			field();
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR) {
				{
				{
				setState(6); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(5);
						match(SEPARATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(8); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(10);
				field();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
			match(EOF_);
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
	public static class FieldContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(CSVGrammarParser.BOOLEAN, 0); }
		public TerminalNode NUMERIC() { return getToken(CSVGrammarParser.NUMERIC, 0); }
		public List<TerminalNode> SPACE() { return getTokens(CSVGrammarParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CSVGrammarParser.SPACE, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(CSVGrammarParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(CSVGrammarParser.TEXT, i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVGrammarListener ) ((CSVGrammarListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVGrammarListener ) ((CSVGrammarListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVGrammarVisitor ) return ((CSVGrammarVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(18);
				match(SPACE);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				{
				setState(24);
				match(BOOLEAN);
				}
				break;
			case NUMERIC:
				{
				setState(25);
				match(NUMERIC);
				}
				break;
			case TEXT:
			case SEPARATOR:
			case EOF_:
				{
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXT) {
					{
					{
					setState(26);
					match(TEXT);
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SPACE) {
						{
						{
						setState(27);
						match(SPACE);
						}
						}
						setState(32);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0007)\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0004\u0000\u0007\b\u0000\u000b\u0000\f\u0000\b\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0005\u0001\u0014\b\u0001\n\u0001\f\u0001\u0017"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001d"+
		"\b\u0001\n\u0001\f\u0001 \t\u0001\u0005\u0001\"\b\u0001\n\u0001\f\u0001"+
		"%\t\u0001\u0003\u0001\'\b\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002"+
		"\u0000\u0000-\u0000\u0004\u0001\u0000\u0000\u0000\u0002\u0015\u0001\u0000"+
		"\u0000\u0000\u0004\r\u0003\u0002\u0001\u0000\u0005\u0007\u0005\u0006\u0000"+
		"\u0000\u0006\u0005\u0001\u0000\u0000\u0000\u0007\b\u0001\u0000\u0000\u0000"+
		"\b\u0006\u0001\u0000\u0000\u0000\b\t\u0001\u0000\u0000\u0000\t\n\u0001"+
		"\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\u0006\u0001\u0000"+
		"\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000"+
		"\u000f\r\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0007\u0000\u0000\u0011"+
		"\u0001\u0001\u0000\u0000\u0000\u0012\u0014\u0005\u0001\u0000\u0000\u0013"+
		"\u0012\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015"+
		"\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016"+
		"&\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\'"+
		"\u0005\u0003\u0000\u0000\u0019\'\u0005\u0004\u0000\u0000\u001a\u001e\u0005"+
		"\u0005\u0000\u0000\u001b\u001d\u0005\u0001\u0000\u0000\u001c\u001b\u0001"+
		"\u0000\u0000\u0000\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000"+
		"\u0000 \u001e\u0001\u0000\u0000\u0000!\u001a\u0001\u0000\u0000\u0000\""+
		"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&\u0018\u0001"+
		"\u0000\u0000\u0000&\u0019\u0001\u0000\u0000\u0000&#\u0001\u0000\u0000"+
		"\u0000\'\u0003\u0001\u0000\u0000\u0000\u0006\b\r\u0015\u001e#&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}