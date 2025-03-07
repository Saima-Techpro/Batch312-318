package day26collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList02 {
    public static void main(String[] args) {


        List<String> brrList = Arrays.asList("Earth" , "Mars", "Neptune");
        System.out.println("brrList = " + brrList); // This is a fixed length array. Because Arrays.asList() creates a fixed length array at the background
        //brrList.add("Uranus");
        //System.out.println("brrList = " + brrList); // UnsupportedOperationException


        ArrayList<String> arrList = new ArrayList<>(Arrays.asList("Earth" , "Mars", "Neptune"));
        System.out.println("arrList = " + arrList); // arrList is an ArrayList which is flexible list

        arrList.add("Jupitar");
        System.out.println("arrList = " + arrList);


        LinkedList<String> list1 = new LinkedList<>(Arrays.asList("Earth" , "Mars", "Neptune"));
        System.out.println("list1 = " + list1);

        list1.add("Jupitar");
        list1.add("Mercury");
        System.out.println("list1 = " + list1);

        /*
        list1 structure:
        list1 is a LinkedList
        Arrays.asList() method is used and it created a fixed length Array  => Arrays.asList("Earth" , "Mars", "Neptune")
        When it is passed through new LinkedList<>() constructor, it changes its behaviour and makes it modifiable LinkedList => mutable

        new LinkedList<>() constructor creates a new empty List by copying the elements coming from Arrays.asList()

         */


        LinkedList<String> list2 = new LinkedList<>(List.of("Lion", "Bear", "Penguin"));
        System.out.println("list2 = " + list2);

        list2.add("Cat");
        System.out.println("list2 = " + list2);


        /*
        list2 structure:
        list2 is a LinkedList
        List.of() method is used and it creates immutable List  => List.of("Lion", "Bear", "Penguin")
        When it is passed through new LinkedList<>() constructor, it changes its behaviour and makes it modifiable LinkedList => mutable

        new LinkedList<>() constructor creates a new empty List by copying the elements coming from List.of()

         */


        List<String> list3 = List.of("Tiger", "Dog", "Hamster");
        System.out.println("list3 = " + list3);
//        list3.add("Camel");
//        System.out.println("list3 = " + list3); // UnsupportedOperationException


        // list1 = [Earth, Mars, Neptune, Jupitar, Mercury]

        // poll() method returns and removes the first node value from the list
        System.out.println(list1.poll()); //Earth
        System.out.println("list1 = " + list1); // [Mars, Neptune, Jupitar, Mercury]


        // element() retrieves the first element but DOES NOT remove it
        System.out.println(list1.element()); // Mars
        System.out.println("list1 = " + list1); // [Mars, Neptune, Jupitar, Mercury]


        // pop() method returns and removes it from the list
        System.out.println(list1.pop()); // Mars
        System.out.println("list1 = " + list1); // [Neptune, Jupitar, Mercury]


        // clear() method removes all nodes(values) from the list
        list1.clear();
        System.out.println("list1 = " + list1); // []

        // Difference between poll() and pop() on an empty list

        System.out.println(list1.poll()); // null
        // System.out.println(list1.pop()); // NoSuchElementException

        list1.offer("Pluto");
        list1.add("Sun");
        list1.add("Uranus");
        System.out.println("list1 = " + list1); // [Pluto, Sun, Uranus]



    }
}
