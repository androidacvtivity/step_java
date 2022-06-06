package com.company.w3schools;

public class sumDouble {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;

    }


    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {


        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }


    public static int sumDouble(int a, int b) {
        // Store the sum in a local variable
        int sum = a + b;

        // Double it if a and b are the same
        if (a == b) {
            sum = sum * 2;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World Test!");

        //Test
        System.out.println("Hello, World Test!");
        System.out.println(sumDouble(2,2));

        System.out.println(sleepIn(false,false));

        System.out.println(monkeyTrouble(false,false));
    }



}

