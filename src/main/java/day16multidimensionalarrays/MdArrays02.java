package day16multidimensionalarrays;

import java.util.Arrays;

public class MdArrays02 {
    public static void main(String[] args) {


        // Task: Create a Multidimensional Array of 3 rows and flexible columns of String data type
        // and concatenate all the elements

        String str[][] = {{"Java", "is", "a", "programming", "language."}, {"I", "love", "Java."},
                {"Just", "kidding!!"}};


        System.out.println(Arrays.deepToString(str));
        // [[Java, is, a, programming, language.], [I, love, Java.], [Just, kidding!!]]

        String result = "";   // to store the concatenated words

        for (String[] outer : str){

            for (String inner : outer){
               //  System.out.println(inner);
                result += inner + " ";
            }
            // System.out.println(result);
        }
        System.out.println("Concatenated: "+ result); // Java is a programming language. I love Java. Just kidding!!


        // Is it possible to change the data type from String[] to String?
        // Yes


        String names[] = {"Emina", "Ali", "Veli", "Zahra"};

        // 1st way:
        for (String w : names){
            String eachName = w;
            System.out.println("eachName = " + eachName);
        }

        // 2nd way: String.join()
        String namesInString = String.join(" , ", names);
        System.out.println("namesInString = " + namesInString);

        // Will this String.join() method work for Multidimensional Array?
        // NO

        // String.join(" , ", str); doesn't work with Multidimensional Array
       // For Multidimensional Array Strings, we need to use nested loop to change the data type

    }
}
