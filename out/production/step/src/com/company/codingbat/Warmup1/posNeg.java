package com.company.codingbat.Warmup1;

import static java.lang.System.out;

public class posNeg {

    public static void main(String[] args) {
        out.println("Hello, posNeg !");
        out.println(posNeg(1,-1,false));

    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }
}
