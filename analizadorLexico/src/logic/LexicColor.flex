import compilerTools.TextColor;
import java.awt.Color;

%%
%class LexerColor
%type TextColor
%char 
%{

    private TextColor textColor(long start, int size, Color color) {
        return new TextColor((int)start, size, color);
    }

%}

  LineTerminator = \r|\n|\r\n
    InputCharacter = [^\r\n]
    WhiteSpace     = {LineTerminator} | [ \t\f]
   TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
    EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
    DocumentationComment = "/**" {CommentContent} "*"+ "/"
    CommentContent       = ( [^*] | \*+ [^/*] )*
    Letter = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
    Digit = [0-9]


    Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
    Identifier = {Letter}({Letter}|{Digit})*
    Digit = 0 | [1-9][0-9]*
    DecDigit = [0-9][.][0-9]+
%%

/*Comment*/

{Comment} {return textColor(yychar, yylenght(), new Color(146,146,146));}

/*White space*/
{WhiteSpace} {/*Ignore*/}

. {/*Ignore*/}


