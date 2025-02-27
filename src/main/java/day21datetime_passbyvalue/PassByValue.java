package day21datetime_passbyvalue;

import java.util.Arrays;

public class PassByValue {
    public static void main(String[] args) {

          /*
                 Pass By Value
           - When we create a variable and pass it through a method, Java creates a copy of that variable and
             uses that copy for further manipulation.
           - This is called Pass By Value.
           - Through this rule, Java protects the original value of the variables. If this property didn't exist,
             the value of the variable would be updated with every method call and that's not good.
           - Java applies this Pass By Value property on primitives and objects.

            Example:
              int price = 100;
              Original Price of a shirt is 100 => there's 10% discount for seniors, 10% discount for students,
              20% discount for veterans etc.
            - Pass By Reference => Java does not allow "Pass By Reference". Because with address/ reference, original
              values will be updated/can be changed which makes the direct data manipulation possible.

              EXCEPTION TO THIS RULE:
              Arrays, ArrayList and StringBuilder allow the direct data manipulation (because if mutability)

         */

        String str = "Java";
        System.out.println("Original str = " + str); // Java

        int price = 200;
        System.out.println("Original price = " + price); // 200


       int[] brr = {1, 3, 4};
        System.out.println("Original array = " + Arrays.toString(brr)); // [1, 3, 4]



        // method call
        modifyString(str); // java
        System.out.println("Original str after method call = " + str); // Java

        modifyInt(price); // 20
        System.out.println("Original price after method call = " + price); // 200


        modifyArray(brr);
        System.out.println("Original array after method call = " + Arrays.toString(brr)); // [22, 75, 4]

    }


    public static void modifyString(String s){
        s = s.toLowerCase();
        System.out.println("Modified string = " + s);
    }


    public static void modifyInt(int a){
        a = 20;
        System.out.println("Modified int = " + a);
    }


    public static void modifyArray(int[] arr){
        arr[0] = 22;
        arr[1] = 75;
        System.out.println("method call = " + Arrays.toString(arr));
    }

}
