package day32lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Elyas");
        myList.add("Ali");
        myList.add("Rumeysa");
        myList.add("Veli");
        myList.add("Kemal");
        myList.add("Ali");
        myList.add("Aziza");
        myList.add("rumeysa");

        System.out.println("myList = " + myList);


        // method call
        printElements(myList);

        System.out.println("==============");
        elementsGreaterThanSix(myList);
        System.out.println("==============");
        elementsGreaterThanFour(myList);
        System.out.println("==============");
        listOfElements(myList);
        System.out.println("==============");
        removeIfGreaterThanFive(myList);


    }



    // Create a method to print all elements except the ones that start with 'R' or 'r'
    public static void printElements(List<String> list){
        list.
                stream().
                filter(t -> !t.startsWith("R") && !t.startsWith("r")).
                forEach(System.out::println);
    }

    // Create a method to print the unique elements whose length is greater than 6
    // myList = [Elyas, Ali, Rumeysa, Veli, Kemal, Ali, Aziza, rumeysa]

    public static void elementsGreaterThanSix(List<String> list){
        list.stream().distinct().filter(t -> t.length() > 6).forEach(System.out::println);

    }


     /*

     Create a method returning version of the list as follows:
    1.	must contain elements whose length is greater than 4
    2.  must contain elements all converted to uppercase
    3.	must return as a list as well

     */

    public static void elementsGreaterThanFour(List<String> list){
       // List<String> nameList = list.stream().filter(t -> t.length() > 4).map(t -> t.toUpperCase()).collect(Collectors.toList());
        List<String> nameList = list.stream().filter(t -> t.length() > 4).map(String::toUpperCase).toList();
        System.out.println("nameList = " + nameList);
    }

    /*
    Create a method returning version of the list as follows:
    1.	must contain UNIQUE elements
    2.  must be in alphabetical order
    3. must be in lowercase
    4. must return as a list as well
    5. print the elements in the same line with space between
    */

    // myList = [Elyas, Ali, Rumeysa, Veli, Kemal, Ali, Aziza, rumeysa]
    public static void listOfElements(List<String> list){
        list.stream().sorted().map(String::toLowerCase).distinct().toList().forEach(System.out::println);
    }


    //NOTE: You can't use reduce() function here because reduce() is useful for aggregating values
    // into a single result, but not for collecting elements into a List.
    // If you need a list, prefer collect(Collectors.toList()).
    // reduce("", (a, b) -> a + " " + b) can be used for string concatenation, but Collectors.joining() is better.



    // Create a method to delete the elements whose length is greater than five
    public static void removeIfGreaterThanFive(List<String> list){
        // we don't need to use stream() here because stream() doesn't have remove methods
        // all types of remove() methods come from Collection Interface
        // So we can use it directly.
        // removeIf() removes the elements if the given condition inside is true

        list.removeIf(t-> t.length()>5);
        System.out.println("list = " + list);

    }










}
