package com.Falseille;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        // String word als een negende primitieve gezien bij Java. Dit vanwege het feit dat het veel gebruikt wordt tijdens het programmeren.

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + " and this one";
        System.out.println(myString);
        myString = myString + (" \u00A9 2015");
        System.out.println("myString is equal to " + myString);

        String laststring = "10";
        int myInt = 50;
        laststring = laststring + myInt;
        System.out.println("Laststring is equal to " + laststring);
        double doublenumber = 120.47;
        laststring = laststring + doublenumber;
        System.out.println("lastring is equal to " + laststring);


    }

}
