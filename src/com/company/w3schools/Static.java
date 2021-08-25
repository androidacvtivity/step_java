package com.company.w3schools;

public class Static {

    private static String s= "Javatpoint";
//Static and nested class

    static class StaticNestedClass
    {
        //non-static method of the nested class
        public void show()
        {
//prints the string defined in base class
            System.out.println(s);
        }
    }

    public static void main (String [] args){

        System.out.println(s);

        Static.StaticNestedClass obj = new Static.StaticNestedClass();
//invoking the method of the nested class
        obj.show();


    }
}
