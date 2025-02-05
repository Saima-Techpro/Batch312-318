package day07nestedifandternary;

import java.util.Scanner;

public class HW_TriangleType {
    public static void main(String[] args) {
        /*
        Type code that takes three integers a, b, and c as the sides of a triangle and
        uses NESTED TERNARY operators to determine the type of triangle:

If all three sides are equal: "Equilateral".
If two sides are equal: "Isosceles".
If no sides are equal: "Scalene".
If the three sides do not form a valid triangle (i.e., violate the triangle inequality theorem), output: "Not a Triangle".
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three sides of a triangle");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Check if it forms a valid triangle, then determine the type

        // Using NESTED IF

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Not a Triangle");
        }




        // Using NESTED TERNARY
        String triangleType = (a + b > c && a + c > b && b + c > a) ? (a == b && b == c)  ? "Equilateral" :
                (a == b || b == c || a == c) ? "Isosceles" : "Scalene" : "Not a Triangle";

        System.out.println("The triangle with sides " + a + ", " + b + ", and " + c + " is: " + triangleType);


    }
}
