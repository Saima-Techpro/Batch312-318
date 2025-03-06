package day25oop_interface;

public interface Brake {

    void esp(int a);
    void run();


    // Can we create concrete methods in Interface?
    // YES, but we have to insist to Java to do that by using keywords "static"  or "default"

    public static void speed() { // static is just a keyword telling Java to create concrete method in an Interface
        System.out.println("180km per hour ... ");
    }

    public default void power() { // default here is NOT an access modifier; it's just a keyword telling Java to create concrete method in an Interface
        System.out.println("Concrete method using default keyword.. ");
        log();
    }

    // Can we create private method in an interface?
    // YES

    private void log() {
        System.out.println("Private log method is executed ... ");
    }








}
