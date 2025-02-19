package day15arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {


        // INTERVIEW QUESTION
        // Move all zero elements to the end of array from a given array

        int[] arr = {0, 2, 5, 0, 12, 17,0, 0, 21};

        System.out.println(Arrays.toString(arr)); // [0, 2, 5, 0, 12, 17, 0, 0, 21]

        System.out.println(arr.length); // 9

        // int[] brr = new int[9]; // Hard coded

        int[] brr = new int[arr.length]; // dynamic
        System.out.println(Arrays.toString(brr)); // [0, 0, 0, 0, 0, 0, 0, 0, 0]


        // arr = [0, 2, 5, 0, 12, 17, 0, 0, 21]
        int index = 0;

        for (int w : arr){
            if ( w != 0 ){
                brr[index] = w;
                index++;
            }
        }
        System.out.println(Arrays.toString(brr)); // [2, 5, 12, 17, 21, 0, 0, 0, 0]








    }
}
