package day26collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {

        // List<String> list1 = new List(); // error => because List is an interface and an interface can't be used for object creation

        ArrayList<String> list1 = new ArrayList<>(); // concrete class constructor to access the methods from the same concrete class
        List<String> list2 = new ArrayList<>(); // concrete class constructor to access the methods in List Interface

        List<String> list3 = new LinkedList<>(); // concrete class constructor to access the methods from the List Interface

        // Object list4 = new ArrayList<>(); This also works but consumes a lot of memory
        // Object list5 = new LinkedList<>();


        List<String> myList = new LinkedList<>();
        System.out.println("myList = " + myList); // []

        myList.add("Ali");
        System.out.println("myList = " + myList);
        myList.add("Ayse");
        System.out.println("myList = " + myList); // [Ali, Ayse]

        // LinkedList Structural design: LinkedLists have nodes => Head-> node-> node-> Tail
        // Each node has two parts: 1. data  2. pointer/address
        // Head-> [Ali]-> [Ayse]-> Tail

        myList.add(1, "Veli");
        System.out.println("myList = " + myList); // [Ali, Veli, Ayse]
        myList.addFirst("Tom");
        myList.addLast("Emily");

        System.out.println("myList = " + myList); // [Tom, Ali, Veli, Ayse, Emily]

        System.out.println("=======================");

        List<String> classList = new LinkedList<>();
        classList.add("Elyas");
        classList.add("Yemele");
        classList.add("Aziza");
        classList.add("Alperen");

        System.out.println("classList = " + classList);

//        classList.addAll(myList);
//        System.out.println("classList = " + classList);

        classList.addAll(1 , myList);
        System.out.println("classList = " + classList);


        // remove some nodes
        myList.remove("Ayse");
        System.out.println("myList = " + myList);

        myList.remove(3);
        System.out.println("myList = " + myList);


        System.out.println("classList before removing all = " + classList);
        classList.removeAll(myList);
        System.out.println("classList after removing  = " + classList);

        classList.removeFirst();
        System.out.println("classList = " + classList);
        classList.removeLast();
        System.out.println("classList = " + classList);

        System.out.println("=========================");

        LinkedList<String> names = new LinkedList<>();
        names.add("Jane");
        names.add("Emily");
        names.add("Bob");
        names.add("Alex");
        names.add("Emily");
        names.add("Bob");
        names.add("Ali");
        names.add("Junaid");

        System.out.println("names = " + names);
        names.removeFirstOccurrence("Emily");
        System.out.println("names = " + names);

        names.removeLastOccurrence("Bob");
        System.out.println("names = " + names);

        names.removeLastOccurrence("Alex");
        System.out.println("names = " + names); // [Jane, Bob, Emily, Ali, Junaid]

        // Task: If the number of characters of the name is more than 4, then remove it
        names.add("Alexander");
        names.add("Tom");
        names.add("Natalia");
        names.add("Jeremy");

        System.out.println("names = " + names);
        // [Jane, Bob, Emily, Ali, Junaid, Alexander, Tom, Natalia, Jeremy]
        // 1st way:

        for (int i = 0; i < names.size(); i++) {

            if (names.get(i).length() > 4){
                names.remove(names.get(i));
                i--;
            }


        }
        System.out.println("names after the loop= " + names); // [Jane, Bob, Ali, Tom]

        names.add("Alperen");
        names.add("Elyas");
        names.add("Yu");
        names.add("Yemele");
        names.add("Palmer");

        System.out.println("names = " + names); // [Jane, Bob, Ali, Tom, Alperen, Elyas, Yu, Yemele, Palmer]
        // 2nd way:

        for (int i = 0; i < names.size(); i++) {

            if (names.get(i).length() > 4){
                names.remove(i);
                i--;
            }


        }
        System.out.println("names after the loop= " + names); // [Jane, Bob, Ali, Tom, Yu]

    }
}
