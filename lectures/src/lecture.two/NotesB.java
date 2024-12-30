package lecture.two;

// algabraic expressions
//
// <expr> => <term> + <term> | <term> - <term>
// <term => 0 | ... | 9
//
// "1 + 2" \in L(G) ?
//
// <expr> -> <term> + <term>
//        -> 1 + <term>
//        -> 1 + 2
// 
// "1 + 2".equals("1 + 2") TRUE
// "2 + 1".equals("2 + 1") FALSE
//
// JAVA IDENTIFIER 
// <ident> => <letter> | <letter><symbol>
// <symbol> => <letter> | <digit> | <letter><symbol> | <digit><symbol>
// <letter> => a | ... | z | A | ... | Z | _ | $
// <digit> => 0 | ... | 9
//
// PALINDROME
// <pal> => a <pal> a | ... | z <pal> z | ... 

// ALGABRAIC EXPRESSIONS
// infix prefix postfix
// in:    1 + 2 * 3
// pre:   + 1 * 2 3 what the heck
// post:  1 2 3 * +
//                ^
// 3
// 2
// 1
//
// (( 2 * 3 ))
//
// 6
// 1
// 
// (( 6 + 1 ))
//
// 7
//
// that's stack ig??
// postfix btw
//
// PREFIX IDENTIFIER
// <prefix> => <operand> | <operator> <prefix> <prefix>
// <operand> => 0 | ... | 9
// <operator> => + | - | * | /
//


















