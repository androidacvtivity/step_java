package com.company;

public class Main {

    public enum Season { WINTER, SPRING, SUMMER, FALL }

    public static void main(String[] args) {
	// write your code here
        for (Season s : Season.values())
            System.out.println(s);
        // commit
    }
}
