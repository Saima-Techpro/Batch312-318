package practices.day07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C07_Errors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age:");
        try {
            byte age = input.nextByte();
            input.nextLine(); //clears the input buffer

            System.out.println(10 / age);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide a number by 0. It will be infinity.");
        } catch (Exception e){
            System.out.println("Something went wrong!");
        } finally {
            System.out.println("This is the finally block");
        }


        System.out.println("is the app running?");
    }
}
