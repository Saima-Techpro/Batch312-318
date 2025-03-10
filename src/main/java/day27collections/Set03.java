package day27collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set03 {
    public static void main(String[] args) {

        /*
        Interview  question:
        Store the student emails in natural order. Student emails should be unique.
         */


        long t1 = System.nanoTime(); // starting moment of TreeSet

        // 1st way: Using TreeSet
        TreeSet<String> stdEmails = new TreeSet<>();
        stdEmails.add("pq@gmail.com");
        stdEmails.add("ab@gmail.com");
        stdEmails.add("xy@gmail.com");
        stdEmails.add("de@gmail.com");
        stdEmails.add("lm@gmail.com");
        stdEmails.add("rs@gmail.com");
        stdEmails.add("gh@gmail.com");
        stdEmails.add("rs@gmail.com");

        // System.out.println("stdEmails = " + stdEmails);// prints in natural (alphabetical order)

        long t2 = System.nanoTime(); // starting moment of HashSet

        // 2nd way: Using combination of HashSet + TreeSet
        HashSet<String> emailHS = new HashSet<>();
        emailHS.add("pq@gmail.com");
        emailHS.add("ab@gmail.com");
        emailHS.add("xy@gmail.com");
        emailHS.add("de@gmail.com");
        emailHS.add("lm@gmail.com");
        emailHS.add("rs@gmail.com");
        emailHS.add("gh@gmail.com");
        emailHS.add("rs@gmail.com");
        //System.out.println("emailHS = " + emailHS); // prints values at random order

        long t3 = System.nanoTime(); // ending moment of HashSet

        // Now that we have our emails stored in HashSet at a faster speed, we can use TreeSet
        // to put them in Natural order

        // Create TreeSet and assign HashSet directly in here.
        TreeSet<String> emailsTS = new TreeSet<>(emailHS);
        //System.out.println("emailsTS = " + emailsTS);

        long t4 = System.nanoTime(); // ending moment of HashSet + TreeSet

        System.out.println("Execution time for TreeSet: " + (t2-t1));
        System.out.println("Execution time for HashSet: " + (t3-t2));
        System.out.println("Execution time for HashSet and TreeSet: " + (t4-t2));



    }
}
