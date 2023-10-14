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
    Boolean             = "True" | "False"
    StringArray         = {Quote} {LetterOrDigitOrWhiteSpace}* {Quote}
    SimpleStringArray   = {SimpleQuote} {LetterOrDigitOrWhiteSpace}* {SimpleQuote}
    
    Arithmetic  = {Addition} | {Subtraction} | {Exponent} | {Division} | {Module} | {Multiplication}
    Comparison  = {Equal} | {Different} | {GreaterThan} | {SmallerThan} | {LessThanOrEqualTo} | {GreaterThanOrEqualTo}
    Logicians   = "and" | "or" | "not"
    Assignment  = {Arithmetic} "=" | "="
    KeyWords    = "as" | "assert" | "break" | "class" | "continue" | "def" | "del" | "elif"
                "else" | "except" | "finally" | "for" | "from" | "global" | "if" | "import" |
                "in" | "is" | "lambda" | "None" | "nonlocal" | "pass" | "raise" | "return" |
                "try" | "while" | "with" | "yield"
    Constants   = {DecIntegerLiteral} | {Decimal} | {Boolean} | {StringArray} | {SimpleStringArray}
    Others      = "(" | ")" | "{" | "}" | "[" | "]" | "," | ";" | ":"
    Identifiers = ({Letter} | "_") ({LetterOrDigit}| "_")*
%%

/*Comment*/

{Comment} { return textColor(yychar, yylength(), new Color(146, 146, 146)); }

/*White space*/
{WhiteSpace} {/*Ignore*/}

/* Comparison */
{Comparison} { return textColor(yychar, yylength(), new Color(46, 134, 193)); }

/* Arithmetic */
{Arithmetic} { return textColor(yychar, yylength(), new Color(46, 134, 193)); }

/* Logicians */
{Logicians} { return textColor(yychar, yylength(), new Color(46, 134, 193)); }

/* Assignment */
{Assignment} { return textColor(yychar, yylength(), new Color(46, 134, 193)); }

/* KeyWords */
{KeyWords} { return textColor(yychar, yylength(), new Color(125, 60, 152)); }

/* Constants */
{Constants} { return textColor(yychar, yylength(), new Color(169, 50, 38)); }

/* Others */
{Others} { return textColor(yychar, yylength(), new Color(30, 132, 73)); }

. {/*Ignore*/}