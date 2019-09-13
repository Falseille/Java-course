public class ArrayReferenceVariables {
    public static void main (String [] args){
        /* Array reference variable.
        Arrays are an object, they can be integers, Strings etc. What important is to know arrays use always brackets.
         */
        String cities[];
        // This String array is pointing to null, why? Because it's not instantiated it will go to default null.

        String villages[] = new String[4];
        /* This String array has four elements because the length is 4, these slots are null but has the possibility
        to point out to a String object.
         */

        // With arrays can also bigger types forced to smaller types.
        //String[] Amman = {"Jordan"};
        //Object[] Odeum = Amman;
        //String[] againAmman = (String[]) Objects;
        //againAmman[0] = new StringBuilder();
        //Objects[] = new StringBuilder();
        /*
        Line 20 will not compile because String[] will only allow String Objects and Stringbuilder is not a String.
        Line 21 will give an exception because there is no object. It is possible to put StringBuilder in a object.
         */

        String[] central = {"Slovakia", "Czech Republic", "Hungary"};
        System.out.println(central.length);
        // this is saying how many elements can be in the array. This will say 3.
        System.out.println(central[0]);
        // outcome Slovakia because also array starts with 0.
        System.out.println(central[1]);
        // outcome Czech Republic is the second in line with an index of 1
        System.out.println(central[2]);
        // Outcome Hungary is the third in line with index of 2

        // It is also possible to use an loop in an array.
        int[] test = new int[12];
        for (int f = 0; f < test.length; f++)
            test[f] = f + 2;
        System.out.println(test);

    }
}
