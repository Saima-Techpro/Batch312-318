package day31lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {

    /*
      1. Lambda expressions, introduced in Java 8, are a feature that is used to facilitate functional programming.
         Lambda themselves are not "functional programming" but rather a feature that supports functional
         programming style in Java (which remains object-oriented language).

         Lambda essentially represent anonymous functions (functions without names) and
         are usually used to define short functions.

      2. Lambda expressions (Functional programming) are commonly used with Collections and Arrays.


       The general advantages of lambda expressions:

      1- Writing less code: Lambdas allow you to write less and more readable code.
      2- Functional programming: They help you utilize Java's functional programming features.
      3- Anonymous: Lambda expressions do not have a name.
      4- Can contain a single expression: Lambda expressions can contain a single expression that performs one or more
          operations.
      5- Can take one or more parameters: Lambda expressions can take one or more parameters.

      Lambda expressions are sometimes also called "arrow functions" -> OR 't functions'

       */
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 12, 25, 49, 65));

        // Method call
        printElements(numbers);

        System.out.println();
        System.out.println("===============");
        printElementsLambda(numbers);
        System.out.println();
        System.out.println("===============");

        printEvens(numbers);

    }



    // Create a simple method to print the elements
   public static void printElements(List<Integer> list){
        for (Integer w : list){
            System.out.print(w + " ");
        }
   }

   public static void printElementsLambda(List<Integer> list){
        list.stream().forEach(t -> System.out.print(t + " "));
   }

   // stream() => returns a sequential Stream over the elements in this collection
   // t => here represents the name of the variables which receives elements one by one
   // These functions are called 't functions' or also known as 'arrow functions'
   // NOTE: In structured language, we CREATE loops, in functional language, we use functions like forEach()


    // Print evens from the given list
    // 5, 9, 12,25, 49, 65
   public static void printEvens(List<Integer> list){
        list.stream().filter(t -> t%2 == 0).forEach(t -> System.out.print(t + " "));
   }

   // filter() returns a stream consisting of the elements of this stream that match the given predicate.
    // filter() works like 'if statement' in structured language
    // It is used to apply certain condition, if the condition is true, elements will be passed on

}
