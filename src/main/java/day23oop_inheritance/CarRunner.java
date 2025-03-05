package day23oop_inheritance;

public class CarRunner {
    public static void main(String[] args) {

        System.out.println(" ======== First object ========");

        Car car1 = new Car(); // Car is the data type and Car() is the constructor.  Constructor is the active side
        System.out.println(car1.model);
        System.out.println(car1.year);

        System.out.println(" ======== Second object ========");

        Car car2 = new Honda();
        System.out.println(car2.model);
        System.out.println(car2.year);
        // car2.torque => shows error because car2 is created by calling Car class
        // Java doesn't allow parent (Car) to use any feature from child class (Honda)

        System.out.println(" ======== Third object ========");
        Honda car3 = new Honda();
        System.out.println(car1.model);
        System.out.println(car3.torque);
        System.out.println(car3.year);

        System.out.println(" ======== Fourth object ========");

        Vehicle car4 = new Vehicle();

        Vehicle car5 = new Car();

        Vehicle car6 = new Honda();

        /*
         NOTES ABOUT "super()" and "super" keyword

            1)"super" keyword is used to get data(variables + methods) from parent classes in inheritance

            2)If there is no data in parent, Java looks for the data in grandparents
              If no parent has the data, Java gives Compile Time Error.

            3)"super()" must be the first statement in the constructor body, but "super" can be in any line

            4)"super()" is for calling "constructors" from parent class, "super" is for calling variables and methods
              from the parent class

            5)"this" is used to call data from the class itself.
               When you use "this", it means you are telling Java "do not go to the parent, stay in this class"


           Why make a super call?

        1) If you use the super keyword, you can call the method of the parent class and also modify the behaviour
            of this method according to the needs of the child class.
        2) The extends keyword only allows inheritance, but does not modify the methods of the parent class


         */






    }
}
