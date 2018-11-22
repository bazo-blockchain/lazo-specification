grammar Lazo;

@header {
  package bazolang;
}

// Parser Rules
// ------------

program
  : NLS* versionDirective interfaceDeclaration* contractDeclaration EOF ;

versionDirective
  : 'version' INTEGER '.' INTEGER NLS ;

interfaceDeclaration
  : 'interface' IDENTIFIER '{' NLS* interfacePart* '}' NLS ;

interfacePart
  : functionSignature NLS ;

functionSignature
  : annotation* ( type | '(' type (',' type)* ')' ) IDENTIFIER '(' paramList? ')' ;

contractDeclaration
  : 'contract' IDENTIFIER ('is' IDENTIFIER (',' IDENTIFIER)* )? '{' (NLS | contractPart)* '}' NLS? ;

contractPart
  : variableDeclaration
  | structDeclaration
  | errorDeclaration
  | enumDeclaration
  | eventDeclaration
  | constructorDeclaration
  | functionDeclaration
  ;

// Declarations
// ------------

variableDeclaration
  :  'readonly'? type IDENTIFIER assignment? NLS;

structDeclaration
  : 'struct' IDENTIFIER '{' NLS* structField* '}' NLS ;

errorDeclaration
  : 'error' IDENTIFIER '{' NLS* structField* '}' NLS ;

structField
  : type IDENTIFIER NLS;

eventDeclaration
  : 'event' IDENTIFIER '(' paramList? ')' NLS;

enumDeclaration
  : 'enum' IDENTIFIER '{' NLS* IDENTIFIER (',' NLS* IDENTIFIER)* NLS*'}' NLS ;

constructorDeclaration
  :  annotation* 'constructor' '(' paramList? ')' statementBlock ;

functionDeclaration
  : annotation* functionHead statementBlock ;

functionHead
  : 'internal'? 'function' (type | '(' type (',' type)*')') IDENTIFIER '(' paramList? ')' ;

annotation
  : '[' IDENTIFIER (':' expression)? ']' NLS ;

paramList
  : parameter (',' parameter)* (',' defaultParameter)* ; // todo allow optional newline

parameter
  : type IDENTIFIER ;

defaultParameter
  : parameter assignment ;

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
  | expressionStatement
  | sendStatement
  | emitStatement
  | variableDeclaration
  | ifStatement
  | forEachStatement
  | forStatement
  | mapForEachStatement
  | breakStatement
  | continueStatement
  | throwStatement
  ;

emitStatement
  : 'emit' expression NLS;

ifStatement
  : 'if' '(' expression ')' statementBlock ('else if' '(' expression ')' statementBlock)? ('else' statementBlock)? ;

forStatement
  : 'for' '(' IDENTIFIER ':' rangeStatement ')' statementBlock ;

forEachStatement
  : 'foreach' '(' (IDENTIFIER ',')? type IDENTIFIER ':' expression ')' statementBlock ;

mapForEachStatement
  : 'foreach' '(' type IDENTIFIER ',' type IDENTIFIER ':' expression ')' statementBlock ;

breakStatement
  : 'break' NLS ;

continueStatement
  : 'continue' NLS ;

rangeStatement
  : expression? 'to' expression ('by' expression)?; // Expression as we could use .size or negative integers

expressionStatement
  : expression NLS ;

sendStatement
  : expression '.' 'send' '(' expression? ')' NLS ;

argumentList
  : expression (',' expression)* (',' namedArgument)*
  | namedArgument (',' namedArgument)*
  ;

namedArgument
  : IDENTIFIER '=' expression ;

assignmentStatement
  : expression assignment NLS ;

assignment
  : '=' expression ;

designator
  : IDENTIFIER ;

throwStatement
  : 'throw' IDENTIFIER '{' argumentList? '}' NLS ;

returnStatement
  : 'return' (expression (',' expression)*)? NLS ;

// Expressions
// -----------
expression
  : expression ( '++' | '--' )
  | expression '[' expression ']'    // index access
  | expression '.' IDENTIFIER        // member access
  | expression '(' argumentList? ')' // call
  | newCreation
  | '(' expression ')'
  // --- End of Level 1 ----
  | <assoc=right> ( '++' | '--' | '+' | '-' | '!' | TILDE ) expression
  | <assoc=right> '(' type ')' expression      // cast
  | <assoc=right> expression '**' expression
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
  | <assoc=right> expression '?' expression ':' expression
  | <assoc=right> expression ( '+' | '-' | '**' | '*' | '/' | '%' | '<<' | '>>' | '&' | '^' | '|' ) '=' expression
  | operand
  ;

newCreation
  : structCreation
  | arrayCreation
  | mapCreation
  ;

structCreation
  : 'new' IDENTIFIER '(' argumentList? ')' ;

arrayCreation
  : 'new' IDENTIFIER ('[' expression ']' ('{' '}')?| '[' ']' '{' expression (',' expression)* '}');

mapCreation
  : 'new' mapType '(' ')';

operand
  : literal
  | designator
  ;

literal
  : INTEGER
  | CHARACTER
  | STRING
  | BOOL
  ;

// End of Expressions±

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
EVENT: 'event' ;
FUNCTION : 'function' ;
INTERFACE : 'interface' ;
INTERNAL : 'internal' ;
IS : 'is' ;
MAP : 'Map' ;
READONLY : 'readonly' ;
RETURN : 'return' ;
STRUCT : 'struct' ;
THROW: 'throw';
VERSION : 'version' ;
IF: 'if' ;
ELSE: 'else' ;
FOR: 'for' ;
FOREACH: 'foreach' ;
TO: 'to' ;
BY: 'by' ;
ENUM: 'enum' ;


BOOL
  : 'true'
  | 'false' ;

// Reserved Keywords which are not used in the language (prohibited)
// ----------------
PUBLIC: 'public' ;
SWITCH: 'switch' ;
CASE: 'case' ;
WHILE: 'while' ;
TRY: 'try' ;
CATCH: 'catch' ;
FINALLY: 'finally' ;
GOTO: 'goto' ;
ABSTRACT: 'abstract' ;
IMPLEMENTS: 'implements' ;
EXTERNAL: 'external' ;
PRIVATE: 'private' ;
REF: 'ref' ;
OUT: 'out' ;
AS: 'as' ;
STATIC: 'static' ;
EXTENDS: 'extends' ;
OVERRIDE: 'override' ;
VIRTUAL: 'virtual' ;
CONST: 'const' ;
VAR: 'var' ;
NULL: 'null';
// ----------------

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
LSHIFT: '<<';
RSHIFT: '>>';

// Logical Operators
AND: '&&';
OR: '||';
NOT: '!';
BITWISE_AND: '&';
BITWISE_OR: '|';
CARET: '^';
TILDE: [\u007e];

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
  ;

// Skip Rules
// --------
WHITE_SPACE
  : [ \t\f\r]+ -> skip // skip spaces, tabs, form feed and carrige return
  ;

LINE_COMMENT
  : '//' ~[\r\n]* -> skip ;

BLOCK_COMMENT
  : '/*' .*? '*/' -> skip ;