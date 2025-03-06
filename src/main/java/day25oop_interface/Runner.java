package day25oop_interface;

public class Runner {
    public static void main(String[] args) {

       // Can we create objects from an Interface?
       // No
       // Brake brakeObj = new Brake();  Object creation is NOT possible
       // Interfaces DO NOT have CONSTRUCTORS.

        // So we access methods through object created by their child classes

        Audi5 audi5 = new Audi5();
        audi5.esp(20);
//        ((Brake) audi5).run(); // for brake
        audi5.digital();
//        ((AirCond) audi5).run(); // for air condition
        audi5.turbo();
//        ((Engine)audi5).run(); // for engine

        // We can deal with this issue through type casting, clearly telling audi5 object which run() should be used

        audi5.power();
        System.out.println("============== Second object ===========");

        Toyota toyota = new Toyota();
        toyota.digital();
        toyota.eco();
        toyota.esp(100);


        // Call the concrete methods

        // by the interface name if the concrete method was created using 'static' keyword
        Brake.speed();

        // by object if the concrete method was created using 'default' keyword
        toyota.power();

        System.out.println(Engine.price); // 3500
//        Engine.price = 4000; CTE=> final variable can't be updated
        System.out.println(AirCond.price); // 2000
//        AirCond.price = 3000; CTE=> final variable can't be updated


    }
}
