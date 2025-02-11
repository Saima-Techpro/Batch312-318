package day09stringmanipulations;

public class StringManipulation03 {
    public static void main(String[] args) {

        /*

        indexOf() method returns the INDEX of the first occurrence of the first character of the given String

         */
        String str = "Java is an OOP language";


        int indexOfO = str.indexOf("OOP");
        System.out.println("indexOfO = " + indexOfO); // 11


        // Get the domain name of the given email address and print it on the console

        String email = "abc@gmail.com";

        System.out.println(email.indexOf("@")); // 3

        int startIndex = email.indexOf("@") + 1; // 4 => because domain name for this email starts from index 4

        // 1st way:
        String fullDomainName = email.substring(startIndex);
        System.out.println("fullDomainName = " + fullDomainName);// gmail.com

        // 2nd way:
        System.out.println("fullDomainName = " + email.substring(startIndex, email.length()));
        // email.length() will count the total number of characters => which then is passed as a parameter in
        // substring(4, 13) method => where start index is inclusive and ending index is exclusive

        // Print the domain name without "com"
        // abc@gmail.com
        int endingIndex = email.indexOf(".");
        System.out.println("endingIndex = " + endingIndex); // 9

        String domainWithoutCom = email.substring(startIndex, endingIndex);
        System.out.println("domainWithoutCom = " + domainWithoutCom); // gmail


        // 3rd way: Using split()
        // abc@gmail.com

        String fullDomainName1 = email.split("@")[1];
        System.out.println("fullDomainName1 = " + fullDomainName1); // gmail.com

        String domainNameWithoutCom1 = email.split("@")[1].split("\\.")[0];
        System.out.println("domainNameWithoutCom1 = " + domainNameWithoutCom1);


        System.out.println(email.split("a")[0]); // empty String
        System.out.println(email.split("a")[1]); // "bc@gm"
        System.out.println(email.split("a")[2]); // "il.com"

        /*
         split() splits the given String and returns String Array (will learn later)

        NOTE: if the given letter/sign in split() method occurs more than once, split() method
              cuts the String wherever it sees the given letter/sign => splits the String on
              all occurrences of that letter/sign.
              Like in above example, 'a' occurred twice, so split() method will cut the String
              wherever it sees 'a'. So in this case we will be left with 3 String Arrays and
              we can reach out to whichever we want by using index []
         */


        String secondEmail = "abc.xyz@yahoo.com";
        int firstIndex = secondEmail.indexOf("@") + 1;
        System.out.println("firstIndex = " + firstIndex); // 8

//        int lastIndex = secondEmail.indexOf("."); // 3 => index of the first occurrence of full stop
//        System.out.println("lastIndex = " + lastIndex);


        int lastIndex = secondEmail.lastIndexOf(".");
        System.out.println("lastIndex = " + lastIndex); // 13
        /*
        NOTE:
        indexOf() method returns the first occurrence of the given character
        lastIndexOf() method returns the last occurrence of the given character
         */

        String yahooName = secondEmail.substring(firstIndex, lastIndex);
        System.out.println("yahooName = " + yahooName); // yahoo


        // Count the number of words in following String
        String sentence = "I love Java. Java is getting interesting. But it needs lots of review and practice.";
        String sentenceWithoutPunc = sentence.replaceAll("\\p{Punct}", "");
        System.out.println("sentenceWithoutPunc = " + sentenceWithoutPunc);

        int wordCount = sentenceWithoutPunc.split(" ").length;
        System.out.println("wordCount = " + wordCount); // 15

        //sentenceWithoutPunc =  I love Java Java is getting interesting But it needs lots of review and practice

        int letterCount = sentenceWithoutPunc.split("").length;
        System.out.println("letterCount = " + letterCount); // 80

        // sentence.length() => With String, we use length()
        // split() returns Array; with Arrays, we use length. We don't need ()
        // split() + length => We don't need ()
    }
}
