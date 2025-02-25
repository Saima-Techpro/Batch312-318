package day19methodcreation_overloading;

import static day19methodcreation_overloading.MethodCreation01.add;
import static day19methodcreation_overloading.MethodCreation02.printText;
import static day19methodcreation_overloading.MethodCreation02.subtract;
//import static day19methodcreation_overloading.MethodCreation02.addAndMultiply;

public class Runner {
    public static void main(String[] args) {

        // Method call for static members => by className OR by importing

        System.out.println("add = " + add(5, 6)); // by importing

        System.out.println("multiply: " + MethodCreation02.multiply(4, 5, 2)); // calling by className

        // addAndMultiply(); private method... can't be called here
        printText("Java is driving me crazy!!");
        System.out.println("subtract = " + subtract(8, 2));


        // Method call for non-static members => by object creation
        MethodCreation02 md = new MethodCreation02();
        System.out.println("divide: " + md.divide(6, 2));

        // NOTE: non-static members belong to objects; static members belong to classes directly

    }
}
