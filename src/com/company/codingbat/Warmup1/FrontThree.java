package com.company.codingbat.Warmup1;

public class FrontThree {
    public static void main(String[] args) {
        String str1 = front3("Java");
        System.out.println(str1); // Output: JavJavJav

        String str2 = front3("Chocolate");
        System.out.println(str2); // Output: ChoChoCho

        String str3 = front3("abc");
        System.out.println(str3); // Output: abcabcabc

        String str4 = front3("ab");
        System.out.println(str4); // Output: abcabcabc
    }

    public static String front3(String str) {
//        String front;
//        if (str.length() < 3) {
//            front = str;
//        } else {
//            front = str.substring(0, 3);
//        }

//        String front = str.length() < 3 ? str : str.substring(0, 3);
//        return front + front + front;

        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        }
        else {
            front = str;
        }

        return front + front + front;


    }

}


