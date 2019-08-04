public class ReplaceTrim {
    public static void main (String [] args){
        /* Replace()
        This is method is just a simple search and replace method on a string.
        The method signature:

        String replace(char oldChar, char newChar)
        String replace(CharSequence oldChar, CharSequence newChar)

        First signature is passing in char parameters and the second is a passing in String parameters.
         */

        System.out.println("LaLaLa".replace('a', 'A'));
        // Outcome is LALALA because l is replaced by L.

        System.out.println("lAlAlA".replace("l", "L"));
        // Outcome is LALALA because l is replaced by L.

        /* Trim()
        This method is used for deleting whitespaces in a String.

        The method signature

        public String trim()
        */

        System.out.println("lalala".trim());
        // Outcome will be the same because there is not whitespace deleted.

        System.out.println("/t lalala".trim());
        // Outcome is that the tab will be removed and the method is now the same as line 27 of the outcome.

    }
}
