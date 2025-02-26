package day20methodoverloading;

public class Varargs01 {
    public static void main(String[] args) {
        /*
        Varargs => var + args
                = varying + arguments
        If we want to make number of arguments flexible, we create varargs.

        SYNTAX:
        datatype... + space + nameOfVariable
        int... a

        varargs can be used with primitives and non-primitives
        varargs work in Array structure at the background


        RULES:
        1. varargs can accept UNLIMITED number of elements
        2. More than one variable can be used in the method which has varargs
            But varargs should ALWAYS be used in the end /last parameter
        3. varargs can have zero or single value/element


         */

        // Method call

        System.out.println(sum(2));
        System.out.println(sum(2, 5));
        System.out.println(sum(2, 5, 7, 4));
        System.out.println(sum(51, 34, 67, 93, 118, 20));


        System.out.println(sum(2.9, 5.5));
        System.out.println(sum(2.9, 5.5, 33.90, 25.99, 10.99));

        // Can varargs work without any argument?
        // Yes
        System.out.println(sum());


    }



    public static int sum(int... a){
        int sum = 0;
        for (int w: a){
            sum += w;
        }
        return sum;
    }

    public static double sum(double... a){
        double sum = 0;
        for (double w: a){
            sum += w;
        }
        return sum;
    }
}
