package practices.day06.inheritance02;

public class Car {
    //TASK
    //Create classes: Car, MercedesBenz, SEL600
    //MercedesBenz class should extend Car class.
    //SEL600 class should extend MercedesBenz class.
    //Enter some general information in the Car class.
    //Enter some required information in the MercedesBenz class.
    //Enter the model-specific information in SEL600 class.
    //Print those information with an SEL600 object.

    public String movement = "Cars move with 4 wheels.";
    public String topSpeed = "Cars go as fast as they can go.";
    public String fuelType = "Cars use diesel, petrol, or electric.";
    public String brand = "Cars have the brand they are produced by.";

    public void engine(){
        System.out.println("Cars have engines made by their brands");
    }

    public void fuelConsumption(){
        System.out.println("Cars consume fuel depending on their engine power.");
    }

}
