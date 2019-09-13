import java.util.Arrays;

public class SortingSearchArrays {
    public static void main(String [] args){
    /* Sorting
    Arrays will use an import. It is a requirement for using it. The following statements are needed:

    import java.util.*;
    import java.util.Arrays;

    The last statement will just import arrays. Attention, at least one is needed.
     */

    int[] goingup = {5, 3, 2, 4, 1};
    //Arrays.sort(goingup);
    for (int f = 0; f < goingup.length; f++)
        System.out.println(goingup[f] + " ");
    // Outcome is not sorting, because arrays.sort is not working. Because there is nothing to import.
        // If it was String and it was like this, 1, 200, 1000. Outcome would be  1, 1000, 200. 1 comes before 2.
        // Sorting of precedence is: numbers , letters, uppercase , lowercase.

        /*  Search
        Inside Java its possible for searching with Arrays.binarySearch. With this method there can be searched for
        the index of the value.
        The condition for this array method is that it has to be already sorted before it can be used.

        When the target element is not found in a sorted array it will give a negative value, than the negative of
        index where a match is needed to be inserted to preserve sorted order. Mind that it is always one smaller than
        When an array is not sorted it cannot be predicted.
         */

        int [] kilometers = {5,7,8,13};
        System.out.println(Arrays.binarySearch(kilometers, 7));
        // Outcome will be 1. Because the index of 7 is one. 5 = 0  7 = 1.
        System.out.println(Arrays.binarySearch(kilometers, 13));
        // Outcome will be 3. Index is of 13 is 3.
        System.out.println(Arrays.binarySearch(kilometers, 9));
        /* Outcome will be -4 because for sorting 9 will be between 8 and 13. They have an index of 3 and 4. Kilometers
        9 will be inserted between these and it will be 3 but it is not in the array so it will be negative. When it
        is negative it will be subtracted by one.
         */

    }
}
