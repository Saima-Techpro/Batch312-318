package practices.practice04;

import java.util.Arrays;

public class Q01_Arrays {


    public static void main(String[] args) {

          /*
        Create an array that stores 7 integers.
        Find and print the median value of the sorted array (the middle value when sorted).
        Swap the highest and lowest values in the array and Print the updated array.
        Reverse the array and print it.
        Print only even numbers from the array.
         */


        // Task 1: Create an array that stores 7 integers.

        int[] numbers = {23, 12, 56, 43, 89, 35, 15};
        System.out.println(Arrays.toString(numbers)); // [23, 12, 56, 43, 89, 35, 15]

        // Task 2: Find and print the median value of the sorted array (the middle value when sorted).

        Arrays.sort(numbers);
        System.out.println("Sorted array: "+Arrays.toString(numbers)); // [12, 15, 23, 35, 43, 56, 89]

        int medianIndex = (numbers.length / 2);
        //System.out.println("medianIndex = " + medianIndex); // 3

        // to get the middle value
        int medianValue  = numbers[medianIndex];
        // System.out.println("medianValue = " + medianValue); // 35

        // another way:
        // int medianValue  = numbers[(numbers.length / 2)];


        // Task 3: Swap the highest and lowest values in the array and Print the updated array.
        // sorted array =  [12, 15, 23, 35, 43, 56, 89]

        int smallestIndex = numbers[0];
        int lowestValue = smallestIndex;
        System.out.println("lowestValue = " + lowestValue); //12


        int lastIndex = numbers.length - 1;
        int highestValue = numbers[lastIndex ];
        System.out.println("highestValue = " + highestValue); // 89

        // Swap now
        int temp = lowestValue;
        numbers[0]=  highestValue;
        numbers[lastIndex] = temp;

        System.out.println(Arrays.toString(numbers)); // [89, 15, 23, 35, 43, 56, 12]


        // Task 4: Reverse the array and print it.
        // numbers = [89, 15, 23, 35, 43, 56, 12]
        
        for (int i = lastIndex; i >= 0; i--) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println();

        // 2nd way: Alperen's solution
//        int[] reversed = new int[lastIndex];
//
//        int i = numbers.length;
//
//        for (int w : numbers){
//            reversed[i-1] = w;
//            i--;
//        }
//        System.out.println(Arrays.toString(reversed));
//

        System.out.println("======== Task 5: =======");

        // Task 5: Print only even numbers from the array.
//        [89, 15, 23, 35, 43, 56, 12]

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) { // checking if number at the given index is even or not
                System.out.print (numbers[i] + " ");
            }

        }


    }


}
