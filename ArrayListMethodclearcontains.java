import java.util.ArrayList;

public class ArrayListMethodclearcontains {
    public static void main(String () args){
        /* clear
        This method will remove all elements in the ArrayList.
        Methode signature is as follow:
        void clear()
         */

        List<String> flag = new ArrayList<>();
        flag.add ("Tonga");
        flag.add ("Canada");
        flag.add ("Slovenia");
        flag.add ("Benin");
        flag.add ("Mongolia");
        flag.add ("Bolivia");
        System.out.println(flag.size());
        // Size will be 6.
        flag.clear;
        // This will remove all the flags.
        System.out.println(flag.size());
        // Outcome will be 0.

        /* contains
        This method is looking for the exact value in the ArrayList.
        Method signature is as follow:
        boolean contains(Object object)
         */

        List<String> state = new ArrayList<>();
        state.add ("South Australia");
        state.add ("Northern Territory");
        state.add ("Tasmania");
        System.out.println(state.contains("Queensland"));
        // Outcome will be false because Queensland is not in the list
        System.out.println(state.contains("Tasmania"));
        // Outcome will be true because Tasmania is in the list.


    }

}
