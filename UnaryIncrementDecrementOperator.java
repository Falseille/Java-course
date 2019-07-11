public class UnaryIncrementDecrementOperator {
    public static void main (String[]args){
        boolean x = false;
        System.out.println(x);

        x = !x;
        System.out.println(x);
        //outcome true. Because ! flips the value of boolean.

        // with the negation operator is it the same way.
        double y = 4.25
                System.out.println(y); // 4.25 it will be
        y = -y;

        System.out.println(y); // -4.25

        y = -y;

        System.out.println(y); // 4.25 it will be. - - will be plus.
    }
    /* There are several unary operators.
    + This gives a positive value. Although numbers are always positive unless they got company of negative unary.
    -  The literal number is negative.
    ++ This will say increments value by 1
    -- This will say decrements value by 2
    ! This will make the boolean a logical value.
     */
    int a = 5
            int h = a++ * 9 / a-- - --a;
    System.out.println("a is " + a);
    System.out.println("h is" + h);
    /* What will be the outcome of this a and h ?
    a++ is number 6
    there will be now like:
    y = 6 * 9 / h-- + --h
    6 * 9 = 54
    y = 54 / h-- + --h
    h -- will be 54 because -- is after the h. So there is no decrement.
    y =  54 / 54 + 53
    54 / 54 = 1
    1 + 53 = 54
    a = 53
    y = 54
     */
}
