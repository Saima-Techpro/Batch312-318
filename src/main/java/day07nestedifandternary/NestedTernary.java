package day07nestedifandternary;

import java.util.Scanner;

public class NestedTernary {
    public static void main(String[] args) {

        /*
        Type code to check the name given by the user.
        Print the name if its length is greater than 3, and it contains "i"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name please");
        String name = scan.next();

        // ternary syntax => condition ? codes for true : codes for false ;
        // nested ternary syntax => condition ? (sub-condition ? codes for true : codes for false;)  : (false) ;
        // nested ternary syntax => condition ? (sub-condition ? codes for true : codes for false;)  : (sub-condition ? codes for true : codes for false;) ;

        System.out.println(name.length() > 3 ? (name.contains("i") ? name : "name doesn't contain i ") : ("name length is less than 3"));

        System.out.println("======= Task 2 ========");

        // Task 2:
        //   Type code that takes three integers a, b, and c as input and
        //   uses a ternary operator to find the smallest of the three numbers.

        System.out.println("Enter three numbers please");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


        int smallest = a < b ? (a < c ? a : c) : ( b < c ? b : c);

        System.out.println("smallest = " + smallest);


    }
}
