package day14loops_arrays;

import java.util.Arrays;

public class HW {
    public static void main(String[] args) {

        // Task 1 : Create an int array called 'ages' of size 6. Print them in Ascending order
        int ages[] = {12, 6, 9, 18, 22, 15};
        System.out.println(Arrays.toString(ages)); // [12, 6, 9, 18, 22, 15]

        Arrays.sort(ages);
        System.out.println("After sorting: "+ Arrays.toString(ages)); // [6, 9, 12, 15, 18, 22]


        // Task 2 : Create another int array called 'grades' of size 6.

        int grades[] = {59, 67, 99, 20, 70, 85};
        System.out.println(Arrays.toString(grades)); // [59, 67, 99, 20, 70, 85]


        // Task 3:  Get the max and min age from this array

        // 1st way: AFTER sorting the array
        // we can use index[0] to get the min value
        // we can use index[last index] to get the max value => last index (length-1)

        int minAge = ages[0];
        int maxAge = ages[ages.length-1];
        System.out.println("minAge = " + minAge);
        System.out.println("maxAge = " + maxAge);
        // NOTE: with Strings, we use length() method to count the number of characters
        // NOTE: with Arrays, we use length property/field to count the number of characters


        // 2nd way: WITHOUT sorting the array, Using Math.max() and Math.min()
        // Get the max and min from grades array
        // grades = [59, 67, 99, 20, 70, 85]

        int minGrade = grades[0];  // we assume that the value at index 0 is the minimum
        int maxGrade = grades[0];  // we assume that the value at index 0 is the maximum

        for (int w : grades){
            maxGrade = Math.max(w, maxGrade);
            minGrade = Math.min(w, minGrade);
        }

        System.out.println("minGrade = " + minGrade); // 20
        System.out.println("maxGrade = " + maxGrade); // 99



        // Task 4:  Check if the two arrays are equal?
        System.out.println("ages:" + Arrays.toString(ages));
        System.out.println("grades:" + Arrays.toString(grades));

        // 1st way:
        System.out.println("Are th two arrays equal? " + (ages == grades)); // false

        // 2nd way:
        boolean check = ages.equals(grades);
        System.out.println("check = " + check); // false

        // 3rd way:
        if (Arrays.equals(ages, grades)) {
            System.out.println("Arrays are equal!!");
        } else {
            System.out.println("Arrays are not equal.");
        }

        // what if two arrays have same values?

        int[] a = {3, 6, 8};
        int[] b = {3, 8, 6};

        System.out.println("a = " + Arrays.toString(a)); // a = [3, 6, 8]
        System.out.println("b = " + Arrays.toString(b)); // b = [3, 8, 6]

        boolean check1 = a.equals(b);
        System.out.println("check1 = " + check1);  // false

        int[] c = {3, 6, 8};
        int[] d = {3, 6, 8};
        boolean check2  = c.equals(d);
        System.out.println("check2 = " + check2); // false

         /*              Important Note:

        - Arrays are objects, stored in HEAP memory.
        - Objects have UNIQUE references.
        - equals() method checks the value AS WELL AS reference.
        - In this example, c.equals(d) checks the values, values are the same at the sames indices.
          However, reference of each array is unique hence not equal. That's why check1 returns false as well.

        - So if you want to check values ONLY inside the two arrays, use Arrays.equal() method.
          Arrays.equal() method checks the values only, not the references.

         */
        System.out.println(Arrays.equals(a, b)); // false

        System.out.println(Arrays.equals(c, d)); // true
    }
}
