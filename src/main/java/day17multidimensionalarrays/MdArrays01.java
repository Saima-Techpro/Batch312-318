package day17multidimensionalarrays;

import java.util.Arrays;

public class MdArrays01 {
    public static void main(String[] args) {

     // Task: Convert a Multidimensional Array (2D) into a single array

    // int[][] numbers = new int[3][3];  // non-flexible way
    // int[][] numbers = new int[3][];  //  a bit flexible way => it allows to store different number of values in the inner arrays
    // int[][] numbers = { {} , {} , {}};  // the most flexible way

        int[][] numbers = { {3, 4, 5} , {8, 3} , {5, 2, 9, 7, 4}};

        System.out.println(Arrays.deepToString(numbers)); // [[3, 4, 5], [8, 3], [5, 2, 9, 7, 4]]


        // Conversion
        //   Multidimensional Array (2D)        =>  Single Array
        // [[3, 4, 5], [8, 3], [5, 2, 9, 7, 4]] => [3, 4, 5, 8, 3, 5, 2, 9, 7, 4]

        // Step 1: Find out how many total elements are there in the 2D,
        // so we can use that to mention as the size of new empty single Array


        int totalNumOfElements = 0;

        for (int[]  w : numbers){
            totalNumOfElements = totalNumOfElements + w.length;
        }
        System.out.println("totalNumOfElements = " + totalNumOfElements); // 10


        // Step 2: Use this totalNumOfElements to declare the size of new empty Array
        // Remember: Arrays are fixed size, so we need to declare the size when we create them

//        int[] singleArray = new int[ what size? ];
//        int[] singleArray = new int[10];// Hard coded

        int[] singleArray = new int[totalNumOfElements];// dynamic way
        System.out.println(Arrays.toString(singleArray)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]


        // Step 3: Use nested loop to extract each value from the 2D array and assign it to singleArray
        // 2D =    [[3, 4, 5], [8, 3], [5, 2, 9, 7, 4]]


        int index = 0;

        for (int[] outer : numbers){

            for (int eachElement : outer){
                singleArray[index] = eachElement;
                index++;
            }
        }

        System.out.println("singleArray = " + Arrays.toString(singleArray)); // [3, 4, 5, 8, 3, 5, 2, 9, 7, 4]

    }
}
