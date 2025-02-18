package day14loops_arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

      /*
       When we create byte, short, int, double, String etc. variables, we can store only SINGLE value at a time.
         Java provides a special structure to store MULTIPLE values in the same variable (container).
         That is called Arrays class.

         1. Arrays can store multiple values.
           e.g. you can store multiple student names in the same variable / container.
         2. Arrays allow to  store multiple values that belong to SAME data type.
           e.g. int array will store only int values
         3. To create array, we need to specify two things =>  a) data type      b) the size
         4. Arrays are faster because they have fix size structure
         5. Arrays use less memory because they have fix size
         6. Arrays can store both Primitive data type and object references as well (references of Non-Primitive data type
            such as Strings and Wrapper classes)
         7. Arrays.toString() returns a string representation of the array, but the original numbers array
            remains unchanged in terms of its type and content.
       */


      int a = 2334;
      byte b = 45;
      String str = "Java is spinning my head around!!!";
      boolean bl = true;

//      String st = "Elyas", "Cahit", "Cigdem";  We can't store multiple values in Strings

        // Java's solution to store multiple values in one variable => ARRAYS

        // How to create an Array?

        // 1st way:

        String[] stdNames = new String[3];
        // 2nd way:

        String teachersNames[] = new String[10];
        int numOfStds[] = new int[4];


        // How do we print an Array?

        System.out.println("str = " + str); // Java is spinning my head around!!!
        System.out.println("a = " + a); // 2334

        System.out.println("stdNames = " + stdNames); // [Ljava.lang.String;@1d81eb93


        System.out.println(Arrays.toString(stdNames)); // [null, null, null]

        // NOTE: default value of an empty Array with non-primitive data (like String) is null


      System.out.println("numOfStds = " + numOfStds); // [I@7291c18f
      System.out.println("numOfStds = " + Arrays.toString(numOfStds)); // [0, 0, 0, 0]

      // NOTE: default value of an empty Array with primitive data (like int) is zero


      // How to add values in an Array?
      stdNames[0] = "Cigdem";
      System.out.println("stdNames: " +Arrays.toString(stdNames)); // [Cigdem, null, null]

      stdNames[2] = "Elyas";
      System.out.println("stdNames: " +Arrays.toString(stdNames)); // [Cigdem, null, Elyas]

      stdNames[1] = "Cahit";
      System.out.println("stdNames: " +Arrays.toString(stdNames)); // [Cigdem, Cahit, Elyas]

      // stdNames[0] = 1;  // Arrays can store SAME data type ONLY.


     // stdNames[3] = "Saima";
     // System.out.println("stdNames: " +Arrays.toString(stdNames)); // error => ArrayIndexOutOfBoundsException => more than capacity

      // How to get a specific value from an Array?

      System.out.println(stdNames[2]); // Elyas

      String student1 = stdNames[0];
      System.out.println(student1);


    }
}
