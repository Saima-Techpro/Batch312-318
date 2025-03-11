package day28maps;

import java.util.HashMap;

public class Map02 {
    public static void main(String[] args) {

          /*
        -	Hashing Technique" means Java creates unique values (hash codes) for each element.
        -	HashMap can accept "Key" as null; other Maps don't.
        -	Value can be null repeatedly.
        -	The order in HashMap is random order. It's superfast.
         */
        HashMap<String, Integer>  stdAges = new HashMap<>();
        stdAges.put("Ali", 15);
        stdAges.put("Ayse", 17);
        stdAges.put("Veli", 18);
        stdAges.put("Maryam", 16);
        stdAges.put("Fatma", 17);

        System.out.println("stdAges = " + stdAges); // {Veli=18, Ayse=17, Fatma=17, Maryam=16, Ali=15}

        // Can we add null key?
        // Yes we can add one null key.
        // If we send null key second time, it will over-write the previous null key

        stdAges.put(null, 18);
        System.out.println("stdAges = " + stdAges); // {null=18, Veli=18, Ayse=17, Fatma=17, Maryam=16, Ali=15}

        stdAges.put(null, 20);
        System.out.println("stdAges = " + stdAges); // {null=20, Veli=18, Ayse=17, Fatma=17, Maryam=16, Ali=15}


        // Can we add null value?
        // Yes, we can store multiple null values
        stdAges.put("Husna", null);
        stdAges.put("Taimur", null);
        stdAges.put("Someone else", null);
        System.out.println("stdAges = " + stdAges);


        // replace()
        stdAges.replace("Ali", 19);
        System.out.println("stdAges = " + stdAges);

        stdAges.replace("Fatma", 17, 21);
        System.out.println("stdAges = " + stdAges);


        // putIfAbsent() checks if the given key-value pair exists in the map already
        // If exists, it returns its current value
        // If absent, this method adds the new key-value pair in the map

        System.out.println(stdAges.putIfAbsent("Mikail", 18)); // null => didn't exist, so added now
        System.out.println("stdAges = " + stdAges);


        //get() method returns the value of the given key
        //getOrDefault() returns the current value if the key exists
        //getOrDefault() returns the given value if the key does not exist
        // You can set any value as a default value to be returned in case the key doesn't exist

        System.out.println(stdAges.get("Veli"));
        System.out.println(stdAges.getOrDefault("Ali", 0)); // 19
        System.out.println(stdAges.getOrDefault("Ayse", 0)); // 17
        System.out.println(stdAges.getOrDefault("Elyas", -1)); // 0

        // remove(key) method checks if the given key exists in the map, if it does, it removes the whole entry (key-value pair)
        // remove(key, value) method checks if the given key and value exists in the map, if it does, it removes the whole entry (key-value pair)

        System.out.println(stdAges.remove("Ali")); // returns the value of the key which is found in the map
        System.out.println(stdAges.remove("Ayse", 17)); // returns true
        System.out.println("stdAges = " + stdAges);




    }
}
