grammar BazoLang;

@header {
    package bazolang;
}

// Parser Rules
// --------------------
program: versionDirective EOF;

versionDirective : 'version' INTEGER '.' INTEGER NL; // todo prevent version 0x3.0x2

//
//THROW : 'throw' EXCEPTION_CREATION;
//EXCEPTION_CREATION : 'a';
//EXCEPTION_DECLARATION : 'exception' IDENTIFIER '(' PARAM_LIST ')' '{' [VAR_DECLARATION]{0,1} [',' VAR_DECLARATION]* '}';

// Lexer Tokens
// -------------

// Reserved Keywords
KEYWORD: BOOL | 'version';

BOOL: 'true' | 'false' ;

IDENTIFIER : ALPHA_LETTER (ALPHA_LETTER|DEC_DIGIT)* ;

INTEGER: DEC_DIGIT_LIT | HEX_DIGIT_LIT;

fragment HEX_DIGIT_LIT: '0' ('x' | 'X') HEX_DIGIT+;
fragment HEX_DIGIT: [0-9a-fA-F];
fragment DEC_DIGIT_LIT: DEC_DIGIT+;
fragment DEC_DIGIT: [0-9];
fragment ALPHA_LETTER: [a-zA-Z];

STRING: '"' [CHARCODE]* '"';
CHARACTER: '\'' CHARCODE '\'';
CHARCODE: 'a'; // todo unicode character code

NL: [\n];
WS: [ \t\f\r]+ -> skip; // skip spaces, tabs, form feed and carrige return
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;