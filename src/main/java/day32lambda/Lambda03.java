package day32lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lambda03 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Alexander");
        myList.add("Ali");
        myList.add("Yusuf");
        myList.add("Josef");
        myList.add("Maryam");
        myList.add("John");
        myList.add("Elizabeth");
        System.out.println("myList = " + myList); // myList = [Alexander, Ali, Yusuf, Josef, Maryam, John, Elizabeth]


        // method call
//        removeElements(myList);
//        removeElementsWithA(myList);
//        removeElements2(myList);

        System.out.println(checkLength(myList)); // false
        System.out.println(checkLength1(myList)); // true
        System.out.println(checkLength2(myList)); // true

    }

    // Create a method to delete elements which start with "Y" and end with "f"
    public static void removeElements(List<String> list){
        list.removeIf(t -> t.startsWith("Y") && t.endsWith("f"));
        System.out.println("list = " + list);
    }



    // Create a method to delete elements which contain 'a'
    public static void removeElementsWithA(List<String> list){
        list.removeIf(t -> t.contains("a"));
        System.out.println("list = " + list);
    }

    // NOTE: removeIf() is removing elements directly from the original list
    // Hence, original list has fewer elements after every method call


    // Create a method to delete elements whose length is between 4 and 8 or ends with 'f'
//
//    public static void removeElements2(List<String> list){
//        list.removeIf(t-> t.length()> 4 && t.length()<8 || t.endsWith("f"));
//        System.out.println("list = " + list);
//    }


    public static void removeElements2(List<String> list){
        Predicate<String> condition = t-> t.length()> 4 && t.length()<8 || t.endsWith("f");
        list.removeIf(t -> condition.test(t));
        System.out.println("list = " + list);
    }

    // Create a method to check if ALL elements length is greater than 6
    public static boolean checkLength(List<String> list){
        return list.stream().allMatch(t -> t.length() > 6);

        // NOTE: allMatch() checks if ALL elements of this stream match the given predicate (condition)
        // even if a single elements doesn't fulfill this condition, allMatch() returns false
    }

    // Create a method to check if ANY element has a length greater than 8
    public static boolean checkLength1(List<String> list){
        return list.stream().anyMatch(t -> t.length() > 8);
        // NOTE: anyMatch() checks if ANY element of this stream match the given predicate (condition)
        // even if a single element fulfills this condition, anyMatch() returns true
    }


    // Create a method to check that NONE of the elements start with "X"
    public static boolean checkLength2(List<String> list){
//        Predicate<String> condition = t -> t.startsWith("X");
//        return list.stream().noneMatch(t -> condition.test(t));
//
        return list.stream().noneMatch( t -> t.startsWith("X"));
    }

       /*

list.stream() creates a stream from the list of strings.
.noneMatch(t -> condition.test(t)) is a terminal operation that checks if no element in the stream satisfies the condition.
Specifically, it evaluates condition.test(t) for each element t in the stream:
If any element starts with "X", condition.test(t) returns true for that element, causing noneMatch to return false.
If no element starts with "X" (i.e., condition.test(t) is false for all elements), noneMatch returns true.

Return Value:

If no elements start with "X," checkLength2 will return true.
If at least one element starts with "X," checkLength2 will return false.

In essence, noneMatch is used here to confirm that none of the strings in list start with "X".

     */




}
