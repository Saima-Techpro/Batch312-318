package day05ifstatements;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

       // Ask user to give the number of the day and check what day is it.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number of the day");
        byte numOfDay = scan.nextByte();

        // 1st way:

        if (numOfDay == 1){
            System.out.println("Monday");
        } else if (numOfDay == 2) {
            System.out.println("Tuesday");
        } else if (numOfDay == 3) {
            System.out.println("Wednesday");
        } else if (numOfDay == 4) {
            System.out.println("Thursday");
        } else if (numOfDay == 5) {
            System.out.println("Friday");
        } else if (numOfDay == 6) {
            System.out.println("Saturday");
        } else if (numOfDay == 7){
            System.out.println("Sunday");
        }else {
            System.out.println("Invalid number for the days of the week! Please provide a valid number");
        }

        System.out.println("====== 2nd way =========");
        // 2nd way:

        if (numOfDay < 1 || numOfDay > 7){
            System.out.println("Invalid number for the days of the week!");
        } else if (numOfDay == 1){
            System.out.println("Monday");
        } else if (numOfDay == 2) {
            System.out.println("Tuesday");
        } else if (numOfDay == 3) {
            System.out.println("Wednesday");
        } else if (numOfDay == 4) {
            System.out.println("Thursday");
        } else if (numOfDay == 5) {
            System.out.println("Friday");
        } else if (numOfDay == 6) {
            System.out.println("Saturday");
        } else if (numOfDay == 7){
            System.out.println("Sunday");
        }



    }
}
