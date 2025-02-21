package day17multidimensionalarrays;

import java.util.Arrays;

public class MdArrays02 {
    public static void main(String[] args) {

        // Task: Find the greatest element from a given int Multidimensional Array

        int numbers[][] = {{4, 7}, {-9, 4, 12}, {15, 36, 83}, {67, 23, 32}};


        System.out.println(Arrays.deepToString(numbers));
        // [[4, 7], [-9, 4, 12], [15, 36, 83], [67, 23, 32]]


        // 1st way:

        int greatest = 0;

        for (int[] outer : numbers){
            for (int w: outer){
                if (greatest < w){
                    greatest = w;
                }
            }
        }
        System.out.println("greatest = " + greatest); // 83

        System.out.println("============= 2nd way ============");
        // 2nd way: Math.max() , Math.min()

        System.out.println(Math.max(45, 23));

        // [[4, 7], [-9, 4, 12], [15, 36, 83], [67, 23, 32]]

        int maxValue = numbers[0][0];  // we assume that the value at this index numbers[0][0] is maximum value in our 2D

        for (int[] outer : numbers){
            for (int each : outer){
               maxValue = Math.max(maxValue, each);
            }
        }

        System.out.println("maxValue = " + maxValue); // 83


    }
}
