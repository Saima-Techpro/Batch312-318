package practices.day02;


public class C04_StringManipulations {
    public static void main(String[] args) {
        //TASK: Create 3 strings for the full names of 3 people.
        //Print the total number of the letters in their names, excluding the space character.

        String name1 = "Bob Smith";
        String name2 = "Mike Olsen";
        String name3 = "Samuel L Jackson";

        name1 = name1.replace(" ", "");
        name2 = name2.replace(" ", "");
        name3 = name3.replace(" ", "");

        // .trim("     Bob Smith      ") -> "Bob Smith"
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        //int length1 = name1.length();

        System.out.println("Total length of all names: " + (name1.length() + name2.length() + name3.length()));
    }
}
