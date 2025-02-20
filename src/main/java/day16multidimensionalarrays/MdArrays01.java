package day16multidimensionalarrays;

import java.util.Arrays;

public class MdArrays01 {
    public static void main(String[] args) {

        /*

        - A Multidimensional Array means an Array of arrays (array within an array)
        - The most common used in Java is 2D - Two dimensional array
        - In a 2D array, data is stored in rows and columns, similar to the concept matrix in Maths or like tables

        Arrays can be jagged/ragged, meaning the inner arrays can have different sizes.

                  Memory allocation:
            - Multidimensional arrays are stored in HEAP memory. (objects, references)
            - Memory usage of multidimensional arrays will depend on number of rows, columns and data type.
            - A ragged multidimensional array (flexible ones) have even more varying use of memory because
              their values in the inner arrays can be different.


         */

        // How to create a Multidimensional Array?
        // 1st way: non-flexible


        int[][] arr = new int[3][2];  // [3] => means outer array,, [2] => means inner arrays

        System.out.println(Arrays.toString(arr)); // [[I@7b23ec81, [I@6acbcfc0, [I@5f184fc6]
        System.out.println(Arrays.deepToString(arr)); // [[0, 0], [0, 0], [0, 0]]


        // How to assign values to Multidimensional Array?
        arr[0][0] = 8;
        arr[0][1] = 7;
//        arr[0][2] = 1; // ArrayIndexOutOfBoundsException

        arr[2][0] = 23;
        arr[2][1] = 56;

        arr[1][1] = 2;
        arr[1][0] = 14;

      //   arr[3][0] = 90; // ArrayIndexOutOfBoundsException
        System.out.println(Arrays.deepToString(arr)); // [[8, 7], [14, 2], [23, 56]]

        // How to count the length of outer and inner array
        System.out.println("outer array length: " + arr.length); // 3
        System.out.println("inner array length: " + arr[1].length); // 2


        // How to print a specific element / value from a Multidimensional Array?
        System.out.println("third element: " + arr[1][0]); // 14
        System.out.println("second element: " +arr[0][1]); // 7
        System.out.println("sixth element: " +arr[2][1]); // 56


        // 2nd way: flexible way of creating Multidimensional Array

        String[][] languages = new String[4][];

        languages[0] = new String[] {"English", "Turkish", "Persian"};
        languages[1] = new String[] {"Java", "JavaScript", "Python", "SQL"};
        languages[2] = new String[] {"Chinese"};
        languages[3] = new String[] {"C++", "TypeScript"};

        System.out.println(Arrays.deepToString(languages));
        // [[English, Turkish, Persian], [Java, JavaScript, Python, SQL], [Chinese], [C++, TypeScript]]

        System.out.println("========================");

        // How to print each inner array one by one

        for (String[] w : languages){

            if ( w == null){
                continue;
            }
            System.out.println(Arrays.toString(w));
        }


        System.out.println("==========================");
        // How to print each element from inner array one by one
        for (String[]  innerArray : languages){
            // System.out.println(Arrays.toString(innerArray));

            for ( String eachElement : innerArray){

                System.out.println(eachElement);
            }

        }

        // 3rd way: MOST flexible way of creating Multidimensional Array

        String[] [] names = { {"Ali", "Tom"}, {"Fatma", "Emily", "Aisha", "Veli"}, {"Judi", "Jenifer", "Mel"}, {""} };

        System.out.println(Arrays.deepToString(names)); // [[Ali, Tom], [Fatma, Emily, Aisha, Veli], [Judi, Jenifer, Mel], []]


        // Update the name "Judi"  to John
        names[2][0] = "John";

        System.out.println(Arrays.deepToString(names)); // [[Ali, Tom], [Fatma, Emily, Aisha, Veli], [John, Jenifer, Mel], []]


        System.out.println("============ Task =============");
        // Task: Create a String Multidimensional array  called cities and print all values which contain "a" (Use loops)

        String[][] cities = { { "Istanbul", "Ankara", "Adana", "Izmir" }, { "Washington", "New York", "Chicago" },
                { "London", "Chelsea", "Newcastle" }, { "Berlin", "Hamburg" } };

        System.out.println(Arrays.deepToString(cities));

        // [[Istanbul, Ankara, Adana, Izmir], [Washington, New York, Chicago], [London, Chelsea, Newcastle], [Berlin, Hamburg]]

        for (String[] innerArray :  cities){
            for (String cityName : innerArray){

                if (cityName.contains("a")){
                    System.out.println(cityName);
                }
            }
        }





    }
}
