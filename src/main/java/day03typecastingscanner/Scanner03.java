package day03typecastingscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //String name = "               John      ";
        //System.out.println(name.trim());

        //System.out.println(name.isEmpty());

        /*

                Get the full name of the user,
                check if the input is empty,
                if so, make user enter their name again.

         */

        /*

                HW:
                    - If the name is in fact empty,
                    print "Your name cannot be empty" to the console.
                    And ask for an input again.

         */

        Scanner sc = new Scanner(System.in);
        String fullName = "";

        do{

            System.out.println("Please enter your full name: ");
            fullName = sc.nextLine();

        }while(fullName.trim().isEmpty());

        System.out.println("Your full name is: " + fullName);

    }
}