package day04wrapper_increment_decrement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        // Ask the user to provide width, length and height of a rectangular prism.
        // Then calculate its total area.
        // HINT: formula for rectangular prism  =>    A=2(wl+hl+hw)
        // OR (2*w*l) + (2*h*l) + (2*w*h)

        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide width, length and height of a rectangular prism");
        double width = scan.nextDouble();
        double length = scan.nextDouble();
        double height = scan.nextDouble();

        double area = (2*width*length) + (2*height*length) + (2*width*height) ;
        System.out.println("area of a rectangular prism= " + area);


    }
}
