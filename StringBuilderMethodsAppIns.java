public class StringBuilderMethodsAppIns {
    public static void main(String [] args){
        /* There are four methods who will work the same as they work in Strings. These are:
        charAt()
        Indexof()
        length()
        substring()
        Important to know is that substring will return a String instead of a StringBuilder.
         */

        /* append()
        This method is in general the most used method in StringBuilder. What this method is doing is adding a parameter
        to the StringBuilder.
         */
        StringBuilder fo = new StringBuilder().append(5).append('t');
        fo.append("-").append(true);
        System.out.println(fo);
        /* Outcome will be 5t-true, because first it was empty, with the append 5 will be 5 and the append after is
        adding a t. This is will give 5t. The next append will give an - to the StringBuilder, result 5t-. Where the
        next append will add true to the StringBuilder.
         */

        /* insert()
        This method is adding characters to the requested index of the StringBuilder. Notice when there is a chain the
        index of the will also change of the object.
         */
        StringBuilder Mon = new StringBuilder("Mongolia");
        Mon.insert(3, "-");
        Mon.insert(6, "-");
        // Outcome is Mon-go-lia. As said the index will change for line 29 because at line 28 there is a - added.


    }
}
