grammar Test;

program: exp* EOF ;

exp
  : exp '*' exp
  | exp ( '+' | '-' ) exp
  | INT
  ;

INT: [0-9];

WHITE_SPACE
  : [ \t\f\r]+ -> skip // skip spaces, tabs, form feed and carrige return
  ;

/*
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
*/