package com.company.codingbat.Warmup1;

public class notString {



    public static void main(String[] args) {


        System.out.println("Hello, World!");
        System.out.println(notString("candy"));
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        String myStr3 = "Another String";

        System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
        System.out.println(myStr1.equals(myStr3)); // false

    }

    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }

        return "not " + str;
    }
}
