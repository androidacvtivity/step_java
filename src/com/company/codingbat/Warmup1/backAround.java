package com.company.codingbat.Warmup1;

public class backAround {

    public static void main(String[] args) {
        String str1 = lastCharToFrontBack("cat");
        System.out.println(str1); // Output: tcatt

        String str2 = lastCharToFrontBack("hello");
        System.out.println(str2); // Output: ohelloo

        String str3 = lastCharToFrontBack("a");
        System.out.println(str3); // Output: aa
    }

    public static String lastCharToFrontBack(String str) {
        char lastChar = str.charAt(str.length() - 1);
        return lastChar + str + lastChar;
    }
}


//Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt".
// The original string will be length 1 or more.
//Show first char, show length of the word.  The text must be able to be entered