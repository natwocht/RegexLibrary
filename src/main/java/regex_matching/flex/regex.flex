/* Regular expression lexer specification */

import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java.io.*;

/**
* This class is a regular expression lexer.
*/

%%

%public
%class Lexer
%cup
%scanerror LexerException
%unicode
%line
%column

%{
    StringBuffer string = new StringBuffer();
    ComplexSymbolFactory symbolFactory;

    public Lexer(java.io.Reader in, ComplexSymbolFactory sf){
    	this(in);
    	symbolFactory = sf;
    }

    private void error(String message) {
	    System.out.println("Error at line "+(yyline+1)+", column "+(yycolumn+1)+" : "+message);
    }

    private Symbol symbol(String name, int sym) {
        System.out.println(name);
        return symbolFactory.newSymbol(name, sym, new Location(yyline+1,yycolumn+1,yychar), new Location(yyline+1,yycolumn+yylength(),yychar+yylength()));
    }

    private Symbol symbol(String name, int sym, Object val) {
        Location left = new Location(yyline+1,yycolumn+1,yychar);
        Location right= new Location(yyline+1,yycolumn+yylength(), yychar+yylength());
        return symbolFactory.newSymbol(name, sym, left, right,val);
    }

    private Symbol symbol(String name, int sym, Object val,int buflength) {
        Location left = new Location(yyline+1,yycolumn+yylength()-buflength,yychar+yylength()-buflength);
        Location right= new Location(yyline+1,yycolumn+yylength(), yychar+yylength());
        return symbolFactory.newSymbol(name, sym, left, right,val);
    }

    private void error(String message) {
        System.out.println("Error at line "+(yyline+1)+", column "+(yycolumn+1)+" : "+message);
    }


%}

%eofval{
     return symbolFactory.newSymbol("EOF", sym.EOF, new Location(yyline+1,yycolumn+1,yychar), new Location(yyline+1,yycolumn+1,yychar+1));
%eofval}

/* Macros*/
Dash = "-"
LeftSquareBracket = "["
RightSquareBracket = "]"
LeftBracket = "("
RightBracket = ")"
QuestionMark = "?"
Star = "*"
Plus = "+"
Bar = "|"
Char = [0-9a-zA-Z!#$%',:;<=>@_`\./\{\}~]|\\\\|\\\(|\\\)|\\\-|\\\]|\\\[|\\\*|\\\+|\"|\\\?|\\\^

%%

<YYINITIAL> {
    {Char}                  { return symbol("CHAR", sym.CHAR, yytext());}
    {Dash}                   { return symbol("-", sym.DASH); }
    {LeftBracket}            { return symbol("(", sym.LEFT_BRACKET); }
    {RightBracket}            { return symbol(")", sym.RIGHT_BRACKET); }
    {LeftSquareBracket}            { return symbol("[", sym.LEFT_SQUARE_BRACKET); }
    {RightSquareBracket}            { return symbol("]", sym.RIGHT_SQUARE_BRACKET); }
    {QuestionMark}            {return symbol("?", sym.QUESTION_MARK); }
    {Star}            { return symbol("*", sym.STAR); }
    {Plus}            { return symbol("+", sym.PLUS);}
    {Bar}            {  return symbol("|", sym.BAR);}
}