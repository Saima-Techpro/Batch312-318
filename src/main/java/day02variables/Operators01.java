package day02variables;

public class Operators01 {
    public static void main(String[] args) {

        //      COMPARISON OPERATORS

        /*
        They're mostly used in Conditional statements.
        EQUAL TO: '=='  => represents equality in JAVA
                  '=' is called ASSIGNMENT OPERATOR => takes the data from the right the side and assigns it to the left side (to the variable)

        NOT EQUAL TO: '!='  => represents not equal in JAVA
        myAge = 30; // assignment operator

        myAge == 30
        myAge != 30

        GREATER THAN:   '>'   => 9>5
        LESS THAN :     '<'   => 5<10

        GREATER THAN or EQUAL TO: '>='    =>  18>=16
        LESS THAN or EQUAL TO:    '<='    =>  14<=19

        //    MATHS OPERATIONS

        Addition: +
        Multiplication: *
        Subtraction: -
        Division: /

        // If there's parenthesis in the code line, the operation inside the parenthesis will be done first.
        // Multiplication / division operations have first priority
        // Addition / subtraction have the second priority

        16/4*(2+6) = 32

        30-4+6*9 = 80


        //     LOGICAL OPERATORS

        OR sign: '||' This is quite generous, used for filtration (at least one of the conditions should be fulfilled)
        AND sign: '&&' This is very strict, this is used for filtration (BOTH of the conditions should be fulfilled)

         */


       boolean b1 = true , b2 = true , b3 = false , b4 = 5>8 ;

        System.out.println(b1 || b2); // true
        System.out.println(b1 || b3); // true
        System.out.println(b1 && b2); // true
        System.out.println(b1 && b3); // false
        System.out.println(b1 && b4); // false


        // NOTE: OR operator || is quite relaxed => even if one condition is true, it returns true
        // AND operator &&  is very strict => ALL conditions have to be true if we want the result to be true

        boolean x = 10 > 5;
        System.out.println("x = " + x); // true
        boolean y = 2+4 != 6;
        System.out.println("y = " + y); // false

        boolean z = 3+4*2 >=20 ;
        System.out.println("z = " + z); // false

        System.out.println( x && y); // false
        System.out.println(x || y || z); // true


    }
}
