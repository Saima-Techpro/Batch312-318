package day08stringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {


        /*
         ******** Notes about REGULAR EXPRESSIONS ********

        regex => Regular Expressions

            To define a group of data, we use Regular Expressions in Java. short name => REGEX
            REGEX are used with replaceAll() method
            There are many REGEX, but we will learn the most commonly used ones:

            //inclusive Regex
                1) All the letters ==> [a-zA-Z]
                2) All lowercase letters ==> [a-z]
                3) All uppercase letters ==> [A-Z]
                4) All digits ==> [0-9]
                5) All the letters and digits ==> [a-zA-Z0-9]
                6) All punctuations ==> \\p{Punct}
                7) All the vowels ==> [aeiouAEIOU]
                8) All random characters like a, x, y  ==> [axy]
                9) A given range e.g. From A - G and a - g ==> [A-Ga-g]


            //exclusive Regex ==> we use "^" to exclude defined group of data....
            //It means "other than" or "except"

               1) All the characters other than digits ==> [^0-9]
               2) All the characters other than lowercase letters ==> [^a-z]
               3) All the characters other than letters ==> [^a-zA-Z]
               4) All the characters other than space ==> [^ ]

             // Following Regex are used without square bracket
               1) Only space character ==> \\s
                   \\s+  is used for multiple spaces
                   replace multiple spaces with single space => replaceAll("\\s+", " ")
               2) Except space character ==> \\S
               3) Only digits ==> \\d
               4) Except digits ==> \\D
               5) Only punctuation=> \\p

         */

        // OOP => Object Oriented Programming

        String str = "  Java is an OOP language.  ";
        System.out.println("Total characters = " + str.length()); // 28

        // Remove all spaces and then count how many characters are left

        // 1st way:
        String strWithoutSpaces = str.replaceAll("\\s", ""); // \\s removes spaces ONLY
        System.out.println("strWithoutSpaces = " + strWithoutSpaces); //JavaisanOOPlanguage.

        // 2nd way:
        String strWithoutSpaces2 = str.replaceAll("[^a-zA-Z]", ""); // [^a-zA-Z] removes everything including spaces, numbers, symbols etc.
        System.out.println("strWithoutSpaces2 = " + strWithoutSpaces2);


        // Remove all alphabets from the string

        String strWithoutAlphabets = str.replaceAll("[a-zA-Z]", "");
        System.out.println("strWithoutAlphabets = " + strWithoutAlphabets);

        System.out.println("strWithoutAlphabets length= " + strWithoutAlphabets.length()); // 9

        System.out.println("======================================");

        String s = "Learn Java 2025#@%&*$ 02 Earn money!";

        // Replace money with dollars

        System.out.println(s.replaceAll("money", "dollars")); // Learn Java 2025#@%&*$ 02 Earn dollars!
        System.out.println(s.replaceAll("a", "")); // Lern Jv 2025#@%&*$ 02 Ern money!

        // Remove all special characters one by one
        System.out.println(s.replaceAll("#", ""));
        System.out.println(s.replaceAll("@", ""));
        System.out.println(s.replaceAll("%", ""));
        System.out.println(s.replaceAll("&", ""));
        System.out.println(s.replaceAll("\\*", ""));
        System.out.println(s.replaceAll("\\$", ""));

        // Remove all special characters at once

        System.out.println(s.replaceAll("[#@%&*$]", ""));

        // to remove special characters permanently, assign it back to the s variable
        s = s.replaceAll("[#@%&*$]", "");
        System.out.println("s after replacing all special characters= " + s);

        // Replace all numbers with *
        System.out.println(s.replaceAll("[0-9]", "*"));

        // Remove all numbers and calculate the total characters left
        String sWithoutNumbers = s.replaceAll("[0-9]", "");
        System.out.println("sWithoutNumbers = " + sWithoutNumbers); // Learn Java   Earn money!

        System.out.println("sWithoutNumbers.length = " + sWithoutNumbers.length()); // 24

        // Remove multiple spaces with one space
        System.out.println(sWithoutNumbers.replaceAll("\\s+", " "));


        // Remove all punctuations from the String
        System.out.println(sWithoutNumbers.replaceAll("\\p{Punct}", ""));


    }
}
