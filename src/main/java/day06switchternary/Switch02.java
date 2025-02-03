package day06switchternary;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

       // Task: When user enters the number of a month, print the name of that month
       // and ALL the months after that.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of the month");
        byte monthNumber = scan.nextByte();

        switch (monthNumber){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;  // only here because we don't want the default message printed as well in case of valid entry
            default:
                System.out.println("Provide a valid number of month!");
                System.out.println("There is no "+monthNumber+ "th number of month in a year");
        }


    }
}
