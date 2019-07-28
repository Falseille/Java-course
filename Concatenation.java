public class Concatenation {
    public static void main(String[]args) {
        /* String Concatenation means that two Strings are combined. There are three main rules with concatenation.
        1: When operands are numeric + will mean an addition.
        2: When one operand is a String, the meaning of + is Concatenation.
        3: The expression must always be read from left to right.

        When kept to these rules it should always be fine when it comes to concatenation. A few examples will be
        shown.
        */

        System.out.println(5+3);
        // This will print out 8, because both operands are numeric and there is no String. First rule will apply.

        System.out.println("F" + "C");
        // This will print out  FC, because both operands are a String. So there will be a concatenation. See rule 2.

        System.out.println("F" + "C" + 9);
        /* This will print out FC9,  because F and C will make a concatenation also for number 9 because of rule 2.
         */
        System.out.println(2 + 7 + "C");
        // this will print out 9C because we start first with rule 3 and then we come to rule 2.

        // There is a possibility to make these three rules put in code of block. Look at the next code

        int three = 9;
        String four = "4";
        System.out.println(4 + 8 + three + four);
        /* This will print out 214, because 4 + 8 will be calculated first, its 12. Then three is initialized with 9.
        That will give us 12 + 9 = 21. Where four is just a string with number 4. This will make + a concatenation
        When 4 is attached to 21, the outcome will be 214.
         */

        // One small thing left.  += for example is important to know. Code snippet beneath will explain this.
        String f = "19";
        f += "9";
        f += 0;
        System.out.println(f);
        /* Outcome 1990, because it will hold these strings. At line 37 there is a numeric, but as since rule2 is well
        known this will be a concatenation. 
         */
    }

}
