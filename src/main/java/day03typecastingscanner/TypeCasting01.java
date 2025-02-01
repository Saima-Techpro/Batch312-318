package day03typecastingscanner;

public class TypeCasting01 {
    public static void main(String[] args) {

        /*
              The action of converting primitive data types from one to another is called TYPE CASTING.

        1. Auto-widening: Java automatically converts smaller data types into larger data types.
        2. Explicit Narrowing: Java does NOT automatically convert larger data types into smaller ones.
           Java resists this type of conversion because of the risk of loosing data. UNLESS we insist on
           doing this by declaring the data type on the left hand side of the variable before we assign to
           larger data type.

                Auto Widening:
                    - The process of converting a smaller data type,
                    into a bigger one.
                    byte -> int, short -> int, int -> long

         */
        byte age = 127;

        int ageInt = age;


        /*

                Explicit Narrowing:
                    - The process of converting a bigger data type,
                    into a smaller one.
                    int -> short, int -> byte, short -> byte, long -> int

                    - When you do so, Java will warn you, in-case you are
                    making a mistake. If you are sure about your conversion,
                    you just put (data type) in front of the value you would
                    like to convert.

         */

        int a = 30000;
        short b = (short) a;
        System.out.println(b);




    }
}