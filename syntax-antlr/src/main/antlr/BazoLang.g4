grammar BazoLang;

program: versionDirective;

versionDirective : 'version ' INTEGER '.' INTEGER ;

//
//THROW : 'throw' EXCEPTION_CREATION;
//EXCEPTION_CREATION : 'a';
//EXCEPTION_DECLARATION : 'exception' IDENTIFIER '(' PARAM_LIST ')' '{' [VAR_DECLARATION]{0,1} [',' VAR_DECLARATION]* '}';

// Tokens
IDENTIFIER : [a-zA-Z] [a-zA-Z0-9]* ;

ADDRESS : '0x' [0-9a-f]+;
INTEGER : [0-9]+ ;
BOOL : 'true' | 'false' ;
STRING : '"' [CHARCODE]* '"';
CHARACTER : '\u0027' CHARCODE '\u0027';
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
CHARCODE : 'a';

//tokens { BREAK, CONTINUE };