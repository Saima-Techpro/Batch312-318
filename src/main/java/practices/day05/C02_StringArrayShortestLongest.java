package practices.day05;

public class C02_StringArrayShortestLongest {
    public static void main(String[] args) {
        //TASK: For the given string array, write a method that would print the longest and shortest strings in the array.

        String[] names = {"bob", "jack", "mike", "franklin", "trevor"};

        shortestAndLongest(names);
    }

    public static void shortestAndLongest(String[] strArray){
        String min = strArray[0];
        String max = strArray[0];

        for (String item : strArray){
            if (item.length() < min.length()){
                min = item;
            }
            if (item.length() > max.length()){
                max = item;
            }
        }

        System.out.println("Longest string: " + max);
        System.out.println("Shortest string: " + min);
    }
}
