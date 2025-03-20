package day34lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo {

    public static void main(String[] args) {

      /*
      What is the relationship between Functional Interfaces and LAMBDA Expressions?

      LAMBDA Expressions work only with Functional Interfaces.

      "A functional interface is an interface that has exactly ONE abstract method
      (also called a Single Abstract Method (SAM)).
      It can have multiple default or static methods, but only ONE abstract method."

      If an interface has multiple abstract methods, Java will not allow a lambda expression
      to be used because it won’t know which method the lambda is implementing.

      Why Functional Interfaces?
        - They allow lambda expressions and method references.
        - They make code concise by avoiding anonymous classes.

      There are two types of Functional Interfaces:
      1) Built-in => provided by Java in java.util.function library
                     There are 4 most commonly used built-in Functional Interfaces:
                     a. Predicate
                     b. Function
                     c. Consumer
                     d. Supplier
        The Predicate<T> interface has a test(T t) method that returns true or false.
        Use case: Filtering elements in a Stream.

        The Function<T, R> interface has an apply(T t) method that converts data from type T to type R.
        Use case: Mapping elements to another type.

        The Consumer<T> interface has an accept(T t) method that performs an action but doesn’t return anything.
        Use case: Printing elements in a Stream.

        The Supplier<T> interface has a get() method that provides a value without taking input.
        Use case: Generating random numbers in a Stream.


      2) Custom Functional Interfaces => We can create them by using @FunctionalInterface
         like Greeting, Calculator

       */

        // How we used built-in Functional Interfaces with LAMBDA Expressions?
        List<String>  names = List.of("Ali", "Bob", "Fatma", "Emily");
        System.out.println("names = " + names);

//        names.stream().
//                filter(t -> t.length() > 3).
//                map(t -> t.toUpperCase()).
//                forEach(t -> System.out.println(t));

        //Filter names with length more than 3

       // Predicate<String> condition1 = t -> t.length() > 3;
       Predicate<String> condition1 = name -> name.length() > 3;

       // Convert to uppercase
        Function<String, String>  condition2 = String::toUpperCase;


        // Print each name
        Consumer<String> condition3 = name -> System.out.println("Processed name: " +name);

        List<String> processedNamesList = names.stream().
                                        filter(condition1).
                                        map(condition2).
                                        peek(condition3).
                                        toList();
        System.out.println("processedNamesList = " + processedNamesList);


        // How to use Custom Functional Interfaces?
        // Before Java 8, we would have to create Anonymous inner class implementing a functional interface
        // like this:

        // Anonymous class implementing Greeting Functional Interface (that we created)
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello, " + name);
            }
        };

        greeting.sayHello("Ali");
        greeting.sayHello("Veli");
        greeting.sayHello("John");



        // Anonymous class implementing Calculator Functional Interface (that we created)
        Calculator calculator = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }

            @Override
            public void showMessage() {
                System.out.println("Optional to override this method!");
            }
        };


        System.out.println(calculator.operate(3, 8));
        System.out.println(calculator.operate(12, 32));
        calculator.showMessage();

    }



}
