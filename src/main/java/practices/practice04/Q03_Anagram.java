package practices.practice04;

import java.util.Arrays;
import java.util.Scanner;

public class Q03_Anagram {
    public static void main(String[] args) {
        //  Task: Check if two Strings are anagrams or not

        // Anagram: A word or phrase made by re-arranging the letters of a given sentence

//        dormitory -> dirty room
//        debit card -> bad credit
//        eleven plus two -> twelve plus one
//        a decimal point -> I'm a dot in place
//        vacation time -> I am not active

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give two phrases to check if they're anagrams or not");

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

       String[] array1 = (s1.toLowerCase().replaceAll("[^a-z]", "").split(""));
         System.out.println(Arrays.toString(array1));


        String[] array2 = s2.toLowerCase().replaceAll("[^a-z]", "").split("");

        System.out.println(Arrays.toString(array2));

        // Now sort the arrays

        Arrays.sort(array1);
        Arrays.sort(array2);


        System.out.println( "After sorting: " +Arrays.toString(array1));
        System.out.println("After sorting: " + Arrays.toString(array2));

        // Now check if they're equal or not

        if (Arrays.equals(array1, array2)){   // Arrays.equals() checks the values  ONLY
            System.out.println("The two Strings are anagrams");
        }else {
            System.out.println("The two Strings are not anagrams");
        }



    }
}
