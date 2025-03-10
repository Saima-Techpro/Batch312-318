package practices.day05;

public class C06_MultiDimensionalArrays {
    public static void main(String[] args) {
        //TASK: Write a program that will output the inner elements of a
        //2D array that are greater than the average of their own array.
        //Example: {{1, 2, 3, 4}, {5, 6, 7, 8}} => prints numbers 3, 4, 7 and 8.
        //You pick how you want to print.
        //Work with this array:
        Integer[][] numbers = {{8, 57, 37}, {99, 88, 11}, {32, 34, 15, 12}, {2, 3, 5, 1}};

        Double sum = 0.0;
        Double average;

        for (Integer[] intArray : numbers){
            for (Integer i : intArray){
                sum += i;
            }
            average = sum / intArray.length;
            for (Integer j : intArray){
                if (j > average){
                    System.out.println(j + " is greater than the average: " + average);
                }
            }
            average = 0.0;
            sum = 0.0;
            System.out.println("Going to the next array");
        }
    }
}
