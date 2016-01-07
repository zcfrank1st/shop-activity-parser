grammar ShopActivity;

// grammar
prog: (stm)* EOF;

stm: name '@' subject effect;

name: NAME
    ;

subject: TOTAL_PRICE
       | EXPRESS
       ;

effect: VALUE
      | FREE
      ;


// lexcial
TOTAL_PRICE: 'TOTAL_PRICE';
EXPRESS: 'EXPRESS';
VALUE: '-'[0-9]+;
FREE: 'FREE';
NAME: ('\u0080'..'\ufffe' | '0'..'9')+;

WS: [' '\n\t\r]+ -> skip;