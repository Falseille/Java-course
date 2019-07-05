package com.Falseille;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 2;

        // width of float = 32 (4bytes)
        float myFloatValue = 5.4f / 3f;

        // width of double = 64 (8bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue =" + myIntValue);
        System.out.println("myFloatValue =" + myFloatValue);
        System.out.println("myDoubleValue =" + myDoubleValue);

        //Convert a given number of pounds to kilograms
        //1. Create a variable to store the number of pounds
        //2. Calculate the number of kilograms for the number above and store in a variable
        //3. Print out the result
        //
        // Notes: 1 Pound is equal to 0.45359237 kilograms

        double pounds = 50d;

       double convertedKilograms = pounds * 0.45359237d;

        System.out.println("kilograms =" + convertedKilograms);

        double pi = 3.141_592d;

    }

}