package day14loops_arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {


        // Create an array of int data type of size 5 and print the sum of the first and the last number

        int[] numbers = new int[5];
        numbers[0] = 12;
        numbers[1] = 7;
        numbers[2] = 25;
        numbers[3] = 9;
        numbers[4] = 57;
//        numbers[5] = 89;  this will show error

        System.out.println(Arrays.toString(numbers)); // [12, 7, 25, 9, 57]

         /*
        NOTE: Arrays.toString() returns a string representation of the array, but the original numbers array
            remains unchanged in terms of its data type and content.
         */

        System.out.println(numbers[0] + numbers[4]); // 69 => HARD CODED
        System.out.println(numbers[0] + numbers[numbers.length-1]); // 69 => DYNAMIC

        int firstNumb = numbers[0];
        int lastNumb = numbers[numbers.length-1];

        int sum = firstNumb + lastNumb;
        System.out.println("sum = " + sum); // 69


        // Create an array of cities of size 7, add names to it and print it on the console

        String cities[] = new String[7];
        cities[0] = "Herat";
        cities[1] = "Kabul";
        cities[2] = "Kandahar";
        cities[3] = "Nemroz";
        cities[4] = "Helmand";
        cities[5] = "Farah";
        cities[6] = "Mazar-e-Sharif";

        System.out.println(Arrays.toString(cities)); // [Herat, Kabul, Kandahar, Nemroz, Helmand, Farah, Mazar-e-Sharif]

        // How to print all elements one by one?

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
        System.out.println(cities[5]);
        System.out.println(cities[6]);

        // Not a good practice .... lots of repetition

        System.out.println("=========== Using for loop ============");
        // Using loop
        // 1st way: for loop

        for (int i = 0; i < cities.length; i++){
            System.out.println(cities[i]);
        }

        System.out.println("=========== Using for each loop ============");
        // 2nd way: for each loop => an advance version of for loop; usually used with Arrays and Collections

        for (String temp : cities){
            System.out.println(temp);

        }

        System.out.println("============================");

        // Create an Array of double data type named "prices" of size 4 and print the sum of all values

        double[] prices = new double[4];
        prices[0] = 12.50;
        prices[1] = 9.90;
        prices[2] = 4.80;
        prices[3] = 34.50;

        System.out.println(Arrays.toString(prices));  // [12.5, 9.9, 4.8, 34.5]

        // 1st way
        System.out.println("Total = "+ (prices[0]+prices[1]+prices[2]+prices[3]));

        // 2nd way
//        price = [12.5, 9.9, 4.8, 34.5]

        double total = 0;

        for (double w : prices){
            total = total + w;
//            total += w;
        }
        System.out.println("total = " + total);


    }
}
