public class StringBuilderChain {
    public static void main(String [] args){
        /* Chaining
        The difference between a String and a StringBuilder when it comes to chaining methods, is when chaining Strings
        to each other , the result is a new String what will be used for the next.
        StringBuilder is working completely different, this method will changes his state and returns a reference
        to himself.
         */

        StringBuilder f = new StringBuilder("fgh");
        StringBuilder g = f.append("ij");
        g = g.append("k") .append("l");
        System.out.println("f=" +f);
        System.out.println("g=" +g);

        /* The outcome will be fghijkl for both printings. The reason for it, is that new StringBuilder is only called
        once and therefore is it the mother of all variables what is pointing to this object.
         */

        // There are three ways to create a StringBuilder.
        StringBuilder F0 = new StringBuilder();
        StringBuilder F1 = new StringBuilder("Falklands");
        StringBuilder F2 = new StringBuilder(15);
        /*
        F0 is just an empty StringBuilder and is pointed to F0.

        F1 is containing a specific value already and is pointed to F1.

        F2 this one is the different one from the other two, this one is saying there is an idea how it should be but
        it is not clear yet. We have an idea how big the value can be, reserve certain number of slots.
         */
    }
}
