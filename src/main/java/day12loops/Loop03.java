package day12loops;

import java.util.Scanner;

public class Loop03 {
    public static void main(String[] args) {

        /*
        Task: Type code to find the sum of the Unique digits in the given integer
         Example: 1232 => 1+3 => 4
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number.");
        String number = scan.next();

//        System.out.println(number.charAt(2));
//        System.out.println(number.substring(2)); // substring(single param) returns the value of the given index and everything that comes AFTER it
//        System.out.println(number.substring(2, 3)); // substring(1st param, 2nd param) returns the value of the starting Index, but excludes the value at the ending index

        int sum  = 0;

        for (int i = 0; i < number.length(); i++){
            String digit = number.substring(i , i+1);
            if (number.indexOf(digit) == number.lastIndexOf(digit)){ // checking the uniqueness of the digit
                //sum = sum + Integer.valueOf(digit);
                sum = sum + Integer.parseInt(digit);
            }
        }

        System.out.println("sum = " + sum);








    }
}
