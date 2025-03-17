package day31lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {

        // Arrays.asList(3, 5, 3, 11, 34); creates IMMUTABLE LIST
        // When this is passed through ArrayList constructor => new ArrayList<>(),
        // it becomes mutable (its behaviour from Arrays is modified to a List)

        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 5, 2, 11, 34));
        // numbers.add(55); // Mutable
        System.out.println("numbers = " + numbers); // [3, 5, 2, 11, 34]


//        int a = 10;
//        a = a * a; // variable a will be updated ONLY if we assign  a*a back to it
//        System.out.println("a = " + a);


        // Create a list with duplicate values
        List<Integer> nums = new ArrayList<>(Arrays.asList(3, 5, 2, 3, 34, 2, 11, 9, 11));


        // method call
        printSquare(numbers); // 9 25 4 121 1156
        System.out.println("============");
        printCubeOfOdds(numbers); // 27 125 1331
        System.out.println("============");
        removeDuplicates(nums);


    }

    // Create a method to print the squares of each element
    public static void printSquare(List<Integer> list){
        list.stream().map(n -> n*n).forEach(n -> System.out.print(n + " "));

        // map() function updates the elements in the existing stream AFTER any mathematical operation
    }


    // Create a method to print the cube of odd elements ONLY
    // [3, 5, 2, 11, 34]

    public static void printCubeOfOdds(List<Integer> a){
        a.
                stream(). // puts list elements into a stream
                filter(t -> t%2 != 0 ). // applies the given condition on the elements
                map(t -> t*t*t). // updates the elements in the existing stream AFTER any mathematical operation
                forEach(t -> System.out.print(t + " ")); // works as for each loop

        // a.stream().map(t -> t*t*t).filter(t -> t%2 != 0).forEach(t -> System.out.print(t + " ")); This also works but it makes Java work more
    }

    // Create a method to remove duplicates from a list
    public static void removeDuplicates(List<Integer> list){
        list.
                stream().
                distinct(). // filters the duplicates and return unique values only
                forEach(t -> System.out.print(t + " "));
    }


}
