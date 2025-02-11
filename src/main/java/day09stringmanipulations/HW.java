package day09stringmanipulations;

public class HW {
    public static void main(String[] args) {

        // Task 1: Type code to find order number of last occurrence of the word "Java"
        // Task 2: Find out how many times, the word "Java" occurred in this String.
        String str = "I like to study Java. Learn Java, earn money. Java is OOP language. Java is easy!";

        int wordOccurrence = str.lastIndexOf("Java");
        System.out.println("wordOccurrence = " + wordOccurrence); //68

        // Task 2: Count occurrences of "Java"
//        int count = str.substring(0, wordOccurrence).split("Java").length;
//        int count = str.split("Java").length;
//        System.out.println("Count of 'Java' occurrences = " + count); //4
        // OR

        int count = str.split("Java", -1).length - 1; // limit = -1 ensures that in case if there's an empty subString in the end, count that too
        System.out.println("Count of 'Java' occurrences = " + count); // 4






        // Task 3:   Type code to check if the given letter is unique in the String
        String s = "Hello World"; //H , e and o are unique, but l is repeated so it's not unique
        // Miami => the only unique letter is a

        if (s.indexOf('o') == -1){
            System.out.println("The given letter doesn't exist");

        }  else if (s.indexOf('o') == s.lastIndexOf('o')){
            System.out.println( "The given letter is unique. ");
        } else {
            System.out.println("The given letter is not unique.");
        }



    }
}
