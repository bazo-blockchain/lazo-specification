grammar Lazo;

@header {
  package bazolang;
}

/**
  The following code snippets for lexer and parser are copied from GoLang AntLR grammar file
  and slightly modified for the Lazo Grammar.
  Link: https://github.com/antlr/grammars-v4/blob/master/golang/Golang.g4
  Accessed on: 10.Nov 2018
*/
@parser::members {
    private boolean hasNewline() {
        var countEOF = this.getCurrentToken().getTokenIndex() - 1;
        var nextToken = _input.get(countEOF);
        if (nextToken.getChannel() != Lexer.HIDDEN) {
            return false;
        }

        if (nextToken.getType() == NEWLINE) {
            return true;
        }

        if (nextToken.getType() == WHITE_SPACE) {
            countEOF = this.getCurrentToken().getTokenIndex() - 2;
            nextToken = _input.get(countEOF);
        }

        var tokenLiteral = nextToken.getText();
        var tokenType = nextToken.getType();

        return (tokenType == BLOCK_COMMENT &&
                (tokenLiteral.contains("\r") || tokenLiteral.contains("\n"))) || (tokenType == NEWLINE);
    }

     /**
     * Returns {@code true} if no line terminator exists between the specified
     * token offset and the prior one on the {@code HIDDEN} channel.
     *
     * @return {@code true} if no line terminator exists between the specified
     * token offset and the prior one on the {@code HIDDEN} channel.
     */
    private boolean noTerminatorBetween(int tokenOffset) {
        BufferedTokenStream stream = (BufferedTokenStream)_input;
        List<Token> tokens = stream.getHiddenTokensToLeft(stream.LT(tokenOffset).getTokenIndex());

        if (tokens == null) {
            return true;
        }

        for (Token token : tokens) {
            if (token.getText().contains("\n"))
                return false;
        }

        return true;
    }

     /**
     * Returns {@code true} if no line terminator exists after any encounterd
     * parameters beyond the specified token offset and the next on the
     * {@code HIDDEN} channel.
     *
     * @return {@code true} if no line terminator exists after any encounterd
     * parameters beyond the specified token offset and the next on the
     * {@code HIDDEN} channel.
     */
    private boolean noTerminatorAfterParams(int tokenOffset) {
        BufferedTokenStream stream = (BufferedTokenStream)_input;
        int leftParams = 1;
        int rightParams = 0;
        String value;
        if (stream.LT(tokenOffset).getText().equals("(")) {
            // Scan past parameters
            while (leftParams != rightParams) {
                tokenOffset++;
                value = stream.LT(tokenOffset).getText();
                if (value.equals("(")) {
                    leftParams++;
                }
                else if (value.equals(")")) {
                    rightParams++;
                }
            }

            tokenOffset++;
            return noTerminatorBetween(tokenOffset);
        }

        return true;
    }
}

@lexer::members {
    // The most recently produced token.
    private Token lastToken = null;
    /**
     * Return the next token from the character stream and records this last
     * token in case it resides on the default channel. This recorded token
     * is used to determine when the lexer could possibly match a regex
     * literal.
     *
     * @return the next token from the character stream.
     */
    @Override
    public Token nextToken() {
        // Get the next token.
        Token next = super.nextToken();
        if (next.getChannel() == Token.DEFAULT_CHANNEL) {
            // Keep track of the last token on the default channel.
            this.lastToken = next;
        }

        return next;
    }
}
// End of Code snippets

// Parser Rules
// --------------------

program
  : versionDirective interfaceDeclaration* contractDeclaration EOF ;

versionDirective
  : 'version' INTEGER '.' INTEGER SEMI; // todo prevent version 0x3.0x2

contractDeclaration
  : 'contract' IDENTIFIER ('is' IDENTIFIER (',' IDENTIFIER)*)? '{' contractParts* '}';

interfaceDeclaration
  : 'interface' IDENTIFIER '{' interfaceParts* '}';

contractParts
  : variableDeclaration
  | structDeclaration
  | enumDeclaration
  | constructorDeclaration
  | eventDeclaration
  | functionDeclaration
  | annotation;

interfaceParts
  : functionHead SEMI;

constructorDeclaration
  : 'constructor' '(' paramList? ')' statementBlock;

annotation
  : '[' IDENTIFIER ('=' IDENTIFIER)? ']';

emitStatement
  : 'emit' callStatement;

eventDeclaration
  : 'event' IDENTIFIER '(' paramList*')' SEMI;

enumDeclaration
  : 'enum' IDENTIFIER '{' IDENTIFIER (',' IDENTIFIER)* '}' SEMI;

ifStatement
  : 'if' '(' expression ')' statementBlock ('else if' '(' expression ')' statementBlock)? ('else' statementBlock)? ;

forStatement
  : 'for' '(' IDENTIFIER ':' rangeStatement ')' statementBlock ;

forEachStatement
  : 'foreach' '(' type IDENTIFIER ':' designator ')' statementBlock;

mapForEachStatement
  : 'foreach' '(' (type? IDENTIFIER ',')? type IDENTIFIER ':' designator ')' statementBlock ;

rangeStatement
  : expression? 'to' expression ('by' expression)?; // Expression as we could use .size or negative integers

functionDeclaration
  : functionHead statementBlock;

functionHead
  : 'internal'? 'function' (type | '(' type (',' type)*')') IDENTIFIER '(' paramList? ')';

call
  : IDENTIFIER '(' argumentList? ')';

argumentList
  : expression (',' expression)* ;

paramList
  : parameter (',' parameter)*;

parameter
  : type IDENTIFIER; // todo add default value

statementBlock
  : '{' statement* '}';

statement
  : assignmentStatement
  | returnStatement
  | callStatement
  | emitStatement
  | variableDeclaration
  | ifStatement
  | forEachStatement
  | forStatement
  | mapForEachStatement;

variableDeclaration
  :  type IDENTIFIER assignment? SEMI;

callStatement
  : call SEMI;

assignment
  : '=' (expression | ternaryExpression);

assignmentStatement
  : designator assignment SEMI;

designator
  : IDENTIFIER
  | 'this'
  | designator '.' IDENTIFIER
  | designator '[' expression ']' ;

returnStatement
  : 'return' expression (',' expression)? SEMI ;

ternaryExpression
  : expression '?' statement ':' statement SEMI ;

// TODO Try to write expression with OR and adjust sub-rules (see solidity)
// ---------------------------
expression
  : logicTerm ('||' logicTerm)*;
logicTerm
: logicFactor ('&&' logicFactor)*;

logicFactor
: bitwiseOrExp ('|' bitwiseOrExp)*;

bitwiseOrExp
: bitwiseXorExp ('^' bitwiseXorExp)*;

bitwiseXorExp
: bitwiseAndExp ('&' bitwiseAndExp)*;

bitwiseAndExp
  : equalityExp (('==' | '!=') equalityExp)* ;

equalityExp
  : comparisonExp (('<' | '<=' | '>' | '>=') comparisonExp)*;

comparisonExp
  : bitwiseShiftExp (('<<' | '>>') bitwiseShiftExp)*;

bitwiseShiftExp
  : term (('+' | '-') term)*;

term
  : factor (('*' | '/' | '%') factor)*;

factor
  : exponent ('**' exponent)*;

exponent
  : ('(' type ')')? castExpression;

castExpression
  : prefixExpression | unaryExpression;

prefixExpression
  : ('++' | '--')? callExpression;

unaryExpression
  : ( '!' | '+' | '-' | '∼' )? (callExpression | postfixExpression);

postfixExpression
  : callExpression ( '++' | '--' )? ;

callExpression
  : operand | '(' expression ')';

operand
  : literal
  | arrayCreation
  | mapCreation
  | structCreation
  | designator
  | call;

literal
  : INTEGER
  | CHARACTER
  | STRING
  | BOOL;

//-----------------------------

structCreation
  : 'new' IDENTIFIER '('(IDENTIFIER assignment | expression)* ')' ;

arrayCreation
  : 'new' IDENTIFIER '[' expression* ']';

mapCreation
  : 'new' mapType LPAREN RPAREN;

type
  : arrayType
  | mapType
  | IDENTIFIER;

arrayType
  : IDENTIFIER '[]';

mapType
  : 'Map' '<' type',' type '>';

structDeclaration
  : 'struct' IDENTIFIER '{' structBody* '}' ;

structBody
  : type IDENTIFIER SEMI;


//
//THROW : 'throw' EXCEPTION_CREATION;
//EXCEPTION_CREATION : 'a';
//EXCEPTION_DECLARATION : 'exception' IDENTIFIER '(' PARAM_LIST ')' '{' [VAR_DECLARATION]{0,1} [',' VAR_DECLARATION]* '}';

// Lexer Tokens
// -------------

// Reserved Keywords (Hint: Order by asc)
// -----------------
BREAK : 'break' ;
CONSTRUCTOR : 'constructor';
CONTINUE: 'continue' ;
CONTRACT : 'contract' ;
EMIT : 'emit' ;
FUNCTION : 'function' ;
INTERNAL : 'internal' ;
IS : 'is' ;
MAP : 'Map' ;
RETURN : 'return' ;
STRUCT : 'struct' ;
THIS : 'this' ;
VERSION : 'version' ;
// ----- TODO: complete the keywords

BOOL
  : 'true'
  | 'false' ;

// Punctuation marks
// ----------------
LPAREN : '(' ;
RPAREN : ')' ;
LBRACE : '{' ;
RBRACE : '}' ;
LBRACK : '[' ;
RBRACK : ']' ;
SEMI : ';';
COMMA : ',';
DOT : '.';
// -----

// Arithmatics
// -----------
PLUS: '+';
MIN: '-';
MUL: '*';
DIV: '/';
MOD: '%';
EXP: '**';
// TODO add others
// -----------

// Comparison
// ---------
EQ: '==';
NEQ: '!=';
GT: '>';
GT_EQ: '>=';
LT: '<';
LT_EQ: '<=';
// ---------

IDENTIFIER
  : ( '_' | ALPHA_LETTER) ( '_' | ALPHA_LETTER | DEC_DIGIT )* ;

fragment ALPHA_LETTER
  : [a-zA-Z] ;

INTEGER
  : DEC_DIGIT_LIT
  | HEX_DIGIT_LIT ;

HEX_DIGIT_LIT
  : '0x' HEX_DIGIT+ ;

fragment HEX_DIGIT
  : [0-9a-fA-F] ;

DEC_DIGIT_LIT
  : DEC_DIGIT+ ;

fragment DEC_DIGIT
  : [0-9] ;

STRING
  : '"' UNICODE_CHAR* '"' ;

CHARACTER
  : '\'' ( ESCAPED_CHAR | UNICODE_CHAR ) '\'' ;

fragment ESCAPED_CHAR
  : '\\' ( '0' | 'n' | '\\' | '\'' | '"' ) ;

fragment UNICODE_CHAR
  : ~[\r\n] // any Unicode code point except carrige return & new line
  ;

// Skip Rules
// ----------

NEWLINE
  : [\r\n]+ -> skip ;

WHITE_SPACE
  : [ \t\f\r]+ -> skip // skip spaces, tabs, form feed and carrige return
  ;

LINE_COMMENT
  : '//' ~[\r\n]* -> skip ;

BLOCK_COMMENT
  : '/*' .*? '*/' -> skip ;