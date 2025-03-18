package day31lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda04 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(16, 5, 8, 11, 34, 8, 2));
        System.out.println("numbers = " + numbers); // [16, 5, 8, 11, 34, 8, 2]
        System.out.println(Integer.MIN_VALUE); // -2147483648

        // method call
        findMax1(numbers);
        findMax2(numbers);
        findMax3(numbers);
        findMax4(numbers);
        findMax5(numbers);

    }


    // Create a method to find out the maximum element from the given list
    // 1st way: using Integer.MIN_VALUE
    public static void findMax1(List<Integer> list){

       int max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println("max = " + max);

    }

    // Integer.MIN_VALUE provides minimum value that an integer can have (-2147483648)
    // This value is used as an identity element and assigned in t variable at first
    // The first element from the stream goes to u variable
    // Condition used in ternary returns the value from the relevant variable
    // That value is assigned back to t variable everytime
    // until we get the last value in t which should be the maximum



    // 2nd way: by using an element from the list itself as our identity element
    // [16, 5, 8, 11, 34, 8, 2]
    public static void findMax2(List<Integer> list){

        int max = list.stream().distinct().reduce(list.get(0), (t, u) -> t > u ? t : u);
        System.out.println("max = " + max);

    }

    // 3rd way: using sorted()
    public static void findMax3(List<Integer> list){

        int max = list. // [16, 5, 8, 11, 34, 8, 2]
                stream().
                distinct().  // [16, 5, 8, 11, 34, 2]
                sorted(). // [2, 5, 8, 11, 16, 34]  // from small to big
                reduce((t, u) -> u). // u will always receive the bigger number form the stream, so we ask to return u
                get();

        System.out.println("max = " + max);
    }

     /*
    reduce () function can be used with / without identity element


    1. reduce () function with identity element:
       identity element for addition = 0
       identity element for multiplication = 1
       identity element for maximum value = Integer.MIN_VALUE
       identity element for maximum value = list.get(0)


    2. reduce () function  without identity element:
       sorted() function sorts the stream from small to big elements
       reduce() does NOT use identity element and returns Optional Data type
          1. first option to declare Optional<Integer> data type for max variable
          2. 2nd option is to use get() after reduce() to get smaller data type (int)

     */

    // 4th way: using method reference => Integer::max
    public static void findMax4(List<Integer> list){

        int max = list.
                stream().
                distinct().
                //reduce((t, u) -> Math.max(t, u)).
                reduce(Math::max).
                get();

        System.out.println("max = " + max);

        // Math::max is the method reference for Math.max(t, u)
    }


    // 5th way:
    public static void findMax5(List<Integer> list){

        int max = list.  // [16, 5, 8, 11, 34, 8, 2]
                stream().
                distinct(). // [16, 5, 8, 11, 34, 2]
                sorted(Comparator.reverseOrder()). // from big to small => [34, 16, 11 , 8 , 5 , 2]
                findFirst().
                get();

        System.out.println("max = " + max);

        // sorted() functions sorts the elements from small to big first
        // then Comparator.reverseOrder() reverses the order => from big to small

    }

}
