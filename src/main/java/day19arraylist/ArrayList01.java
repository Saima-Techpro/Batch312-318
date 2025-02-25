package day19arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

    public static void main(String[] args) {
        // Task: Check that the given ArrayList should be empty, or have only space in it
        // acceptable => [] or [ ] or [ , , ]
        // unacceptable => [a]

        // 3rd way of creating an ArrayList
        List<String> list1 = new ArrayList<>();
        list1.add(" ");
        list1.add(" ");
        list1.add(" ");
        list1.add("a");
        System.out.println("list1 = " + list1); // [ ,  ,  ]  if we add any other character => [ ,  ,  , a]


        // removeAll() => this method is used to remove multiple values at a time after checking
        // the given condition

        List<String> list2 = new ArrayList<>();
        list2.add(" ");
        list2.add("a");
        list2.add("m");
        list2.add("z");
        System.out.println("list2 = " + list2); // [ ]

        // list1.removeAll(list2); // check list1, remove all those elements from list1 which are also present in list2
        System.out.println(list1.removeAll(list2)); // true  => the task of removing similar elements is done
        System.out.println("list1 after removing = " + list1);

        if (list1.isEmpty()){
            System.out.println("This list is empty");
        }else {
            System.out.println("This list is not empty or it contains elements other spaces");
        }

        // NOTE: ONLY those elements will be removed from list1 which match with list2 elements.
        // The elements of list2 which don't exist in list1, will be completely ignored by removeAll()






    }
}
