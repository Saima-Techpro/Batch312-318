package day22instanceblock_staticblock;

public class StaticBlock {
    /*
      - Static block is used to initialise static variables
    - Static variables are class property => reach out to those variables through class name

    - Static block runs once the class is loaded in the memory

    SYNTAX:
    static{
        codes go here
    }


    1. JVM: Makes the class ready to use for you.
    2. JVM prepares the class for you (class members are loaded) in this order normally:
             1) main method  2) methods and variables

    3. But sometimes we need some data to be available before we start the main method, in that case,
    we use "static block" even before the main method.
              1) static block   2) main method    3) methods and variables
                   see example of static block of pi.
    4. Rule: "static" structures can work with just static class members.
       Do not put non-static class members (methods or variables) into static methods. It will give error.
    5. "static block" can be used just with "static" variables (as defined in number 4.)
    6. "static block" is used to initialise (means assigning first value) "static variables"

    If there are multiple static blocks, Java follows top to bottom rule

     */

    public static double pi; // static variable
    // int age; //non-static variable

    // static block
    static {
        // System.out.println(age = 50); // error
        System.out.println(pi = 3.14);
        System.out.println("Static block is being executed!");
    }


    public StaticBlock(){
        System.out.println("This is default constructor!");
    }




    public static void main(String[] args) {

        System.out.println("This is the main method!");

        StaticBlock obj = new StaticBlock();


    }
}
