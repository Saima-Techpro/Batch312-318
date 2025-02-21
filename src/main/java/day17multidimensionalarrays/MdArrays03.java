package day17multidimensionalarrays;

import java.util.Arrays;

public class MdArrays03 {
    public static void main(String[] args) {

        // Create a 2D Array and print the sum of elements for row separately

        int[][] numbers = {
                {5,4,3},
                {8,2} ,
                {3, 7, 9}
        };

      //  System.out.println(Arrays.deepToString(numbers));
        // [[5, 4, 3], [8, 2], [3, 7, 9]]

        // int sum = 0; // we used to create sum variable outside the loop for the sum of ALL elements


        int rowNumb = 0;  // if you want to print the row numbers as well

        for (int[] outer : numbers){ // [5, 4, 3]
            // System.out.println(Arrays.toString(outer));

            int sum = 0;  // local variable

            for (int eachElement : outer){
                sum = sum + eachElement;

            }

            rowNumb++;
            System.out.println("Sum of " +rowNumb +" row is: " + sum);

        }


    }
}
