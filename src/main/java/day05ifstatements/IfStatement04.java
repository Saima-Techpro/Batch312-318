package day05ifstatements;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {

        // Check the name of the weekday given by user and print 'weekday' or 'weekend' on the console

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day of the week ");

        String dayName = scanner.nextLine();

        // 1st way:

        if (dayName.equalsIgnoreCase("Monday")){
            System.out.println("Weekday");
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println("Weekday");
        } else if (dayName.equalsIgnoreCase("wednesday")) {
            System.out.println("Weekday");
        } else if (dayName.equalsIgnoreCase("thursday")) {
            System.out.println("Weekday");
        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Weekday");
        }else if (dayName.equalsIgnoreCase("Saturday")){
            System.out.println("Weekend");
        } else if (dayName.equalsIgnoreCase("sunday")) {
            System.out.println("Weekend");
        }else {
            System.out.println("Invalid name of the day!!");
        }

        // 2nd way:
        if (dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday")){
            System.out.println("Weekend");
        } else if (dayName.equalsIgnoreCase("Monday")){
            System.out.println("Weekday");
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println("Weekday");
        } else if (dayName.equalsIgnoreCase("wednesday")) {
            System.out.println("Weekday");
        } else if (dayName.equalsIgnoreCase("thursday")) {
            System.out.println("Weekday");
        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Weekday");
        }else {
            System.out.println("Invalid name of the day!!");
        }


        // 3rd way:
        if (dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday")){
            System.out.println("Weekend");
        } else if (dayName.equalsIgnoreCase("Monday") ||
                dayName.equalsIgnoreCase("tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") ||
                dayName.equalsIgnoreCase("thursday") ||
                dayName.equalsIgnoreCase("Friday")){
            System.out.println("Weekday");
        }else {
            System.out.println("Invalid name of the day!!");
        }

        // 4th way:

        boolean weekendCondition = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

        boolean weekdayCondition = dayName.equalsIgnoreCase("Monday") ||
                dayName.equalsIgnoreCase("tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") ||
                dayName.equalsIgnoreCase("thursday") ||
                dayName.equalsIgnoreCase("Friday");

        if (weekdayCondition){
            System.out.println("Weekday");
        }else if (weekendCondition){
            System.out.println("Weekend");
        }else {
            System.out.println("Invalid name of the day!!");
        }





    }
}
