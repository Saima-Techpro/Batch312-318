package day07nestedifandternary;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {

      /*
      Use nested If Statement and nested Ternary both

     Type code to check the password
     If it has more than 8 characters, initial should be 'i'
     If it has no more than 8 characters initial should be 'K'

     Hint: length() method is used to count the length of a String

       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password please");

        String password = scan.next();

        if (password.isEmpty()){  // like password.length() < 1
            System.out.println("Password can't be empty");

        } else if (password.length() > 8){ // primary condition : more than 8 characters

            if (password.charAt(0) == 'i'){ // secondary condition: initial should be 'i'
                //charAt(0) returns single character at first index => the initial
                System.out.println("Valid password");
            }else {
                System.out.println("Invalid password");
            }

        }else if (password.length() < 8){

            if (password.charAt(0) == 'K'){
                System.out.println("Valid password");
            }else {
                System.out.println("Invalid password");
            }

        }else {
            System.out.println("Invalid password");

        }

        System.out.println("==========================");
        // Nested Ternary

        System.out.println( (password.length() < 1) ? "Password can't be empty" : (password.length() > 8) ? ((password.charAt(0) == 'i') ? "Valid password" : "Invalid password") : ((password.length() < 8) ? ((password.charAt(0) == 'K') ? "Valid Password" : "Invalid password") : "Invalid password"));

        // NOTE: USE NESTED STRUCTURES ONLY OF NEEDED because they slow down the programme, and they're less readable and modifiable

    }
}
