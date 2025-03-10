package practices.day06.inheritance02;

public class SEL600 extends MercedesBenz{
    //movement, topSpeed, fuelType, brand,
    // hqLocation, brakes, fuelConsumption, engine

    public String topSpeed = "600SEL can go as fast as 280 km/h";
    public String fuelType = "600SEL uses petrol.";
    public String model = "600SEL";

    public void engine(){
        System.out.println("600SEL uses Mercedes-Benz M120 engine.");
    }

    public void fuelConsumption(){
        System.out.println("600SEL burns 12 liters of petrol each 100 kilometers.");
    }

    public void gearCount(){
        System.out.println("600SEL has a 4 speed gearbox.");
    }
}
