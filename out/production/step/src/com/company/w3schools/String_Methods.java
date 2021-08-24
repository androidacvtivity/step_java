package com.company.w3schools;

public class String_Methods {
    public static void main (String[] args){

        String myStr = "Hello";
        char result = myStr.charAt(1);
        System.out.println(result);


        String myStr1 = "Hello";
        int result1 = myStr1.codePointAt(0);
        System.out.println(result1);


        String myStr2 = "Hello";
        int result2 = myStr2.codePointCount(0, 5);
        System.out.println(result2);

        String myStr1VB = "Vitalie Bancu";
        String myStr2VB = "Vitalie Bancu";
        System.out.println(myStr1VB.compareTo(myStr2VB)); // Returns 0 because they are equal



    }
}
