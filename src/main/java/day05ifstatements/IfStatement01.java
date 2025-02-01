package day05ifstatements;

public class IfStatement01 {
    public static void main(String[] args) {

        /*
        If it rains, picnic is cancelled. => Conditional sentence
        If it doesn't rain, picnic will carry on. => Conditional sentence

         IF STATEMENTS in Java

         if( condition ){
           This is the body of IF STATEMENT
           This is where codes are written.
         }

         */

        if ( 4 < 6){ // condition is true, body will be executed
            System.out.println("If you see this message, it means the condition is true!!");
        }

        if ( 4 > 6){// condition is not true, body will not be executed
            System.out.println("If you see this message, it means the condition is true!!");
        }

        System.out.println("=====================");

        /*
        Task:
        Print "positive" if the given digit is greater than zero
        Print "negative" if the given digit is less than zero
         */

        int a = 23;

        if (a > 0 ){
            System.out.println("positive");
        }

        if (a < 0){
            System.out.println("negative");
        }

        // Rule in JAVA => DRY => Don't Repeat Yourself
        // In order to avoid repetition, we can else part

        if (a > 0){
            System.out.println("positive");
        }else {
            System.out.println("negative");
        }

        // Print "Digit" on the console if the number is digit
        // 0-9

        int b = 6;

        if (b >=0  && b <=9){
            System.out.println(b + " is a digit");
        }

        // && operator returns true if BOTH conditions are true (strict)
        // || operator returns true even if ONE condition is true (generous)


        // Task: Check if the given number has three digits

        int x = 23489;

        if (x > 99 && x < 1000){
            System.out.println(x + " has three digits");
        }else {
            System.out.println(x + " doesn't have three digits");
        }



    }

}
