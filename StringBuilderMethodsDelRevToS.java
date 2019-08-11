public class StringBuilderMethodsDelRevToS {
    public static void main(String [] args){
        /* delete()
        This method is just doing what it is saying. Delete what is requested.

        deleteCharAt()
        This is deleting a character at the requested place.
         */
        StringBuilder ko = new StringBuilder("Volga");
        ko.delete(0, 1);
        System.out.println(ko);
        //Outcome is olga, because index is started at 0 and requested to go till 1. One will be deleted and V = index1

        ko.deleteCharAt(2);
        System.out.println(ko);
        //Outcome will be ola , because g is the second in the index counting from 0.

        /*reverse()
        This method is just what it is saying, reverse it.
         */
        StringBuilder thu = new StringBuilder("Thulium");
        thu.reverse();
        System.out.println(thu);
        //Outcome will be muiluhT because of reversing it.

        /* toString
        This method is changing the StringBuilder to a String. The reason to use this method is that StringBuilder
        is better for the performance then creating a new String continuity.
         */
    }
}
