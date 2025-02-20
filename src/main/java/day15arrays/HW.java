package day15arrays;

import java.util.Arrays;

public class HW {
    public static void main(String[] args) {

        // Task 1: Write a Java program that finds the maximum value in an integer array.
        int[] numbers = {5, 12, 3, 19, 7};

        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum value: " + max);

        System.out.println("========== Task 2 ===========");

        // Task 2: Count the number of even and odd numbers in an array.
        int[] arr = {5, 12, 8, 19, 7, 22};

        int evenCount = 0, oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);

        System.out.println("========== Task 3 ===========");

        // Task 3: Merge two arrays into a single array.
        int[] arr1 = {11, 42, 33};
        int[] arr2 = {14, 55, 6};

        int[] mergedArray = new int[arr1.length + arr2.length];

        // Copy elements of arr1
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }

        // Copy elements of arr2
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }

        // Print merged array
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("========== Task 4 ===========");
        // Task 4: Find the second-largest element in an array.
        int[] arr3 = {12, 35, 1, 10, 34, 1};
        Arrays.sort(arr3); // Sort in ascending order

        System.out.println("second-largest element: " + arr3[arr3.length - 2]);
    }
}
