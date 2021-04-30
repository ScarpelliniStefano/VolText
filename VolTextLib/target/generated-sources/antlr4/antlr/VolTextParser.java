// Generated from VolText.g4 by ANTLR 4.4

    package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VolTextParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'height'", "'RECTANGLE'", "'img'", "'id:'", "'colorT-bullet:'", 
		"'font-family-otf:'", "'item:'", "'oob:'", "'stylesheet'", "'ordered:'", 
		"'list'", "'color-bullet:'", "'underline:'", "'color:'", "'fit-y'", "'pos-x'", 
		"'format:'", "'italics:'", "'orientation:'", "'p_width'", "'shape:\"'", 
		"'title:'", "'TRIANGLE'", "'angle-rotation'", "'page'", "'position:'", 
		"'URL:'", "'colorT:'", "':'", "'CIRCLE'", "'width'", "'font-family-ttf:'", 
		"'bullet:'", "'string:'", "'font-family:'", "'@'", "'text'", "'pos-y'", 
		"'fit-x'", "'div'", "'font-size:'", "'author:'", "'alignment:'", "'path:'", 
		"'bold:'", "'cross-point:'", "'p_height'", "'-'", "UNIT", "FORMATVAL", 
		"ORIENTATION", "TXTATF", "COLORVAL", "ALIGNVAL", "TFVAL", "POSVAL", "NVAL", 
		"'\";'", "';'", "':{'", "'{'", "'}'", "STRING", "WS"
	};
	public static final int
		RULE_pdf = 0, RULE_pdfattr = 1, RULE_stylesheet = 2, RULE_element = 3, 
		RULE_attrStyle = 4, RULE_page = 5, RULE_pae = 6, RULE_div = 7, RULE_tvalue = 8, 
		RULE_figure = 9, RULE_elemd = 10, RULE_img = 11, RULE_imgattr = 12, RULE_imgElem = 13, 
		RULE_list = 14, RULE_listElem = 15, RULE_text = 16, RULE_txtattr = 17, 
		RULE_txtElem = 18, RULE_fitAttr = 19, RULE_imganumber = 20, RULE_idval = 21, 
		RULE_listattr = 22, RULE_txtval = 23, RULE_colorBullet = 24, RULE_color = 25, 
		RULE_positionv = 26, RULE_alignment = 27, RULE_pageattr = 28;
	public static final String[] ruleNames = {
		"pdf", "pdfattr", "stylesheet", "element", "attrStyle", "page", "pae", 
		"div", "tvalue", "figure", "elemd", "img", "imgattr", "imgElem", "list", 
		"listElem", "text", "txtattr", "txtElem", "fitAttr", "imganumber", "idval", 
		"listattr", "txtval", "colorBullet", "color", "positionv", "alignment", 
		"pageattr"
	};

	@Override
	public String getGrammarFileName() { return "VolText.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VolTextParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PdfContext extends ParserRuleContext {
		public List<PageContext> page() {
			return getRuleContexts(PageContext.class);
		}
		public PageContext page(int i) {
			return getRuleContext(PageContext.class,i);
		}
		public StylesheetContext stylesheet() {
			return getRuleContext(StylesheetContext.class,0);
		}
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public List<PdfattrContext> pdfattr() {
			return getRuleContexts(PdfattrContext.class);
		}
		public TerminalNode A() { return getToken(VolTextParser.A, 0); }
		public PdfattrContext pdfattr(int i) {
			return getRuleContext(PdfattrContext.class,i);
		}
		public PdfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pdf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterPdf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitPdf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitPdf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PdfContext pdf() throws RecognitionException {
		PdfContext _localctx = new PdfContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pdf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(A);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__5) | (1L << T__3))) != 0)) {
				{
				{
				setState(59); pdfattr();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(65); stylesheet();
				}
			}

			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68); page();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__22 );
			setState(73); match(C);
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

	public static class PdfattrContext extends ParserRuleContext {
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public PdfattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pdfattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterPdfattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitPdfattr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitPdfattr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PdfattrContext pdfattr() throws RecognitionException {
		PdfattrContext _localctx = new PdfattrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pdfattr);
		try {
			setState(84);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); match(T__25);
				setState(76); match(STRING);
				setState(77); match(ENDNLINE);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); match(T__5);
				setState(79); match(STRING);
				setState(80); match(ENDNLINE);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81); match(T__3);
				setState(82); match(STRING);
				setState(83); match(ENDNLINE);
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

	public static class StylesheetContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(T__38);
			setState(87); match(O);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(88); element();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94); match(C);
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

	public static class ElementContext extends ParserRuleContext {
		public AttrStyleContext attrStyle(int i) {
			return getRuleContext(AttrStyleContext.class,i);
		}
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public List<AttrStyleContext> attrStyle() {
			return getRuleContexts(AttrStyleContext.class);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(T__11);
			setState(97); match(STRING);
			setState(98); match(O);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__42) | (1L << T__41) | (1L << T__39) | (1L << T__37) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__32) | (1L << T__31) | (1L << T__30) | (1L << T__29) | (1L << T__28) | (1L << T__27) | (1L << T__26) | (1L << T__23) | (1L << T__21) | (1L << T__19) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << T__9) | (1L << T__8) | (1L << T__6) | (1L << T__4) | (1L << T__2) | (1L << T__1) | (1L << T__0))) != 0)) {
				{
				{
				setState(99); attrStyle();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105); match(C);
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

	public static class AttrStyleContext extends ParserRuleContext {
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode COLORVAL() { return getToken(VolTextParser.COLORVAL, 0); }
		public TerminalNode ENDLINE() { return getToken(VolTextParser.ENDLINE, 0); }
		public TerminalNode POSVAL() { return getToken(VolTextParser.POSVAL, 0); }
		public TerminalNode NOTVAL() { return getToken(VolTextParser.NOTVAL, 0); }
		public TerminalNode TFVAL() { return getToken(VolTextParser.TFVAL, 0); }
		public TerminalNode ALIGNVAL() { return getToken(VolTextParser.ALIGNVAL, 0); }
		public TerminalNode FORMATVAL() { return getToken(VolTextParser.FORMATVAL, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public TerminalNode UNIT() { return getToken(VolTextParser.UNIT, 0); }
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
		public TerminalNode ORIENTATION() { return getToken(VolTextParser.ORIENTATION, 0); }
		public AttrStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterAttrStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitAttrStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitAttrStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrStyleContext attrStyle() throws RecognitionException {
		AttrStyleContext _localctx = new AttrStyleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attrStyle);
		int _la;
		try {
			setState(187);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107); match(T__1);
				setState(108); match(NVAL);
				setState(109); match(ENDNLINE);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); match(T__26);
				setState(111);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__24) | (1L << T__17))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(112); match(ENDLINE);
				}
				break;
			case T__32:
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				_la = _input.LA(1);
				if ( !(_la==T__32 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(114); match(T__18);
				setState(115); match(TFVAL);
				setState(116); match(ENDNLINE);
				}
				break;
			case T__31:
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(118); match(T__18);
				setState(120);
				_la = _input.LA(1);
				if (_la==NOTVAL) {
					{
					setState(119); match(NOTVAL);
					}
				}

				setState(122); match(NVAL);
				setState(124);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(123); match(UNIT);
					}
				}

				setState(126); match(ENDNLINE);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(127); match(T__23);
				setState(128); match(T__18);
				setState(130);
				_la = _input.LA(1);
				if (_la==NOTVAL) {
					{
					setState(129); match(NOTVAL);
					}
				}

				setState(132); match(NVAL);
				setState(133); match(ENDNLINE);
				}
				break;
			case T__46:
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
				_la = _input.LA(1);
				if ( !(_la==T__46 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(135); match(T__18);
				setState(136); match(NVAL);
				setState(138);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(137); match(UNIT);
					}
				}

				setState(140); match(ENDNLINE);
				}
				break;
			case T__27:
			case T__0:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__0) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(142); match(T__18);
				setState(143); match(NVAL);
				setState(144); match(ENDNLINE);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 8);
				{
				setState(145); match(T__37);
				setState(146); match(TFVAL);
				setState(147); match(ENDNLINE);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 9);
				{
				setState(148); match(T__14);
				setState(149); match(STRING);
				setState(150); match(ENDNLINE);
				}
				break;
			case T__41:
			case T__15:
			case T__12:
				enterOuterAlt(_localctx, 10);
				{
				setState(151);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__15) | (1L << T__12))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(152); match(STRING);
				setState(153); match(ENDNLINE);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 11);
				{
				setState(154); match(T__6);
				setState(155); match(NVAL);
				setState(156); match(ENDNLINE);
				}
				break;
			case T__34:
			case T__29:
			case T__2:
				enterOuterAlt(_localctx, 12);
				{
				setState(157);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__29) | (1L << T__2))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(158); match(TFVAL);
				setState(159); match(ENDNLINE);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 13);
				{
				setState(160); match(T__42);
				setState(161); match(STRING);
				setState(162); match(ENDNLINE);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 14);
				{
				setState(163); match(T__35);
				setState(164); match(COLORVAL);
				setState(165); match(ENDNLINE);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 15);
				{
				setState(166); match(T__19);
				setState(167); match(STRING);
				setState(168); match(ENDNLINE);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 16);
				{
				setState(169); match(T__33);
				setState(170); match(COLORVAL);
				setState(171); match(ENDNLINE);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 17);
				{
				setState(172); match(T__21);
				setState(173); match(POSVAL);
				setState(174); match(ENDNLINE);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 18);
				{
				setState(175); match(T__4);
				setState(176); match(ALIGNVAL);
				setState(177); match(ENDLINE);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 19);
				{
				setState(178); match(T__28);
				setState(179); match(ORIENTATION);
				setState(180); match(ENDNLINE);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 20);
				{
				setState(181); match(T__39);
				setState(182); match(TFVAL);
				setState(183); match(ENDNLINE);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 21);
				{
				setState(184); match(T__30);
				setState(185); match(FORMATVAL);
				setState(186); match(ENDNLINE);
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

	public static class PageContext extends ParserRuleContext {
		public List<PageattrContext> pageattr() {
			return getRuleContexts(PageattrContext.class);
		}
		public PaeContext pae(int i) {
			return getRuleContext(PaeContext.class,i);
		}
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public PageattrContext pageattr(int i) {
			return getRuleContext(PageattrContext.class,i);
		}
		public List<PaeContext> pae() {
			return getRuleContexts(PaeContext.class);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(T__22);
			setState(190); match(O);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__39) | (1L << T__30) | (1L << T__28) | (1L << T__27) | (1L << T__0))) != 0)) {
				{
				{
				setState(191); pageattr();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__36) | (1L << T__10) | (1L << T__7))) != 0)) {
				{
				{
				setState(197); pae();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203); match(C);
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

	public static class PaeContext extends ParserRuleContext {
		public ElemdContext elemd() {
			return getRuleContext(ElemdContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public PaeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pae; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterPae(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitPae(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitPae(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaeContext pae() throws RecognitionException {
		PaeContext _localctx = new PaeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pae);
		try {
			setState(207);
			switch (_input.LA(1)) {
			case T__44:
			case T__36:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); elemd();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(206); div();
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

	public static class DivContext extends ParserRuleContext {
		public List<ColorContext> color() {
			return getRuleContexts(ColorContext.class);
		}
		public List<FitAttrContext> fitAttr() {
			return getRuleContexts(FitAttrContext.class);
		}
		public List<IdvalContext> idval() {
			return getRuleContexts(IdvalContext.class);
		}
		public FitAttrContext fitAttr(int i) {
			return getRuleContext(FitAttrContext.class,i);
		}
		public ImganumberContext imganumber(int i) {
			return getRuleContext(ImganumberContext.class,i);
		}
		public PositionvContext positionv(int i) {
			return getRuleContext(PositionvContext.class,i);
		}
		public ColorContext color(int i) {
			return getRuleContext(ColorContext.class,i);
		}
		public List<ImganumberContext> imganumber() {
			return getRuleContexts(ImganumberContext.class);
		}
		public IdvalContext idval(int i) {
			return getRuleContext(IdvalContext.class,i);
		}
		public List<FigureContext> figure() {
			return getRuleContexts(FigureContext.class);
		}
		public FigureContext figure(int i) {
			return getRuleContext(FigureContext.class,i);
		}
		public List<ElemdContext> elemd() {
			return getRuleContexts(ElemdContext.class);
		}
		public List<PositionvContext> positionv() {
			return getRuleContexts(PositionvContext.class);
		}
		public TvalueContext tvalue(int i) {
			return getRuleContext(TvalueContext.class,i);
		}
		public List<TvalueContext> tvalue() {
			return getRuleContexts(TvalueContext.class);
		}
		public ElemdContext elemd(int i) {
			return getRuleContext(ElemdContext.class,i);
		}
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(T__7);
			setState(210); match(O);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__44) | (1L << T__43) | (1L << T__36) | (1L << T__33) | (1L << T__32) | (1L << T__31) | (1L << T__26) | (1L << T__23) | (1L << T__21) | (1L << T__19) | (1L << T__16) | (1L << T__10) | (1L << T__9) | (1L << T__8) | (1L << T__1))) != 0)) {
				{
				setState(219);
				switch (_input.LA(1)) {
				case T__33:
				case T__19:
					{
					setState(211); color();
					}
					break;
				case T__43:
					{
					setState(212); idval();
					}
					break;
				case T__46:
				case T__31:
				case T__23:
				case T__16:
				case T__9:
					{
					setState(213); imganumber();
					}
					break;
				case T__44:
				case T__36:
				case T__10:
					{
					setState(214); elemd();
					}
					break;
				case T__21:
					{
					setState(215); positionv();
					}
					break;
				case T__32:
				case T__8:
					{
					setState(216); fitAttr();
					}
					break;
				case T__26:
					{
					setState(217); figure();
					}
					break;
				case T__1:
					{
					setState(218); tvalue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224); match(C);
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

	public static class TvalueContext extends ParserRuleContext {
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
		public TvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterTvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitTvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitTvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TvalueContext tvalue() throws RecognitionException {
		TvalueContext _localctx = new TvalueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); match(T__1);
			setState(227); match(NVAL);
			setState(228); match(ENDNLINE);
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

	public static class FigureContext extends ParserRuleContext {
		public TerminalNode ENDLINE() { return getToken(VolTextParser.ENDLINE, 0); }
		public FigureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterFigure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitFigure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitFigure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigureContext figure() throws RecognitionException {
		FigureContext _localctx = new FigureContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_figure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); match(T__26);
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__24) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(232); match(ENDLINE);
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

	public static class ElemdContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ImgContext img() {
			return getRuleContext(ImgContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ElemdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterElemd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitElemd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitElemd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElemdContext elemd() throws RecognitionException {
		ElemdContext _localctx = new ElemdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elemd);
		try {
			setState(237);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(234); text();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(235); list();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 3);
				{
				setState(236); img();
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

	public static class ImgContext extends ParserRuleContext {
		public ImgattrContext imgattr(int i) {
			return getRuleContext(ImgattrContext.class,i);
		}
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public List<ImgattrContext> imgattr() {
			return getRuleContexts(ImgattrContext.class);
		}
		public ImgElemContext imgElem() {
			return getRuleContext(ImgElemContext.class,0);
		}
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public ImgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_img; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterImg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitImg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitImg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgContext img() throws RecognitionException {
		ImgContext _localctx = new ImgContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_img);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(T__44);
			setState(240); match(O);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__43) | (1L << T__32) | (1L << T__31) | (1L << T__23) | (1L << T__21) | (1L << T__16) | (1L << T__9) | (1L << T__8))) != 0)) {
				{
				{
				setState(241); imgattr();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247); imgElem();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__43) | (1L << T__32) | (1L << T__31) | (1L << T__23) | (1L << T__21) | (1L << T__16) | (1L << T__9) | (1L << T__8))) != 0)) {
				{
				{
				setState(248); imgattr();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254); match(C);
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

	public static class ImgattrContext extends ParserRuleContext {
		public PositionvContext positionv() {
			return getRuleContext(PositionvContext.class,0);
		}
		public FitAttrContext fitAttr() {
			return getRuleContext(FitAttrContext.class,0);
		}
		public IdvalContext idval() {
			return getRuleContext(IdvalContext.class,0);
		}
		public ImganumberContext imganumber() {
			return getRuleContext(ImganumberContext.class,0);
		}
		public ImgattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imgattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterImgattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitImgattr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitImgattr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgattrContext imgattr() throws RecognitionException {
		ImgattrContext _localctx = new ImgattrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_imgattr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			switch (_input.LA(1)) {
			case T__43:
				{
				setState(256); idval();
				}
				break;
			case T__46:
			case T__31:
			case T__23:
			case T__16:
			case T__9:
				{
				setState(257); imganumber();
				}
				break;
			case T__21:
				{
				setState(258); positionv();
				}
				break;
			case T__32:
			case T__8:
				{
				setState(259); fitAttr();
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

	public static class ImgElemContext extends ParserRuleContext {
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public ImgElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imgElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterImgElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitImgElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitImgElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgElemContext imgElem() throws RecognitionException {
		ImgElemContext _localctx = new ImgElemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_imgElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); match(T__20);
			setState(263); match(STRING);
			setState(264); match(ENDNLINE);
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

	public static class ListContext extends ParserRuleContext {
		public List<ListElemContext> listElem() {
			return getRuleContexts(ListElemContext.class);
		}
		public ListattrContext listattr(int i) {
			return getRuleContext(ListattrContext.class,i);
		}
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public List<ListattrContext> listattr() {
			return getRuleContexts(ListattrContext.class);
		}
		public ListElemContext listElem(int i) {
			return getRuleContext(ListElemContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); match(T__36);
			setState(267); match(O);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__43) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__37) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__32) | (1L << T__31) | (1L << T__29) | (1L << T__23) | (1L << T__21) | (1L << T__19) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << T__9) | (1L << T__8) | (1L << T__6) | (1L << T__2))) != 0)) {
				{
				setState(270);
				switch (_input.LA(1)) {
				case T__46:
				case T__43:
				case T__42:
				case T__41:
				case T__37:
				case T__35:
				case T__34:
				case T__33:
				case T__32:
				case T__31:
				case T__29:
				case T__23:
				case T__21:
				case T__19:
				case T__16:
				case T__15:
				case T__14:
				case T__12:
				case T__9:
				case T__8:
				case T__6:
				case T__2:
					{
					setState(268); listattr();
					}
					break;
				case T__40:
					{
					setState(269); listElem();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275); match(C);
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

	public static class ListElemContext extends ParserRuleContext {
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public ListElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterListElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitListElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitListElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElemContext listElem() throws RecognitionException {
		ListElemContext _localctx = new ListElemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(T__40);
			setState(278); match(STRING);
			setState(279); match(ENDNLINE);
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

	public static class TextContext extends ParserRuleContext {
		public TxtattrContext txtattr(int i) {
			return getRuleContext(TxtattrContext.class,i);
		}
		public TxtElemContext txtElem(int i) {
			return getRuleContext(TxtElemContext.class,i);
		}
		public List<TxtattrContext> txtattr() {
			return getRuleContexts(TxtattrContext.class);
		}
		public List<TxtElemContext> txtElem() {
			return getRuleContexts(TxtElemContext.class);
		}
		public TerminalNode O() { return getToken(VolTextParser.O, 0); }
		public TerminalNode C() { return getToken(VolTextParser.C, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(T__10);
			setState(282); match(O);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(283); txtattr();
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(289); txtElem();
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(298);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295); txtattr();
					}
					} 
				}
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(301); txtElem();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__43) | (1L << T__41) | (1L << T__34) | (1L << T__33) | (1L << T__32) | (1L << T__31) | (1L << T__29) | (1L << T__23) | (1L << T__21) | (1L << T__19) | (1L << T__16) | (1L << T__15) | (1L << T__12) | (1L << T__9) | (1L << T__8) | (1L << T__6) | (1L << T__4) | (1L << T__2))) != 0)) {
				{
				{
				setState(307); txtattr();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313); match(C);
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

	public static class TxtattrContext extends ParserRuleContext {
		public PositionvContext positionv() {
			return getRuleContext(PositionvContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public TxtvalContext txtval() {
			return getRuleContext(TxtvalContext.class,0);
		}
		public FitAttrContext fitAttr() {
			return getRuleContext(FitAttrContext.class,0);
		}
		public IdvalContext idval() {
			return getRuleContext(IdvalContext.class,0);
		}
		public AlignmentContext alignment() {
			return getRuleContext(AlignmentContext.class,0);
		}
		public ImganumberContext imganumber() {
			return getRuleContext(ImganumberContext.class,0);
		}
		public TxtattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txtattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterTxtattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitTxtattr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitTxtattr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TxtattrContext txtattr() throws RecognitionException {
		TxtattrContext _localctx = new TxtattrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_txtattr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			switch (_input.LA(1)) {
			case T__33:
			case T__19:
				{
				setState(315); color();
				}
				break;
			case T__43:
				{
				setState(316); idval();
				}
				break;
			case T__46:
			case T__31:
			case T__23:
			case T__16:
			case T__9:
				{
				setState(317); imganumber();
				}
				break;
			case T__21:
				{
				setState(318); positionv();
				}
				break;
			case T__4:
				{
				setState(319); alignment();
				}
				break;
			case T__41:
			case T__34:
			case T__29:
			case T__15:
			case T__12:
			case T__6:
			case T__2:
				{
				setState(320); txtval();
				}
				break;
			case T__32:
			case T__8:
				{
				setState(321); fitAttr();
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

	public static class TxtElemContext extends ParserRuleContext {
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public TxtElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txtElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterTxtElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitTxtElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitTxtElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TxtElemContext txtElem() throws RecognitionException {
		TxtElemContext _localctx = new TxtElemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_txtElem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); match(T__13);
			setState(325); match(STRING);
			setState(326); match(ENDNLINE);
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

	public static class FitAttrContext extends ParserRuleContext {
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode TFVAL() { return getToken(VolTextParser.TFVAL, 0); }
		public FitAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fitAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterFitAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitFitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitFitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FitAttrContext fitAttr() throws RecognitionException {
		FitAttrContext _localctx = new FitAttrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fitAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !(_la==T__32 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(329); match(T__18);
			setState(330); match(TFVAL);
			setState(331); match(ENDNLINE);
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

	public static class ImganumberContext extends ParserRuleContext {
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode NOTVAL() { return getToken(VolTextParser.NOTVAL, 0); }
		public TerminalNode UNIT() { return getToken(VolTextParser.UNIT, 0); }
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
		public ImganumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imganumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterImganumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitImganumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitImganumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImganumberContext imganumber() throws RecognitionException {
		ImganumberContext _localctx = new ImganumberContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_imganumber);
		int _la;
		try {
			setState(357);
			switch (_input.LA(1)) {
			case T__31:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(334); match(T__18);
				setState(336);
				_la = _input.LA(1);
				if (_la==NOTVAL) {
					{
					setState(335); match(NOTVAL);
					}
				}

				setState(338); match(NVAL);
				setState(340);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(339); match(UNIT);
					}
				}

				setState(342); match(ENDNLINE);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(343); match(T__23);
				setState(344); match(T__18);
				setState(346);
				_la = _input.LA(1);
				if (_la==NOTVAL) {
					{
					setState(345); match(NOTVAL);
					}
				}

				setState(348); match(NVAL);
				setState(349); match(ENDNLINE);
				}
				break;
			case T__46:
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				_la = _input.LA(1);
				if ( !(_la==T__46 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(351); match(T__18);
				setState(352); match(NVAL);
				setState(354);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(353); match(UNIT);
					}
				}

				setState(356); match(ENDNLINE);
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

	public static class IdvalContext extends ParserRuleContext {
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public IdvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterIdval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitIdval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitIdval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdvalContext idval() throws RecognitionException {
		IdvalContext _localctx = new IdvalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_idval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); match(T__43);
			setState(360); match(STRING);
			setState(361); match(ENDNLINE);
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

	public static class ListattrContext extends ParserRuleContext {
		public PositionvContext positionv() {
			return getRuleContext(PositionvContext.class,0);
		}
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TxtvalContext txtval() {
			return getRuleContext(TxtvalContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public FitAttrContext fitAttr() {
			return getRuleContext(FitAttrContext.class,0);
		}
		public TerminalNode TFVAL() { return getToken(VolTextParser.TFVAL, 0); }
		public IdvalContext idval() {
			return getRuleContext(IdvalContext.class,0);
		}
		public ColorBulletContext colorBullet() {
			return getRuleContext(ColorBulletContext.class,0);
		}
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public ImganumberContext imganumber() {
			return getRuleContext(ImganumberContext.class,0);
		}
		public ListattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterListattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitListattr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitListattr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListattrContext listattr() throws RecognitionException {
		ListattrContext _localctx = new ListattrContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_listattr);
		try {
			setState(376);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(363); match(T__37);
				setState(364); match(TFVAL);
				setState(365); match(ENDNLINE);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(366); match(T__14);
				setState(367); match(STRING);
				setState(368); match(ENDNLINE);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 3);
				{
				setState(369); idval();
				}
				break;
			case T__46:
			case T__31:
			case T__23:
			case T__16:
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(370); imganumber();
				}
				break;
			case T__41:
			case T__34:
			case T__29:
			case T__15:
			case T__12:
			case T__6:
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(371); txtval();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 6);
				{
				setState(372); positionv();
				}
				break;
			case T__33:
			case T__19:
				enterOuterAlt(_localctx, 7);
				{
				setState(373); color();
				}
				break;
			case T__42:
			case T__35:
				enterOuterAlt(_localctx, 8);
				{
				setState(374); colorBullet();
				}
				break;
			case T__32:
			case T__8:
				enterOuterAlt(_localctx, 9);
				{
				setState(375); fitAttr();
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

	public static class TxtvalContext extends ParserRuleContext {
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode TFVAL() { return getToken(VolTextParser.TFVAL, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
		public TxtvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txtval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterTxtval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitTxtval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitTxtval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TxtvalContext txtval() throws RecognitionException {
		TxtvalContext _localctx = new TxtvalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_txtval);
		int _la;
		try {
			setState(387);
			switch (_input.LA(1)) {
			case T__41:
			case T__15:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__15) | (1L << T__12))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(379); match(STRING);
				setState(380); match(ENDNLINE);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(381); match(T__6);
				setState(382); match(NVAL);
				setState(383); match(ENDNLINE);
				}
				break;
			case T__34:
			case T__29:
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__29) | (1L << T__2))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(385); match(TFVAL);
				setState(386); match(ENDNLINE);
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

	public static class ColorBulletContext extends ParserRuleContext {
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode COLORVAL() { return getToken(VolTextParser.COLORVAL, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public ColorBulletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorBullet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterColorBullet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitColorBullet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitColorBullet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorBulletContext colorBullet() throws RecognitionException {
		ColorBulletContext _localctx = new ColorBulletContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_colorBullet);
		try {
			setState(395);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(389); match(T__42);
				setState(390); match(STRING);
				setState(391); match(ENDNLINE);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(392); match(T__35);
				setState(393); match(COLORVAL);
				setState(394); match(ENDNLINE);
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode COLORVAL() { return getToken(VolTextParser.COLORVAL, 0); }
		public TerminalNode STRING() { return getToken(VolTextParser.STRING, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_color);
		try {
			setState(403);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(397); match(T__19);
				setState(398); match(STRING);
				setState(399); match(ENDNLINE);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(400); match(T__33);
				setState(401); match(COLORVAL);
				setState(402); match(ENDNLINE);
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

	public static class PositionvContext extends ParserRuleContext {
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode POSVAL() { return getToken(VolTextParser.POSVAL, 0); }
		public PositionvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterPositionv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitPositionv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitPositionv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionvContext positionv() throws RecognitionException {
		PositionvContext _localctx = new PositionvContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_positionv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405); match(T__21);
			setState(406); match(POSVAL);
			setState(407); match(ENDNLINE);
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

	public static class AlignmentContext extends ParserRuleContext {
		public TerminalNode ENDLINE() { return getToken(VolTextParser.ENDLINE, 0); }
		public TerminalNode ALIGNVAL() { return getToken(VolTextParser.ALIGNVAL, 0); }
		public AlignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterAlignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitAlignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitAlignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentContext alignment() throws RecognitionException {
		AlignmentContext _localctx = new AlignmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_alignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); match(T__4);
			setState(410); match(ALIGNVAL);
			setState(411); match(ENDLINE);
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

	public static class PageattrContext extends ParserRuleContext {
		public TerminalNode ENDNLINE() { return getToken(VolTextParser.ENDNLINE, 0); }
		public TerminalNode TFVAL() { return getToken(VolTextParser.TFVAL, 0); }
		public IdvalContext idval() {
			return getRuleContext(IdvalContext.class,0);
		}
		public TerminalNode FORMATVAL() { return getToken(VolTextParser.FORMATVAL, 0); }
		public TerminalNode ORIENTATION() { return getToken(VolTextParser.ORIENTATION, 0); }
		public TerminalNode NVAL() { return getToken(VolTextParser.NVAL, 0); }
		public PageattrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pageattr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).enterPageattr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VolTextListener ) ((VolTextListener)listener).exitPageattr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VolTextVisitor ) return ((VolTextVisitor<? extends T>)visitor).visitPageattr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageattrContext pageattr() throws RecognitionException {
		PageattrContext _localctx = new PageattrContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pageattr);
		try {
			setState(431);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(413); match(T__28);
				setState(414); match(ORIENTATION);
				setState(415); match(ENDNLINE);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(416); match(T__39);
				setState(417); match(TFVAL);
				setState(418); match(ENDNLINE);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(419); match(T__27);
				setState(420); match(T__18);
				setState(421); match(NVAL);
				setState(422); match(ENDNLINE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(423); match(T__0);
				setState(424); match(T__18);
				setState(425); match(NVAL);
				setState(426); match(ENDNLINE);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(427); match(T__30);
				setState(428); match(FORMATVAL);
				setState(429); match(ENDNLINE);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 6);
				{
				setState(430); idval();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3B\u01b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\7\2?\n\2\f"+
		"\2\16\2B\13\2\3\2\5\2E\n\2\3\2\6\2H\n\2\r\2\16\2I\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3W\n\3\3\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\7\5g\n\5\f\5\16\5j\13\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6{\n\6\3\6\3\6\5\6\177\n\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0085\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008d\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00be\n\6\3\7\3\7\3\7"+
		"\7\7\u00c3\n\7\f\7\16\7\u00c6\13\7\3\7\7\7\u00c9\n\7\f\7\16\7\u00cc\13"+
		"\7\3\7\3\7\3\b\3\b\5\b\u00d2\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u00de\n\t\f\t\16\t\u00e1\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\5\f\u00f0\n\f\3\r\3\r\3\r\7\r\u00f5\n\r\f\r\16"+
		"\r\u00f8\13\r\3\r\3\r\7\r\u00fc\n\r\f\r\16\r\u00ff\13\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\5\16\u0107\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\7\20\u0111\n\20\f\20\16\20\u0114\13\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\7\22\u011f\n\22\f\22\16\22\u0122\13\22\3\22\7\22\u0125"+
		"\n\22\f\22\16\22\u0128\13\22\3\22\7\22\u012b\n\22\f\22\16\22\u012e\13"+
		"\22\3\22\7\22\u0131\n\22\f\22\16\22\u0134\13\22\3\22\7\22\u0137\n\22\f"+
		"\22\16\22\u013a\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0145\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\5\26\u0153\n\26\3\26\3\26\5\26\u0157\n\26\3\26\3\26\3\26\3\26\5\26\u015d"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0165\n\26\3\26\5\26\u0168\n"+
		"\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\5\30\u017b\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0186\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u018e\n"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0196\n\33\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01b2\n\36\3\36\2\2\37\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\t\5\2\4"+
		"\4\31\31  \4\2\21\21))\4\2\22\22((\4\2\3\3!!\4\2\26\26\61\61\5\2\b\b\""+
		"\"%%\5\2\17\17\24\24//\u01eb\2<\3\2\2\2\4V\3\2\2\2\6X\3\2\2\2\bb\3\2\2"+
		"\2\n\u00bd\3\2\2\2\f\u00bf\3\2\2\2\16\u00d1\3\2\2\2\20\u00d3\3\2\2\2\22"+
		"\u00e4\3\2\2\2\24\u00e8\3\2\2\2\26\u00ef\3\2\2\2\30\u00f1\3\2\2\2\32\u0106"+
		"\3\2\2\2\34\u0108\3\2\2\2\36\u010c\3\2\2\2 \u0117\3\2\2\2\"\u011b\3\2"+
		"\2\2$\u0144\3\2\2\2&\u0146\3\2\2\2(\u014a\3\2\2\2*\u0167\3\2\2\2,\u0169"+
		"\3\2\2\2.\u017a\3\2\2\2\60\u0185\3\2\2\2\62\u018d\3\2\2\2\64\u0195\3\2"+
		"\2\2\66\u0197\3\2\2\28\u019b\3\2\2\2:\u01b1\3\2\2\2<@\7?\2\2=?\5\4\3\2"+
		">=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2CE\5\6\4\2"+
		"DC\3\2\2\2DE\3\2\2\2EG\3\2\2\2FH\5\f\7\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2"+
		"IJ\3\2\2\2JK\3\2\2\2KL\7@\2\2L\3\3\2\2\2MN\7\30\2\2NO\7A\2\2OW\7=\2\2"+
		"PQ\7,\2\2QR\7A\2\2RW\7=\2\2ST\7.\2\2TU\7A\2\2UW\7=\2\2VM\3\2\2\2VP\3\2"+
		"\2\2VS\3\2\2\2W\5\3\2\2\2XY\7\13\2\2Y]\7>\2\2Z\\\5\b\5\2[Z\3\2\2\2\\_"+
		"\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7@\2\2a\7\3\2\2\2b"+
		"c\7&\2\2cd\7A\2\2dh\7>\2\2eg\5\n\6\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7@\2\2l\t\3\2\2\2mn\7\60\2\2no\7;\2\2o\u00be"+
		"\7=\2\2pq\7\27\2\2qr\t\2\2\2r\u00be\7<\2\2st\t\3\2\2tu\7\37\2\2uv\79\2"+
		"\2v\u00be\7=\2\2wx\t\4\2\2xz\7\37\2\2y{\7\62\2\2zy\3\2\2\2z{\3\2\2\2{"+
		"|\3\2\2\2|~\7;\2\2}\177\7\63\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080\u00be\7=\2\2\u0081\u0082\7\32\2\2\u0082\u0084\7\37\2\2\u0083"+
		"\u0085\7\62\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\7;\2\2\u0087\u00be\7=\2\2\u0088\u0089\t\5\2\2\u0089"+
		"\u008a\7\37\2\2\u008a\u008c\7;\2\2\u008b\u008d\7\63\2\2\u008c\u008b\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u00be\7=\2\2\u008f"+
		"\u0090\t\6\2\2\u0090\u0091\7\37\2\2\u0091\u0092\7;\2\2\u0092\u00be\7="+
		"\2\2\u0093\u0094\7\f\2\2\u0094\u0095\79\2\2\u0095\u00be\7=\2\2\u0096\u0097"+
		"\7#\2\2\u0097\u0098\7A\2\2\u0098\u00be\7=\2\2\u0099\u009a\t\7\2\2\u009a"+
		"\u009b\7A\2\2\u009b\u00be\7=\2\2\u009c\u009d\7+\2\2\u009d\u009e\7;\2\2"+
		"\u009e\u00be\7=\2\2\u009f\u00a0\t\b\2\2\u00a0\u00a1\79\2\2\u00a1\u00be"+
		"\7=\2\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\7A\2\2\u00a4\u00be\7=\2\2\u00a5"+
		"\u00a6\7\16\2\2\u00a6\u00a7\7\67\2\2\u00a7\u00be\7=\2\2\u00a8\u00a9\7"+
		"\36\2\2\u00a9\u00aa\7A\2\2\u00aa\u00be\7=\2\2\u00ab\u00ac\7\20\2\2\u00ac"+
		"\u00ad\7\67\2\2\u00ad\u00be\7=\2\2\u00ae\u00af\7\34\2\2\u00af\u00b0\7"+
		":\2\2\u00b0\u00be\7=\2\2\u00b1\u00b2\7-\2\2\u00b2\u00b3\78\2\2\u00b3\u00be"+
		"\7<\2\2\u00b4\u00b5\7\25\2\2\u00b5\u00b6\7\65\2\2\u00b6\u00be\7=\2\2\u00b7"+
		"\u00b8\7\n\2\2\u00b8\u00b9\79\2\2\u00b9\u00be\7=\2\2\u00ba\u00bb\7\23"+
		"\2\2\u00bb\u00bc\7\64\2\2\u00bc\u00be\7=\2\2\u00bdm\3\2\2\2\u00bdp\3\2"+
		"\2\2\u00bds\3\2\2\2\u00bdw\3\2\2\2\u00bd\u0081\3\2\2\2\u00bd\u0088\3\2"+
		"\2\2\u00bd\u008f\3\2\2\2\u00bd\u0093\3\2\2\2\u00bd\u0096\3\2\2\2\u00bd"+
		"\u0099\3\2\2\2\u00bd\u009c\3\2\2\2\u00bd\u009f\3\2\2\2\u00bd\u00a2\3\2"+
		"\2\2\u00bd\u00a5\3\2\2\2\u00bd\u00a8\3\2\2\2\u00bd\u00ab\3\2\2\2\u00bd"+
		"\u00ae\3\2\2\2\u00bd\u00b1\3\2\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00b7\3\2"+
		"\2\2\u00bd\u00ba\3\2\2\2\u00be\13\3\2\2\2\u00bf\u00c0\7\33\2\2\u00c0\u00c4"+
		"\7>\2\2\u00c1\u00c3\5:\36\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00ca\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c7\u00c9\5\16\b\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00ce\7@\2\2\u00ce\r\3\2\2\2\u00cf\u00d2\5\26\f\2\u00d0\u00d2"+
		"\5\20\t\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\17\3\2\2\2\u00d3"+
		"\u00d4\7*\2\2\u00d4\u00df\7>\2\2\u00d5\u00de\5\64\33\2\u00d6\u00de\5,"+
		"\27\2\u00d7\u00de\5*\26\2\u00d8\u00de\5\26\f\2\u00d9\u00de\5\66\34\2\u00da"+
		"\u00de\5(\25\2\u00db\u00de\5\24\13\2\u00dc\u00de\5\22\n\2\u00dd\u00d5"+
		"\3\2\2\2\u00dd\u00d6\3\2\2\2\u00dd\u00d7\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd"+
		"\u00d9\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2"+
		"\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7@\2\2\u00e3\21\3\2\2\2"+
		"\u00e4\u00e5\7\60\2\2\u00e5\u00e6\7;\2\2\u00e6\u00e7\7=\2\2\u00e7\23\3"+
		"\2\2\2\u00e8\u00e9\7\27\2\2\u00e9\u00ea\t\2\2\2\u00ea\u00eb\7<\2\2\u00eb"+
		"\25\3\2\2\2\u00ec\u00f0\5\"\22\2\u00ed\u00f0\5\36\20\2\u00ee\u00f0\5\30"+
		"\r\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\27\3\2\2\2\u00f1\u00f2\7\5\2\2\u00f2\u00f6\7>\2\2\u00f3\u00f5\5\32\16"+
		"\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fd\5\34\17\2"+
		"\u00fa\u00fc\5\32\16\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0101\7@\2\2\u0101\31\3\2\2\2\u0102\u0107\5,\27\2\u0103\u0107\5*\26\2"+
		"\u0104\u0107\5\66\34\2\u0105\u0107\5(\25\2\u0106\u0102\3\2\2\2\u0106\u0103"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\33\3\2\2\2\u0108"+
		"\u0109\7\35\2\2\u0109\u010a\7A\2\2\u010a\u010b\7=\2\2\u010b\35\3\2\2\2"+
		"\u010c\u010d\7\r\2\2\u010d\u0112\7>\2\2\u010e\u0111\5.\30\2\u010f\u0111"+
		"\5 \21\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0115\u0116\7@\2\2\u0116\37\3\2\2\2\u0117\u0118\7\t\2\2\u0118\u0119"+
		"\7A\2\2\u0119\u011a\7=\2\2\u011a!\3\2\2\2\u011b\u011c\7\'\2\2\u011c\u0120"+
		"\7>\2\2\u011d\u011f\5$\23\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0126\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0123\u0125\5&\24\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012c\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0129\u012b\5$\23\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0132\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012f\u0131\5&\24\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0138\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0135\u0137\5$\23\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013b\u013c\7@\2\2\u013c#\3\2\2\2\u013d\u0145\5\64\33\2\u013e\u0145"+
		"\5,\27\2\u013f\u0145\5*\26\2\u0140\u0145\5\66\34\2\u0141\u0145\58\35\2"+
		"\u0142\u0145\5\60\31\2\u0143\u0145\5(\25\2\u0144\u013d\3\2\2\2\u0144\u013e"+
		"\3\2\2\2\u0144\u013f\3\2\2\2\u0144\u0140\3\2\2\2\u0144\u0141\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145%\3\2\2\2\u0146\u0147\7$\2\2\u0147"+
		"\u0148\7A\2\2\u0148\u0149\7=\2\2\u0149\'\3\2\2\2\u014a\u014b\t\3\2\2\u014b"+
		"\u014c\7\37\2\2\u014c\u014d\79\2\2\u014d\u014e\7=\2\2\u014e)\3\2\2\2\u014f"+
		"\u0150\t\4\2\2\u0150\u0152\7\37\2\2\u0151\u0153\7\62\2\2\u0152\u0151\3"+
		"\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\7;\2\2\u0155"+
		"\u0157\7\63\2\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3"+
		"\2\2\2\u0158\u0168\7=\2\2\u0159\u015a\7\32\2\2\u015a\u015c\7\37\2\2\u015b"+
		"\u015d\7\62\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3"+
		"\2\2\2\u015e\u015f\7;\2\2\u015f\u0168\7=\2\2\u0160\u0161\t\5\2\2\u0161"+
		"\u0162\7\37\2\2\u0162\u0164\7;\2\2\u0163\u0165\7\63\2\2\u0164\u0163\3"+
		"\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\7=\2\2\u0167"+
		"\u014f\3\2\2\2\u0167\u0159\3\2\2\2\u0167\u0160\3\2\2\2\u0168+\3\2\2\2"+
		"\u0169\u016a\7\6\2\2\u016a\u016b\7A\2\2\u016b\u016c\7=\2\2\u016c-\3\2"+
		"\2\2\u016d\u016e\7\f\2\2\u016e\u016f\79\2\2\u016f\u017b\7=\2\2\u0170\u0171"+
		"\7#\2\2\u0171\u0172\7A\2\2\u0172\u017b\7=\2\2\u0173\u017b\5,\27\2\u0174"+
		"\u017b\5*\26\2\u0175\u017b\5\60\31\2\u0176\u017b\5\66\34\2\u0177\u017b"+
		"\5\64\33\2\u0178\u017b\5\62\32\2\u0179\u017b\5(\25\2\u017a\u016d\3\2\2"+
		"\2\u017a\u0170\3\2\2\2\u017a\u0173\3\2\2\2\u017a\u0174\3\2\2\2\u017a\u0175"+
		"\3\2\2\2\u017a\u0176\3\2\2\2\u017a\u0177\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u0179\3\2\2\2\u017b/\3\2\2\2\u017c\u017d\t\7\2\2\u017d\u017e\7A\2\2\u017e"+
		"\u0186\7=\2\2\u017f\u0180\7+\2\2\u0180\u0181\7;\2\2\u0181\u0186\7=\2\2"+
		"\u0182\u0183\t\b\2\2\u0183\u0184\79\2\2\u0184\u0186\7=\2\2\u0185\u017c"+
		"\3\2\2\2\u0185\u017f\3\2\2\2\u0185\u0182\3\2\2\2\u0186\61\3\2\2\2\u0187"+
		"\u0188\7\7\2\2\u0188\u0189\7A\2\2\u0189\u018e\7=\2\2\u018a\u018b\7\16"+
		"\2\2\u018b\u018c\7\67\2\2\u018c\u018e\7=\2\2\u018d\u0187\3\2\2\2\u018d"+
		"\u018a\3\2\2\2\u018e\63\3\2\2\2\u018f\u0190\7\36\2\2\u0190\u0191\7A\2"+
		"\2\u0191\u0196\7=\2\2\u0192\u0193\7\20\2\2\u0193\u0194\7\67\2\2\u0194"+
		"\u0196\7=\2\2\u0195\u018f\3\2\2\2\u0195\u0192\3\2\2\2\u0196\65\3\2\2\2"+
		"\u0197\u0198\7\34\2\2\u0198\u0199\7:\2\2\u0199\u019a\7=\2\2\u019a\67\3"+
		"\2\2\2\u019b\u019c\7-\2\2\u019c\u019d\78\2\2\u019d\u019e\7<\2\2\u019e"+
		"9\3\2\2\2\u019f\u01a0\7\25\2\2\u01a0\u01a1\7\65\2\2\u01a1\u01b2\7=\2\2"+
		"\u01a2\u01a3\7\n\2\2\u01a3\u01a4\79\2\2\u01a4\u01b2\7=\2\2\u01a5\u01a6"+
		"\7\26\2\2\u01a6\u01a7\7\37\2\2\u01a7\u01a8\7;\2\2\u01a8\u01b2\7=\2\2\u01a9"+
		"\u01aa\7\61\2\2\u01aa\u01ab\7\37\2\2\u01ab\u01ac\7;\2\2\u01ac\u01b2\7"+
		"=\2\2\u01ad\u01ae\7\23\2\2\u01ae\u01af\7\64\2\2\u01af\u01b2\7=\2\2\u01b0"+
		"\u01b2\5,\27\2\u01b1\u019f\3\2\2\2\u01b1\u01a2\3\2\2\2\u01b1\u01a5\3\2"+
		"\2\2\u01b1\u01a9\3\2\2\2\u01b1\u01ad\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2"+
		";\3\2\2\2(@DIV]hz~\u0084\u008c\u00bd\u00c4\u00ca\u00d1\u00dd\u00df\u00ef"+
		"\u00f6\u00fd\u0106\u0110\u0112\u0120\u0126\u012c\u0132\u0138\u0144\u0152"+
		"\u0156\u015c\u0164\u0167\u017a\u0185\u018d\u0195\u01b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}