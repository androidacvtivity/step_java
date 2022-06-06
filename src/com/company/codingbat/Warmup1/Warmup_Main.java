package com.company.codingbat.Warmup1;

public class Warmup_Main {
    public static void main(String[] args) {
        System.out.println("Hello, Warmup- 1 !");
        System.out.println(sumDouble(2,2));
        System.out.println("Hello \n" + diff21(22));
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
