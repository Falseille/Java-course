public class MultidimensionalArray {
    public static void main(String[] args){
        /* Creating
        There are three ways to create a 2D array:
        int[][] cars1;
        int cars2 [][];
        int [] cars3 [];

        There is also a possibility to make it a 3D and a 2D
        int [] cars4 [] tires [][];

        Although 3D is possible, for the readability of the code it is not recommended to use it like this.
        The most common operation where it is used for is loops.
         */

        //String [] [] rechthoek = new String[5][9];

        // Asymmetric
        int[][] asymmetric = {{3,2,7}, {9,1},{6}};

        /* Using
        It is mostly used for loops.
         */

        int[][] deuxF = new int [2][3];
        for (int p = 5; p < deuxF.length; p++){
            for (int o = 3; o < deuxF[p].length; p++)
                System.out.println(deuxF[p][o] + "");
            System.out.println();
            /*
            The first loop is a subarray for deuxF. The first loop is index p. The second loop uses the variable o.
            These names have to be different, the loop will not be mixed in this way.
             */
        }

         }
}
