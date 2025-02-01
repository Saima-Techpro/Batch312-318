package day03typecastingscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        /*

                Get the information below from the user:
                    - Name and Surname
                    - Age
                    - Height
                    - Weight
                    - Job

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scan.nextLine(); // John Wayne

        System.out.println("How old are you?");
        byte age = scan.nextByte();

        System.out.println("How tall are you?"); // 1.79
        double height = scan.nextDouble();

        System.out.println("What's your weight?");
        short weight = scan.nextShort();

        System.out.println("What's your job?");
        String job = scan.next(); // Software Developer --> Software

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
        System.out.println("Job: "+job);


    }
}
