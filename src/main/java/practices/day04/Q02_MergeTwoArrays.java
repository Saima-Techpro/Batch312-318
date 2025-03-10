package practices.day04;

import java.util.Arrays;

public class Q02_MergeTwoArrays {
    public static void main(String[] args) {

        // Task: Create two Arrays of int data type, merge them and return a single Array
        //       Sort the new array and print it.


        int[] arr = {2, 4, 6, 8};
        int[] brr = {1, 3, 5, 7};

        int arrLength = arr.length; // 4
        int brrLength = brr.length; // 4

        int[] mergedArray = new int[arrLength +  brrLength];
        System.out.println(Arrays.toString(mergedArray)); // [0, 0, 0, 0, 0, 0, 0, 0]

        System.out.println("============= 1st way: ===============");
        // 1st way:
        // Copy the elements from arr
        for (int i = 0; i < arrLength; i++) {
            mergedArray[i] = arr[i];

        }

        System.out.println(Arrays.toString(mergedArray)); // [2, 4, 6, 8, 0, 0, 0, 0]

        // Copy the elements from brr
        for (int i = 0; i < brrLength ; i++) {
           mergedArray [arrLength + i] = brr[i];
        }

        System.out.println(Arrays.toString(mergedArray)); // [2, 4, 6, 8, 1, 3, 5, 7]

        // Sort the new array and print it.
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray)); // [1, 2, 3, 4, 5, 6, 7, 8]

        System.out.println("============= Alperen's solution ============");

        // Alperen's solution
        int[] mergedArray1= new int[arr.length+ brr.length];

        for (int i=0; i< mergedArray1.length; i++){
            for (int w:arr){
                mergedArray1[i]=w;
                i++;
            }for (int w:brr){
                mergedArray1[i]=w;
                i++;
            }
        }
        Arrays.sort(mergedArray1);
        System.out.println(Arrays.toString(mergedArray1));

        System.out.println("============= 2nd way: ===============");
        // 2nd way: using Arrays.copyOf()
        // Arrays.copyOf() creates a copy of the given array

       //  int[]  newArray = new int[arrLength + brrLength];

        // Instead of creating an empty Array and then assigning values of arr to this array through loop,
        // we copy the elements of arr while creating the new Array

        int[]  newArray = Arrays.copyOf(arr, (arrLength+brrLength));
        System.out.println(Arrays.toString(newArray)); // [2, 4, 6, 8, 0, 0, 0, 0]

        // to copy the values from second array (brr), we still need the loop

        for (int i = 0; i < brrLength; i++) {
            newArray[arrLength + i ] = brr[i];

        }

        System.out.println(Arrays.toString(newArray)); // [2, 4, 6, 8, 1, 3, 5, 7]
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray)); // [1, 2, 3, 4, 5, 6, 7, 8]


        System.out.println("=========== 3rd way: ===========");
        // 3rd way: using System.arraycopy() method

//        int[] arr = {2, 4, 6, 8};
//        int[] brr = {1, 3, 5, 7};

        int[] anotherArray = new int[arrLength + brrLength];
        System.out.println(Arrays.toString(anotherArray)); // [0, 0, 0, 0, 0, 0, 0, 0]

        System.arraycopy(arr, 0, anotherArray, 0, arrLength);
        // We are asking arraycopy() method to copy "arr" array, start from index 0,
        // assign these values to "anotherArray" , starting from index 0, until you reach the length of "arr" Array


        System.out.println(Arrays.toString(anotherArray)); // [2, 4, 6, 8, 0, 0, 0, 0]

        System.arraycopy(brr, 0, anotherArray, arrLength, brrLength);
        System.out.println(Arrays.toString(anotherArray)); // [2, 4, 6, 8, 1, 3, 5, 7]

        Arrays.sort(anotherArray);

        System.out.println(Arrays.toString(anotherArray)); // [1, 2, 3, 4, 5, 6, 7, 8]



        /*
        Summary:
        There are 3 ways to copy elements from two existing arrays to a new array

        1: using loops
        2. using Arrays.copyOf() method
        3. System.arraycopy() method

         */
    }
}
