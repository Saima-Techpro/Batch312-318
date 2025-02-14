package day13loops;

import java.util.Scanner;

public class WhileLoop03 {
    public static void main(String[] args) {

       /*
       Create a multiplication table using the number given by user.

       4 x 1 = 4
       4 x 2 = 8
       4 x 3 = 12
       4 x 4 = 16
       .....
       4 x 10 = 40

        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to create a multiplication table");

        int number = scanner.nextInt();

        int i = 1; // starting value

        int result = 1;

        while (i < 11){
            if (number < 0 || number > 10){
                System.out.println("PLease enter a number between 1 and 10 only");
                break;
            }
           result =  i * number;
            System.out.println(number + " x " + i + " = " + result );
            i++;

        }

        System.out.println(" ===== Elyas' solution =======");
        int j = 1;

        while (j < 11){

            if (number < 0 || number > 10){
                System.out.println("PLease enter a number between 1 and 10 only");
                break;
            }

            int  result1 = j * number;
            System.out.println(number + " x " + j + " = " + result1 );
            j++;
        }


    }
}
