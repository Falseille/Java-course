package com.Falseille;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        //int myMinValue = -2_147_483_648;
        //int myMaxValue = 2_147_483_647;
        //int myTotal = (myMinValue / 2);
        //System.out.println("myTotal = " + myTotal);


        // byte has width of 8
        //byte myByteValue = -128; // 127 max -128 min
        //byte myNewByteValue = (byte) (myByteValue/2);
        //System.out.println("myNewbyteValue" + myNewByteValue);

        //short has width of 16
        //short myShortValue = -32768; // 32767 max
        //short myNewShortValue = (short) (myShortValue/2);
        //System.out.println("myNewShortvalue = " + myNewShortValue);

        //long has a width of 64
        //long myLongValue = -9_223_372_036_854_775_808L; //min and max is minus 1. 807 at the end.
        //long myNewLongtvalue = (long) (myLongValue/2);
        //System.out.println("myNewShortValue = " + myNewLongtvalue);

        //assignment
        // Create a byte variable and set it to any valid byte number.
        // Create a short variable and set it to any valid short number.
        // Create a int variable and set it to any valid int number.
        // Create a long variable and set it to any valid long number.
        // 50000 + 10 times the of the byte, plus the short plus the int.

        byte myByteValue = 10;

        short myShortValue = 20;

        int myIntValue = 50;

        long myLongValue = (50000L + 10L * (myByteValue + myShortValue + myIntValue));
        short shorttotal = (short) (1000 + 10 * (myByteValue + myShortValue + myIntValue) );
        System.out.println("myLongValue = " + myLongValue);
        System.out.println("Shortotal = " + shorttotal);

        short test = 10;

        int test2 = 20;

        byte total = (byte) (test + test2);
        System.out.println ("test total =" + total);

    }
}
