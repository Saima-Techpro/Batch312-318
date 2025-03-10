package practices.day01_variables;

public class C01_Variables {
    public static void main(String[] args) {
        /*
        There are 2 types of variables: Primitive and non-primitive. We store values in variables.
        Variables are passive objects.
         */

        //TASK 1: Assign the sum of 2 numbers to a new variable and print the variable to the console.
        /*
        int a = 50;
        double b = 85.2;

        double sum = a + b;

        System.out.println("sum = " + sum);
        */
        //TASK 2: Take the sum of the same numbers, then print only the whole part of the sum.

        //Solution #1
        //int sum2 = a + (int) b;

        //Solution #2
        //int sum2 = (int) (a + b);

        //Solution #3
        //int sum2 = (int) sum;

        //System.out.println("sum2 = " + sum2);

        double x = 6.9;
        double y = 7.8;

        double actualSumXY = x + y;
        System.out.println("The actual sum of X and Y: " + actualSumXY); // 14.7

        int sum3 = (int) x + (int) y;
        System.out.println("Sum of integer cast of each variable: " + sum3); // 13

        int sum4 = (int) (x + y);
        System.out.println("Integer cast of the sum: " + sum4); //14

        int sum5 = (int) actualSumXY;
        System.out.println("Integer cast of actual sum: " + sum5); //14

    }
}
