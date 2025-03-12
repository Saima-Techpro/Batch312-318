package day28maps;

import java.util.Arrays;
import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {

        /*
           Interview Question
        - Write code that shows how many times each word is used in a given String.
        - The operation should be case-insensitive.
        Example:
        - Mike is Mike.  => mike is mike ==> mike, is, mike
        - expected result should be in a map => {mike=2, is=1}

        HomeWork:
        - Extension: Also count the letters => {m=2, i=3....}

         */

        String str = "How much Wood would a woodchuck chuck if a woodchuck could chuck Wood?";

        //String[] words = str.replaceAll("\\p{Punct}", "").toLowerCase().split(" ");

        str = str.replaceAll("\\p{Punct}", "").toLowerCase();
        //System.out.println("str = " + str);

        String[]  words = str.split(" ");
        // System.out.println(words); // [Ljava.lang.String;@3feba861
        System.out.println(Arrays.toString(words));
        // [how, much, wood, would, a, woodchuck, chuck, if, a, woodchuck, could, chuck, wood]

        // Create an empty map to store the words and number of times they appear in the Array
        HashMap<String , Integer> myMap = new HashMap<>();


        for (String w: words){

            Integer usage = myMap.get(w); // check the map if the value of this key exists

            if (usage == null){ // if the value of the key is null

                myMap.put(w, 1); // add the key and assign it a new value which is 1

            }else {
                myMap.put(w, usage+1); // if the key already exists in the map, adding it again  will over-write it because keys can't be duplicate in maps
                                        // assign a new value to this key by adding 1 to the existing value.
            }

        }
        System.out.println("myMap = " + myMap);


    }
}
