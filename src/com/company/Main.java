package com.company;

import static com.company.codingbat.Warmup1.nearHundred.nearHundred;

public class Main {

    public enum Season { WINTER, SPRING, SUMMER, FALL }

    public static void main(String[] args) {
	// write your code here
        for (Season s : Season.values())
            System.out.println(s);
        // commit
        System.out.println(nearHundred(100));

    }
}
