package day19arraylist;

import java.util.ArrayList;

public class HW {
    public static void main(String[] args) {

        // Task 1: Reverse the given String arrayList without a method call

        System.out.println("================= without method call ============== ");
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        System.out.println("original list = " + list);

        // Reverse without method call

        System.out.println("================= Using for loop ============== ");

        // Using for loop
        ArrayList<String> reversedList = new ArrayList<>();

        // Using a for loop to iterate in reverse
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        System.out.println("Reversed List: " + reversedList);

        System.out.println("================= Using while loop ============== ");

        // Using a while loop
        int index = 0;
        int length = list.size() - 1;

        while (index < length) {
            // Swap elements
            String temp = list.get(index);
            list.set(index, list.get(length));
            list.set(length, temp);

            // Move pointers
            index++;
            length--;
        }

        System.out.println("Reversed List: " + list);


        System.out.println("================= with method call ============== ");

        // Task2 : Reverse the given String arrayList with method call
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");

        System.out.println(planets); // [Mercury, Venus, Earth, Mars]

        // method call
        System.out.println("reversedArrayList(planets) = " + reversedArrayList(planets)); // reversedArrayList(planets) = [Mars, Earth, Venus, Mercury]
    }

    public static ArrayList<String> reversedArrayList(ArrayList<String> givenList) {

        ArrayList<String> reversedList = new ArrayList<>();
        for (int i = givenList.size() - 1; i >= 0; i--) {
            reversedList.add(givenList.get(i));
        }
        return reversedList;

    }

}
