grammar CSVGrammar;

line: field(SEPARATOR+ field)*EOF_;
//line: field(SEPARATOR+ field)*EOF_;

field: (BOOLEAN|NUMERIC|TEXT);
//field: SPACE*(BOOLEAN|NUMERIC|(TEXT SPACE*)+); //NO ' ' fields

SPACE: ' ' -> skip;
BOOLEAN: 'true'|'false';
NUMERIC: [0-9]+;
TEXT: '"'[a-zA-Z ]+'"';
SEPARATOR: [,|;];
EOF_: '\n'|'\r\n';