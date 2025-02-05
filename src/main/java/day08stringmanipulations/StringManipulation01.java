package day08stringmanipulations;

public class StringManipulation01 {
    public static void main(String[] args) {

        /*
        String is NON-PRIMITIVE data type.
        It has values as well as methods.
        We use " " to declare the values in a String.
        Strings can store alphabets, characters, numbers, signs etc.
         */

        String str = "I love Java";
        System.out.println(str.toLowerCase()); // i love java
        System.out.println(str.toUpperCase()); // I LOVE JAVA

        System.out.println("original string: "+str); // I love Java

        // NOTE: Original string value won't change UNLESS we assign it back to str variable
//        str = str.toUpperCase();
//        System.out.println("original string: "+str); // I LOVE JAVA

        String str1 = "Java is easy.";

        /*
        The process of joining two strings is called CONCATENATION.
        we can do this in two ways:
        1. Using plus (+) sign => String + String => We can add different signs in between=> , . a space
        2. Using concat() method =>  We can't add any signs between the two strings

        NOTE: It is recommended to use JAVA METHODS if they're provided.

         */
        String str2 = "I'm learning Java.";

        // 1st way:
        System.out.println(str +". " + str1); // I love Java. Java is easy.

        // 2nd way:
        System.out.println(str.concat(str1)); // I love JavaJava is easy.

        // Can we concat more than one strings?
        System.out.println(str.concat(str1).concat(str2));


        // Check the length of a String
        // length() method counts the number of characters inside a String (including spaces)
        //String str = "I love Java";
         int numOfChar = str.length();
        System.out.println("numOfChar = " + numOfChar); // 11

        // Get the first and the last character from a String

        //String str = "I love Java";
        // chartAt() method
//        System.out.println(str.charAt(0)); // I
//        System.out.println(str.charAt(1)); // space

        char firstChar = str.charAt(0);
        System.out.println("firstChar = " + firstChar);

        char lastChar = str.charAt(10); //HARD CODE => if your codes doesn't work for all/ different values
        System.out.println("lastChar = " + lastChar);

        System.out.println(str.length() - 1);

        char lastCharDynamic = str.charAt(str.length()-1);  //DYNAMIC CODE => if your codes works for all/different values
        System.out.println("lastCharDynamic = " + lastCharDynamic);


        // equals() method is used to check the equality of two Strings
        // It looks for the EXACT match
        // It returns boolean value => true or false
        // String str1 = "Java is easy.";
        String s = "java is easy.";

        System.out.println("Is equal? " + str1.equals(s)); // false
        System.out.println("Is equal? " + str1.equalsIgnoreCase(s)); // true

        // trim() method is used to remove leading and trailing spaces, but it doesn't remove spaces in the middle of the words
        // leading space =>  space in the beginning
        // trailing space => space in the end

        String st = "    There are 12 of us learning Java at the moment.     ";
        System.out.println(st.length()); // 56
        System.out.println(st.trim()); //There are 12 of us learning Java at the moment.

        System.out.println("First character before trimming: " + st.charAt(0)); // space
        System.out.println("Last character before trimming: " + st.charAt(st.length()-1)); // space

        // If we want to update the original String, we must assign it back to st variable
         st = st.trim();

        System.out.println("First character after trimming: " + st.charAt(0)); //T
        System.out.println("Last character after trimming: " + st.charAt(st.length()-1)); // .


    }
}
