import java.util.List;

public class Arraylist {
    public static void main (String [] args){
        /* Arraylist
        What is needed for arraylist like with other array sort for example. At least one of the follow import is called
        import java.util.*;
        import java.util.ArrayList;

        As can be remembered import java.util* will import the whole package. Where import java.util.ArrayList will
        just import an ArrayList.

        There are three possible ways to create an Arraylist
         */
        Arraylist listeune = new Arraylist();
        // This says make an Arraylist by default
        Arraylist listedeux = new Arraylist(15);
        // This says make an Arraylist of 15 slots big which are not assigned yet.
        Arraylist listetrois = new Arraylist(listedeux);
        // This say make an copy of the list.

        // There are two variations which are also needed to know which allows to specify the class
        Arraylist<String> listequatre = new Arraylist<String>();
        // With diamond operator can be an type set.

        Arraylist<String> listecinq = new Arraylist<>();
        // Its also possible at the right side have no type written. This will do exactly the same as Listequatre.

        // Arraylist is also a List. List can be List variable reference but not an Arraylisy not.

        List<String> listesix = new Arraylist<>();
        // Arraylist can be stored in  a List.
        //Arraylist<String> listesept = new List<>();
        // This will not work because List cannot be stored in an Arraylist.
    }
}
