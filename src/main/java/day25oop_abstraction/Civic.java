package day25oop_abstraction;

public class Civic extends Honda{

    @Override
    public void engine() {
        System.out.println("Civic engine size is 1.8");
    }

    /*
    If there's a parent-child  relationship between a "regular / concrete" class and an "abstract" class,
    the child class will show error UNTIL and UNLESS the abstract method is implemented.
    So, the implementation of abstract method is MANDATORY.
    */

    @Override
    public void music() {
        System.out.println("Civic music system is awesome!");
    }
}


