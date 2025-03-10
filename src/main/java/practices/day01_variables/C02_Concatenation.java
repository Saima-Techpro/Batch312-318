package practices.day01_variables;

public class C02_Concatenation {
    public static void main(String[] args) {

        // In Java, the "+" symbol performs addition when used between two numbers.
        // In Java, the "+" symbol performs "concatenation" when used between two Strings or a String and a number.
        // "Concatenation" operation merges values.
        // Note: In concatenation operations, Java follows the mathematical order of operations.
        // Java always processes instructions from top to bottom and left to right.

         /*
            Mathematical order of operations:
            1) Operations inside parentheses are performed first.
            2) Exponentiation operations are performed.
            3) Multiplication and division operations are performed.
            4) Addition and subtraction operations are performed.
            5) If operations have the same priority, they are executed from left to right in order.
         */

        //TASK 1: Make a sentence with these variables:
        String variable1 = "Bob, ";

        char variable2 = '?';

        String variable3 = "can you ";

        String variable4 = "to me ";

        String variable5 = "throw the ball ";

        String variable6 = " times please";

        int variable7 = 5;

        //System.out.println(variable1 + variable3 + variable5 + variable4 + variable7*2 + variable6 + variable2);
        //System.out.println(variable1 + variable3 + variable5 + variable4 + (variable7 + variable7) + variable6 + variable2);
        System.out.println(variable1 + variable3 + variable5 + variable4 + variable7 + variable7 + variable6 + variable2);



    }
}
