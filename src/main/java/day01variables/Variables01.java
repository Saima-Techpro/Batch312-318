package day01variables;

import java.io.DataOutput;

public class Variables01 { // This is the start of  class body

    public static void main(String[] args) {

        /*
          There are 3 ways to create main method:
          1. Manually
          2. using short key => psvm and press enter
          3. shortest => main and press enter
         */


        // What's variable?
        // Variable is like a container which holds the data/value
        // The space/memory allocated to that variable depends on the data type


//        dataType  nameOfVariable     assignment operator    value       semi-colon
           short         myAge                =                  22            ;


           // Create a variable to store decimal number

        float num1 = 12.40F;
        double num2 = 15.50;

        /*
                DATA TYPES
              For whole numbers => byte, short, int, long
              For decimal numbers => float, double

           1) integer: It is used for whole numbers
            integer variables use 32 bits of memory (4 bytes   => 8 bits= 1 byte)
            The minimum value for integers is -2,147,483,648
            The maximum value for integers is 2,147,483,647
            default value of int  is zero

         2) short: It is used for whole numbers
            short variables use 16 bits of memory
            The minimum value for short is -32,768
            The maximum value for short is 32,767
         3) byte: It is used for whole numbers
            byte variables use 8 bits of memory
            The minimum value for byte is -128
            The maximum value for byte is 127

         4) long: It is used for whole numbers
            long variables use 64 bits of memory
            The minimum value for long -9,223,372,036,854,755,808
            The maximum value for long 9,223,372,036,854,755,807


            NOTE: Java accepts long as integer value by default
            If the given value is within int range, Java will allocate it int memory (4 bytes)
            If the given value exceeds int range, Java will see it as an error.
            To fix that error, we need to insist Java to use long as our data type
            How do we insist? we add L at the end.
         */


        // Create a variable to store the population of your country

        int populationOfHongKong = 7404060;
        System.out.println(populationOfHongKong);
        System.out.println("populationOfHongKong = " + populationOfHongKong);


        // Create a variable to store the population of the world

        long populationOfWorld = 8000000000L;

        /*
            DECIMAL DATA TYPES

            float: It is used for decimals.
                  float variables use 32 bit sof memory
           NOTE: when we create float variable, we need to add 'f' OR 'F' at the end of value.

           double: It is used for decimals.
                  double variables use 64 bit sof memory


          PRIMITIVE DATA TYPES
          byte < short < int < long < float < double

         */

        float priceOfShirt = 55.90F;
        double salaryOfEmployees = 5678812.999;



        char initialsOfMyName = 'S';
        System.out.println(initialsOfMyName); // S
        System.out.println("initialsOfMyName = " + initialsOfMyName);


        boolean isRetired = true;
        System.out.println("isRetired = " + isRetired);

        boolean isOld = false;
        System.out.println("isOld = " + isOld);

        /*

        boolean: It is used for 'True' or 'False' values.
                 It only uses 1 bit of memory

         char: It is used to store single characters =>  'a', '!', 'D', '4'
              char uses 16 bits of memory
              Use single quotation mark


           8 PRIMITIVE DATA TYPES
          byte , short , int , long , float , double , boolean, char
          PRIMITIVE DATA TYPES have "values" ONLY. They do NOT have methods/functions

         */

    }

} // Class body ends here

