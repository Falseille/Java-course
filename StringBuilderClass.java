import java.awt.*;

public class StringBuilderClass {
    public static void main(String [] args){
        /* StringBuilder
        A program can collect a lot of strings but it can be very inefficient. Next code snippet wil give an example
        of a form of inefficiency.
         */
        String France = "";
        for (char current = '1'; current <= '9'; current++)
            France += current;
        System.out.println(France);

        /* Outcome will be 123456789. What happens every time there is a 1 and then there will be 2 behind it, but
        a String is immutable as we know so 1 is ready for garbage collection same as for 12 when the loop will come to
        the next 3, 12 will be ready for garbage collection and then we got 123. This will go on until number of 9
        because we said to do so on line 9.
        There will be an more proper way with StringBuilder.
         */

        StringBuilder Andorra = new StringBuilder();
        for(char current = '1'; current <='9'; current++)
            Andorra.append(current);
        System.out.println(Andorra);

        /* The outcome will be the same but the main difference between a StringBuilder and String in this case,
        a StringBuilder is creating an interim String every time and it is mutable.
         */
    }
}
