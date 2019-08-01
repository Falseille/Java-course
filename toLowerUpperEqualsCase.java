public class toLowerUpperEqualsCase {
    public static void  main(String [] args){
        /* to LowerCase and toUpperCase
        This method wil do what it is just saying. Completely upper case or only lower case. The string as be said
        will be always the same because it is immutable.
        The following signature is be used.
        String to LowerCase()
        String to UpperCase()
         */

        String region = "Tirol";
        System.out.println(region.toUpperCase());
        // This will print out TIROL because its upper cased.

        System.out.println(region.toLowerCase());
        // This will print out tirol because everything lower cased.

        System.out.println("Innsbruck123".toLowerCase());
        // This will be printed out innsbruck123 because these method will only take letters not any other character.

        /* equal() and equalsIgnoreCase()
        equals() is a method what will check if two String objects contain exactly the characters in the same order.
        Where the equalsIgnoreCase will checking if there object has the same characters, although there is an exception
        for converting characters if this is needed.
        These are method signatures:
        boolean equals (Object obj)
        boolean equalsIgnoreCase(String str)
        */

        String country = "Rwanda";
        String africa = "RwandA";

        System.out.println(country.equals(africa));
        // This will print out false because Rwanda and RwandA are not the same.
        System.out.println(country.equals(country));
        // This will print out true because Rwanda s the same as Rwanda.

        System.out.println(country.equalsIgnoreCase(africa));
        // The outcome will be true because there is said that in the method, difference in case may be ignored.
    }
}
