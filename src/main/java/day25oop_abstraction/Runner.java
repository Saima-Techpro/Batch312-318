package day25oop_abstraction;

public class Runner {
    public static void main(String[] args) {

       // Honda honda = new Honda(); // We can NOT create object from an abstract class


        // So how do we access the methods from "abstract class"?
        // Through its child classes

        Civic civic = new Civic();
        civic.engine();
        civic.music();
        System.out.println("========== Second object ===========");
        Accord accord = new Accord();
        accord.engine();
        accord.music();

        // accord.brake();
        // shows Compile Time Error (CTE) because Java can't see brake() method in Accord class
        // when Java goes to super class (Honda), it can't see brake() there either. So it shows error.


//        AbstractChild abstractChild = new AbstractChild();
//        We can't use Abstract Class for object creation






    }
}
