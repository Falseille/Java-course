import java.sql.SQLOutput;

public class indexSubstring {
    public static void main(String [] args){
        /* indexOf()
        This method looks for the first index that matches with the desired value. it works with an individual character
        or a whole string. There is also a possibility to start this search on a requested place.

        It has the follow method signature.
        int indexOf (int ch)
        int indexOf (char ch, int fromIndex)
        int indexOf (String str)
        int indexOf (String str, index fromIndex)
         */

        String province = "Hainaut";
        System.out.println(province.indexOf('H'));
        // Index start counting from 0. The outcome of this code will be 0.

        System.out.println(province.indexOf("in"));
        // This code will look for a more specific string. With an outcome of 2.

        System.out.println(province.indexOf('u', 4));
        // This code will start from index four. It will start from the letter a with the outcome 5.

        System.out.println(province.indexOf("au", 6));
        // This will give an outcome of -1. Because this is out of the scope. Doesn't give an exception.

        /* substring()
        This method wil return the string from the requested start. Whereby it is possible to give an end index. This
        means it will stop before end index.

        It has the follow method signatures.
        String substring(int beginIndex)
        String substring(int beginIndex, int endIndex)
        */

        String region = "Moravie";
        System.out.println(region.substring(4));
        //From here it will start from v and the outcome will be vie.

        System.out.println(region.substring(region.indexOf('r')));
        // It will start from r because its indexed on char r. The outcome will be ravie because there is no end index.

        System.out.println(region.substring(2,5));
        // Outcome will be rav, because index start from 2 and end index is at 5 it will stop at letter v because i is 5

        System.out.println(region.substring(2, 7));
        // Outcome will be ravie. This is like the first line of code. Because end index stops before 7 is result ravie

        System.out.println(region.substring(2,2));
        // Outcome is nothing. It will start at r and stops at r. There will be nothing printed.
    }
}
