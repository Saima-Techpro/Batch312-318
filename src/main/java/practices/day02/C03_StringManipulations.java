package practices.day02;

import java.util.Scanner;

public class C03_StringManipulations {
    public static void main(String[] args) {
        //TASK: Ask the user their email address.
        //If the email does not contain @gmail.com -> print “Please enter a Gmail address.”
        //If the email ends with @gmail.com -> Success message
        //If the email does not end with @gmail.com -> print “Please check your email for typos.”
        //HW: If the email has a space in it, print an error message.

        //STEP 1: Create a Scanner
        Scanner input = new Scanner(System.in);

        //STEP 2: Inform the user about the operation.
        System.out.println("Please enter your email address.");

        //STEP 3: Take the input from the user and assign it to a String.
        String email = input.nextLine();

        //STEP 4: Evaluate.

        /*if (!email.contains("@gmail.com")){
            System.out.println("Please enter a Gmail address.");
        }else if (email.contains(" ")){
            System.out.println("Please check your email for typos.");
        }else if (email.split("@")[0].length()==0){
            System.out.println("Please check your email for typos.");
        }else if (email.endsWith("@gmail.com")) {
            System.out.println("Your email address is saved!");
        }else {
            System.out.println("Please check your email for typos.");
        }*/

        if (email.contains("@gmail.com")){
            if (email.endsWith("@gmail.com")){
                //hw another if
                if (!email.split("@")[0].isEmpty()){
                    if (!email.contains(" ")){
                        System.out.println("Your email address is saved!");
                    }else {
                        System.out.println("Please check your email for typos.");
                    }
                }else{
                    System.out.println("Please check your email for typos.");
                }
            }else {
                System.out.println("Please check your email for typos.");
            }
        }else {
            System.out.println("Please enter a Gmail address.");
        }

    }
}
