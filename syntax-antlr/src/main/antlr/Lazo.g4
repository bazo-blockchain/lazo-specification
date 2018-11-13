grammar Lazo;

@header {
  package bazolang;
}

// Parser Rules
// ------------

program
  : versionDirective interfaceDeclaration* contractDeclaration EOF ;

versionDirective
  : 'version' INTEGER '.' INTEGER NLS; // todo prevent version 0x3.0x2

interfaceDeclaration
  : 'interface' IDENTIFIER '{' NLS* interfacePart* '}' NLS;

interfacePart
  : functionHead NLS ;

contractDeclaration
  : 'contract' IDENTIFIER ('is' IDENTIFIER (',' IDENTIFIER)* )? '{' (NLS | contractPart)* '}' NLS?;

contractPart
  : variableDeclaration
  | structDeclaration
  | enumDeclaration
  | eventDeclaration
  | constructorDeclaration
  | functionDeclaration
  ;

// Declarations
// ------------

variableDeclaration
  :  type IDENTIFIER assignment? NLS;

structDeclaration
  : 'struct' IDENTIFIER '{' NLS* structField* '}' NLS ;

structField
  : type IDENTIFIER NLS;

eventDeclaration
  : 'event' IDENTIFIER '(' paramList? ')' NLS;

enumDeclaration
  : 'enum' IDENTIFIER '{' IDENTIFIER (',' IDENTIFIER)* '}' NLS ; // todo allow optional newlines between constants

constructorDeclaration
  :  annotation* 'constructor' '(' paramList? ')' statementBlock ;

functionDeclaration
  : annotation* functionHead statementBlock ;

functionHead
  : 'internal'? 'function' (type | '(' type (',' type)*')') IDENTIFIER '(' paramList? ')' ;

annotation
  : '[' IDENTIFIER ('=' IDENTIFIER)? ']' NLS ;

paramList
  : parameter (',' parameter)* ; // todo allow optional newline

parameter
  : type IDENTIFIER assignment? ;

// Types
// -----

type
  : arrayType
  | mapType
  | IDENTIFIER ;

arrayType
  : IDENTIFIER '[' ']' ;

mapType
  : 'Map' '<' type ',' type '>' ;

// Statements
// ----------

statementBlock
  : '{' ( NLS | statement )* '}';

statement
  : assignmentStatement
  | returnStatement
  | callStatement
  | emitStatement
  | variableDeclaration
  | ifStatement
  | forEachStatement
  | forStatement
  | mapForEachStatement ;

emitStatement
  : 'emit' callStatement ;

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

callStatement
  : call NLS ;

call
  : IDENTIFIER '(' argumentList? ')' ;

argumentList
  : expression (',' expression)* ;

// todo support indexAccess = exp;
assignmentStatement
  : designator assignment NLS ;

assignment
  : '=' ( expression | ternaryExpression ) ;

// todo support test().x = 5
designator
  : IDENTIFIER
  | 'this'
  | designator '.' IDENTIFIER
  ;

returnStatement
  : 'return' expression (',' expression)? NLS ;

// Expressions
// -----------

ternaryExpression
  : expression '?' expression ':' expression NLS ;

// TODO Try to write expression with OR and adjust sub-rules (see solidity)
// ---------------------------
expression
  : expression ( '++' | '--' )
  | indexAccess
  | memberAccess
  | callExpression
  | newCreation
  | '(' expression ')'
  | ( '++' | '--' | '+' | '-' | '!' | '∼' ) expression // L2
  | '(' type ')' expression   // L3
  | expression '**' expression
  | expression ('*' | '/' | '%') expression
  | expression ('+' | '-') expression
  | expression ('<<' | '>>') expression
  | expression ('<' | '>' | '<=' | '>=') expression
  | expression ('==' | '!=') expression
  | expression '&' expression
  | expression '^' expression
  | expression '|' expression
  | expression '&&' expression
  | expression '||' expression
  ;

indexAccess
  : designator '[' expression ']' ;

memberAccess
  : designator '.' IDENTIFIER ;

// todo from here

callExpression
  : operand | '(' expression ')';

operand
  : literal
  | designator
  | call;

literal
  : INTEGER
  | CHARACTER
  | STRING
  | BOOL;

//-----------------------------

newCreation
  : structCreation
  | arrayCreation
  | mapCreation
  ;

structCreation
  : 'new' IDENTIFIER '('(IDENTIFIER assignment | expression)* ')' ;

arrayCreation
  : 'new' IDENTIFIER '[' expression* ']';

mapCreation
  : 'new' mapType '(' ')';

// ---------------------------------------------------
// Lexer Tokens
// ---------------------------------------------------

// Reserved Keywords (Hint: Order by asc)
// -----------------
BREAK : 'break' ;
CONSTRUCTOR : 'constructor';
CONTINUE: 'continue' ;
CONTRACT : 'contract' ;
EMIT : 'emit' ;
FUNCTION : 'function' ;
INTERFACE : 'interface' ;
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

NLS
  : NL+;

fragment NL
  : [\n]
  | [\r\n]
  ; // TODO: remove terminator and add CRLF as well

// Skip Rules
// --------

TERMINATOR
  : [\r\n]+ -> skip ;

WHITE_SPACE
  : [ \t\f\r]+ -> skip // skip spaces, tabs, form feed and carrige return
  ;

LINE_COMMENT
  : '//' ~[\r\n]* -> skip ;

BLOCK_COMMENT
  : '/*' .*? '*/' -> skip ;