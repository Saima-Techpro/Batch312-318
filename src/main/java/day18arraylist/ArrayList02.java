package day18arraylist;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {

        // Create an integer ArrayList

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(22);
        myList.add(5);
        myList.add(39);
        myList.add(14);
        myList.add(2);
        System.out.println("myList = " + myList); // [22, 5, 39, 14, 2]


        // Calculate the number of elements in the given ArrayList
        int numOfElements = myList.size();
        System.out.println("numOfElements = " + numOfElements); // 5

        // How to get a specific element from an ArrayList

        int firstElement = myList.get(0);
        System.out.println("firstElement = " + firstElement); // 22

        System.out.println("firstElement = " +myList.getFirst()); //22

        int thirdElement = myList.get(2);
        System.out.println("thirdElement = " + thirdElement); // 39

        System.out.println("Last element = " + myList.getLast()); // 2
        System.out.println("Last element = " + myList.get(myList.size()-1)); // 2


        // How to replace / update a specific element
        //  myList = [22, 5, 39, 14, 2]

        // myList.add(2, 19); // this won't replace the existing element, this will add 19 at index 2 and re-index the remaining values

        myList.set(2, 19);
        System.out.println("myList updated = " + myList); // [22, 5, 19, 14, 2]

        System.out.println(myList.set(3, 67)); // 14 => just prints the element that is being replaced

        // To see if the ArrayList is updated or not, print the ArrayList
        System.out.println("myList updated = " + myList); // [22, 5, 19, 67, 2]

       // Replace all odd elements from myList with 10
        // using loops

        for (Integer w : myList){
            if ( w%2 != 0 ){   // to check if the elements are odd
                 myList.set(myList.indexOf(w), 10);
            }
        }
        System.out.println("myList = " + myList);

        // Replace all even elements from myList with 7

         for (Integer w : myList){

             if ( w%2 == 0){
                 myList.set(myList.indexOf(w), 7);
             }
         }
        System.out.println("myList = " + myList);   // [7, 7, 7, 7, 7]


    }
}
