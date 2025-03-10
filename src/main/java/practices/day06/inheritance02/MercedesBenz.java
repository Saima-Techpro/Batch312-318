package practices.day06.inheritance02;

public class MercedesBenz extends Car{
    public String brand = "Mercedes-Benz";
    public String fuelType = "Mercedes-Benz cars are mostly petrol and electric cars.";
    public String hqLocation = "Stuttgart";

    public void engine(){
        System.out.println("Mercedes-Benz cars use Mercedes branded engines.");
    }

    public void fuelConsumption(){
        System.out.println("Mercedes-Benz cars use relatively more fuel than other cars.");
    }

    public void brake(){
        System.out.println("Mercedes-Benz cars use ABS brakes.");
    }
}
