grammar State;
main: state dependency* EOF;
state: id;
dependency: (did|ded|dred|dbored);

ded: T ed;
did: T id;
dred: T red;
dbored: T bored;

red: OSQB ed CSQB;
//bored: ed+ (P+ ed)*;
bored: ed (P ed)+;

ed: CHAR+ (DOT CHAR+)+ SLA id;
id: (IS|NOT) CHAR+;

//ed: CHAR+ (DOT CHAR+)* SLA id;
//id: (IS|NOT) (CHAR|S)+;

IS: 'Is ';
NOT: 'Not ';
DOT: '.';
SLA: '/';
S:  [ \n\r:] -> skip;
T: ('\t'|'    '|'-');
P: '|';
OSQB: '[';
CSQB: ']';
CHAR: [A-Za-z0-9];
LINE_COMMENT
    : ('    '|'\t'|'-'|'- ')'//' ~[\r\n]* -> skip
;