package day33lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ronaldinho");
        myList.add("Messi");
        myList.add("Zidane");
        myList.add("Torres");
        myList.add("Torres");
        myList.add("Yamin");
        myList.add("Pelinovich");
        myList.add("Maldini");
        myList.add("CR7");
        myList.add("Arda Güler");

        System.out.println("myList = " + myList);

        // method call
        printElements(myList);
        System.out.println();
        //printElements2(myList);
        // System.out.println();
        printElementsLowercaseSorted(myList);
        System.out.println();
        sortedByFirstChar(myList);
        System.out.println();
        sortedByLastChar(myList);
        System.out.println();
        sortedByLastCharUtils(myList);
        System.out.println();
        System.out.println("myList = " + myList);


    }


    // Create a method to print all elements in Uppercase in the same line with a space between

    public static void printElements(List<String> list){
        list.
                stream().
                map(t-> t.toUpperCase()). // in place of map(t-> t.toUpperCase()), we could also use replaceAll() directly on the list
                forEach(t-> System.out.print(t + " "));
    }

//    public static void printElements2(List<String> list){
//        list.replaceAll(String::toUpperCase);
//        System.out.println("list = " + list);
//    }

    // Create a method to print UNIQUE elements from the list in lowercase and
    // sorted by their length (from the shortest to longest)
    // Print them in the same line with a space between

    public static void printElementsLowercaseSorted(List<String> list){
        list.
                stream().
                distinct().
                map(t -> t.toLowerCase()).
                //sorted(). // sorts the elements alphabetically
                sorted(Comparator.comparing(String::length)). // now it will sort the elements by their length
                forEach(Utils::printWithSpace); // we are using a REUSABLE METHOD that we created in Utils class
    }
      /*
    Comparator.comparing() compares the elements in the stream according to the given condition (which happens to be the length in this example)
    String::length is the method reference of t-> t.length()

    sorted(Comparator.comparing(String::length).reversed())  => returns elements sorted from longest to shortest

    So here, we are asking sorted() to sort the elements after comparing their length.

    NOTE: If two elements have same length, sorted() method will sort them in the insertion order

     */


    // Create a method to sort the unique elements according to their first character
    public static void sortedByFirstChar(List<String > list){
        list.
                stream().
                distinct().
                //sorted(Comparator.comparing(t -> t.charAt(0))).
                sorted().  // sorts the Strings in alphabetical order anyway
                forEach(Utils::printWithSpace);
    }

    // Create a method to sort the unique elements according to their last character
    public static void sortedByLastChar(List<String > list){
        list.
                stream().
                distinct().
                sorted(Comparator.comparing(t -> t.charAt(t.length()-1))).
                forEach(Utils::printWithSpace);
    }

    public static void sortedByLastCharUtils(List<String > list){
        list.
                stream().
                distinct().
                sorted(Comparator.comparing(Utils::getLastChar)).
                forEach(Utils::printWithSpace);
    }

}
