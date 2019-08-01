public class startsEndsContains {
    public static void main (String [] args){
        /* startsWith() and endsWith()
        These methods will check at case-sensitive. As the method is saying from the start or end of a string.
        The method signatures
        boolean startsWith(StringPrefix)
        boolean endsWith (String suffix)
         */

        System.out.println("Bhutan".startsWith("B"));
        // Outcome will be true, because Bhutan is starting with a B.

        System.out.println("panama".startsWith("P"));
        //Outcome will be false, because panama is not starting with a P.

        System.out.println("Martinique".endsWith("e"));
        // Outcome will be true, because Martinique is ending with a e.

        System.out.println("Maledives".endsWith("S"));
        //Outcome will be false, because Maledives is not ending with a S.

        /* Contains
        This is a convenience method. Whereby this is an method who is checking.
        The method signature.
        boolean contains (String str)
         */
        System.out.println("Bulgaria".contains("a"));
        //Outcome will be true, because a is in Bulgaria.

        System.out.println("Austria".contains("S"));
        // Outcome will be false, because S is not in Austria as a upper case.
    }
}
