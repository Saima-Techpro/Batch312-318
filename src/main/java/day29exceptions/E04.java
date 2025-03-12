package day29exceptions;

import java.util.Arrays;

public class E04 {
    public static void main(String[] args) {

        String[] str = {"j", "a", "v", "a"};
        System.out.println(Arrays.toString(str));

        // Get specific element from an array
        // method call

        getElementFromArray(str, 2); // v
        getElementFromArray(str, 3); // a
        getElementFromArray(str, 4); // ArrayIndexOutOfBoundsException
    }



    public static void getElementFromArray(String[] s , int idx){

        try {
            String element = s[idx];
            System.out.println("element = " + element);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index can't be greater than the length of the Array which is: "+ (s.length));
        }


    }
}
