public class ArrayListMethodSetEmptySize {
    public static void main(String [] args){
        /* set()
        This method will change an element in the ArrayList without changing the size.
        Method signature:
        E set(int index, E newElement)
        */

        List<String> auto = new ArrayList<>();
        auto.add("Dacia");
        System.out.println(auto.size());
        // will print out 1, because we have only one element in this Arraylist what is added.
        auto.set(0, "Nissan");
        // 0 is because of the index. Nissan will replace Dacia as element.
        System.out.println(auto.size());
        // Still one, the element is only replaced, so the size of the Arraylist will be the same.
        auto.set(1, "Kia");
        // Will give an exception because it will replace something what isn't there.

        /* isEmpty()
        This looking if the list is empty or not
        signature of this method is as follow.
        boolean isEmpty()

         */
        List<String> motor = new ArrayList<>();
        System.out.println(motor.isEmpty());
        // Will give true if there was a list of motor, with no elements in it.
        motor.add("Honda");
        // will add an element.
        System.out.println(motor.isEmpty());
        // Will give false as answer.

        /* size
        This will count the size of the Arraylist.
        The signature is as follow
        int size()
         */
        List<String> racemoter = new ArrayList<>();
        racemoter.add("Ducati");
        System.out.println(racemotor.size);
        // Will give size 1.


        //Note: List will not work because of there is no import.


    }
}
