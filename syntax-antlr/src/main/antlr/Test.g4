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