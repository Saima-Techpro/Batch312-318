package day10stringmanipulations;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class StringManipulation02 {
    public static void main(String[] args) {

//        String s = "";
//        System.out.println(s.isEmpty()); // true
//        System.out.println(s.isBlank()); // true
//
//        String str = " ";
//        System.out.println(str.length()); // 1
//
//        System.out.println(str.isEmpty()); // false => not empty => because space is a value in Strings
//        System.out.println(str.isBlank()); // true => because space is a value in Strings, but it is INVISIBLE value so isBlank() can't see it


        /*
          Example: Check the given password if it meets the following conditions:

        // it shouldn't be empty
        // it shouldn't contain just space characters, there must be other characters as well
        // it shouldn't contain starting and ending spaces

        NOTE: use isEmpty() or isBlank() method
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password please");

        String password = scan.nextLine();

        // it shouldn't be empty

        boolean firstCondition = password.isEmpty();

        if (firstCondition){
            System.out.println("Password should not be empty!");
        }


        // it shouldn't contain just space characters, there must be other characters as well

        boolean secondCondition = password.isBlank(); // if isBlank() returns true, it means there's space only
                                                      // if isBlank() returns false, it means there are characters other than space as well
        if (secondCondition){
            System.out.println("Password shouldn't be empty or contain just space!");
        }


        // it shouldn't contain starting and ending spaces

        boolean thirdCondition = password.trim().equals(password);
        System.out.println("thirdCondition = " + thirdCondition);


//        if (!thirdCondition){
//            System.out.println("Password shouldn't contain starting and ending spaces!");
//        }

        // OR

        if (thirdCondition){
            System.out.println("Password is valid");
        } else {
            System.out.println("Password shouldn't contain starting and ending spaces!");
        }

        System.out.println("========= 2nd way ========== ");

        // Another way:

        if (!password.isEmpty() && !password.isBlank() && !password.startsWith(" ") && !password.endsWith(" ")){
            System.out.println("Password is valid!");
        }else {
            System.out.println("Password is NOT valid!");
        }



    }
}
