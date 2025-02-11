package day10stringmanipulations;

import java.util.Scanner;

public class StringManipulation01 {
    public static void main(String[] args) {

        /*
        Task: Convert all the digits into "*" in a card number except last 4 digits.
                //  1234 6789 1234 6789 ==> **** **** **** 6789
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your card number");
        String cardNum = scan.nextLine();

        String firstPart = cardNum.substring(0, 15).replaceAll("[0-9]", "*");
        //System.out.println("firstPart = " + firstPart);

        String secondPart= cardNum.substring(15);
        //System.out.println("secondPart = " + secondPart);

        /*
        NOTE:
        We need to make sure that we have a space between firstPart and secondPart of the cardNum.
        if we use String firstPart = cardNum.substring(0, 14), this will not include space => 1234 6789 1234
        In that case, we must use String secondPart= cardNum.substring(14); so that we can get space in the
        secondPart of the cardNum. Because in substring(14), the value of the the given index is inclusive, hence
        we get the space.
         */

        String result = firstPart + secondPart ;
        System.out.println("The card ending: " + result);
        System.out.println("The card ending: " + firstPart.concat(secondPart));

        // 2nd way:
        System.out.println(cardNum.length()); // 19
        // cardNum.length()-4 => 15

        String lastFourDigits = cardNum.substring(cardNum.length()-4);
        String firstPart2 = cardNum.substring(0, cardNum.length()-4).replaceAll("[0-9]", "*");
        System.out.println(firstPart2 + lastFourDigits);
    }
}