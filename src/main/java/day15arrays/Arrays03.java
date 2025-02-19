package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {

        // Create an array to store names of students  => classRegister
        // Ask user to enter the names
        // Use loops to get the names from the user
        // Print all the names of the students on the console
        // Print any specific name from the class register


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students you want to register");
        int stdNumb = scan.nextInt();


        String[] classRegister = new String[stdNumb];
        System.out.println(Arrays.toString(classRegister)); // [null, null, null, null, null]

//
//        System.out.println("Enter first name ");
//        classRegister[0]  = scan.next();
//
//        System.out.println("Enter second name ");
//        classRegister[1]  = scan.next();
//
//        System.out.println("Enter third name ");
//        classRegister[2]  = scan.next();

         // To avoid repetition, we use loop

        for (int i = 0; i < stdNumb; i++){

            System.out.println("Enter "+(i+1)+" name of the student. To stop, enter Q");

            String stdName = scan.next();

            if (!stdName.equalsIgnoreCase("Q")){

               classRegister[i] = stdName;

            }else {
                break;
            }


        }
        System.out.println(Arrays.toString(classRegister));

        // Print any specific name from the class register
        System.out.println(classRegister[2]);


        // Alperen's solution
        String[] students = new String[stdNumb];

        for (int i=0; i< students.length; i++){
            System.out.println("please enter "+(i+1)+". name");
            students[i] = scan.next();
        }
        System.out.println(Arrays.toString(students));

        System.out.print("Enter the name you want to find: ");
        String searchName = scan.next();


        boolean found = false;

        for (String w: students) {

            if (w.equalsIgnoreCase(searchName)) {
                System.out.println("The name " + searchName + " is found ");
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println("The name " + searchName + " is not in the class register.");
        }


    }
}
