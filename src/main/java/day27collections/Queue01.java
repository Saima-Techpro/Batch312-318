package day27collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {

        /*

       In Java, a Queue is a data structure where data is stored and processed in a specific order.
       It follows the First In First Out (FIFO) principle, meaning the first object added is the first
       to be handled.
       Queues are used for ordered operations and processing data.
       It's not possible to insert elements in the middle.


    Here are a few real-world examples:

    Queue Line: The person at the front of the line is served first.
    For example: think of how orders are processed in a fast-food restaurant.
    The first order placed is the first to be prepared and delivered.
    Ticket Queue: People wanting to buy tickets for a concert or event line up.
    Tickets are sold in order, and the first person in line gets their ticket first.
    Call Queue: Customers at a customer service call centre are connected to operators in order.
    The first caller waiting is served first, followed by the next in line.
    File Processing: Computer operating systems and applications process files in order.
    When one file process is completed, the next file in the queue is processed.


    The working principle of a queue is to add elements to the end of the queue and remove them from the beginning.
    Queues are useful when ordered operations or data are needed.

    The Queue interface can be implemented by different classes such as...
    1.	LinkedList (which can also use the List interface)
    2.	PriorityQueue
         */


        // How to create a Queue?
//        Queue<String> store = new PriorityQueue<>();
//        Queue<String> store = new ArrayDeque<>();

        Queue<String> store = new LinkedList<>();
        store.add("Milk");
        store.add("Bread");
        store.add("Eggs");
        store.add("Cheese");
        store.add("Vegetables");
        store.add("Meat");
        store.add("Chocolate");
        store.add("Juice");

        System.out.println("store = " + store);

        // store.add(3, "Oil"); error => It's not possible to insert elements in the middle.

        // remove() returns first element from the queue
        String firstElement = store.remove();
        System.out.println("firstElement = " + firstElement); //Milk
        System.out.println("store = " + store);

        System.out.println(store.remove("Meat")); // true
        System.out.println("store = " + store); // [Bread, Eggs, Cheese, Vegetables, Chocolate, Juice]


        // peek() => retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        System.out.println(store.peek()); // Bread
        System.out.println("store = " + store);

        // poll() => retrieves and removes the head of this queue, or returns null if this queue is empty.

        System.out.println(store.poll()); // Bread
        System.out.println("store = " + store); // [Eggs, Cheese, Vegetables, Chocolate, Juice]

        // element() => Retrieves, but does not remove, the head of this queue.
        // This method differs from peek only in that it throws an exception if this queue is empty.
        System.out.println(store.element());
        System.out.println("store = " + store);

        // clear()
        store.clear();
        System.out.println("store = " + store);

        // offer() can also be used to add values
        store.offer("Fish");
        store.offer("Coffee");
        store.offer("Honey");
        System.out.println("store = " + store);


    }
}
