package day30enums;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args){

           /*

        1) The data in the enum are constants.
        2) You cannot create a new object from the enum using the new keyword.
        3) This is because each constant data you put into the enum works with the logic of an object created from this class.
        4) Each constant we put inside the enum is by default public, static, and final.
            (Here, cities are implied - when defining an enum, you don't need to and cannot write these keywords in front of the constants; the syntax of the language does not support this.)
        5) Therefore, you can access each constant data inside the enum by writing the enum name.
        6) The constructor in the enum is not used to create a new object, but to initialize the variables inside each constant data in the enum.


         */

        //  Cities cities = new Cities(); // new keyword is used to create object

        System.out.println(Cities.İZMİR);


        Cities city1 = Cities.ADANA;
        System.out.println("city1 = " + city1);
        System.out.println(city1.getCityName());
        System.out.println(city1.getPlateCode());
        System.out.println(city1.getPostalCode());


        // Ask user to enter plate code to find its related city.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter plate code to find its related city");

        int userPlateCode = scanner.nextInt();

        Cities[] allValues= Cities.values();
        //System.out.println("allValues = " + allValues); // [Lday30enums.Cities;@76fb509a

        // System.out.println(Arrays.toString(allValues));

        if (userPlateCode < 1 || userPlateCode > 81){
            System.out.println("Invalid plate code");
        }else {

            for (Cities w : allValues){
                // System.out.println(w.getCityName());

                if (userPlateCode == w.getPlateCode()){
                    // System.out.println(w.getCityName());
                    System.out.println(userPlateCode + " plateCode belongs to " + w.getCityName());
                }


            }
        }



    }
}
