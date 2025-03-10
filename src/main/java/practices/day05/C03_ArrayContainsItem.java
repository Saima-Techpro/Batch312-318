package practices.day05;

import java.util.Scanner;

public class C03_ArrayContainsItem {
    public static void main(String[] args) {

        //TASK: For the given string array, write a method that would return
        //true if a word that user enters exists in the array, and false if not.

        String[] names = {"bob", "jack", "mike", "franklin", "trevor"};
        //names.contains(); Arrays do not have a contains method.
        System.out.println("Name exists in array: " + containsElement(names));
    }

    public static boolean containsElement(String[] names) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name that you want to check for:");
        String expectedName = input.nextLine();

        for (String name : names){
            if (expectedName.equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
}
