package day25oop_abstraction;

public abstract class Honda {

    public void music(){ // regular method , concrete method, normal method => because it is a method which has its body
        System.out.println("Pro music system from Honda class...");
    }


    public abstract void engine();
    // This is an abstract method => method without body
    // abstract method is considered incomplete method
    // It must be completed by the child class that extends to this parent class

    // NOTE: A concrete class can NOT have abstract methods
    // But an abstract class can have concrete as well as abstract methods

}
