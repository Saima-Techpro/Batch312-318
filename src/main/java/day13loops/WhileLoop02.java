package day13loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {

        /*
        Task: Ask user to enter a number. Find the sum of the digits of the given number.
        // 123 => 1+2+3 => 6
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");

        int number = scanner.nextInt(); // starting value

        int sum = 0;
        while (number > 0 ){
          sum = sum + number % 10; // OR sum += number%10;
            number = number / 10;
        }
        System.out.println("sum = " + sum);


    }
}
