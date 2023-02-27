lexer grammar Expressions;

INT: [0-9]+;
DEC: [0-9]+'.'[0-9]+;
SPACE: ' '+ -> skip;
OP_ARITHMETIC: '+' | '-' | '*' | '/';
OP_POWER: '^';
PARENTHESES: '(' | ')';