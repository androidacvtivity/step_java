package com.company.w3schools.multidimensional_Arrays;

public class ma1 {
    public static void main(String[] args) {

// create a 2d array
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };
// calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);

        int[][] b = {
                {1, -2, 3},
                {-4, -5, 6, 9},
                {7},
        };

        for (int i = 0; i < b.length; ++i) {
            for(int j = 0; j < b[i].length; ++j) {
                System.out.println(b[i][j]);

            }
        }




        // create a 2d array
        int[][] c = {
                {1, -2, 3},
                {-4, -5, 6, 9},
                {7},
        };
// first for...each loop access the individual array
        // inside the 2d array
        for (int[] innerArray: c) {
            // second for...each loop access each element inside the row
            for(int data: innerArray) {
                System.out.println(data);
            }
        }

    }
}
