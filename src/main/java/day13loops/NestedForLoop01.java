package day13loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {

        /*
        for(startingValue; condition to break the loop; increment/decrement){

           for(startingValue; condition to break the loop; increment/decrement){
           loop body
            }

        }
         */

         /*
        Example: Type the code to print following pattern:
        Week: 1
            Day: 1
            Day: 2
            Day: 3
            ....
        Week: 2
            Day: 1
            Day: 2
            Day: 3
            ....
         Week: 3
            Day: 1
            Day: 2
            Day: 3
            ....

         */


        for (int i = 1; i< 5; i++){
            System.out.println("Week: " + i);

            for( int k = 1; k < 8; k++){
                System.out.println("   Day: " + k);
            }

        }
        /*
        Task: Print the following pattern on the console:
                    * * * *
                    * * * *
                    * * * *
                    * * * *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows please" );
        int rows = scan.nextInt(); // 4

        System.out.println("Enter the number of columns please" );
        int columns = scan.nextInt();

        for (int i = 0; i < rows; i++){

            for (int j = 0; j < columns; j++){
                System.out.print("* ");
            }

            System.out.println(); // This is used to send the cursor on to the next line on the console
        }













    }
}
