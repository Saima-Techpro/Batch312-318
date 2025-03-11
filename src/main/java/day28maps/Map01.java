package day28maps;

import java.util.*;

public class Map01 {
    public static void main(String[] args) {

           /*

          1) Maps have key - value structure
           2)Keys are unique but values are not
           3)Every element in a Map is called as "Entry"
           4)All elements are called as "EntrySet" => key-value pair
           5)Key cannot be null in maps except "HashMap" but value can
           6)HashMap puts the entries in random order, because of that it is superfast.
	       7)Maps are NOT collections.

-	Maps are like dictionaries. They are descriptive. e.g.: Jim = 13.
-	The left side, i.e., keys, are unique. The value side can have duplicates.
-	For keys, a Set is used. For values, a Collection structure is generally used.
-	***(A Collection structure is used, which can be a List or an Array depending on the situation.)


            */

        // Map<String, Integer> myMap= new Map(); // error => because Map is an interface and interfaces do NOT have constructors so no object creation
        //  Map<String, Integer> myMap = new HashMap<>();

        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Tom Cruise", 79);
        myMap.put("Keira Knightly", 39);
        myMap.put("Keanu Reeves", 60);
        myMap.put("Denzil Washigton", 70);
        myMap.put("Judi Dench", 74);
        myMap.put("Al Pacino", 71);
        myMap.put("Emma Watson", 34);
        myMap.put("" , 25);

        // HashMap follows random insertion, hence fast
        System.out.println("myMap = " + myMap);

        // Can we add duplicate keys?
        myMap.put("Keira Knightly", 39);
        //System.out.println("myMap = " + myMap);
        // When we try to add duplicate key, the existing one gets over-written
        // We don't get to see the key being stored twice.

        myMap.put("Keira Knightly", 42);
        System.out.println("myMap = " + myMap);

        // If the key has a new value, the value would be updated


        // How to get keys from a map?
        //System.out.println(myMap.keySet());

        Set<String> keys = myMap.keySet();
        System.out.println("keys = " + keys);

        // how to get values from a map?
        // System.out.println(myMap.values());

        Collection<Integer> values = myMap.values();
        System.out.println(values);

        // get() => used to get specific value from the map
        // get() method works with the key and returns its value

        System.out.println(myMap.get("Keanu Reeves")); // 60

        Integer age = myMap.get("Judi Dench");
        System.out.println("age = " + age);


        // Can we get key / value one by one?
        // keys only

        for (String w: keys){
            System.out.println(w);
        }

        // values only
        for (Integer w: values){
            System.out.println(w);
        }


        // Can we get key-value pair one by one?
        // System.out.println(myMap.entrySet());

        for (Map.Entry<String, Integer>  w : myMap.entrySet()){
            System.out.println(w);
        }

        /*
        Real life use case of Map.Entry<> stores key-value pair
          - count word frequency in a text
          - count product sale in an e-commerce app
          - track website visitors by their IDs
          - store exam scores of students
         */


        // Can we use other loops?
        // For loop
        System.out.println("====== For loop ======");
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(myMap.entrySet());
        int i = 0;
        while (i < entryList.size()) {
            Map.Entry<String, Integer> entry = entryList.get(i);
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
            i++;
        }

        System.out.println();
        System.out.println("====== While loop ======");

        // while loop
        List<Map.Entry<String, Integer>> entryList1 = new ArrayList<>(myMap.entrySet());

        int j = 0;
        while (j < entryList1.size()) {
            Map.Entry<String, Integer> entry = entryList1.get(j);
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
            j++;
        }



    }
}
