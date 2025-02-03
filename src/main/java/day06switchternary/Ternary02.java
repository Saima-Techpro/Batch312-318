package day06switchternary;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

        // Create a ternary to print the absolute value of a given number
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();

        if (number < 0){
            System.out.println("Absolute value of the number is = " + (number * -1));
        }else {
            System.out.println("Absolute value of the number is = " + number);
        }

        // with ternary
        int absoluteValue = number < 0 ? (number * -1) : number;
        System.out.println("absolute value = " + absoluteValue);

        // If two numbers have same sign (+ve or -ve), multiply them. If not, print "I don't want to multiply"
        int a = 9 , b =  - 5 ;
        String result = (a < 0 && b < 0)  || (a > 0 && b > 0)  ? Integer.toString(a * b) :  "I don't want to multiply"  ;
        System.out.println("result = " + result);

        // 2nd way  to resolve data type issue

        Object result1 = (a < 0 && b < 0)  || (a > 0 && b > 0)  ? (a * b) :  "I don't want to multiply"  ;
        System.out.println("result1 = " + result1);

        /*
        Object data type is the father of all data types => Adam is to humans, Object is to data types
        General rule: To store the result in its relevant data type
        But is some case, when we HAVE to deal with different data types, it's an option to use
        REMEMBER: Object data type uses HUGE Memory. USE IT ONLY WHEN YOU REALLLLLLLY IT.
         */


    }
}
