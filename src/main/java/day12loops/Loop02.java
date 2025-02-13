package day12loops;

public class Loop02 {
    public static void main(String[] args) {

        /*
        Task : Print the unique (not-repeated) characters from the given String
                "Hello" => "Heo"  "Loops" => "Lps"

          NOTE: we can use following methods to get the single char from the string:
                1. str.substring(first param, second param)
                2. charAt()

          indexOf() => returns the first occurrence of the char
          lastIndexOf() => returns the last occurrence of the char
         */

        String str = "Banana";

        String unique = "";

        for (int i = 0; i < str.length();i++) {

            char ch = str.charAt(i); // local variable

            if (str.indexOf(ch) == str.lastIndexOf(ch)){
               unique = unique +  ch;
            }

        }

        System.out.println("unique = " + unique);


    }
}
