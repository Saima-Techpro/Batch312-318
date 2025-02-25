package day19methodcreation_overloading;

import java.util.ArrayList;
import java.util.List;

public class MethodCreation02 {
    public static void main(String[] args) {

            /*
                   ACCESS MODIFIERS IN JAVA
            1) public - NO RESTRICTION AT ALL - everyone can access within the project
            2) protected - accessible within package
                           also accessible to specific members which are related (through inheritance)
            3) default - accessible within the same package (package private)
                         it's less restrictive than private, but more than public and protected
            4) private - accessible ONLY within the class
         */


        // Method call
        System.out.println("multiply= " + multiply(3, 4, 7)); // 84

        System.out.println("addAndMultiply = " + addAndMultiply(2, 5, 8));

        printText("Java");
        System.out.println("subtract= " + subtract(4, 2));

        // Method call for non-static method
        // divide(8, 4); // trying to call this method by importing
        // MethodCreation02.divide(10, 5); // trying to call this method by class name

        // NOTE: static members belong to class (class property)
        //     non-static members belong to objects (object property)

        MethodCreation02 md = new MethodCreation02(); // objected created by us
        System.out.println("divide= " + md.divide(6, 3)); // now we can call this non-static member using the object


        /*
        Objects provided
        String str = new String();
        ArrayList arr = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
         */


    }

    // Create a method to multiply 3 numbers
    public static int multiply(int a, int b, int c){
//        int result = a*b*c; // local variable/instance
//        return result;
        return a*b*c;
    }


    // Create a method with 3 parameter. Multiply two and add the third
    private static int addAndMultiply(int a, int b, int c) {
        return a*b+c;
    }

    // Create a method to print the given text
    protected static void printText(String str){
        System.out.println(str);
    }
    /*
    protected access modifier
    - works in the same class
    - works in another class within the same package
    - doesn't work in another class in another package if there's NO relationship.
    - will work in another class in another package if there IS a relationship. (will learn later)

     */

    // Create a method to subtract 2 integers
    // this method has 'default' access modifier by default
    static int subtract(int a , int b) {
        return a- b ;
    }

     /*
    default access modifier
    - works in the same class
    - works in another class within the same package
    - doesn't work in ANYWHERE OUTSIDE THE PACKAGE -> package private
     */

    // NON-STATIC Method
    public int divide(int a , int b){
        return a/b;
    }








}
