import java.util.ArrayList;

public class ArrayListMethodRemove {
    public static void main(String [] args){

        /* What does it do
        This method will remove the first value what is matched in the ArrayList, but it has also the possibility to
        remove an element at specific index.

        It has the follow signatures.

        boolean remove (Object object)
        E remove (int index)

        The boolean will tell if the element was removed or not. Where the element will return the name what is removed.
        int uses an index, when it asked for example index 8, when there is no 8 then there will be an exception.
         */

        List<String> villages = new ArrayList<>();
        villages.add("Vianden");
        villages.add("Durbuy");
        System.out.println(villages.remove("Givet"));
        // This will return a false because Givet is not in the ArrayList.
        System.out.println(village.remove("Durbuy"));
        // This will give a true because Durbuy is in the list.
        System.out.println(village.remove(0));
        // This will return Vianden because Vianden is at the index of 0 and the removed element will be shown.

    }
}
