package day25oop_abstraction;

public class Accord extends Honda{


    @Override
    public void engine() {
        System.out.println("Accord engine size is 2.5");
    }

    @Override
    public void music() {
        System.out.println("Accord music system ... ");
    }
}
