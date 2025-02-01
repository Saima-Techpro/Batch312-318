package day04wrapper_increment_decrement;

public class Wrapper01 {
    public static void main(String[] args) {

        /*
        Primitive data types => byte > short > int > long > float > double

        Primitive data types allow to store VALUES ONLY. They do NOT have any methods.
        In order to manipulate data, we need methods.
        This problem was resolved by Java by creating WRAPPER CLASSES

        byte  => Byte
        short => Short
        int   => Integer
        long  => Long
        float => Float
        double => Double
        char   => Character
        boolean => Boolean

        WRAPPER classes can store values, and they also provide METHODS as well.
        WRAPPER classes are NON-PRIMITIVE data types.
        When we convert Primitive data type to its wrapper class, Java performs this function automatically.
        It's called "Auto-boxing"

        When we convert wrapper class to its Primitive data type, Java performs this function automatically.
        It's called "Un-boxing"


         */

        int a = 10;

        // a. => shows no methods because a is int data type


        Integer b = 12;
       // b.  => shows a number of methods because b is Integer data type and Integer is a wrapper class


        // Auto-boxing
        char ch = 'M';
        Character c = ch;
        System.out.println("c = " + c);

        // Un-boxing
        Short s = 67;
        short sh = s;
        System.out.println("sh = " + sh);


        // How to get Max and Min values of the Wrapper classes?
        // Byte
        System.out.println("Min Value of Byte: "+Byte.MIN_VALUE); // -128
        System.out.println("Max Value of Byte: "+Byte.MAX_VALUE); // 127

        // Integer
        System.out.println("Min value of Integer: "+ Integer.MIN_VALUE); // -2147483648
        System.out.println("Max value of Integer: "+ Integer.MAX_VALUE); // 2147483647

        // Character
        System.out.println("Min value of Integer: "+ Character.MIN_VALUE);
        System.out.println("Max value of Integer: "+ Character.MAX_VALUE);

        /*
        NOTES:
        Character.MIN_VALUE and Character.MAX_VALUE returns a symbol which represents unicode of the max
        or min value, which is not readable.
        Character.MIN_VALUE => '\u0000'
        Character.MAX_VALUE => '\uFFFF'

        In order to get a readable value, we need to use typeCasting
        (int) Character.MIN_VALUE => '\u0000' => 0
        (int) Character.MAX_VALUE => '\uFFFF' => 65535
         */

        System.out.println("Min value of Integer after type casting: "+(int) Character.MIN_VALUE);
        System.out.println("Max value of Integerafter type casting: "+ (int) Character.MAX_VALUE);


        /*
        Task: Create two variables to store total amount of money and number of people in a team.
              Calculate the amount each teammate gets. Print it on the console.
          amount = 90
          num of players: 12
         */

        byte numberOfPlayers = 12;
        short amount = 90;

        System.out.println(amount / numberOfPlayers); // 7
        // When both variables use a data type for whole numbers, the result will be produced in whole number data type
        // short / byte => short  => the result is always returned in bigger data type

        double eachPlayer = ( amount / numberOfPlayers );
        System.out.println("Each player gets = " + eachPlayer); // 7.0

        float amount1 = 90;
        System.out.println(amount1 / numberOfPlayers); // 7.5
        // float / byte => float  => the result is always returned in bigger data type


        // Type casting
        double result =  (double)   amount / numberOfPlayers;
        System.out.println("result = " + result); // 7.5

    }
}
