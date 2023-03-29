grammar DSL;

parse
 : expr EOF
 | ifExpr EOF
 ;

expr
 : '(' expr ')'                          #nested
 | '-' expr                              #unaryMinus
 | '+' expr                              #unaryAdd
 | expr MULT expr                        #mul
 | expr DIV expr                         #div
 | expr MOD expr                         #mod
 | expr ADD expr                         #add
 | expr MINUS expr                       #sub
 | expr ASSIGN expr                      #assign
 | ID                                    #argVar
 | NUMBER                                #argNum
 | STRING                                #string
 | ifExpr                                #if
 ;
 
 compareExpr
 : compareExpr AND compareExpr           #AND
 | compareExpr OR compareExpr            #OR
 | expr GT expr                          #GT
 | expr GTE expr                         #GTE
 | expr LT expr                          #LT
 | expr LTE expr                         #LTE
 | expr EQ expr                          #EQ
 | expr NEQ expr                         #NEQ
 ;
 
ifExpr
 : 'if' compareExpr 'then' (expr)+ ('elseif' compareExpr 'then' expr)* ('else' expr)? 'end'
 ;
 
ADD    : '+';
MINUS  : '-';
MULT   : '*';
DIV    : '/';
MOD    : '%';
OPAR   : '(';
CPAR   : ')';
LTE    : '<=';
LT     : '<';
GTE    : '>=';
GT     : '>';
ASSIGN : '=';
EQ     : '==';
NEQ    : '!=';
AND    : 'and';
OR     : 'or';
NUMBER : ( [0-9]* '.' )? [0-9]+;
ID     : [a-zA-Z_] [a-zA-Z_0-9]*;
STRING : '"' ~["\r\n]* '"';
NL     : '\r'? '\n' | '\r';
WS     : [ \t\r\n]+ -> skip;