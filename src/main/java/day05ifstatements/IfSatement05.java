package day05ifstatements;

import java.util.Scanner;

public class IfSatement05 {
    public static void main(String[] args) {

        // Based on the age entered by the user, print one of the following messages:
        // 0-4 => infant
        // 5-12 => child
        // 13-20 => teen
        // 21-40 => adult
        // 41+  => middle age
        // Also include "invalid age" message

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your age ");

        int age = scan.nextInt();

        // Yunus' solution:

        if (age <= 0 || age >=65 ){
            System.out.println("Invalid age. Please enter an age above zero or below 65");
        } else if (age >=1 && age <= 4) {
            System.out.println("You are Infant");
        } else if (age >=5 && age <= 12) {
            System.out.println("You are Child");
        } else if (age >= 13 && age <=20) {
            System.out.println("You are teen");
        }else if (age >= 21 && age <=40) {
            System.out.println("You are Adult");
        } else if (age >= 41 && age <= 65) {
            System.out.println("You are Middle age");
        }

        System.out.println("========== Cahit's solution ==========");
        // Cahit's solution
        System.out.println("Please enter your age");
        int a= scan.nextInt();

        if (a <= 0 || a >=65 ) {
            System.out.println("Invalid age. Please enter an age above zero or below 65");
        } else if (a <= 4){
            System.out.println("infant");
        }else if ( a<=12){
            System.out.println("children");
        }else if (a<=20){
            System.out.println("teen");
        }else if (a<=40){
            System.out.println("adult");
        } else {
            System.out.println("middle age");
        }

        System.out.println("======= Çiğdem's solution ========");
        // Çiğdem's solution

        if (a <= 0 || a >=65 ) {
            System.out.println("Invalid age. Please enter an age above zero or below 65");
        }else if(age>=0 && age<=4){
            System.out.println("İnfant");
        } else if(age>=5 && age<=12){
            System.out.println("Child");
        } else if(age>=13 && age<=20){
            System.out.println("Teen");
        } else if(age>=21 && age<=40){
            System.out.println("Adult");
        }else if(age>=41){
            System.out.println("Middle age");
        }



    }
}
