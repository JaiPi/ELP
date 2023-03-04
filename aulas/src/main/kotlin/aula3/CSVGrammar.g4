grammar CSVGrammar;

line: field(SEPARATOR+ field)*EOF_;

field: SPACE*(BOOLEAN|NUMERIC|(TEXT SPACE*)*);
//field: SPACE*(BOOLEAN|NUMERIC|(TEXT SPACE*)+); //NO ' ' fields

SPACE: ' ';
QUOTE: '"' -> skip;
BOOLEAN: 'true'|'false';
NUMERIC: [0-9]+;
TEXT: [a-zA-Z]+;
SEPARATOR: [,|;];
EOF_: '\n'|'\r\n';