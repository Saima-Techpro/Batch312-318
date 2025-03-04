package day23oop_inheritance;

public class Car extends  Vehicle{

    // Passive features
    String model = "Accord";
    int year = 2024;

    // non-parameterised constructor
    public Car(){
        //super();
        System.out.println("H-pack");
    }


    // parameterised constructor
    public Car(String type){
       // super();
        System.out.println("type = " + type);
    }
}
