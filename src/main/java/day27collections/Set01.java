package day27collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set01 {
    public static void main(String[] args) {

        /*

        Sets are to store UNIQUE DATA.
        Example: national ID, fingerprints, driver licence, car plate numbers etc.

        There are 3 types of sets:
        1. HashSet
        2. LinkedHashset
        3. TreeSet

        Let's start with HashSet

        1. HashSet
               - This set stores data / elements based on their hash codes.
               - Elements are stored using a hashing mechanism.
               - The hashcode determines the location of the bucket which contains the element.
                 If two or more elements get same hash code, this is called "hash collision".
                 Java creates LinkedList inside that bucket to solve this issue of "hash collision".
               - The default capacity of a HashSet is 16.
               - HashSet offer the fastest performance. They do NOT maintain the order of insertion.
               -

         */

        String s  = "Java" ;
        System.out.println(s.hashCode()); //2301506

        String st  = "Java is an interesting language." ;
        System.out.println(st.hashCode()); //1706788819


        // How to create HashSet?
        // Collections in Java don't accept primitive data type
        // HashSet<int> hs = new HashSet<>(); => error

//        HashSet<Integer> hs = new HashSet<>(); // Acceptable
//        System.out.println("hs = " + hs); // []


        HashSet<String> fruits = new HashSet<>();
        System.out.println("fruits = " + fruits); // []
        System.out.println("Hash code when set is empty: "+fruits.hashCode());

        fruits.add("Mango");
        fruits.add("Apricot");
        System.out.println("Hash code when set has two elements: "+fruits.hashCode());
        fruits.add("Banana");
        fruits.add("Lychee");
        fruits.add("Date");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Fig");

        // adds elements at random order
        System.out.println("fruits = " + fruits); // [Apple, Lychee, Fig, Mango, Apricot, Orange, Date, Banana]

        // Can HashSet have null?
        fruits.add(null);
        System.out.println("fruits = " + fruits); // [null, Apple, Lychee, Fig, Mango, Apricot, Orange, Date, Banana]

        // Can we add null again?
        fruits.add(null);
        System.out.println("fruits = " + fruits);
        // Sets do NOT have duplicates. It overwrites the previous null value

        System.out.println(fruits.add("Apple"));// false because this data already exists in the set
        System.out.println("fruits = " + fruits);


        // clone() method: Returns a shallow copy of this HashSet instance: the elements themselves are not cloned.
        // System.out.println(fruits.clone());
        Object fruitClone = fruits.clone();
        System.out.println("fruitClone = " + fruitClone);


        System.out.println(fruits.hashCode()); // -933908395


        fruits.clear();
        System.out.println("fruits = " + fruits); // []

        // So is HashSet mutable or immutable?
        // Mutable

        // Some extra information about HashSet
        HashSet<String> names= new HashSet<>(Arrays.asList("Tom", "Hary", "John", "Emily"));
        System.out.println("names = " + names); // [Emily, Hary, Tom, John]
        names.add("Ali");
        System.out.println("names = " + names); // [Emily, Hary, Tom, John, Ali]

        /*
        Arrays.asList() method creates Array structure at the backend.
        Arrays are fixed length.
        But its behaviour is changed because we passed it through HashSet constructor => new HashSet<>()
        Now it is mutable.
         */

        Set<String> classNames = Set.of("Mary", "Dave");
        System.out.println("classNames = " + classNames); // [Mary, Dave]
//        classNames.add("Jane");
//        System.out.println("classNames = " + classNames); // UnsupportedOperationException

        /*
        Set.of() returns an unmodifiable set => IMMUTABLE
         */

        System.out.println(names.remove("Hary")); // true
        System.out.println("names = " + names); // [Emily, Tom, John, Ali]

        System.out.println(names.containsAll(classNames)); // false
        names.add("Dave");
        names.add("Mary");

        System.out.println(names.containsAll(classNames)); // true


    }
}
