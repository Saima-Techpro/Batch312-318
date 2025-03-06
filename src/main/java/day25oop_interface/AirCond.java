package day25oop_interface;

public interface AirCond {
    // Any variable /method in an interface is 'public' by default
    // Any variable /method in an interface is 'abstract' by default

    // abstract methods
     void digital();
     void run();


     // Can we create variables in an interface?
    // Yes
    // By default, variables in interface are "public static final"
    // Variables must be initialised in interface.

    public static final int price = 2000;

        /*
    in Java interfaces, all variables must be initialized at the time of declaration. This is because variables in an interface are implicitly:
    public – Accessible to all classes.
    static – Belong to the interface, not to individual instances.
    final – Their value cannot be changed once assigned.
     */




}
