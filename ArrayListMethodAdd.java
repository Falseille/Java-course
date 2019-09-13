public class ArrayListMethodAdd {
    public static void main(String [] args){

        /* Start
        There is an object called E, this is used when there is no type specified when creating an Arraylist.
         */

        /* add()
        This method adds a new value in the Arraylist. The signature of this method is:
        boolean add (E element)
        void add (E element)

        The boolean value is always true. The reason there is a boolean value is because in the collection
        there is need of a return value in the signature when adding an element.
         */

        Arraylist voiture = new Arraylist();
        voiture.add("Peugeot");
        voiture.add(Boolean.TRUE);
        System.out.println(voiture);
        // Note that this will not work because there is no import for an Arraylist what is needed.

        // It's also possible with an specified type.

        Arraylist<String> roulez = new Arraylist<>();
        roulez.add("heures");
        roulez.add(Boolean.TRUE);
        // This will not work because type is already known as String, Boolean is not needed.

        // There is also a possibility to add values on a different position with indexes.

        List<String> renault = new Arraylist<>();
        renault.add("megane");
        renault.add(0, "twingo");
        // result twingo megane
        renault.add(2, "talisman");
        // result twingo megane talisman
        renault.add(1, "clio");
        //result twingo clio megane talisman
        System.out.println(renault);
    }
}
