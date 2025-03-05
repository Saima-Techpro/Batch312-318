package day24oop_polymorphism;

public class Cat extends Mammal{

    public void meow(){
        System.out.println("Cats love to meow... ");
    }

    // We can change the implementation of the methods coming from the parent
    // by using @Override annotation and make it specific for the child class
    // But it is not mandatory.

    @Override
     public void feed(){
        System.out.println("Cats can't live without milk... ");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat fish.");
    }

    @Override
    public void drink() {
        System.out.println("Cats don't drink fizzy drinks.");
    }

    @Override
    public Animal create() {
        System.out.println("Inheritance allows cat object to override this method and create a new cat object");
        return new Cat();
    }
}
