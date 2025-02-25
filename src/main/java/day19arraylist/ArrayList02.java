package day19arraylist;

import java.util.Arrays;
import java.util.List;


public class ArrayList02 {
    public static void main(String[] args) {

    // 4th way of creating ArrayList:
       // ArrayList<Integer> myList = new ArrayList<>();
       //  List<Integer> myList = new ArrayList<>();

        List<Integer> myList = Arrays.asList(12, 8, 4, 3, 1);
        System.out.println("myList = " + myList);  // [12, 8, 4, 3, 1]

//        myList.add(19);
//        System.out.println("myList = " + myList); // UnsupportedOperationException

//        myList.remove(2);
//        System.out.println("myList = " + myList); // UnsupportedOperationException

//        myList.add(1, 33);
//        System.out.println("myList = " + myList); // UnsupportedOperationException

        myList.set(1, 33);
        System.out.println("myList = " + myList); // [12, 33, 4, 3, 1]

        System.out.println("List size = " + myList.size()); // 5

         /*
            ************* Notes about Arrays.asList() method *************

        1) We can use this method to create List. But this doesn't behave the same way as ArrayLists.
           Because asList() method is coming from Arrays class which works as Arrays at the background. (secretly array)
        2) Arrays are fixed size structures that's why we can't use add() and remove() methods with the lists
           that are created by using asList() method.
        3) However, we can still use other methods like set() or size() methods which are available for Lists

        4) We can use this way of creating Lists when we have fix size of elements. We don't need to add/remove
           elements. But we can use other methods that are available for lists.

         */


        int[] arr = new int[3];
        arr[0] = 3;
        arr[1] = 9;
        arr[2] = 22;
        System.out.println(Arrays.toString(arr)); // [3, 9, 22]

        arr[1] = 49;
        System.out.println(Arrays.toString(arr)); // [3, 49, 22]

        /*
        All following methods come from List Interface. They're not available for Arrays
        arr.add();
        arr.remove();
        arr.get();
        arr.set();

         */

        // Method call
        // printText("Testing protected access modifier. It doesn't work in another class in another package if there's NO relationship");

//        subtract(); can't use it OUTSIDE the package

    }
}
