package day23oop_inheritance;


public class MammalRunner {
    public static void main(String[] args) {

        Cat cat = new Cat(); // cat instance (object) => CONSTRUCTOR allows to create the object
                            // and also makes the active and passive features available for the object
        cat.meow();
        // inherited from grandparent class => Mammal
        cat.eat();
        cat.drink();
        cat.feed();

        Dog dog = new Dog();
        dog.bark();
        dog.drink();
        dog.eat();
        dog.feed();
        // inherited from parent class => Animal
        dog.run();


        /*
             OOP => Object-Oriented Programming Language

            OOP has 4 fundamental principles:
            1. Inheritance
            2. Polymorphism (method overloading + method overriding)
            3. Encapsulation
            4. Abstraction

          1. Inheritance: (based on real life concept of inheritance like eye colour, name, state, money etc.)
             It is a concept that transfers the properties from one class to other classes.
             We use "extends" keyword in child class to inherit the properties from parent class

            NOTE: But in coding, it's one-way => parent class can NOT use property of child class

         1. Why do we use inheritance?
         a) to prevent "repetition"
         b) to make "maintenance" easy
         c) to make our classes "atomic" (small)
         d) to maintain "readability" of the classes


         2. To make a class child to another class, we use "extends" keyword.
         3. Child classes can use class members from parent class. However, parent classes
            can't use anything from child classes (one-way relation)
         4. Every class in Java has a parent class. It's called "Object class".
            Object class is like Adam.. it doesn't have any parent.

         5. Inheritance types in Java
            a) Multilevel Inheritance  => Grandparent => parent => child
            b) Hierarchical Inheritance => Single parent => Many children
            c) Multiple Inheritance => more than one parent at the same level (Java doesn't support it)
            d) Opposite of "Multiple Inheritance" is "Single Inheritance"
              Java supports "Single Inheritance"

        NOTE: Java does not support "Multiple Inheritance". It supports "Single Inheritance"

        IS-A relationship and HAS-A relationship

        Animal IS-A child of Mammal => true
        Dog IS-A child of Mammal => true
        Dog IS-A child of Animal => true
        Cat IS_A Mammal => true

        Mammal HAS-A Animal => true
        Cat HAS-A Mammal => false
        Dog HAS-A Animal => false
        Dog HAS-A Mammal => false


       In Java, the relationship from parent to child is called a HAS-A Relationship (from top to bottom)
       In Java, the relationship from child to parent is called an IS-A Relationship (from bottom to top)


         */

    }

}
