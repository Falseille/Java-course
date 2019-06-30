public class InstanceAndClassVariables {
// Instance and a class variable don't have to be initialized because when they are declared they have a default value.
/*  Default initialization.
    boolean default false
    byte, short, int, long, default 0
    float double 0.0
    char 'u\u0000' (NUL)
    Everything else null

 */
// Variable scope

    public void glass (int piecesOfGlass) {
        int BrokenGlass = 1;
    }
    /* In this case there are two local variables, one is in a method see void eat (int PiecesOfGlass)
    It makes it also method parameter. So the method is eat and the method parameter is int PiecesOfGlass
    Second parameter is int Broken Glass. Void is saying that a method should not have a return value.
     */


}
    public void  useIfNeeded(boolean needed) {
        if(needed) {
            int brokenGlass =1;
        } //brokenGlass is now 'outside' the scope of the method.
        System.out.println(brokenglass); /* This will not be printed out because brokenGlass is declared in the scope of
        if and not in the scope of the boolean. So its in another block of code. */
    }

    public class stadium
    static int MAX_CAPACITY = 2000;
    int capacity;
    public void visitors(int realcapacity) {
        if (capacity < MAX_CAPACITY) {
            int newCapacity = capacity + realcapacity;
            capacity = newCapacity;
        }
        /* This class has a class variable , instance variable and two local variable.
        The class variable is MAX_Capacity , because there is a static in its declaration. Static means that it can be
        accessed without creating a object or class. It is declared on line 32 and stays in the scope until the program
        ends.
        The instance variable is capacity and it is declared on line 33, instance variable is a variable what is used
        in a class but not in a method.
        The local variables are realcapacity and newcapacity because its only used in the method. Other parts are not
        aware of these variables.
         */
    }