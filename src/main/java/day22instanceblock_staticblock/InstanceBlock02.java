package day22instanceblock_staticblock;

public class InstanceBlock02 {

    /*
    NOTES:
    - instance block runs first
    - constructor runs next
    - other class members(variables+ methods) are executed after that

    Instance block takes precedence over constructor information

    Can we have multiple instance blocks in a class?
    YES

    What happens if there are multiple instance blocks?
    Java executes them from top to bottom

     */

    // instance  / class variables
    public int price;
    public int year;
    public String colour;
    public String fuelType;
    public String brand;
    public String model;
    public boolean airCond;

    // instance block

    {
        System.out.println("Hello everyone!");
    }


    // 2nd instance block

    {
        System.out.println(price = 60000);
        System.out.println(colour = "Black");
        System.out.println(fuelType = "Diesel");
        System.out.println(brand = "Honda");
        System.out.println(model = "Accord");
        System.out.println(airCond = false);
    }


    // NOTE: EVERY CLASS HAS A DEFAULT CONSTRUCTOR WHICH IS INVISIBLE
    // But we can make it visible


    // DEFAULT CONSTRUCTOR made visible now
    public InstanceBlock02(){
       //System.out.println("Hello everyone!");
    }

    // parameterised constructor
    public InstanceBlock02(int year){
       // System.out.println("Hello everyone!");
        this.year = year;
        System.out.println("year = " + year);
    }

    public InstanceBlock02(int year, String brand){
        // System.out.println("Hello everyone!");
        this.year = year;
        this.brand = brand;
        System.out.println("year = " + year);
        System.out.println("brand = " + brand);

    }


    public InstanceBlock02(int price, int year, String colour, String fuelType, String brand, String model, boolean airCond) {
        this.price = price;
        this.year = year;
        this.colour = colour;
        this.fuelType = fuelType;
        this.brand = brand;
        this.model = model;
        this.airCond = airCond;
        // System.out.println("Hello everyone!");
    }

    public static void main(String[] args) {

        InstanceBlock02 obj1 = new InstanceBlock02();

        System.out.println("================");
        InstanceBlock02 obj2 = new InstanceBlock02(2025);

        System.out.println("================");

        InstanceBlock02 obj3 = new InstanceBlock02(2000, "Toyota");

        System.out.println("================");

        InstanceBlock02 obj4 = new InstanceBlock02(40000, 2022, "White", "Electric", "Tesla", "Y", true);
        System.out.println(obj4.year); // 2022
        System.out.println(obj4.fuelType); //Electric
    }

}
