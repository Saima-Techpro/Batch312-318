package day14loops_arrays;

import java.util.Scanner;

public class Loop01 {
    public static void main(String[] args) {

        /*
        Accept input from user:

    1.	If password and username are correct: print "Welcome to your account"
    2.	If username and password are incorrect; print 4 times "Enter your username and password"
    3.	If username and password are incorrect fifth time as well, print "Account is blocked"

    	Valid credentials => username= "admin"    password= "pwd123"

         */

        Scanner scan = new Scanner(System.in);

        String userName;
        String password;

        int numbOfTries= 0;
        int maxTries= 5;

        do {

            System.out.println("Enter your username");
            userName = scan.next();

            System.out.println("Enter your password");
            password = scan.next();

            numbOfTries ++;

            if (userName.equals("admin") && password.equals("pwd123")){
                System.out.println("Welcome to your account!");
                // User should be able to see/perform any actions that they want

                break;
            }else {
                if (numbOfTries == maxTries){
                    System.out.println("You provided invalid credentials 5 times! So your account is blocked!");
                    break;
                }else {
                    System.out.println("Username or password don't match. Please provide valid credentials.");
                    System.out.println("Warning: Invalid credentials. Attempts remaining:  "+ (maxTries - numbOfTries));
                }

            }

        }while (true);



        System.out.println("====== Elyas' solution  ========");

        // Elyas' solution
        int NumTry = 5;

        do {
            System.out.println("Enter your username please!");
            String name = scan.next();
            System.out.println("Enter your password!");
            String passWord = scan.next();
            NumTry--;

            if (name.equals("admin") && passWord.equals("pwd123")){
                System.out.println("Welcome to your account!");

            }else {
                System.out.println("Wrong password or username" + "you can try "+(NumTry)+" more times.");
            }


        }while (NumTry > 0);

        if (NumTry == 0) {
            System.out.println("Your account is blocked!!!");

        }












    }
}
