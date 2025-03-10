package practices.day06.inheritance02;

public class Runner {
    public static void main(String[] args) {
        SEL600 car1 = new SEL600();

        System.out.println("car1.movement = " + car1.movement); //movement from Car class
        System.out.println("car1.topSpeed = " + car1.topSpeed); //topSpeed from SEL600 class
        System.out.println("car1.brand = " + car1.brand); //brand from MercedesBenz class

        car1.engine();
        car1.fuelConsumption();

        MercedesBenz car2 = new SEL600();

        System.out.println("car2.movement = " + car2.movement); //movement from Car class
        System.out.println("car2.topSpeed = " + car2.topSpeed); //topSpeed from Car class
        System.out.println("car2.fuelType = " + car2.fuelType); //fuelType from MercedesBenz class

        car2.engine(); //from SEL600 class

        car2.fuelConsumption(); //initially from MercedesBenz class, now from SEL600 class.

    }
}
