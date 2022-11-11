package com.company.codingbat.Warmup1;

import static java.lang.System.out;


public class Warmup_Main {
    public static void main(String[] args) {
        out.println("Hello, Warmup- 1 !");
        out.println(sumDouble(2,2));
        out.println("Hello \n" + diff21(22));
        out.println("Hello \n" + diff21.diff21(24));
        out.println(sumDouble.sumDouble(3,3));
        out.println(parrotTrouble.parrotTrouble(true,6));
        out.println(parrotTrouble.parrotTrouble(true,7));
        out.println(parrotTrouble.parrotTrouble(true,7));

        out.println(makes10.makes10_10(9,10));
        out.println(makes10.makes10_10(9,9));

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


    public static int diff21(int n) {

        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }

    }


}
