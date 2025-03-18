package day32lambda;

import java.util.*;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(Arrays.asList(11, 2, 24, 5, 7, 16, 2));
        System.out.println("myList = " + myList); // [11, 2, 24, 5, 7, 16, 2]
        System.out.println(Integer.MAX_VALUE); // 2147483647

        // method call
        findMinimum1(myList);
        findMinimum2(myList);
        findMinimum3(myList);
        findMinimum4(myList);
        findMinimum5(myList);

    }

    // Create a method to find out the minimum value from the given list
    // [11, 2, 24, 5, 7, 16, 2]

    // 1st way: By  using Integer.MAX_VALUE
    public static void findMinimum1(List<Integer> list){
       int min =  list.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t > u ? u : t);
        System.out.println("min = " + min);
    }

    // Integer.MAX_VALUE provides maximum value that an integer can have (2147483648)
    // This value is used as an identity element and assigned in t variable at first
    // The first element from the stream goes to u variable
    // Condition used in ternary returns the value from the relevant variable
    // That value is assigned back to t variable everytime
    // until we get the last value in t which should be the minimum


    // 2nd way: By using the element from the stream itself as our identity element
    // [11, 2, 24, 5, 7, 16, 2]

    public static void findMinimum2(List<Integer> list){
        int min = list.stream().distinct().reduce(list.get(0), (t, u) -> t < u ? t : u);
        System.out.println("min = " + min);

        // list.get(0) provided the first element from the list
        // This is then used as an identity element in t variable in the first iteration
    }

    // 3rd way: using method reference
    public static void findMinimum3(List<Integer> list){

        int min = list.
                stream().
                distinct().
                // reduce((t , u) -> Math.min(t , u)).
                reduce(Math::min).  // Math::min is a Method reference for Math.min(t , u)
                get(); // get() is used to get the element from Optional Data
        System.out.println("min = " + min);
    }


    // 4th way: using sorted()
    public static void findMinimum4(List<Integer> list){
        int min = list.stream().distinct().sorted().findFirst().get();
        System.out.println("min = " + min);
    }

    // 5th way: using sorted() with Comparator
    // [11, 2, 24, 5, 7, 16, 2]
    public static void findMinimum5(List<Integer> list){
        Optional<Integer> min = list.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                reduce((t,u) -> u);

        System.out.println("min = " + min);
    }
}
