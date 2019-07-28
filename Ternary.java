public class Ternary {
    public static void main(String [] args){

        /* This operator is nothing more then a if then else statement. The big difference between the ternary and
        the if then else statement is that this written down shorter.
         */
        // First the if then else code after ternary way.
        int u = 15;

        int f;

        if (u > 2){
            f = 2 * u;
        }
        else {
            f = 3 *u;
        }
        System.out.println( f + " Great it works");
        // It will be 30 because 15 is bigger then 2 so it will be 2 * 15 makes it 30.

        int q = 5;

        int w = (q > 30) ? ( 10 * q) : (90 * q);

        System.out.println(w);
        // answer will be 450 because 5 is smaller then 30, it will be else 90 * q. 90 * 5 makes it 450.
    }
}
