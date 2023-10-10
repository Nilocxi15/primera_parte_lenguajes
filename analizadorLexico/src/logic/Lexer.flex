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
    LineTerminator  = \r|\n|\r\n
    InputCharacter  = [^\r\n]
    WhiteSpace      = {LineTerminator} | [ \t\f]
    Quote           = [\"]
    SimpleQuote     = [\']

    /* comments */
    Comment = {CustomComment}

    TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
    // Comment can be the last line of the file, without line terminator.
    EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
    CustomComment        = "#" {InputCharacter}* {LineTerminator}?
    DocumentationComment = "/**" {CommentContent} "*"+ "/"
    CommentContent       = ( [^*] | \*+ [^/*] )*

    Identifier = [:jletter:] [:jletterdigit:]*

    DecIntegerLiteral           = 0 | [1-9][0-9]*
    Letter                      = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
    LetterOrDigit               = {Letter} | {DecIntegerLiteral}
    LetterOrDigitOrWhiteSpace   = {LetterOrDigit} | {WhiteSpace}

    /* arithmetic */
    Addition        = "+"
    Subtraction     = "-"
    Exponent        = "**"
    Division        = "/" | "//"
    Module          = "%"
    Multiplication  = "*"

    /* comparison */
    Equal               = "=="
    Different           = "!="
    GreaterThan         = ">"
    SmallerThan         = "<"
    LessThanOrEqualTo   = "<="
    GreaterThanOrEqualTo= ">=" 

    /* Constants */
    Decimal         = [0-9]+ "." [0-9]+
    Boolean         = "True" | "False"
    StringArray     = {Quote} {LetterOrDigitOrWhiteSpace}* {Quote}
    
    Arithmetic  = {Addition} | {Subtraction} | {Exponent} | {Division} | {Module} | {Multiplication}
    Comparison  = {Equal} | {Different} | {GreaterThan} | {SmallerThan} | {LessThanOrEqualTo} | {GreaterThanOrEqualTo}
    Logicians   = "and" | "or" | "not"
    Assignment  = {Arithmetic} "=" | "="
    KeyWords    = "as" | "assert" | "break" | "class" | "continue" | "def" | "del" | "elif"
                "else" | "except" | "finally" | "for" | "from" | "global" | "if" | "import" |
                "in" | "is" | "lambda" | "None" | "nonlocal" | "pass" | "raise" | "return" |
                "try" | "while" | "with" | "yield"
    Constants   = {DecIntegerLiteral} | {Decimal} | {Boolean} | {StringArray}
    Others      = "(" | ")" | "{" | "}" | "[" | "]" | "," | ";" | ":"
    Identifiers = ({Letter} | "_") ({LetterOrDigit}| "_")*
%%

{Comment} | {WhiteSpace} { /*Ignore*/ }

/* Identifier */
\${Identifier} { return token(yytext(), "IDENTIFICADOR", yyline, yycolumn); }

/* Arithmetic */
{Arithmetic} { return token(yytext(), "ARITMÉTICO", yyline, yycolumn); }

/* Comparison */
{Comparison} { return token(yytext(), "COMPARACIÓN", yyline, yycolumn); }

/* Logicians */
{Logicians} { return token(yytext(), "LÓGICOS", yyline, yycolumn); }

/* Assignment */
{Assignment} { return token(yytext(), "ASIGNACIÓN", yyline, yycolumn); }

/* KeyWords */
{KeyWords} { return token(yytext(), "PALABRAS CLAVE", yyline, yycolumn); }

/* Constants */
{Constants} { return token(yytext(), "CONSTANTES", yyline, yycolumn); }

/* Others */
{Others} { return token(yytext(), "OTROS", yyline, yycolumn); }

/* Identifiers */
{Identifiers} { return token(yytext(), "IDENTIFICADORES", yyline, yycolumn); }

. { return token(yytext(), "ERROR", yyline, yycolumn); }