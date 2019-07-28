public class LogicalOperator {
    public static void main (String [] args) {
    /* remmember the table
    AND &  is only when both oparands are have the operands are true.
    Inclusive OR |  is only false if both operands are false
    Exclusive OR ^ is only true if the operands are different
     */

    int f = 8;
    boolean g = (f >= 8) ||  (++f <= 10);
    System.out.println(f);
        }
}