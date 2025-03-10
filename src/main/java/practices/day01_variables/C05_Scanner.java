package practices.day01_variables;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //TASK: Calculate the volume of a rectangular prism. Take the short edge, long edge and the
        //height from the user.

        //V = S * L * h;

        //Step 1: Create a scanner object.
        Scanner input = new Scanner(System.in);
        /*
        //Step 2: Inform the user about the operation.
        System.out.println("Please enter the length of the short edge of your rectangular prism:");

        //Step 3: Take the value and assign it to a variable.
        double shortEdge = input.nextDouble();
        input.nextLine();

        //Step 4: Repeat for the remaining information.

        System.out.println("Please enter the length of the long edge of your rectangular prism:");

        double longEdge = input.nextDouble();
        input.nextLine();

        System.out.println("Please enter the height of your rectangular prism:");

        double height = input.nextDouble();
        input.nextLine();

        //Step 5: Calculate the volume using formula given above, and print the volume.
        System.out.println("Volume of your rectangular prism: " + shortEdge * longEdge * height);
        */

        //Second way:

        System.out.println("Please enter the dimensions in this format: ShortEdge LongEdge Height");

        double shortEdge = input.nextDouble();
        double longEdge = input.nextDouble();
        double height = input.nextDouble();

        System.out.println("Volume of your rectangular prism: " + shortEdge * longEdge * height);

    }
}
