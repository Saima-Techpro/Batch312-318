package day18arraylist;

import java.util.ArrayList;

public class ArrayList03 {
    public static void main(String[] args) {

        // Create an ArrayList with duplicate values. transfer the unique values in another ArrayList

        ArrayList<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('a');
        a.add('v');
        a.add('a');
        System.out.println("a = " + a); // [J, a, a, v, a]

        ArrayList<Character> b = new ArrayList<>();

        //1st way: using "continue" keyword

        for (Character w : a){
            if (b.contains(w)){
                continue; // skip that element
            }
            b.add(w);
        }

        System.out.println("b = " + b); // [J, a, v]

        // 2nd way:
        for (Character w : a){
            if (!b.contains(w)) {
                b.add(w);
            }
        }
        System.out.println("b = " + b);

        ArrayList<String > str = new ArrayList<>();
        str.add("John");
        str.add("Emily");
        str.add("Bob");
        System.out.println("str before removing = " + str); // [John, Emily, Bob]

//         System.out.println(str.remove(0));
//        System.out.println("str = " + str);

        if (str.get(0).contains("o")){
            str.remove(0);
        }

        System.out.println("str = " + str);

        if (str.get(1).contains("o")){
            str.remove(1);
        }

        System.out.println("str = " + str); // [Emily]

        // NOTE: remove(index) removes the element from a given index and after that remaining
        // elements in the ArrayList are re-indexed.
        // When remove(index) is used for a single element, it doesn't cause a problem.
        // But when it is used in a loop without decrement / increment, it throws exception/error

        System.out.println("============= INTERVIEW QUESTION ==============");
        // Create a String ArrayList of cities and remove the ones that contain "u"

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Dubai");
        cities.add("Istanbul");
        cities.add("Darmstadt");
        cities.add("Koln");
        cities.add("Virginia");
        cities.add("Cologne");
        cities.add("Baku");
        cities.add("Izmir");
        System.out.println("cities = " + cities);

        // [Dubai, Istanbul, Darmstadt, Koln, Virginia, Cologne, Baku, Izmir]
        /*
        for (String w : cities){

            if (w.contains("u")) {
                cities.remove(w);
            }
        }
        System.out.println("cities = " + cities); // ConcurrentModificationException

        NOTE:

        The above loop shows error (throw exception => ConcurrentModificationException).
        This is the loop's way of telling us that structure of the ArrayList is constantly changing;
        and it's impossible to work with it.
        We know the reason is ArrayList always reindex their elements whenever we add/remove an element.
        So we need to create a logic where we can control the index from moving on i.e. loop stays at the
        same index.
        We will use decrement for that purpose


         */

        // [Dubai, Istanbul, Darmstadt, Koln, Virginia, Cologne, Baku, Izmir]

        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).toLowerCase().contains("u")){
                cities.remove(i);
                i--;
            }
        }
        System.out.println("cities = " + cities);


    }
}
