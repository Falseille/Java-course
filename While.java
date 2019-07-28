public class While {
    public static void main(String [] args) {
            /* While statement is a statement where loops can be created. It will execute until the expression is reached.
     If the expression will not be reached then there is an infinite loop. Should be aware of infinite loops within the
     application
     Beside this one, there is also a do while statement. This statement will executed before the expression will be
     evaluated.
     There is no big difference between these two, to use the while do statement is recommended to use when it will be
     executed for sure once.
     */

        int f = 16;

        while (f < 160) {
            f++;
        }
        System.out.println(f + " It works I guess");

        int seatsLeft = 50;

        int takeSeat = 0;

        while (takeSeat < seatsLeft) {
            takeSeat++;
            System.out.println(takeSeat + "\n" + " Hong" + " Kong");
        }
        //for statement

        for (int i = 0; i < 10; i++) {
            System.out.print(i + "");
        }
        /* The for statement starts  in the parentheses with an initialization statement, when it is initialized then
        the booleanexpression will start. When this one is true, the loop will go on. UpdateStatement will executed
        when loop to encounter a false, it means the loop will be terminated.
        In the example above it will terminate on eleven iteration.
        0 1 2 3 4 5 6 7 8 9. The outcome will be 10 because of the updateStatement i++.
         */

        // Creating an infinite loop.

        //for ( ; ; )  {
         //System.out.println("This is an infinite loop");
        //}

        // Add more terms for statement.
        int h = 5;

        for(long u = 3 , r = 0; h < 10 && u < 10; h++, u++){
           System.out.println(u + "");
        }

        /* Redeclaring a variable in the initialization will not work when it is already initialized before the
        for statement. There is way to workaround this one. This will be shown now.
         */
        //int m = 3;

        //for(long s = 3 , m = 4; m < 9 && s < 10; m++, s++ {System.out.println(s + "");}

        // Above will not work. Beneath this comment will be shown how solve this problem. Code snippet: 61 till 66

        int m = 3;
        long s = 4;

        for(m = 6 , s = 0; m < 10 && s < 10; m++ , s++){
            System.out.println(m + "");
        }
        // It works because in the for statement m and s just got a value and were not assigned.
    }
}