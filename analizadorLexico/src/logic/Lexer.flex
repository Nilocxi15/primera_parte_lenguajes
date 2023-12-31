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
    Decimal             = [0-9]+ "." [0-9]+
    StringArray         = {Quote} {LetterOrDigitOrWhiteSpace}* {Quote}
    SimpleStringArray   = {SimpleQuote} {LetterOrDigitOrWhiteSpace}* {SimpleQuote}
    
    Arithmetic  = {Addition} | {Subtraction} | {Exponent} | {Division} | {Module} | {Multiplication}
    Comparison  = {Equal} | {Different} | {GreaterThan} | {SmallerThan} | {LessThanOrEqualTo} | {GreaterThanOrEqualTo}
    Logicians   = "and" | "or" | "not"
    Assignment  = {Arithmetic} "=" | "="
    KeyWords    = "as" | "assert" | "break" | "class" | "continue" | "def" | "del" | "except" |
                "finally" | "for" | "from" | "global" | "import" | "in" | "is" | "lambda" | "None" | 
                "nonlocal" | "pass" | "raise" | "return" | "try" | "while" | "with" | "yield"
    Constants   = {DecIntegerLiteral} | {Decimal}
    Others      = "[" | "]" | ";" | ":" | "&" | "|" | "^" | "."
    Identifiers = ({Letter} | "_") ({LetterOrDigit}| "_")*
%%

{Comment} | {WhiteSpace} { /*Ignore*/ }

/* Condicion if else */
"if"   { return token(yytext(), "IF", yyline, yycolumn); }
"else" { return token(yytext(), "ELSE", yyline, yycolumn); }
"elif" { return token(yytext(), "ELIF", yyline, yycolumn); }

/* True */
"True" { return token(yytext(), "BOOLEANO", yyline, yycolumn); }

/* False */
"False" { return token(yytext(), "BOOLEANO", yyline, yycolumn); }

/* False */
"#" { return token(yytext(), "NUMERAL", yyline, yycolumn); }

/* Identifier */
\${Identifier} { return token(yytext(), "IDENTIFICADOR", yyline, yycolumn); }

/* Arithmetic */
{Arithmetic} { return token(yytext(), "ARITMETICO", yyline, yycolumn); }

/* Comparison */
{Comparison} { return token(yytext(), "COMPARACION", yyline, yycolumn); }

/* Logicians */
{Logicians} { return token(yytext(), "LOGICOS", yyline, yycolumn); }

/* Assignment */
{Assignment} { return token(yytext(), "ASIGNACION", yyline, yycolumn); }

/* KeyWords */
{KeyWords} { return token(yytext(), "PALABRAS_CLAVE", yyline, yycolumn); }

/* Constants */
{Constants} { return token(yytext(), "CONSTANTES", yyline, yycolumn); }

/* Others */
{Others} { return token(yytext(), "OTROS", yyline, yycolumn); }

/* Identifiers */
{Identifiers} { return token(yytext(), "IDENTIFICADORES", yyline, yycolumn); }

/* StringArray */
{StringArray} { return token(yytext(), "CADENA", yyline, yycolumn); }

/* SimpleStringArray */
{SimpleStringArray} { return token(yytext(), "CADENA", yyline, yycolumn); }

/* Operadores de agrupación */
"(" { return token(yytext(), "PARENTESIS_A", yyline, yycolumn); }
")" { return token(yytext(), "PARENTESIS_B", yyline, yycolumn); }
"{" { return token(yytext(), "LLAVE_A", yyline, yycolumn); }
"}" { return token(yytext(), "LLAVE_B", yyline, yycolumn); }

/* Signos de puntuación */
"," { return token(yytext(), "COMA", yyline, yycolumn); } 

. { return token(yytext(), "ERROR", yyline, yycolumn); }