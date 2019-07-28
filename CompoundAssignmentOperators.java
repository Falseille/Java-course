public class CompoundAssignmentOperators {
    public static void main(String[] arg){

        /* Compound is just a way to write it down shorter. But it will also save to cast an explicitly cast a value.

         */

        // long h = 6;
        // int  u = 3;
        // u = h * u;
        /* Will not compile because the result will be promoted to be a long and assigned to an int variable.
         */

        long h = 6;
        int  u = 3;
        u *= h;
    /* What will happen here is that the compound cast u to a long. Apply multiplication of two long values. After it,
    the result will be casted in int.
          */


    }
    }


