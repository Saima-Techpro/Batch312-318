package day23stringbuffer;

public class StringBuffer01 {
    /*
    1.	StringBuffer is another class in Java to create Strings.
    2.	StringBuffer was introduced in Java 1.0 to allow MUTABLE strings.
    3.	StringBuffer is very similar to StringBuilder. Both of them create 'Mutable' Strings (changeable).
    4.	StringBuffer is synchronized, meaning it is thread-safe, whereas StringBuilder is not synchronized and is faster for single-threaded applications.
    5.	StringBuffer uses synchronization, ensuring safe access in multi-threaded environments. StringBuilder does not.

        What is a thread?
               A thread is the smallest unit of a program that can execute independently.
               In single threads, execution is done sequentially (in an order).

        What is multi-threading?
               Multithreading allows multiple threads to execute independently, taking turns using the CPU. (distribution of labour)

        What is synchronization?
              Synchronization is not just about logical order; it's about controlling
              access to shared resources in multi-threading to avoid conflicts (race conditions). So,
                “Synchronization is the mechanism that ensures only one thread can access a shared resource
                at a time to prevent data inconsistency."

        We have learned about three classes that create Strings => Strings, StringBuilder, StringBuffer

        1) If an Immutable String is needed ==> String class
        2) For a Mutable String, use StringBuilder or StringBuffer
           a) Use StringBuilder when multi-threading is not needed
           b) Use StringBuffer when multi-threading is required
     */

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer();
        System.out.println("sbf = " + sbf);
        sbf.append("We are learning StringBuffer");
        System.out.println("sbf = " + sbf);

        // we can change the data type from StringBuffer to String
        String str = sbf.toString();

        System.out.println("str = " + str); // String data type here
        System.out.println(str.toUpperCase());

        // we can change the data type from StringBuffer to StringBuilder
        // We need to create StringBuilder object and pass the sbf as a parameter
        StringBuilder sb = new StringBuilder(sbf);
        System.out.println("sb = " + sb);


    }
}
