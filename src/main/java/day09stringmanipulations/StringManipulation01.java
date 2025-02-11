package day09stringmanipulations;

public class StringManipulation01 {
    public static void main(String[] args) {

        /*
        substring() method:
        There are two types of substring() methods:
        1. substring(starting index) => single parameter => returns value at the given index and the rest of the String
        2. substring(starting index, ending index) => two parameters => returns value at the given index
                                                    where staring index is inclusive and ending index is exclusive

          NOTE: index start at zero
          starting index => inclusive => the value at this index is included
          ending index => exclusive => the value at this index is NOT included

          contains() method: looks for the exact match of the value that you're looking for

          startsWith(single parameter) => checks if the String starts with given word/letter and returns boolean
          startsWith(two parameter) => ("word/letter" , index to skip) => checks if the String starts with given word/letter
                                        AFTER skipping the given index and returns boolean

           endsWith(single parameter) => checks if the String ends with given word/letter and returns boolean

         */

        String str = "Learn Java, earn money. Enjoy your life!!";

        System.out.println(str.substring(7));

        // Print the first word from the given String
        String firstWord =  str.substring(0, 5);
        System.out.println("firstWord = " + firstWord); //Learn

        // Print the word "Java" from the given String
        String secondWord = str.substring(6,10);
        System.out.println("secondWord = " + secondWord); // Java

        // Print the remaining String AFTER the word "earn"
        // Learn Java, earn money. Enjoy your life!!
        // 1st way:
        String remainingString = str.substring(16);
        System.out.println("remainingString = " + remainingString);

        // 2nd way:
        System.out.println(str.substring(16, 41)); // Hard coding
        System.out.println(str.substring(16, str.length())); // dynamic



        // Check if the given String contains "Enjoy"
        boolean isExist = str.contains("Enjoy");
        System.out.println("isExist = " + isExist);

        // we can use it in ternary of if statement
        System.out.println(str.contains("enjoy") ? "true" : "false");


        // startsWith()
        // Learn Java, earn money. Enjoy your life!!

        boolean isStart = str.startsWith("Learn");
        System.out.println("isStart = " + isStart); // true

        System.out.println(str.startsWith("money", 17)); // true
        System.out.println(str.startsWith("money", 11)); // false

        //endsWith()

        boolean isEnd = str.endsWith("life");
        System.out.println("isEnd = " + isEnd); // false

        System.out.println(str.endsWith("!")); // true

    }
}
