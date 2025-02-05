package day07nestedifandternary;

import java.util.Scanner;

public class Nested_HW {
    public static void main(String[] args) {
        /*
        Task 1: Grade Calculator
        Write a program that takes a student's percentage score as input and determines their
        grade using nested ternary operators. The grading system is as follows:
        90+ → A
        80-89 → B
        70-79 → C
        60-69 → D
        <60 → F


        Task 2: Number Classification
        Write a program that takes an integer input and classifies it into one of the following
        categories using nested ternary operators:
        Positive Even
        Positive Odd
        Negative Even
        Negative Odd
        Zero

        Task 3: Vowel or Consonant Checker
        Write a program that takes a single character as input and determines whether it is:

        A Vowel (A, E, I, O, U in both uppercase and lowercase).
        A Consonant (any other alphabet letter).
        Not a Letter (if it is a digit or a special character).
        Use nested ternary operators to implement this logic.

        Task 4: Discount Calculator
        Write a program that takes a purchase amount as input and calculates the final amount
        after applying discounts:

        20% discount if the amount is 500 or more.
        10% discount if the amount is between 200 and 499.
        No discount if the amount is less than 200.
        Use nested ternary operators to determine the discount and display the final amount.
         */

        // Task 1:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your percentage: ");
        int percentage = scanner.nextInt();

        String grade;
        grade = (percentage >= 90) ? "A" :
                (percentage >= 80) ? "B" :
                        (percentage >= 70) ? "C" :
                                (percentage >= 60) ? "D" : "F";

        System.out.println("Your grade is: " + grade);

        // Nested IF
        if (percentage >= 90) {
            grade = "A";
        } else {
            if (percentage >= 80) {
                grade = "B";
            } else {
                if (percentage >= 70) {
                    grade = "C";
                } else {
                    if (percentage >= 60) {
                        grade = "D";
                    } else {
                        grade = "F";
                    }
                }
            }
        }

        System.out.println("Your grade is: " + grade);



        // Task 2:
        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();

        String result = (num == 0) ? "Zero" :
                (num > 0) ? ((num % 2 == 0) ? "Positive Even" : "Positive Odd") :
                        ((num % 2 == 0) ? "Negative Even" : "Negative Odd");

        System.out.println("The number is: " + result);

        // Nested IF
        if (num == 0) {
            result = "Zero";
        } else {
            if (num > 0) {
                if (num % 2 == 0) {
                    result = "Positive Even";
                } else {
                    result = "Positive Odd";
                }
            } else {
                if (num % 2 == 0) {
                    result = "Negative Even";
                } else {
                    result = "Negative Odd";
                }
            }
        }

        System.out.println("The number is: " + result);

        // Task 3:
        System.out.println("Enter a single character: ");
        char ch = scanner.next().charAt(0);

        String vowelResult;

        vowelResult = (Character.isLetter(ch)) ?
                ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                        ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Vowel" : "Consonant")
                : "Not a Letter";

        System.out.println("The character is: " + vowelResult);

        // Nested IF
        if (Character.isLetter(ch)) {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                    ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelResult = "Vowel";
            } else {
                vowelResult = "Consonant";
            }
        } else {
            vowelResult = "Not a Letter";
        }

        System.out.println("The character is: " + vowelResult);

        // Task 4:
        System.out.println("Enter the purchase amount: ");
        double amount = scanner.nextDouble();

        double finalAmount;

        finalAmount = (amount >= 500) ? amount * 0.80 :
                (amount >= 200) ? amount * 0.90 :
                        amount;

        System.out.println("Final amount after discount: $" + finalAmount);

        // Nested IF
        if (amount >= 500) {
            finalAmount = amount * 0.80;
        } else {
            if (amount >= 200) {
                finalAmount = amount * 0.90;
            } else {
                finalAmount = amount;
            }
        }

        System.out.println("Final amount after discount: $" + finalAmount);





    }
}
