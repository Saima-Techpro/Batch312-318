package day06switchternary;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        /*

        1. Switch statements is also used for conditional situations (like if-statements) But their syntax is different.
        2. Instead of if(), we use switch() followed by cases

        Difference between if() and switch() statements?

        1. The order of the conditions (cases) doesn't matter in switch statements
        2. Java stops execution automatically in IF statement when a true condition is met.
           However, in switch statements, that is not the case. Even after finding the true condition,
           execution keeps running UNLESS we use break keyword.
        3. Switch statements only work with short, byte, int, char, String data types.
           If statements don't have ANY limitations.

            SYNTAX:

        switch ( variableName){
            case 1 : (condition)
            codes to be executed after the condition is checked
                break; (optional keyword) Use it when you need it

            case 2:
            codes to be executed
                break;
            case 3:
            codes to be executed
                break;
            case 4:
            codes to be executed
                break;
            default:
            codes to be executed
        }

         */

        // Write a code to print day number for the day given by the user

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day name");

        String dayName = scanner.next();

        // 1st way: using if statement
        if (dayName.equalsIgnoreCase("monday")){
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("tuesday")) {
            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("wednesday")) {
            System.out.println(3);
        }else if (dayName.equalsIgnoreCase("thursday")) {
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("friday")) {
            System.out.println(5);
        }else if (dayName.equalsIgnoreCase("saturday")) {
            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("sunday")) {
            System.out.println(7);
        }else {
            System.out.println("Please provide valid day name");
        }

        System.out.println("===========================");
        // 2nd way: switch statement

        switch (dayName.toLowerCase()){

            case "wednesday":
                System.out.println(3);
                break;
            case "thursday":
                System.out.println(4);
                break;
            case "friday":
                System.out.println(5);
                break;
            case "saturday":
                System.out.println(6);
                break;
            case "sunday":
                System.out.println(7);
                break;
            case "monday":
                System.out.println(1);
                break;
            case "tuesday":
                System.out.println(2);
                break;
            default:
                System.out.println("Please provide valid day name");
        }




    }
}
