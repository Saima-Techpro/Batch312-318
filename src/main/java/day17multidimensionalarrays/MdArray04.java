package day17multidimensionalarrays;

import java.util.Arrays;

public class MdArray04 {
    public static void main(String[] args) {

        // What is a transpose of a matrix?
        // flipping the original matrix => rows to columns, columns to rows

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(Arrays.deepToString(arr));
//        [[1, 2, 3], [4, 5, 6]]

        // 1. Find out the number of rows and number of columns in the 2D Array

        int rows = arr.length;
        // System.out.println("rows = " + rows); // 2

        int cols = arr[0].length;
        System.out.println("cols = " + cols); // 3

        // 2. Create an empty 2D Array to store the values coming from arr

        int[][] transpose = new int[cols][rows];
        System.out.println(Arrays.deepToString(transpose));

        //  transpose  =   [[0, 0], [0, 0], [0, 0]]

        //       arr =    [[1, 2, 3], [4, 5, 6]]

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                transpose[j][i] = arr[i][j];
            }

        }
        System.out.println(Arrays.deepToString(transpose)); // [[1, 4], [2, 5], [3, 6]]


    }
}
