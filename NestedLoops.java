import java.sql.SQLOutput;

public class NestedLoops {
    public static void main(String [] args){

        /* Nested loop is a loop what can contain more loops. This can be done with a two-dimensional array. This means
        that an array contains another array. What it really do will be explained later on, in another class.
         */
        int [][] arrayComplex = {{7,4,3,5}, {5,11,10,11},{7,9,14,9}};
        for(int[]arraySimple : arrayComplex){
            for(int f=0; f<arraySimple.length; f++){
                System.out.print(arraySimple[f]+ "\t");
            }
            System.out.println();
        }
        /* For each time that the outer loop will be executed, the inner loop is executed four times. When this code
        snippet above is executed it will give the following output.
        7   4   3   5
        5   11  10  11
        7   9   14  9

        Consider also, nested loops can contain do while loops.
         */
        int x = 60;
        while(x>0){
            do {
                x -= 5;
            } while (x>5);
            x--;
            {
                System.out.print(x + "\t");
            }
            System.out.println();
        }

        /* There is also possibility to add optional labels. They will not add any value. But they are quite useful
        in nested loops. When they are used, they will be written in uppercase. Like the code snippet beneath.
         */
        int[][] arrayComlex = {{7, 4,3,5}, {5,11,10,11}, {7,9,14,9}};
        OUTER_LOOP: for(int[]arraySimle : arrayComlex){
            INNER_LOOP: for(int g=0; g<arrayComlex.length; g++){
                System.out.print(arraySimle[g] + "\t");
            }
            System.out.println();
        }
        // It can be useful to use this for nested loops.
    }
}
