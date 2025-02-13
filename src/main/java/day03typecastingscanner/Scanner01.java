package day03typecastingscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

         /*

            ******** Scanner Class ********
            - Scanner class is used to get the input(values) from the user.
            - Why do we need it?
            - Every application needs to interact with the users and need their credentials/PIN to allow them into their accounts.
              (ATM, Banking, E-commerce, School accounts, Calculators)
            - User inputs (provides) their data (values) and that goes into the application database.
            - Once verified, the app allows the user to use the app.


            - How do we get the data from the user?
            Step 1: Create an object from Scanner class
                    Type Scanner word, it will be red. Hover over it, it will show java.util, select that option
                    Scanner class will be imported from java.util library

                    Scanner Object
                    ClassName    objectName Assignment Operator 'new' keyword Constructor(with parameters)

            Step 2: Give a message to the user about the data / input that you want to get
            Step 3: Store the data provided by the user



         */

        // 1st: Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        // 2nd: Get input from the user
        System.out.println("Enter an age: ");
        byte age = sc.nextByte();

        System.out.println("Age: "+age);


    }
}