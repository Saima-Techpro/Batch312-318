package day24oop_polymorphism;

public class Dog extends Mammal{


    public void bark(){
        System.out.println("Dogs bark when it rains... ");
    }

    @Override
    public void eat() {
        System.out.println("Dogs eat meat.");
    }

    @Override
    public void drink() {
        System.out.println("Dogs drink water too");
    }

    @Override
    public void feed() {
        System.out.println("Dogs also drink milk.");
    }

    @Override
    public Animal create() {
        System.out.println("Inheritance allows dog object to override this method and create a new dog object");
        return new Dog();
    }


    // let's try to override the methods that have return types


    @Override
    public int add(int a, int b) {
        return (a + b);
    }

//    @Override
//    public Number multiply(int a, int b) {
//        return (a * b);
//    }

    @Override
    public Integer multiply(int a, int b) {
        return (a * b);
    }
}
