package day20constructor;

import java.util.Scanner;

public class CarRunner {
    public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in); // scanner object

        Car car = new Car();  // car object is created using default  constructor

        // Method call : To call non-static members, we need object (instance)
        car.accelerate();
        car.brake();
        System.out.println("price = " + car.price);
        System.out.println("brand = " + car.brand);

        System.out.println(car.brand+ " , " + car.model + " , "+ car.price + " , airConditioned= " + car.airCond);


        // object creation using Parameterised Constructor

        Car car1 = new Car("Honda");

        System.out.println("car1.price = " + car1.price);
        System.out.println("car1.brand = " + car1.brand);


        Car car2 = new Car("Tesla", "Y", 2025);
        System.out.println(car2.brand); // Tesla
        System.out.println(car2.model); // Y
        System.out.println(car2.year); // 2025


         Car car3 = new Car();
        System.out.println(car3.brand); //Toyota => car3 object is using default (Non-parameterised) Constructor which can see the original values


        Car ferrari = new Car("Ferrari", "Roma", 2022, 80000, "Diesel", true, false);

        System.out.println(ferrari.model + " , " + ferrari.year + " , " +ferrari.price);



    }
}
