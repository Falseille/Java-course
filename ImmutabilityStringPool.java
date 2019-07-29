public class ImmutabilityStringPool {
    /* A String is not mutable, so its immutable. This means that a String object cannot be changed anymore once it is
    created.
     */
    public static void main(String [] args){
        String r1 = "7";
        String r2 = r1.concat("4");
        r2.concat("3");
        System.out.print(r2);
        // In this example the outcome is 74 because String cannot be changed. r2 is already set on 4.
    }
    private String f;
    public void setF(String newF) { f = newF;} //Setter makes it possible for modification.
    public String getF(){return f; }

}
final class Immu {
    private String f = "France";
    public String getF(){return f;}
}
// Remind that subclasses cannot add any mutable behavior. String is once set, always set.

/* Strings will cost a lot of memory in an Java application. A lot of Strings will be repeated in the program. There is
a solution the solve this problem, reuse the common Strings.
A String pool also known as intern pool is a location in JVM that collect all these Strings.
Strings who are not in the StringPool are like other objects garbage collected.

// String name = "France";
// String name = New String ("France");

Although this is allowed, its not recommended to do like this when writing programs. With line 29 there is said, that
the programmer do not want to make use of the String pool and just create a new one.

 */
