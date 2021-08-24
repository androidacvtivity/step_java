package com.company.w3schools;

public class Multidimensional_Arrays {
    public static void main(String[] args) {

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[0][1];
     //   System.out.println(x); // Outputs 7

        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

    }
}
