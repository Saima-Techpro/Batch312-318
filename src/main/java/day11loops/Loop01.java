package day11loops;

public class Loop01 {
    public static void main(String[] args) {

        // Print "Hi" five times
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        /*
        Java Principle: DRY => Don't Repeat Yourself  => AVOID REPETITION

        Java created this structure called LOOPS to avoid repetition.
        There are four types of Loops
        1. for loop      2. while loop        3. do while loop       4. for each loop


        SYNTAX of for loop

        for (startingValue;  condition to stop the loop; increment / decrement){
           loop body = codes go here
        }

        NOTE: startingValue is the name of a variable; you can use ANY name here
         */

        System.out.println("========== Loops start ============");

        for (int startingValue = 1; startingValue < 6; startingValue++) {
            System.out.println("Hi");
        }

        System.out.println("=================");
        // Print the numbers from 20 to 8
        for (int x = 20; x > 7; x--) {
            System.out.println(x);
        }

        System.out.println("=================");
        // Print all the even numbers from 20 to 8
        for (int g = 20; g > 7; g--) {
            if (g % 2 == 0) {
                System.out.println(g);
            }
        }
        System.out.println("======== Another way =========");
        // Another way:
        // decreasing by 2s, we'll get rid of odd numbers, so we don't need if statement inside the loop
        for (int y = 20; y > 7; y -= 2) {
            System.out.println(y);
        }

        System.out.println("=================");
        // Print all the ODD numbers from 20 to 8
        for (int g = 20; g > 7; g--) {
            if (g % 2 == 1) {
                System.out.println(g);
            }
        }
        // OR
        for (int k = 20; k > 7; k--) {
            if (k % 2 != 0) {
                System.out.println(k);
            }
        }

        // Another way: decreasing by 2
        for (int i = 19; i >= 9; i -= 2) {
            System.out.println(i);
        }

        System.out.println("=================");

        for (int c = 19; c > 8; c -= 2) {
            System.out.println((c % 2 == 1) ? (c) : "");
        }

        System.out.println("=================");
        //  Print odd numbers from 68 to 13 in the same line with a gap between the consecutive integers

        for (int i = 68; i > 12; i--) {

            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("=================");
        // Print all numbers from 120 to 11, which are divisible by 4 but not by 6
        // in the same line with a gap between the consecutive integers

        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 != 0) {
                System.out.print(i + " ");
            }
        }


    }
}
