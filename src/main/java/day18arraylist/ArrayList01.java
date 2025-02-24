package day18arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList01 {
    public static void main(String[] args) {

        /*
             What is ArrayList?
             1. ArrayList is a dynamic structure to store multiple values of same data type.
             2. We don't need to mention size while we are creating it => hence the flexible size
             3. It automatically adjusts the size of the variable when new elements are added to it / removed from it.
             4. ArrayList cannot store primitive data types( short, byte, int etc. )
                They store non-primitive data types only (like String, Wrapper classes, Objects etc. )

             5. Re-indexing in Arraylist: When a new element is added by providing an index, the new element is added
                at the given index and the remaining ArrayList is re-indexed => the remaining elements are assigned new index.

             6. When a new ArrayList is created, it is initialised with an empty internal array, and no memory is allocated.
                But when we add first element, default capacity becomes 10. When its default capacity is used up, new capacity
                is allocated using this formula:

                new capacity = old capacity + (old capacity / 2)
                new capacity =  10 + (10/2)
                new capacity = 10 + 5
                new capacity = 15

          DIFFERENCES BETWEEN ARRAYS and ARRAYLIST?
                  a) Arrays  are fixed size, but ArrayLists are not. (They're flexible, adjusts the size automatically)
                  b) Arrays can Primitives, ArrayLists store Non-Primitives
                  c) Arrays are faster than ArrayLists
                  d) Arrays use less memory than ArrayLists
                  e) Arrays don't allow reindexing; ArrayLists allow reindexing

          Real life example where we can use ArrayList?
          Shopping list

           So which one is better?
           - It really depends on the task/purpose.
           - If you're creating a variable to store static data (that's fixed/known), use Arrays
           - If you're creating a variable to store dynamic data (that's changing), use ArrayLists
                  

         */
        int[] arr = new int[5];
        System.out.println(arr); // [I@7b23ec81
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]

        // How to create an ArrayList?

        // 1st way:
        // ArrayList<Integer> ages  = new ArrayList<Integer>(); // Java 6 and earlier

        // 2nd way:
        ArrayList<Integer> ages  = new ArrayList<>();

        System.out.println(ages); // []
        System.out.println("size: " + ages.size()); // 0

        // How to add elements to an ArrayList?

        ages.add(4);
        ages.add(9);
        ages.add(6);

        System.out.println(ages); // [4, 9, 6]

        System.out.println("size after adding the elements: " + ages.size()); // 3

        // Re-indexing
        ages.add(1, 21);
        System.out.println(ages); // [4, 21, 9, 6]

        // Add an element between 9 and 6
        ages.add(3, 15);
        System.out.println("ages = " + ages); // [4, 21, 9, 15, 6]

        // Add 10 at the end of the ArrayList
        ages.add(10);
        System.out.println("ages = " + ages); // add() method, without index, always adds the element to the end of the list

        // using addLast()
        ages.addLast(10);
        System.out.println("ages = " + ages); // [4, 21, 9, 15, 6, 10, 10]

        ages.add(ages.size(), 35);
        System.out.println("ages = " + ages); // [4, 21, 9, 15, 6, 10, 10, 35]

        // Add an element at the beginning of the list

        ages.add(0, 1);
        System.out.println("ages = " + ages); // [1, 4, 21, 9, 15, 6, 10, 10, 35]

        ages.addFirst(52);
        System.out.println("ages = " + ages); // [52, 1, 4, 21, 9, 15, 6, 10, 10, 35]


        // Create another ArrayList and add ages list to the new ArrayList

        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(45);
        grades.add(67);
        grades.add(89);
        System.out.println("grades = " + grades); // [45, 67, 89]

//        grades.addAll(ages);
//        System.out.println("grades = " + grades); // [45, 67, 89, 52, 1, 4, 21, 9, 15, 6, 10, 10, 35]
        
        // to add at a specific point, use addAll() with the index


        //System.out.println(grades.addAll(1, ages));// true

        boolean isAdded = grades.addAll(1, ages);
        System.out.println("isAdded = " + isAdded);
        System.out.println("grades = " + grades);

        // NOTE: if we use add() and addAll() without index, Java adds the given element / list to the end of ArrayList



    }
}
