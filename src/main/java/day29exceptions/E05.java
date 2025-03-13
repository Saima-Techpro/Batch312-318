package day29exceptions;

public class E05 {
    public static void main(String[] args) {
        /*
        Can we use more than one catch blocks?
        Yes, we can.

        We can use as many catch blocks as we want after try block. The order doesn't matter.
        Whatever issue is faced in the try block, the relevant catch block will be executed.
         */

        // Get a specific character from a given String

        String st= "Java is easy.";
        System.out.println(st.length()); //13
        int a = 40;
        int b = 2;

        // Method call
        getChar(st, a, b);

        System.out.println("===================");

        getCharFromString(st, 20, 0);
        System.out.println("===================");
        getCharFromString(st, 20, 1);

    }


    // Using multiple catch blocks
    public static void getChar(String s , int a, int b){
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println("ch = " + ch);
        }catch (StringIndexOutOfBoundsException w){
            System.out.println("Index can't be greater than the length of the string.");
        }catch (ArithmeticException e){
            System.out.println("Division by zero is not possible");
        }
    }


    // Using parent Exception class to handle ALL types of exceptions

    public static void getCharFromString(String s , int a, int b){
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println("ch = " + ch);
        }catch (Exception e){
            System.out.println("Index can't be greater than the length of the string.");
            System.out.println("Division by zero is not possible");
            System.out.println(e.getMessage());
            System.out.println("This is the parent class taking care of ALL types of exceptions.");
        }
    }





}
