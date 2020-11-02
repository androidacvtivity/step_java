package com.company.w3schools;

public class Java_Strings {

    public static void main (String[] args){
        String greeting = "Hello";
        System.out.println(greeting);
        System.out.println(greeting + " length "+ greeting.length());
        System.out.println(greeting.length());
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(txt);
        System.out.println("The length of the txt string is: " + txt.length());


        String text = "Hello World";
        System.out.println(text.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(text.toLowerCase());   // Outputs "hello world"

        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate")); // Outputs 7

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);



        String firstName1 = "Vitalie ";
        String lastName1 = "Bancu";
        System.out.println(firstName1.concat(lastName1));


        String txt4 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt4);

        String txt5 = "It\'s alright.";
        System.out.println(txt5);

        String txt6 = "The character \\ is called backslash.";
        System.out.println(txt6);




    }
}
