package day16multidimensionalarrays;

public class HW {
    public static void main(String[] args) {

        System.out.println("============== Task 1 ================");
        // Task 1: Find the sum of all elements in a 2D integer array.
        int[][] numbers = { {1, 2, 3},  {4, 5, 6},  {7, 8, 9}};

        int sum = 0;
        for (int[] row : numbers) {
            for (int num : row) {
                sum += num;
            }
        }

        System.out.println("Sum of all elements: " + sum);

        System.out.println("============== Task 2 ================");
        // Task 2: Find the row in a 2D array that has the maximum sum.
        int[][] arr = { {10, 20, 30},  {5, 15, 25},  {8, 18, 28} };

        int maxSum = 0; // Stores the highest row sum found
        int maxRow = -1; // Stores the row index with the highest sum, initially set to -1, indicating no row has been processed yet


        // Loop through each row in the Multi dimensional array

        for (int i = 0; i < arr.length; i++) {

            int rowSum = 0;

            for (int num : arr[i]) {
                rowSum += num;
            }

            // If the sum of the current row is greater than maxSum, update maxSum and maxRow
            if (rowSum > maxSum) {
                maxSum = rowSum;  // Update the max sum
                maxRow = i;  // Store the index of the row with max sum
            }
        }

        System.out.println("Row with maximum sum is: Row " + (maxRow + 1) + " with sum = " + maxSum);




    }
}
