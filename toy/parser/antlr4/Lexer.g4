// Credits to ANTLR Labs demo example http://lab.antlr.org/
// Modified by Ken Jin.
lexer grammar Lexer;

AND : 'and' ;
OR : 'or' ;
NOT : 'not' ;
EQ : '=' ;
COMMA : ',' ;
SEMI : ';' ;
LPAREN : '(' ;
RPAREN : ')' ;
LCURLY : '{' ;
RCURLY : '}' ;
DEF : 'def';
WHILE: 'while';
IF: 'if';
ELSE: 'else';
BINOP: '+' | '-' | '*' | '!=' | '<' | '>';

INT : [0-9]+ ;
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
WS: [ \t\n\r\f]+ -> skip ;