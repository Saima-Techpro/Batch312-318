package day27collections;

import java.util.*;

public class Queue02 {
    public static void main(String[] args) {
        // FIFO => First In , First Out

           /*
        PriorityQueue is a queue tool that sorts objects according to their priority order in a FIFO (first in first out)
        structure.
        That is, the object with the highest priority is always handled first.

        -	A real-life example could be the order of patients entering the emergency room at a hospital
            represented as a priorityQueue.

            Patients are sorted according to their urgency levels.
            The patient with the highest urgency is always treated first.

         */


        // Queue<String> queue = new PriorityQueue<>(); // PriorityQueue concrete class is used to implement Queue interface

        PriorityQueue<String> emergencyQueue = new PriorityQueue<>(); // PriorityQueue concrete class to create PriorityQueue class object

        emergencyQueue.add("Ali");
        emergencyQueue.add("Emily");
        emergencyQueue.add("Bob");
        emergencyQueue.add("Jake");
        emergencyQueue.add("Amy");

        // PriorityQueue stores values randomly
        System.out.println("emergencyQueue = " + emergencyQueue); // [Ali, Amy, Bob, Jake, Emily]


        /*
         Deque (Double-Ended Queue) is a data structure that allows adding and removing elements from both ends.
         Deque can be sorted as FIFO (first in first out) or LIFO (last in first out).

        Real Life example: Browser history and ability to move back and forth between the browsers
         */


        Deque<String> stdNames= new LinkedList<>();

        //add(), addFirst(), addLast()
        stdNames.add("Elyas");
        stdNames.add("Alperen");
        stdNames.add("Aziza");
        stdNames.add("Palmer");
        System.out.println("stdNames = " + stdNames); // follows insertion order

        stdNames.addFirst("Ali");
        System.out.println("stdNames = " + stdNames); // [Ali, Elyas, Alperen, Aziza, Palmer]

        stdNames.addLast("Emily");
        System.out.println("stdNames = " + stdNames); // [Ali, Elyas, Alperen, Aziza, Palmer, Emily]

        // remove(), removeFirst(), removeLast()
        stdNames.remove();
        System.out.println("stdNames = " + stdNames); // [Elyas, Alperen, Aziza, Palmer, Emily]

        stdNames.removeFirst();
        System.out.println("stdNames = " + stdNames); // [Alperen, Aziza, Palmer, Emily]

        stdNames.removeLast();
        System.out.println("stdNames = " + stdNames); // [Alperen, Aziza, Palmer]


        stdNames.addFirst("Veli");
        stdNames.addFirst("Tom");
        stdNames.addLast("Veli");
        stdNames.addLast("Veli");
        stdNames.addLast("Tom");
        System.out.println("stdNames = " + stdNames); // [Tom, Veli, Alperen, Aziza, Palmer, Veli, Veli, Tom]

        stdNames.removeFirstOccurrence("Veli");
        System.out.println("stdNames = " + stdNames);// [Tom, Alperen, Aziza, Palmer, Veli, Veli, Tom]

        stdNames.removeLastOccurrence("Veli");
        System.out.println("stdNames = " + stdNames); // [Tom, Alperen, Aziza, Palmer, Veli, Tom]


        stdNames.removeLastOccurrence("Tom");
        System.out.println("stdNames = " + stdNames); // [Tom, Alperen, Aziza, Palmer, Veli]


        // poll() and pollFirst() => Retrieve and remove the head of the queue represented by this deque
        // (in other words, the first element of this deque), or returns null if this deque is empty.
        System.out.println(stdNames.poll()); // Tom
        System.out.println("stdNames = " + stdNames); // [Alperen, Aziza, Palmer, Veli]

        System.out.println(stdNames.pollFirst()); //Alperen
        System.out.println("stdNames = " + stdNames); // [Aziza, Palmer, Veli]

        System.out.println(stdNames.pollLast()); // Veli
        System.out.println("stdNames = " + stdNames); // [Aziza, Palmer]


        // offer() adds elements at the tail of this deque
        stdNames.offer("Muhammad");
        System.out.println("stdNames = " + stdNames);

        // push() adds elements at the head of this deque
        stdNames.push("Hulya");
        System.out.println("stdNames = " + stdNames);

        // Difference: add() adds values randomly but push() adds value at the head of the deque


        // How to get all the values one by one?

        for (String w: stdNames){
            System.out.println(w);
        }


        // Deque implemented through ArrayDeque

         /*
        ArrayDeque (implementing deque interface)
            -	This structure allows for fast addition and removal of elements at both the beginning and the end.
            -	ArrayDeque offers higher performance compared to LinkedList because it uses an array-based structure
                for its contents.
            -	ArrayDeque is ideal for fast addition/removal operations at both ends.
            -	ArrayDeque has a dynamic structure

         */


        Deque<String> furnitureTruck = new ArrayDeque<>();
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Coffee Table");
        furnitureTruck.add("Chairs");
        furnitureTruck.add("Dinning Table");

        System.out.println("furnitureTruck = " + furnitureTruck); // [Sofa, Bed, Coffee Table, Chairs, Dinning Table]

        furnitureTruck.addFirst("TV");
        furnitureTruck.addLast("Wardrobe");

        System.out.println("furnitureTruck = " + furnitureTruck); // [TV, Sofa, Bed, Coffee Table, Chairs, Dinning Table, Wardrobe]



    }
}
