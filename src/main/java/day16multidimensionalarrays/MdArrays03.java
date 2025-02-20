package day16multidimensionalarrays;

import java.util.Arrays;

public class MdArrays03 {
    public static void main(String[] args) {

        // Task: Find the longest element from a given Multidimensional Array


        String[][] str = {{"kiwi", "banana", "apricot"},
                           {"Liverpool", "Manchester United", "Arsenal"} ,
                           {"iPhone", "Galaxy Note", "Nova", "Huawei", "Blackberry", "Xiaomi", "Nokia", "Tipico"}};

        System.out.println(Arrays.deepToString(str));

        /*

          [[kiwi, banana, apricot],
          [Liverpool, Manchester United, Arsenal],
          [iPhone, Galaxy Note, Nova, Huawei, Blackberry, Xiaomi, Nokia, Tipico]]

        */

        String longestElement = ""; // to store Longest element

        for (String[]  outer : str){
            // System.out.println(outer.length);
            for (String element : outer){
                // System.out.println(element.length());
                if (element.length() > longestElement.length()){

                    longestElement = element;
                }
            }
        }
        System.out.println("longestElement = " + longestElement);


    }
}
