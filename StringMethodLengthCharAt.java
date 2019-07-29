public class StringMethodLengthCharAt {
    public static void main(String [] args){
        /* When it comes to indexing of Java, it always start from 0, but its only when indexes or positions are used
        in a list. When the purpose is determine the total size of length, Java will use the normal counting again.
         */
        // This is about length()
        String country = "France";
        System.out.println(country.length());
        // Outcome is 6. Because F =1 r=2 a=3 n=4 c=5 e=6.

        String San = "San Marino";
        System.out.println(San.length());
        // Outcome is 10. S = 1 a = 2 n = 3 space = 4 M = 5 a = 6 r = 7 i = 8 n = 9 o = 10

        /* Method charAt()
        This method will query the string for finding out which character is at specific index and returns this when it
        is printed out.
        The counting start from 0 not like length() who starts from 1. When for example there a maximum of 9
        characters, counted from 0, and the 10 is called then there will be exception. This will be explained later on.
         */

        String region = "Utrecht";
        System.out.println(region.charAt(0));
        System.out.println(region.charAt(3));
        System.out.println(region.charAt(7));
        // With the explanation in mind, first will be printed out U because we start counting at 0. 3 will be e.
        // 7 will be exception what will be explained later on. It out of range, Java doesn't know what to do with it.
    }
}
