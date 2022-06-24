package com.company.codingbat.Warmup1;

import static java.lang.System.out;

public class sumDouble {
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

        out.println(sumDouble(2,2));

    }
}
