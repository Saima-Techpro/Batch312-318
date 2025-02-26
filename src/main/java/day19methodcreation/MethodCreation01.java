package day19methodcreation;

import static day19methodcreation.MethodCreation02.printText;
import static day19methodcreation.MethodCreation02.subtract;

public class MethodCreation01 {

    public static void main(String[] args) {

        /*
        Main method is the engine in Java.
        Java provides us MANY from its libraries, so we can use them.
        Example: Math.min(), subString(), charAt(), trim(), equals() etc.

        Can we create our own method?
        Of course YES.

        * We can create our own CUSTOMISED methods according to our needs / tasks *
        * We can use loops, if statements, switch, ternary etc. provided by Java in our CUSTOMISED methods

        RULES:
        1. We can't create method inside the main method
        2. We create methods OUTSIDE the main method, then we call them in the main method => Method Call

        SYNTAX:

        accessModifier static(optional) returnType/void  methodName( parameters (optional)){

           // method body

          NOTE: if we have have returnType in the method level, we need to add 'return' keyword
          inside the method body

        }

        add(int a, int b); =>  add is the name of the method
                           => int a, int b are the parameters
                           => together they're called "method signature"



         */

        // Method Call

        System.out.println("addition: " + add(3, 4));
        System.out.println("addition: " + add(5, 8));
        System.out.println("addition: " + add(2, 9));

        // method calls from MethodCreation02 class

        // addAndMultiply();  This method is in MethodCreation02 class and
        // has 'private' access modifier, so we can't call it in this class.

        printText("Testing protected access modifier. It works in another class within the same package.");

        System.out.println("subtract: " + subtract(6, 3));

    }

    // Create a method to add two integers

    public static int add(int a , int b){
//        int result = a + b;
//        return result;
        return a + b ;
    }



}
