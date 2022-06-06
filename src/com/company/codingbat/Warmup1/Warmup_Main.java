package com.company.codingbat.Warmup1;

public class Warmup_Main {
    public static void main(String[] args) {
        System.out.println("Hello, Warmup- 1 !");
        System.out.println(sumDouble(2,2));
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

}
