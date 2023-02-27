package com.company;
import java.util.Scanner;
public class AddTwoIntegers {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second inte1er
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Add the two integers together
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);


    }
}
