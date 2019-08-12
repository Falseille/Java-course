public class Equality {
    public static void main (String [] args){
       /*
       = = is used to compare numbers, can be used for Strings also. Watch out, normally it will not be used in
       String Objects.
       What is used for String objects is equals. Equals will be explained much later on.
       For now its important to understand what = = is doing.
        */
       String name;

       Equality e1 = new Equality();
       Equality e2 = new Equality();
       Equality e3 = e1;
        System.out.println(e1 == e3);
        // Outcome true because e3 is initialized same as e1
        System.out.println(e1 == e2);
        // Outcome false because the reference to the two objects are different.

    }
}
