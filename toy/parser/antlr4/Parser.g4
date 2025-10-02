// Credits to ANTLR Labs demo example http://lab.antlr.org/
// Modified by Ken Jin.
parser grammar Parser;
options {
    tokenVocab=Lexer;
}

program
    : stat* EOF
    ;

stat: assgn
    | whil
    | if_els
    | func_def
    | expr ';'
    ;

assgn: ID '=' expr ';';
whil: WHILE '(' expr ')' '{' stat* '}';
if_els: IF '(' expr ')' '{' stat* '}' ELSE '{' stat* '}';

func_def : DEF ID '(' ID (',' ID)* ')' '{' stat* '}' ;

expr: ID
    | INT
    | func
    | 'not' expr
    | expr 'and' expr
    | expr 'or' expr
    | expr BINOP expr
    ;

func : ID '(' expr (',' expr)* ')' ;