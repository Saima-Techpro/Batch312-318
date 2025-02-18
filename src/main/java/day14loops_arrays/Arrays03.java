package day14loops_arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        // Create a String Array of countries and print the names in alphabetical order


        // 1st way:
        // String[] countriesNames = new String[5];

        // 2nd way:
//        String countriesNames[] = new String[5];
//        countriesNames[0] = "Turkiye";
//        System.out.println(Arrays.toString(countriesNames)); // [Turkiye, null, null, null, null]

        // 3rd way:

        String countriesNames[] = {"Turkiye", "UK", "Afghanistan", "Turkmenistan", "Pakistan"};

        System.out.println(Arrays.toString(countriesNames));  // [Turkiye, UK, Afghanistan, Turkmenistan, Pakistan]

//        countriesNames[5] = "UAE";
//        System.out.println(Arrays.toString(countriesNames)); // ArrayIndexOutOfBoundsException


        // How to print names in alphabetical order?
        // sort()  => sorts the elements ORIGINAL Array
        // for numerical data => it orders the elements in ascending order
        // for String data => it orders the elements in alphabetical order

        Arrays.sort(countriesNames);
        System.out.println(Arrays.toString(countriesNames));  // [Afghanistan, Pakistan, Turkiye, Turkmenistan, UK]

        // Print the name whose length is less than 5
        // [Afghanistan, Pakistan, Turkiye, Turkmenistan, UK]

        for (String w : countriesNames){
            if (w.length() < 5){
                System.out.println(w);
            }
            
        }
        System.out.println("====================");
        // Print all the names before Turkiye

        for (String  w : countriesNames){
            if (w.equals("Turkiye")) {
                break;
            }
            System.out.println(w);

        }
        System.out.println("====================");       

         // Print all the names including Turkiye

        for (String w: countriesNames){
            System.out.println(w);

            if (w.equals("Turkiye")){
                break;
            }
        }

          System.out.println("====================");
          // Print all the names except Turkiye

        for (String w: countriesNames){
            if (w.equals("Turkiye")){
                continue; // skip this match 
            }
            System.out.println(w);


        }















    }
}
