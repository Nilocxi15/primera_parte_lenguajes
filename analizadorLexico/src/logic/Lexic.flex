import compilerTools.Token;

%%
%class Lexer
%type Token
%line
%column

%{

    private Token token(String lexeme, String lexicalComp, int line, int column) {
        return new Token(lexeme, lexicalComp, line+1, column+1);
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

/*White space*/
{WhiteSpace} {/*Ignore*/}

. {return token(yytext(), "ERROR", yyline, yycolumn);}

