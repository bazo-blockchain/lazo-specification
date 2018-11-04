grammar BazoLang;

// Parser Rules
program: versionDirective EOF;

versionDirective : 'version' WS INTEGER '.' INTEGER ;

//
//THROW : 'throw' EXCEPTION_CREATION;
//EXCEPTION_CREATION : 'a';
//EXCEPTION_DECLARATION : 'exception' IDENTIFIER '(' PARAM_LIST ')' '{' [VAR_DECLARATION]{0,1} [',' VAR_DECLARATION]* '}';

// Lexer Rules / Tokens

// Reserved Keywords
KEYWORD: BOOL | 'version';

BOOL: 'true' | 'false' ;

IDENTIFIER : [a-zA-Z] [a-zA-Z0-9]* ;

HEX_DIGIT: '0x' [0-9a-f]+;
INTEGER: [0-9]+ ;
STRING: '"' [CHARCODE]* '"';
CHARACTER: '\'' CHARCODE '\'';
CHARCODE: 'a'; // todo unicode character code
NL: [\n];

WS: [ \t\f\r]+ -> skip; // skip spaces, tabs, form feed and carrige return
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;