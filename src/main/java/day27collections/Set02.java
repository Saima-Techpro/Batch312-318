package day27collections;

import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {

         /*

        2)LinkedHashSet: This set stores elements based on their addition order (insertion order).

        LinkedHashSets are a good choice for applications that require maintaining the order of elements.
        However, they offer slower performance than HashSets. (medium)

        Example: Caching "recently viewed items" on an e-commerce site where both uniqueness and order are important.
        Example2; You can use it to keep student information in order of registration in schools


         3) TreeSet:
        This set stores elements based on their natural order (from smallest to largest).
        It offers slower performance than HashSets and LinkedHashSets.
        In Java, TreeSet is a class that implements the SortedSet interface.
        Therefore, TreeSet is a sorted set.

            */



        // How to create LinkedHashSet?
        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
        System.out.println("lhs1 = " + lhs1); // []

        lhs1.add(23);
        lhs1.add(3);
        lhs1.add(11);
        lhs1.add(6);
        lhs1.add(8);

        System.out.println("lhs1 = " + lhs1); // [23, 3, 11, 6, 8] => follows the order of insertion

        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();

        lhs2.add(67);
        lhs2.add(90);
        lhs2.add(3);
        lhs2.add(6);
        lhs2.add(18);
        System.out.println("lhs2 = " + lhs2); // [67, 90, 3, 6, 18]

        System.out.println(lhs1.retainAll(lhs2)); //true
        System.out.println("lhs1 = " + lhs1); // [3, 6]

        // Can we add null in LinkedHashSet?

        lhs1.add(null);
        System.out.println("lhs1 = " + lhs1); // [3, 6, null]

        // Can we add null again?
        lhs1.add(null);
        System.out.println("lhs1 = " + lhs1); // DUPLICATES are NOT acceptable in SETS



        // How to create TreeSet?
        TreeSet<Character> ts = new TreeSet<>();
        System.out.println("ts = " + ts); // []

        ts.add('L');
        ts.add('D');
        ts.add('Y');
        ts.add('M');
        ts.add('A');
        System.out.println("ts = " + ts); // [A, D, L, M, Y]
        // TreeSet follows natural order
        // If it's storing char / strings => Alphabetical order
        // If it's storing numeric => smaller to bigger


        // Can we add null to a TreeSet?
        // ts.add(null);
        // System.out.println("ts = " + ts); // NullPointerException
        // TreeSet DO NOT accept null values


        // subSet() returns a set from within the existing values

        // TreeSet<Character> subSet1 = ts.subSet('D', 'M'); => error
        // because subSet() method implements SortedSet interface

        SortedSet  <Character> subSet1 = ts.subSet('D', 'Y');
        System.out.println("subSet1 = " + subSet1); // [D, L]  => starting value is inclusive, ending value is exclusive

        // ts = [A, D, L, M, Y]

        System.out.println(ts.ceiling('Y')); // Y
        System.out.println(ts.ceiling('L')); // L
        System.out.println(ts.ceiling('Z')); // null
        System.out.println(ts.ceiling('C')); // D
        System.out.println(ts.ceiling('A')); // A
        System.out.println(ts.ceiling('P')); // Y

        //ceiling() returns the least element in this set greater than or equal to the
        // given element, or null if there is no such element.

        // ts = [A, D, L, M, Y]
        System.out.println(ts.floor('D'));
        System.out.println(ts.floor('Z')); //Y
        System.out.println(ts.floor('A')); //A
        System.out.println(ts.floor('C')); //A

        // floor() returns the greatest element in this set less than or equal to the
        // given element, or null if there is no such element


        /*
        Following two methods are important for finding nearest elements in TreeSets:
        ceiling(E e) → Returns the smallest element greater than or equal to e (≥ e).
        floor(E e) → Returns the largest element smaller than or equal to e (≤ e).
         */

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("TreeSet: " + numbers);

        // ceiling() example
        System.out.println("Ceiling of 25: " + numbers.ceiling(25)); // Output: 30
        System.out.println("Ceiling of 30: " + numbers.ceiling(30)); // Output: 30
        System.out.println("Ceiling of 50: " + numbers.ceiling(50)); // Output: null

        // floor() example
        System.out.println("Floor of 25: " + numbers.floor(25)); // Output: 20
        System.out.println("Floor of 30: " + numbers.floor(30)); // Output: 30
        System.out.println("Floor of 5: " + numbers.floor(5)); // Output: null




    }
}
