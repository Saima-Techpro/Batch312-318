package day15arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        // Arrays.equal() method

        // How to check if two arrays are equal or not?

        int a[] = {3, 6, 8};
        int b[] = {3, 8, 6};

        System.out.println(a == b); // false

        boolean check  = a.equals(b);
        System.out.println("check = " + check); // false


        int[] c = {3, 6, 8};
        int[] d = {3, 6, 8};

        System.out.println( c == d); // expecting true but found false

        boolean check1 = c.equals(d);
        System.out.println("check1 = " + check1); // expecting true but found false

        /*
                 IMPORTANT NOTE:

          - Arrays are Objects, stored in HEAP memory, their reference is stored in stack memory.
          - Arrays have UNIQUE references.
          - equals() method checks the reference equality in Arrays (unlike Strings, in Strings, it checks value)
          - equality operator == checks the reference only in Arrays (like in Strings)

          * reference of each array is unique hence they're never equal even though they've same values (as in above example)
          - To check if the two Arrays are equal or not, we use Arrays.equal() method
          - Arrays.equal() method checks the content ONLY

         */

        // binarySearch() method

        int[] numbers = {5, 8, -3, 12, 7, -4, 2};
        System.out.println(Arrays.toString(numbers)); // [5, 8, -3, 12, 7, -4, 2]

        // Print the ones that are less than 5

        for (int w : numbers){
            if (w < 5){
                System.out.print(w + " "); // -3, -4, 2
            }
        }
        System.out.println();
        System.out.println("======== binarySearch() method =========");
        // See if there is number 9 in the above array
        // BEFORE sorting the array
        // [5, 8, -3, 12, 7, -4, 2]

        System.out.println(Arrays.binarySearch(numbers, 5)); // 0  => returns correct index of an existing number we are looking for
        System.out.println(Arrays.binarySearch(numbers, 2)); // -1 => returns incorrect index of an existing number we are looking for
        System.out.println(Arrays.binarySearch(numbers, 9)); // -4  => returns the index of non-existing numbers


        System.out.println("========= AFTER sorting the array ===========");
        // AFTER sorting the array
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        // [-4, -3, 2, 5, 7, 8, ? , 12]

        System.out.println(Arrays.binarySearch(numbers, 5)); // 3
        System.out.println(Arrays.binarySearch(numbers, -4)); // 0
        System.out.println(Arrays.binarySearch(numbers, 8)); // 5

        // NOTE: if we use binarySearch() AFTER sorting the array, it ALWAYS returns correct index of the existing numbers from the array

        // what happens if the number we are looking for doesn't exist in the array?
        System.out.println(Arrays.binarySearch(numbers, 9)); // -7

        /*

        NOTES on binarySearch()
        - binarySearch() method should be used AFTER sorting the array to get accurate index
        - binarySearch() method returns the index of the element if it exists in the Array
        - binarySearch() method returns '-' negative index of the element if it does NOT exist in the Array
        - binarySearch() method returns the place / order of the element IF IT EXISTED in the sorted Array using following formula:
            -(insertion point) - 1
            - (6)-1
            -7    => indicating that this would be the place of insertion if 9 existed in the array

         */

        String[] letters = {"M", "A", "T", "G", "Z"};
        System.out.println(Arrays.toString(letters)); // [M, A, T, G, Z]

        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters)); // [A, G, M, T, Z]

        // Find the index of "C"
        System.out.println(Arrays.binarySearch(letters, "C")); // -2
        int indexOfC = Arrays.binarySearch(letters, "C");
        System.out.println("indexOfC = " + indexOfC); // -2

        // Find the index of "O"
        int indexOfO = Arrays.binarySearch(letters, "O");
        System.out.println("indexOfO = " + indexOfO); // -4


        // Find the number of words from the given String

        String str = "binarySearch method is sooooo confusing!!!";

        System.out.println(str.split(" ").length);  // 5
        System.out.println(str.split("!").length);  // 1 => because split() does NOT count the trailing empty arrays

        System.out.println(str.split("!", -1).length); // 4

        // OR
        String[] words =  str.split(" ");
        System.out.println(Arrays.toString(words)); // [binarySearch, method, is, sooooo, confusing!!!]
        System.out.println(words.length); // 5


    }
}
