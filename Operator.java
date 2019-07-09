package Operatorcourse;

/* A operator is a special symbol what can be applied to a set variables, values, or literals.
Often refered as oparands.
Operators
Order of operator precedence:
Post-unary operators expression++, expression--
Pre-unary operators  ++expression, --expression
Other unary operators ~,+,-,!
Multiplication /Division/ Modules *,/, %
Addition / Subtraction +,-
Shift Operators     <<, >> , >>>
Relational operators <, > , <= , >=, instanceof
Equal to/ not equal to ==, !=
Logical operators      &,^,|
Short-Circuit logical operators && , ||
Ternary Operators   boolean expression ? expression1 : expression2
Assignment operators    =, +=,-=,*=, , /=, %=, &=, ^=, |=, <<= , >>=, >>>=

 */

public class Operator {
    // Arithmetic operator
    {int x = 2 * 5 + 3 * 4 - 8;
            /* first will be calculated 2 *5 = 10
            After 3 * 4 = 12
            Then I got
            10 + 12 - 8
            This will give x a value of 14.
            multiplicative operators are higher on the precedence also, they will be always first. Unless they are
            overridden by parentheses.
             */
            int y = 2 * ((5 + 3) * 4 - 8);
                    /* What happens here is that first 5 +3 have to be calculated that makes it 8
                    Then there 8 * 4 for the next calculation because * is higher in order of precedence than -.
                    That will be 32. 32 - 8 is 24.
                    Now the anwser what y will be is 2 * 24 = 48
                    y = 48 It's just basic math.
                    These operators can be used on Java primitives except for boolean and string.
                     */

                    /* Remainder operator is showed by %. This means just there a number will be left like reamainder
                    of 15 % 4 =3 because 4 is there is 3 left because 4 fits only three times in it.
                     */ }
}
