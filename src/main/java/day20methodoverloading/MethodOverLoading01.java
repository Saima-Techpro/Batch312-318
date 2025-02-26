package day20methodoverloading;

public class MethodOverLoading01 {

    public static void main(String[] args) {

        /*
        METHOD OVERLOADING:
            We can create as many methods as we want with same name and different data types and parameters.
            This is called METHOD OVERLOADING.


         METHOD SIGNATURE => method name + parameters

        RULE: In Method OverLoading, method name remains the same, method parameters change.

        How to do Method OverLoading?
        1. We MUST keep the name of the method SAME.
        2. We can change the data type
        3. WE can change the number of variables (parameters)
        4. WE can change the place/ order of variables (parameters)

        Can we overload private methods?
        Yes
        Can we overload non-static methods?
        Yes, but we would have to create class object if we want to access it.

        In JAVA, there is a concept called OOP. This has 4 principles
        One of them is POLYMORPHISM

        POLYMORPHISM => POLY + MORPHISM
                      = many + forms

        POLYMORPHISM = Method OverLoading + Method Overriding
         */




        // Method call

        System.out.println("addition = " + add(12, 35)); // 47

        System.out.println("addition = " + add(6, 7, 15)); // 28


        System.out.println("addition = " + add(8, 9.5)); // 17.5

        System.out.println("addition = " + add(15.90, 5)); // 20.9



    }


    public static int add(int a , int b){
        return a + b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static double add(int a , double b){
        return a + b;
    }

    public static double add(double a , int b){
        return a + b;
    }

    public static double add(int a, int b, double c){
        return a+b+c;
    }

    public static double add(int a, double b, double c){
        return a+b+c;
    }

    public static double add(double a, double b, double c){
        return a+b+c;
    }


}
