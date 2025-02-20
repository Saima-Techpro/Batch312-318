package day16multidimensionalarrays;

import java.util.Arrays;

public class MdArray04 {
    public static void main(String[] args) {

        // Create an int Multidimensional Array
        // Calculate its min and max value
        // Get the total of min and max
        // Find the total of all values from this Multidimensional Array


        int[][] numbers = {{21, 15}, {2, 62, 33}, {92, 8, 41, 32}};
        System.out.println(Arrays.deepToString(numbers));

        // [[21, 15], [2, 62, 33], [92, 8, 41, 32]]

        int minValue = numbers[0][0]; // 21  => we assume that the value numbers[0][0] is the minimum
        int maxValue = numbers[1][1]; // we assume that the value numbers[1][1] is the maximum


        for (int[] outer : numbers){


            for (int element : outer){


                minValue = Math.min(minValue , element);

                maxValue = Math.max(maxValue , element);

            }
        }

        System.out.println("minValue = " + minValue); // 2
        System.out.println("maxValue = " + maxValue); // 92

        // Get the total of min and max
        int total = (minValue + maxValue) ;
        System.out.println("total = " + total);


        // Find the sum of all values from this Multidimensional Array

        int sum = 0;

        for (int[] outer : numbers){

            for (int each : outer){
                // System.out.println("each = " + each);
               //  sum = sum + each;
                sum += each;

            }
        }
        System.out.println("sum = " + sum); // 306


    }
}
