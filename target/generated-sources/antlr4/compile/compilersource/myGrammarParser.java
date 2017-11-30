// Generated from myGrammar.g4 by ANTLR 4.4

package compile.compilersource;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Writeln=2, Write=3, Scan=4, Def=5, If=6, Else=7, Return=8, For=9, 
		While=10, To=11, Do=12, Start=13, End=14, Null=15, Split=16, Length=17, 
		Period=18, Or=19, And=20, Equals=21, NEquals=22, GTEquals=23, LTEquals=24, 
		Pow=25, Exclamation=26, GreatThan=27, LessThan=28, Add=29, Subtract=30, 
		Multiply=31, Divide=32, Modulus=33, OpenCurlyBracket=34, CloseCurlyBracket=35, 
		OpenBracket=36, CloseBracket=37, OpenParen=38, CloseParen=39, SemiColon=40, 
		Assign=41, Comma=42, Colon=43, Final=44, DataType=45, Bool=46, Number=47, 
		Identifier=48, String=49, Comment=50, Space=51, Int=52, Digit=53, UNKNOWN_CHAR=54;
	public static final String[] tokenNames = {
		"<INVALID>", "'?'", "'Writeln'", "'Write'", "'Scan'", "'def'", "'if'", 
		"'else'", "'return'", "'for'", "'while'", "'to'", "'do'", "'start'", "'end'", 
		"'null'", "'split'", "'length'", "'.'", "'||'", "'&&'", "'=='", "'!='", 
		"'>='", "'<='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','", 
		"':'", "'final'", "DataType", "Bool", "Number", "Identifier", "String", 
		"Comment", "Space", "Int", "Digit", "UNKNOWN_CHAR"
	};
	public static final int
		RULE_parse = 0, RULE_functionBlock = 1, RULE_block = 2, RULE_returnStatement = 3, 
		RULE_statement = 4, RULE_assignment = 5, RULE_identifierDeclaration = 6, 
		RULE_functionCall = 7, RULE_ifStatement = 8, RULE_ifStat = 9, RULE_elseIfStat = 10, 
		RULE_elseStat = 11, RULE_functionDecl = 12, RULE_forStatement = 13, RULE_whileStatement = 14, 
		RULE_doWhileStatement = 15, RULE_idList = 16, RULE_paramIdList = 17, RULE_exprList = 18, 
		RULE_expression = 19, RULE_list = 20, RULE_indexes = 21;
	public static final String[] ruleNames = {
		"parse", "functionBlock", "block", "returnStatement", "statement", "assignment", 
		"identifierDeclaration", "functionCall", "ifStatement", "ifStat", "elseIfStat", 
		"elseStat", "functionDecl", "forStatement", "whileStatement", "doWhileStatement", 
		"idList", "paramIdList", "exprList", "expression", "list", "indexes"
	};

	@Override
	public String getGrammarFileName() { return "myGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public myGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(myGrammarParser.EOF, 0); }
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); functionBlock();
			setState(45); match(EOF);
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

	public static class FunctionBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitFunctionBlock(this);
		}
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); block();
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

	public static class BlockContext extends ParserRuleContext {
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(51);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(49); statement();
						}
						break;
					case 2:
						{
						setState(50); functionDecl();
						}
						break;
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(57);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(56); returnStatement();
				}
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(myGrammarParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(Return);
			setState(60); expression(0);
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

	public static class StatementContext extends ParserRuleContext {
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IdentifierDeclarationContext identifierDeclaration() {
			return getRuleContext(IdentifierDeclarationContext.class,0);
		}
		public TerminalNode Comment() { return getToken(myGrammarParser.Comment, 0); }
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62); assignment();
				setState(64);
				_la = _input.LA(1);
				if (_la==Comment) {
					{
					setState(63); match(Comment);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); identifierDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68); ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69); forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70); whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(71); doWhileStatement();
				}
				break;
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

	public static class AssignmentContext extends ParserRuleContext {
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myGrammarParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(myGrammarParser.Assign, 0); }
		public TerminalNode DataType() { return getToken(myGrammarParser.DataType, 0); }
		public TerminalNode OpenParen() { return getToken(myGrammarParser.OpenParen, 0); }
		public TerminalNode Scan() { return getToken(myGrammarParser.Scan, 0); }
		public TerminalNode CloseParen() { return getToken(myGrammarParser.CloseParen, 0); }
		public TerminalNode Split() { return getToken(myGrammarParser.Split, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(myGrammarParser.Comma, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		int _la;
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); match(Identifier);
				setState(75); match(Assign);
				setState(79);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(76); match(OpenParen);
					setState(77); match(DataType);
					setState(78); match(CloseParen);
					}
					break;
				}
				setState(81); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82); match(Identifier);
				setState(83); indexes();
				setState(84); match(Assign);
				setState(88);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(85); match(OpenParen);
					setState(86); match(DataType);
					setState(87); match(CloseParen);
					}
					break;
				}
				setState(90); expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92); match(Scan);
				setState(93); match(OpenParen);
				setState(95);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Writeln) | (1L << Write) | (1L << Null) | (1L << Exclamation) | (1L << OpenBracket) | (1L << OpenParen) | (1L << Bool) | (1L << Number) | (1L << Identifier) | (1L << String))) != 0)) {
					{
					setState(94); expression(0);
					}
				}

				setState(97); match(Comma);
				setState(98); match(Identifier);
				setState(100);
				_la = _input.LA(1);
				if (_la==OpenBracket) {
					{
					setState(99); indexes();
					}
				}

				setState(102); match(CloseParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103); match(Identifier);
				setState(104); match(Assign);
				setState(105); match(DataType);
				setState(106); indexes();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(107); match(Identifier);
				setState(108); match(Assign);
				setState(109); match(Split);
				setState(110); match(OpenParen);
				setState(111); expression(0);
				setState(112); match(CloseParen);
				}
				break;
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

	public static class IdentifierDeclarationContext extends ParserRuleContext {
		public TerminalNode DataType() { return getToken(myGrammarParser.DataType, 0); }
		public TerminalNode Def() { return getToken(myGrammarParser.Def, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public TerminalNode Final() { return getToken(myGrammarParser.Final, 0); }
		public IdentifierDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterIdentifierDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitIdentifierDeclaration(this);
		}
	}

	public final IdentifierDeclarationContext identifierDeclaration() throws RecognitionException {
		IdentifierDeclarationContext _localctx = new IdentifierDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identifierDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(Def);
			setState(118);
			_la = _input.LA(1);
			if (_la==Final) {
				{
				setState(117); match(Final);
				}
			}

			setState(120); match(DataType);
			setState(121); idList();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintlnFunctionCallContext extends FunctionCallContext {
		public TerminalNode OpenParen() { return getToken(myGrammarParser.OpenParen, 0); }
		public TerminalNode Writeln() { return getToken(myGrammarParser.Writeln, 0); }
		public TerminalNode CloseParen() { return getToken(myGrammarParser.CloseParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintlnFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterPrintlnFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitPrintlnFunctionCall(this);
		}
	}
	public static class IdentifierFunctionCallContext extends FunctionCallContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myGrammarParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(myGrammarParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(myGrammarParser.CloseParen, 0); }
		public IdentifierFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterIdentifierFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitIdentifierFunctionCall(this);
		}
	}
	public static class PrintFunctionCallContext extends FunctionCallContext {
		public TerminalNode Write() { return getToken(myGrammarParser.Write, 0); }
		public TerminalNode OpenParen() { return getToken(myGrammarParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(myGrammarParser.CloseParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterPrintFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitPrintFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionCall);
		int _la;
		try {
			setState(140);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new IdentifierFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123); match(Identifier);
				setState(124); match(OpenParen);
				setState(126);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Writeln) | (1L << Write) | (1L << Null) | (1L << Exclamation) | (1L << OpenBracket) | (1L << OpenParen) | (1L << Bool) | (1L << Number) | (1L << Identifier) | (1L << String))) != 0)) {
					{
					setState(125); exprList();
					}
				}

				setState(128); match(CloseParen);
				}
				break;
			case Writeln:
				_localctx = new PrintlnFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129); match(Writeln);
				setState(130); match(OpenParen);
				setState(132);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Writeln) | (1L << Write) | (1L << Null) | (1L << Exclamation) | (1L << OpenBracket) | (1L << OpenParen) | (1L << Bool) | (1L << Number) | (1L << Identifier) | (1L << String))) != 0)) {
					{
					setState(131); expression(0);
					}
				}

				setState(134); match(CloseParen);
				}
				break;
			case Write:
				_localctx = new PrintFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(135); match(Write);
				setState(136); match(OpenParen);
				setState(137); expression(0);
				setState(138); match(CloseParen);
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public TerminalNode End() { return getToken(myGrammarParser.End, 0); }
		public ElseIfStatContext elseIfStat(int i) {
			return getRuleContext(ElseIfStatContext.class,i);
		}
		public List<ElseIfStatContext> elseIfStat() {
			return getRuleContexts(ElseIfStatContext.class);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142); ifStat();
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143); elseIfStat();
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(150);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(149); elseStat();
				}
			}

			setState(152); match(End);
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

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(myGrammarParser.Do, 0); }
		public TerminalNode If() { return getToken(myGrammarParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitIfStat(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(If);
			setState(155); expression(0);
			setState(156); match(Do);
			setState(157); block();
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

	public static class ElseIfStatContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(myGrammarParser.Do, 0); }
		public TerminalNode Else() { return getToken(myGrammarParser.Else, 0); }
		public TerminalNode If() { return getToken(myGrammarParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterElseIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitElseIfStat(this);
		}
	}

	public final ElseIfStatContext elseIfStat() throws RecognitionException {
		ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(Else);
			setState(160); match(If);
			setState(161); expression(0);
			setState(162); match(Do);
			setState(163); block();
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

	public static class ElseStatContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(myGrammarParser.Do, 0); }
		public TerminalNode Else() { return getToken(myGrammarParser.Else, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitElseStat(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(Else);
			setState(166); match(Do);
			setState(167); block();
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode DataType() { return getToken(myGrammarParser.DataType, 0); }
		public TerminalNode Identifier() { return getToken(myGrammarParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(myGrammarParser.OpenParen, 0); }
		public TerminalNode Def() { return getToken(myGrammarParser.Def, 0); }
		public TerminalNode End() { return getToken(myGrammarParser.End, 0); }
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public ParamIdListContext paramIdList() {
			return getRuleContext(ParamIdListContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(myGrammarParser.CloseParen, 0); }
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(Def);
			setState(170); match(DataType);
			setState(171); match(Identifier);
			setState(172); match(OpenParen);
			setState(174);
			_la = _input.LA(1);
			if (_la==DataType) {
				{
				setState(173); paramIdList();
				}
			}

			setState(176); match(CloseParen);
			setState(177); functionBlock();
			setState(178); match(End);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode DataType() { return getToken(myGrammarParser.DataType, 0); }
		public TerminalNode Identifier() { return getToken(myGrammarParser.Identifier, 0); }
		public TerminalNode To() { return getToken(myGrammarParser.To, 0); }
		public TerminalNode End() { return getToken(myGrammarParser.End, 0); }
		public TerminalNode Do() { return getToken(myGrammarParser.Do, 0); }
		public TerminalNode For() { return getToken(myGrammarParser.For, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forStatement);
		try {
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180); match(For);
				setState(181); match(DataType);
				setState(182); match(Identifier);
				setState(183); match(Assign);
				setState(184); expression(0);
				setState(185); match(To);
				setState(186); expression(0);
				setState(187); match(Do);
				setState(188); block();
				setState(189); match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191); match(For);
				setState(192); match(Identifier);
				setState(193); match(Assign);
				setState(194); expression(0);
				setState(195); match(To);
				setState(196); expression(0);
				setState(197); match(Do);
				setState(198); block();
				setState(199); match(End);
				}
				break;
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(myGrammarParser.While, 0); }
		public TerminalNode End() { return getToken(myGrammarParser.End, 0); }
		public TerminalNode Do() { return getToken(myGrammarParser.Do, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(While);
			setState(204); expression(0);
			setState(205); match(Do);
			setState(206); block();
			setState(207); match(End);
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(myGrammarParser.While, 0); }
		public TerminalNode Start() { return getToken(myGrammarParser.Start, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitDoWhileStatement(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(Start);
			setState(210); block();
			setState(211); match(While);
			setState(212); expression(0);
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

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(myGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(myGrammarParser.Identifier, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitIdList(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(Identifier);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(215); match(Comma);
				setState(216); match(Identifier);
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParamIdListContext extends ParserRuleContext {
		public List<TerminalNode> DataType() { return getTokens(myGrammarParser.DataType); }
		public List<TerminalNode> Identifier() { return getTokens(myGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(myGrammarParser.Identifier, i);
		}
		public TerminalNode DataType(int i) {
			return getToken(myGrammarParser.DataType, i);
		}
		public ParamIdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramIdList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterParamIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitParamIdList(this);
		}
	}

	public final ParamIdListContext paramIdList() throws RecognitionException {
		ParamIdListContext _localctx = new ParamIdListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_paramIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(DataType);
			setState(223); match(Identifier);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(224); match(Comma);
				setState(225); match(DataType);
				setState(226); match(Identifier);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExprListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); expression(0);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(233); match(Comma);
				setState(234); expression(0);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GtExpressionContext extends ExpressionContext {
		public TerminalNode GreatThan() { return getToken(myGrammarParser.GreatThan, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public GtExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterGtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitGtExpression(this);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode Number() { return getToken(myGrammarParser.Number, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitNumberExpression(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myGrammarParser.Identifier, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitIdentifierExpression(this);
		}
	}
	public static class ModulusExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ModulusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterModulusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitModulusExpression(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Exclamation() { return getToken(myGrammarParser.Exclamation, 0); }
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitNotExpression(this);
		}
	}
	public static class MultiplyExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MultiplyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitMultiplyExpression(this);
		}
	}
	public static class GtEqExpressionContext extends ExpressionContext {
		public TerminalNode GTEquals() { return getToken(myGrammarParser.GTEquals, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public GtEqExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterGtEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitGtEqExpression(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode And() { return getToken(myGrammarParser.And, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitAndExpression(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public TerminalNode String() { return getToken(myGrammarParser.String, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitStringExpression(this);
		}
	}
	public static class ExpressionExpressionContext extends ExpressionContext {
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(myGrammarParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(myGrammarParser.CloseParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterExpressionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitExpressionExpression(this);
		}
	}
	public static class NullExpressionContext extends ExpressionContext {
		public TerminalNode Null() { return getToken(myGrammarParser.Null, 0); }
		public NullExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitNullExpression(this);
		}
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitFunctionCallExpression(this);
		}
	}
	public static class ArrayLengthExpressionContext extends ExpressionContext {
		public TerminalNode Length() { return getToken(myGrammarParser.Length, 0); }
		public TerminalNode Identifier() { return getToken(myGrammarParser.Identifier, 0); }
		public TerminalNode Period() { return getToken(myGrammarParser.Period, 0); }
		public ArrayLengthExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterArrayLengthExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitArrayLengthExpression(this);
		}
	}
	public static class ListExpressionContext extends ExpressionContext {
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitListExpression(this);
		}
	}
	public static class LtEqExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LTEquals() { return getToken(myGrammarParser.LTEquals, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public LtEqExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterLtEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitLtEqExpression(this);
		}
	}
	public static class LtExpressionContext extends ExpressionContext {
		public TerminalNode LessThan() { return getToken(myGrammarParser.LessThan, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public LtExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterLtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitLtExpression(this);
		}
	}
	public static class ArrayExpressionContext extends ExpressionContext {
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myGrammarParser.Identifier, 0); }
		public ArrayExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitArrayExpression(this);
		}
	}
	public static class BoolExpressionContext extends ExpressionContext {
		public TerminalNode Bool() { return getToken(myGrammarParser.Bool, 0); }
		public BoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitBoolExpression(this);
		}
	}
	public static class NotEqExpressionContext extends ExpressionContext {
		public TerminalNode NEquals() { return getToken(myGrammarParser.NEquals, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public NotEqExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterNotEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitNotEqExpression(this);
		}
	}
	public static class DivideExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public DivideExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitDivideExpression(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(myGrammarParser.Or, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitOrExpression(this);
		}
	}
	public static class PowerExpressionContext extends ExpressionContext {
		public TerminalNode Pow() { return getToken(myGrammarParser.Pow, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public PowerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitPowerExpression(this);
		}
	}
	public static class EqExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode Equals() { return getToken(myGrammarParser.Equals, 0); }
		public EqExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitEqExpression(this);
		}
	}
	public static class AddExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitAddExpression(this);
		}
	}
	public static class SubtractExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode Subtract() { return getToken(myGrammarParser.Subtract, 0); }
		public SubtractExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterSubtractExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitSubtractExpression(this);
		}
	}
	public static class TernaryExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitTernaryExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(241); match(Exclamation);
				setState(242); expression(26);
				}
				break;
			case 2:
				{
				_localctx = new ArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243); match(Identifier);
				setState(244); indexes();
				}
				break;
			case 3:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245); match(Number);
				}
				break;
			case 4:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246); match(Bool);
				}
				break;
			case 5:
				{
				_localctx = new NullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247); match(Null);
				}
				break;
			case 6:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248); functionCall();
				setState(250);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(249); indexes();
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new ListExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252); list();
				setState(254);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(253); indexes();
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256); match(Identifier);
				setState(258);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(257); indexes();
					}
					break;
				}
				}
				break;
			case 9:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260); match(String);
				setState(262);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(261); indexes();
					}
					break;
				}
				}
				break;
			case 10:
				{
				_localctx = new ExpressionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264); match(OpenParen);
				setState(265); expression(0);
				setState(266); match(CloseParen);
				setState(268);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(267); indexes();
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new ArrayLengthExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270); match(Identifier);
				setState(271); match(Period);
				setState(272); match(Length);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(323);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(275);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(276); match(Pow);
						setState(277); expression(26);
						}
						break;
					case 2:
						{
						_localctx = new MultiplyExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(279); match(Multiply);
						setState(280); expression(25);
						}
						break;
					case 3:
						{
						_localctx = new DivideExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(282); match(Divide);
						setState(283); expression(24);
						}
						break;
					case 4:
						{
						_localctx = new ModulusExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(285); match(Modulus);
						setState(286); expression(23);
						}
						break;
					case 5:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(287);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(288); match(Add);
						setState(289); expression(22);
						}
						break;
					case 6:
						{
						_localctx = new SubtractExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(290);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(291); match(Subtract);
						setState(292); expression(21);
						}
						break;
					case 7:
						{
						_localctx = new GtEqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(293);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(294); match(GTEquals);
						setState(295); expression(20);
						}
						break;
					case 8:
						{
						_localctx = new LtEqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(296);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(297); match(LTEquals);
						setState(298); expression(19);
						}
						break;
					case 9:
						{
						_localctx = new GtExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(299);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(300); match(GreatThan);
						setState(301); expression(18);
						}
						break;
					case 10:
						{
						_localctx = new LtExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(302);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(303); match(LessThan);
						setState(304); expression(17);
						}
						break;
					case 11:
						{
						_localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(305);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(306); match(Equals);
						setState(307); expression(16);
						}
						break;
					case 12:
						{
						_localctx = new NotEqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(308);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(309); match(NEquals);
						setState(310); expression(15);
						}
						break;
					case 13:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(311);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(312); match(And);
						setState(313); expression(14);
						}
						break;
					case 14:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(314);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(315); match(Or);
						setState(316); expression(13);
						}
						break;
					case 15:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(317);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(318); match(T__0);
						setState(319); expression(0);
						setState(320); match(Colon);
						setState(321); expression(12);
						}
						break;
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(myGrammarParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(myGrammarParser.CloseBracket, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(OpenBracket);
			setState(330);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Writeln) | (1L << Write) | (1L << Null) | (1L << Exclamation) | (1L << OpenBracket) | (1L << OpenParen) | (1L << Bool) | (1L << Number) | (1L << Identifier) | (1L << String))) != 0)) {
				{
				setState(329); exprList();
				}
			}

			setState(332); match(CloseBracket);
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

	public static class IndexesContext extends ParserRuleContext {
		public TerminalNode OpenBracket(int i) {
			return getToken(myGrammarParser.OpenBracket, i);
		}
		public List<TerminalNode> OpenBracket() { return getTokens(myGrammarParser.OpenBracket); }
		public List<TerminalNode> CloseBracket() { return getTokens(myGrammarParser.CloseBracket); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode CloseBracket(int i) {
			return getToken(myGrammarParser.CloseBracket, i);
		}
		public IndexesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).enterIndexes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myGrammarListener ) ((myGrammarListener)listener).exitIndexes(this);
		}
	}

	public final IndexesContext indexes() throws RecognitionException {
		IndexesContext _localctx = new IndexesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_indexes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(334); match(OpenBracket);
					setState(335); expression(0);
					setState(336); match(CloseBracket);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(340); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 25);
		case 1: return precpred(_ctx, 24);
		case 2: return precpred(_ctx, 23);
		case 3: return precpred(_ctx, 22);
		case 4: return precpred(_ctx, 21);
		case 5: return precpred(_ctx, 20);
		case 6: return precpred(_ctx, 19);
		case 7: return precpred(_ctx, 18);
		case 8: return precpred(_ctx, 17);
		case 9: return precpred(_ctx, 16);
		case 10: return precpred(_ctx, 15);
		case 11: return precpred(_ctx, 14);
		case 12: return precpred(_ctx, 13);
		case 13: return precpred(_ctx, 12);
		case 14: return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u0159\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\7\4\66\n\4\f\4\16\49\13\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\6\3\6\5"+
		"\6C\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6K\n\6\3\7\3\7\3\7\3\7\3\7\5\7R\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7[\n\7\3\7\3\7\3\7\3\7\3\7\5\7b\n\7\3\7"+
		"\3\7\3\7\5\7g\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"u\n\7\3\b\3\b\5\by\n\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u0081\n\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0087\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\n\3\n\7\n"+
		"\u0093\n\n\f\n\16\n\u0096\13\n\3\n\5\n\u0099\n\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00b1\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00cc\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\7\22\u00dc\n\22\f\22\16\22\u00df\13\22\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u00e6\n\23\f\23\16\23\u00e9\13\23\3\24\3\24\3\24"+
		"\7\24\u00ee\n\24\f\24\16\24\u00f1\13\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00fd\n\25\3\25\3\25\5\25\u0101\n\25\3\25\3"+
		"\25\5\25\u0105\n\25\3\25\3\25\5\25\u0109\n\25\3\25\3\25\3\25\3\25\5\25"+
		"\u010f\n\25\3\25\3\25\3\25\5\25\u0114\n\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\7\25\u0146\n\25\f\25\16\25\u0149\13\25\3\26\3\26\5\26\u014d\n\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\6\27\u0155\n\27\r\27\16\27\u0156\3\27\2\3"+
		"(\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\u0180\2.\3\2\2"+
		"\2\4\61\3\2\2\2\6\67\3\2\2\2\b=\3\2\2\2\nJ\3\2\2\2\ft\3\2\2\2\16v\3\2"+
		"\2\2\20\u008e\3\2\2\2\22\u0090\3\2\2\2\24\u009c\3\2\2\2\26\u00a1\3\2\2"+
		"\2\30\u00a7\3\2\2\2\32\u00ab\3\2\2\2\34\u00cb\3\2\2\2\36\u00cd\3\2\2\2"+
		" \u00d3\3\2\2\2\"\u00d8\3\2\2\2$\u00e0\3\2\2\2&\u00ea\3\2\2\2(\u0113\3"+
		"\2\2\2*\u014a\3\2\2\2,\u0154\3\2\2\2./\5\4\3\2/\60\7\2\2\3\60\3\3\2\2"+
		"\2\61\62\5\6\4\2\62\5\3\2\2\2\63\66\5\n\6\2\64\66\5\32\16\2\65\63\3\2"+
		"\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28;\3\2\2\29\67"+
		"\3\2\2\2:<\5\b\5\2;:\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=>\7\n\2\2>?\5(\25\2"+
		"?\t\3\2\2\2@B\5\f\7\2AC\7\64\2\2BA\3\2\2\2BC\3\2\2\2CK\3\2\2\2DK\5\16"+
		"\b\2EK\5\20\t\2FK\5\22\n\2GK\5\34\17\2HK\5\36\20\2IK\5 \21\2J@\3\2\2\2"+
		"JD\3\2\2\2JE\3\2\2\2JF\3\2\2\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\13\3\2\2"+
		"\2LM\7\62\2\2MQ\7+\2\2NO\7(\2\2OP\7/\2\2PR\7)\2\2QN\3\2\2\2QR\3\2\2\2"+
		"RS\3\2\2\2Su\5(\25\2TU\7\62\2\2UV\5,\27\2VZ\7+\2\2WX\7(\2\2XY\7/\2\2Y"+
		"[\7)\2\2ZW\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\5(\25\2]u\3\2\2\2^_\7\6\2\2"+
		"_a\7(\2\2`b\5(\25\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7,\2\2df\7\62\2\2"+
		"eg\5,\27\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hu\7)\2\2ij\7\62\2\2jk\7+\2\2"+
		"kl\7/\2\2lu\5,\27\2mn\7\62\2\2no\7+\2\2op\7\22\2\2pq\7(\2\2qr\5(\25\2"+
		"rs\7)\2\2su\3\2\2\2tL\3\2\2\2tT\3\2\2\2t^\3\2\2\2ti\3\2\2\2tm\3\2\2\2"+
		"u\r\3\2\2\2vx\7\7\2\2wy\7.\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7/\2\2"+
		"{|\5\"\22\2|\17\3\2\2\2}~\7\62\2\2~\u0080\7(\2\2\177\u0081\5&\24\2\u0080"+
		"\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u008f\7)\2"+
		"\2\u0083\u0084\7\4\2\2\u0084\u0086\7(\2\2\u0085\u0087\5(\25\2\u0086\u0085"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008f\7)\2\2\u0089"+
		"\u008a\7\5\2\2\u008a\u008b\7(\2\2\u008b\u008c\5(\25\2\u008c\u008d\7)\2"+
		"\2\u008d\u008f\3\2\2\2\u008e}\3\2\2\2\u008e\u0083\3\2\2\2\u008e\u0089"+
		"\3\2\2\2\u008f\21\3\2\2\2\u0090\u0094\5\24\13\2\u0091\u0093\5\26\f\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\5\30\r\2\u0098"+
		"\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\20"+
		"\2\2\u009b\23\3\2\2\2\u009c\u009d\7\b\2\2\u009d\u009e\5(\25\2\u009e\u009f"+
		"\7\16\2\2\u009f\u00a0\5\6\4\2\u00a0\25\3\2\2\2\u00a1\u00a2\7\t\2\2\u00a2"+
		"\u00a3\7\b\2\2\u00a3\u00a4\5(\25\2\u00a4\u00a5\7\16\2\2\u00a5\u00a6\5"+
		"\6\4\2\u00a6\27\3\2\2\2\u00a7\u00a8\7\t\2\2\u00a8\u00a9\7\16\2\2\u00a9"+
		"\u00aa\5\6\4\2\u00aa\31\3\2\2\2\u00ab\u00ac\7\7\2\2\u00ac\u00ad\7/\2\2"+
		"\u00ad\u00ae\7\62\2\2\u00ae\u00b0\7(\2\2\u00af\u00b1\5$\23\2\u00b0\u00af"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7)\2\2\u00b3"+
		"\u00b4\5\4\3\2\u00b4\u00b5\7\20\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\7\13"+
		"\2\2\u00b7\u00b8\7/\2\2\u00b8\u00b9\7\62\2\2\u00b9\u00ba\7+\2\2\u00ba"+
		"\u00bb\5(\25\2\u00bb\u00bc\7\r\2\2\u00bc\u00bd\5(\25\2\u00bd\u00be\7\16"+
		"\2\2\u00be\u00bf\5\6\4\2\u00bf\u00c0\7\20\2\2\u00c0\u00cc\3\2\2\2\u00c1"+
		"\u00c2\7\13\2\2\u00c2\u00c3\7\62\2\2\u00c3\u00c4\7+\2\2\u00c4\u00c5\5"+
		"(\25\2\u00c5\u00c6\7\r\2\2\u00c6\u00c7\5(\25\2\u00c7\u00c8\7\16\2\2\u00c8"+
		"\u00c9\5\6\4\2\u00c9\u00ca\7\20\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00b6\3"+
		"\2\2\2\u00cb\u00c1\3\2\2\2\u00cc\35\3\2\2\2\u00cd\u00ce\7\f\2\2\u00ce"+
		"\u00cf\5(\25\2\u00cf\u00d0\7\16\2\2\u00d0\u00d1\5\6\4\2\u00d1\u00d2\7"+
		"\20\2\2\u00d2\37\3\2\2\2\u00d3\u00d4\7\17\2\2\u00d4\u00d5\5\6\4\2\u00d5"+
		"\u00d6\7\f\2\2\u00d6\u00d7\5(\25\2\u00d7!\3\2\2\2\u00d8\u00dd\7\62\2\2"+
		"\u00d9\u00da\7,\2\2\u00da\u00dc\7\62\2\2\u00db\u00d9\3\2\2\2\u00dc\u00df"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de#\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e1\7/\2\2\u00e1\u00e7\7\62\2\2\u00e2\u00e3\7,"+
		"\2\2\u00e3\u00e4\7/\2\2\u00e4\u00e6\7\62\2\2\u00e5\u00e2\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8%\3\2\2\2"+
		"\u00e9\u00e7\3\2\2\2\u00ea\u00ef\5(\25\2\u00eb\u00ec\7,\2\2\u00ec\u00ee"+
		"\5(\25\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\'\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\b\25\1"+
		"\2\u00f3\u00f4\7\34\2\2\u00f4\u0114\5(\25\34\u00f5\u00f6\7\62\2\2\u00f6"+
		"\u0114\5,\27\2\u00f7\u0114\7\61\2\2\u00f8\u0114\7\60\2\2\u00f9\u0114\7"+
		"\21\2\2\u00fa\u00fc\5\20\t\2\u00fb\u00fd\5,\27\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u0114\3\2\2\2\u00fe\u0100\5*\26\2\u00ff\u0101\5,"+
		"\27\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0114\3\2\2\2\u0102"+
		"\u0104\7\62\2\2\u0103\u0105\5,\27\2\u0104\u0103\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\u0114\3\2\2\2\u0106\u0108\7\63\2\2\u0107\u0109\5,\27\2\u0108"+
		"\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0114\3\2\2\2\u010a\u010b\7("+
		"\2\2\u010b\u010c\5(\25\2\u010c\u010e\7)\2\2\u010d\u010f\5,\27\2\u010e"+
		"\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0114\3\2\2\2\u0110\u0111\7\62"+
		"\2\2\u0111\u0112\7\24\2\2\u0112\u0114\7\23\2\2\u0113\u00f2\3\2\2\2\u0113"+
		"\u00f5\3\2\2\2\u0113\u00f7\3\2\2\2\u0113\u00f8\3\2\2\2\u0113\u00f9\3\2"+
		"\2\2\u0113\u00fa\3\2\2\2\u0113\u00fe\3\2\2\2\u0113\u0102\3\2\2\2\u0113"+
		"\u0106\3\2\2\2\u0113\u010a\3\2\2\2\u0113\u0110\3\2\2\2\u0114\u0147\3\2"+
		"\2\2\u0115\u0116\f\33\2\2\u0116\u0117\7\33\2\2\u0117\u0146\5(\25\34\u0118"+
		"\u0119\f\32\2\2\u0119\u011a\7!\2\2\u011a\u0146\5(\25\33\u011b\u011c\f"+
		"\31\2\2\u011c\u011d\7\"\2\2\u011d\u0146\5(\25\32\u011e\u011f\f\30\2\2"+
		"\u011f\u0120\7#\2\2\u0120\u0146\5(\25\31\u0121\u0122\f\27\2\2\u0122\u0123"+
		"\7\37\2\2\u0123\u0146\5(\25\30\u0124\u0125\f\26\2\2\u0125\u0126\7 \2\2"+
		"\u0126\u0146\5(\25\27\u0127\u0128\f\25\2\2\u0128\u0129\7\31\2\2\u0129"+
		"\u0146\5(\25\26\u012a\u012b\f\24\2\2\u012b\u012c\7\32\2\2\u012c\u0146"+
		"\5(\25\25\u012d\u012e\f\23\2\2\u012e\u012f\7\35\2\2\u012f\u0146\5(\25"+
		"\24\u0130\u0131\f\22\2\2\u0131\u0132\7\36\2\2\u0132\u0146\5(\25\23\u0133"+
		"\u0134\f\21\2\2\u0134\u0135\7\27\2\2\u0135\u0146\5(\25\22\u0136\u0137"+
		"\f\20\2\2\u0137\u0138\7\30\2\2\u0138\u0146\5(\25\21\u0139\u013a\f\17\2"+
		"\2\u013a\u013b\7\26\2\2\u013b\u0146\5(\25\20\u013c\u013d\f\16\2\2\u013d"+
		"\u013e\7\25\2\2\u013e\u0146\5(\25\17\u013f\u0140\f\r\2\2\u0140\u0141\7"+
		"\3\2\2\u0141\u0142\5(\25\2\u0142\u0143\7-\2\2\u0143\u0144\5(\25\16\u0144"+
		"\u0146\3\2\2\2\u0145\u0115\3\2\2\2\u0145\u0118\3\2\2\2\u0145\u011b\3\2"+
		"\2\2\u0145\u011e\3\2\2\2\u0145\u0121\3\2\2\2\u0145\u0124\3\2\2\2\u0145"+
		"\u0127\3\2\2\2\u0145\u012a\3\2\2\2\u0145\u012d\3\2\2\2\u0145\u0130\3\2"+
		"\2\2\u0145\u0133\3\2\2\2\u0145\u0136\3\2\2\2\u0145\u0139\3\2\2\2\u0145"+
		"\u013c\3\2\2\2\u0145\u013f\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148)\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014c"+
		"\7&\2\2\u014b\u014d\5&\24\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014f\7\'\2\2\u014f+\3\2\2\2\u0150\u0151\7&\2\2\u0151"+
		"\u0152\5(\25\2\u0152\u0153\7\'\2\2\u0153\u0155\3\2\2\2\u0154\u0150\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"-\3\2\2\2!\65\67;BJQZaftx\u0080\u0086\u008e\u0094\u0098\u00b0\u00cb\u00dd"+
		"\u00e7\u00ef\u00fc\u0100\u0104\u0108\u010e\u0113\u0145\u0147\u014c\u0156";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}