package day28maps;

import java.util.*;

public class Map03 {
    public static void main(String[] args) {

        /*

        a)HashMap is non-synchronized. This means that multiple threads can access a HashMap at the same time.

        For example, if one customer withdraws money while another deposits at the same time, it could result in an
        incorrect account balance. (it is also not thread-safe)

        However, synchronization must be managed manually in such cases.
        (developers use special structures like Synchronized Blocks, Locks, and Semaphores.)

        b)HashTable is thread - safe and synchronized.
        (meaning that only one thread can use the same Hashtable at a time, creating a queue and extending the service
        time).

        c) TreeMaps are not thread-safe and synchronized.

        d) LinkedHashMap are also not thread-safe and synchronized.


        Difference between HashMap and Hashtable?
        1. HashMap allows ONE null key (doesn't allow duplicate, if we try to add 2nd null key,
            it would over-write the existing one) but allows MULTIPLE null values.
            However, Hashtable does NOT allow null at all (no null key, no null value).
            Throws NullPointerException for any null key/value

        2. HashMap is faster compared to HashTable.
           Both HashMap and Hashtable store each entry (key-value pair) randomly.


         */
        Hashtable<String, Integer> stdGrades = new Hashtable<>();
        // Can we add null key / value?
        // NO

        // stdGrades.put(null, 70); // error => NullPointerException
        // stdGrades.put("Mert", null); // error => NullPointerException

        stdGrades.put("Ali", 86);
        stdGrades.put("Maryam", 90);
        stdGrades.put("Hulya", 80);
        stdGrades.put("Veli", 92);
        stdGrades.put("Aisha", 89);

        // HashTable follows random order
        System.out.println("stdGrades = " + stdGrades); // {Aisha=89, Hulya=80, Ali=86, Maryam=90, Veli=92}

        stdGrades.computeIfAbsent("John", k-> 75); // k-> is the lambda function which we will learn later
        System.out.println("stdGrades = " + stdGrades);


        /*

        NOTES:
        Both computeIfAbsent() and putIfAbsent() in Java's Hashtable (or other Map implementations)
        are used to insert a value if the key is missing, but they differ in how they determine the
        value to insert.
        putIfAbsent(K key, V value):
        If "John" is already in stdGrades, it does nothing.
        If "John" is missing, it adds "John" -> 75.

        computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction):
        If "John" is missing, it calls the function k -> 75 (where k is "John") and inserts "John" -> 75.
        If "John" is already in stdGrades, it does nothing.

        When to Use What?
        Use putIfAbsent() when you have a fixed default value.
        Use computeIfAbsent() when the value depends on computation, like fetching from a
        database or performing calculations.

         */

        /*
                                TreeMap

             TreeMap stores the entries (key-value pair) in NATURAL order, hence they're SLOW.
             They order the entries considering keys.
             They don't allow null for the keys, but allow null values.
             TreeMaps are not thread-safe and synchronized

         */

        TreeMap<String, String > capitals = new TreeMap<>();
        capitals.put("UK", "London");
        capitals.put("UAE", "Abu Dhabi");
        capitals.put("Turkiye", "Istanbul");
        capitals.put("Afghanistan", "Kabul");
        capitals.put("Germany", "Berlin");
        System.out.println("capitals = " + capitals); // follows natural order

        //capitals.put(null, "Madrid"); // NullPointerException
        capitals.put("Spain", null);
        capitals.put("Italy", null);
        capitals.put("United States", null);
        System.out.println("capitals = " + capitals);

        System.out.println(capitals.subMap("Germany", "UAE"));

        /*
                    LinkedHashMap
                It stores the entries in insertion order
         */

        LinkedHashMap<String, String> capitals1 = new LinkedHashMap<>();
        capitals1.put("UK", "London");
        capitals1.put("UAE", "Abu Dhabi");
        capitals1.put("Turkiye", "Istanbul");
        capitals1.put("Afghanistan", "Kabul");
        capitals1.put("Germany", "Berlin");

        System.out.println("capitals1 = " + capitals1); // follows insertion order

        // Get the entries one by one
        Set<Map.Entry<String, String>> allEntries = capitals1.entrySet();
        System.out.println("allEntries = " + allEntries);

        for (Map.Entry<String, String>  w: allEntries){
            // System.out.println(w);
            String key = w.getKey();
            System.out.println(key);

            String value = w.getValue();
            System.out.println(value);
        }


    }
}
