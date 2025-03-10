package practices.day05;

import java.util.Arrays;

public class C05_MultiDimensionalArrays {
    public static void main(String[] args) {
        /*
        Integer[] array1 = {1, 7, 13, 4, 9, 25};
        String[] array2 = {"bob","mike","jack","jake","finn"};
        Double[] array3 = {1.0, 3.5, 4.8, 9.9, 10.3, 16.7};

        Object[][] arrays = {array1, array2, array3};

        System.out.println(Arrays.deepToString(arrays));
        */

        //TASK: Write a program that takes the sum of the inner elements
        //of a 2D (Multi dimensional) array one by one, and outputs the sums into another array.
        //Work on this array like shown:
        //{{1, 2, 3}, {4, 5}, {6, 7}} → 1+2+3=6, 4+5=9, 6+7=13, output: {6, 9, 13}

        Integer[][] arrays = {{1, 2, 3}, {4, 5}, {6, 7}};
        Integer[] resultArray = new Integer[arrays.length];

        Integer sum = 0;
        for (int i = 0; i < arrays.length; i++){

            for (Integer number : arrays[i]){
                sum += number;
            }

            resultArray[i] = sum;
            sum = 0;
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
