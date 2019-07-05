package com.Falseille;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println( "1 + 2 = " + result);

        int previousresult = result;

        result = result - 1;
        System.out.println(previousresult + " - 1 = " + result);

        previousresult = result;

        result = result * 10;
        System.out.println(previousresult + " * 10 = " + result);

        previousresult = result;

        result = result / 5;
        System.out.println(previousresult + " / 5 = " + result);

        previousresult = result;
        result = result % 3;
        System.out.println(previousresult + " % 3 = " + result);

        previousresult = result;
        result = result + 1;
        System.out.println("Result is now" + result);
        result++;
        System.out.println("Result is now" + result);
        result--;
        System.out.println("Result is now" + result);

        result += 2;
        System.out.println("Result is now" + result);
        result *= 10;
        System.out.println("Result is now" + result);
        result -=10;
        System.out.println("Result is now" + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("it is not an alien!");

        int topScore = 100;
        if (topScore != 100)
            System.out.println("you got the high score");

        // == is gelijk aan
        // != niet gelijk aan
        // > is groter dan >= is gelijk of groter dan
        // < kleine dan  zelf voor het grotere teken.

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore <100) //beide condities moeten goed zijn anders werkt het niet.
            System.out.println("Greater than topscore and less then 100");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not supposed to happen");

        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");
        int Falseille = 13;
        int Falice    = 06;

        int ensemble = Falseille * Falice;
        System.out.println(Falseille);
        System.out.println(Falice);
        System.out.println(ensemble);

        // 1. Create a double variable with the value 30
        // 2. Create a second variable of type double with the value 80
        // 3. Add bot numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"


    }
}
