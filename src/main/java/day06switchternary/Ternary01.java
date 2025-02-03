package day06switchternary;

public class Ternary01 {
    public static void main(String[] args) {

      /*
        Ternary is also used for conditional situations => like if and switch
        But their syntax is SIMPLER.

        Syntax:

        condition  ? these codes will be executed if condition is true    :    these codes will be executed if condition is false  ;

       */

        // Task: Check if the integer is positive or negative
        // 1st way:

        int a = 14;

        if (a > 0){
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }

        // 2nd way: using ternary
        System.out.println(a > 0 ? "Positive" : "Negative");

        // OR
        String result = a > 0 ? "Positive" : "Negative";
        System.out.println("result = " + result);

        // Task: Write a code to print the minimum value of the given values (double)

        double b = 12.50 , c = 45 ;

        double result1 = b < c ? b : c ;
        System.out.println("result1 = " + result1); // 12.5

        // Task : Check if the given number is a digit  or not

        int x = 5;
         String result2 = x >=0 && x<=9  ? "It is a digit" : "It is not a digit";
        System.out.println("result2 = " + result2);

        if (x >=0  && x<=9){
            System.out.println("It is a digit");
        }else {
            System.out.println("It is not a digit");
        }


    }
}
