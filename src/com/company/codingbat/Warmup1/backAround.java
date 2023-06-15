package com.company.codingbat.Warmup1;

import java.util.Scanner;

public class backAround {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine().trim();

        char firstChar = input.charAt(input.length() - 1);
        int length = input.length();
        String result = addLastCharToFrontAndBack(input);

        System.out.println("First character: " + firstChar);
        System.out.println("Length of the word: " + length);
        System.out.println("New string: " + result);
    }

    public static String addLastCharToFrontAndBack(String input) {
        String firstChar = input.substring(0, 1);
        String lastChar = input.substring(input.length() - 1);
        return firstChar + input + firstChar;
    }
}


//Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt".
// The original string will be length 1 or more.
//Show last char, show length of the word.  The text must be able to be entered