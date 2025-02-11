package day09stringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {

    /*
     Task: Calculate the total price of the products below:
                    tv: $458.90  , laptop: $788.99

         NOTE: prices are given in String data type
     */

        String tv = "$458.90";
        String laptop = "$788.99";

       // System.out.println(tv + laptop); // This will concatenate the two Strings

        // 1st step: Get rid of the $ sign

        //String tvPrice = tv.replaceAll("\\$", "");
        String tvPrice = tv.replaceAll("[$]", ""); // replaceAll() will accept regex with \\ otherwise it will complain
        System.out.println("tvPrice = " + tvPrice);

        //String tvPrice = tv.replace("$", ""); // replace() works with single char, so no need to use \\

//        String laptopPrice = laptop.replace("$", "");
        String laptopPrice = laptop.substring(1);
        System.out.println("laptopPrice = " + laptopPrice);

        System.out.println(tvPrice + laptopPrice); // concatenated => because they're still String data type

        // 2nd Step:
        // double OR Double?
        // double => primitive => only values,  NO METHODS
        // Double => non - primitive => values as well as METHODS
        // double tvPriceDouble = Double.valueOf(tvPrice);
        // Double tvPriceDouble = Double.valueOf(tvPrice);

        Double tvPriceDouble = Double.parseDouble(tvPrice);
        Double laptopPriceDouble = Double.parseDouble(laptopPrice);

        /*
        NOTE:
        BOTH methods, Double.valueOf() and Double.parseDouble(), perform the same function: they extract the numerical value out of Strings

        Difference:
        Double.parseDouble() returns primitive => double .... but you can store it to Double Wrapper class  (auto-boxing)
        Double.valueOf() returns non primitive => Double .... but you can store it to double  (unboxing)
         */


        Double totalPrice =  tvPriceDouble + laptopPriceDouble;
        System.out.println("totalPrice = " + totalPrice); // 1247.8899999999999


        // To get rid of decimals

        // 1st way: Type casting

//        Integer totalPrice = (int) (tvPriceDouble + laptopPriceDouble);
//        System.out.println("totalPrice = $" + totalPrice);

        // 2nd way: Math.round()

        System.out.println("totalPrice = $" + Math.round(totalPrice));

        // 3rd way: String.format()  => can be used to keep the said value after decimal or completely get rid of decimals and return a whole number
        System.out.println(String.format("%.1f", totalPrice));


        // 4th way: Math.pow()
        int decimalPlaces = 2;
        System.out.println(Math.round(totalPrice * Math.pow(10, decimalPlaces) / Math.pow(10, decimalPlaces)));

        System.out.println("================================");

        char ch = 'Z';
        System.out.println("ch = " + ch);
        System.out.println(Integer.valueOf(ch));

        boolean b = true;
        // System.out.println(Integer.valueOf(b));
        System.out.println(Boolean.valueOf("true")); // true

        Integer integerObject = Integer.valueOf(123);  // Returns Integer object from int
        System.out.println(integerObject); //123

        /*
                      ********** NOTES about valueOf() and parseXXX() methods **********

        1. valueOf() works for wrapper classes to convert strings or primitive values into wrapper objects.
        2. parseXXX() works primarily for numeric and boolean types, converting strings to primitive values.

           Both methods are primarily designed to work with strings but behave differently based on the data type.
           Other data types like char need manual handling (e.g., using charAt() for char).

         */






        // command+/ = MAC => to comment out the lines
        // cntrl+/ = Windows => to comment out the lines


    }
}
