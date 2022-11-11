package com.company.codingbat.Warmup1;

public class nearHundred {

    public static void main(String[] args) {

        System.out.println(makes10.makes10_10(9,10));
        System.out.println("Hello, World!");
        System.out.println(nearHundred(10));
    }



    public static  boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

}
