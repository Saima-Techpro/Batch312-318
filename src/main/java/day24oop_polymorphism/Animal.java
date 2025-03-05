package day24oop_polymorphism;

public class Animal {

    public static int price;
    public final int year = 2025; // final variables can't be created without assigning a value
                                  // final variables can't be updated


    public void eat(){
        System.out.println("Animals eat...");
    }


    public void drink(){
        System.out.println("Animals drink...");
    }

    // Let's create methods with some return type:
    // return type => int => primitive data type
    // Is it a class?
    // NO because primitive data types cannot be classes
    // If it's not a class, it can't have a parent-child relationship


    public int add(int a, int b){
        return a+b;
    }

    public Number multiply(int a , int b){
        return a*b;
    }

    // Is Animal a class?
    // Yes
    // Is it a data type?
    // Yes, it is a non-primitive data type
    // If it's a data type, can we use it as a return type in a method?
    // Yes. non-primitive class is a data type and can also be used for object creation.

//    public Animal create(){
//        Animal animal = new Animal();
//        return animal;
//    }

    // OR
    public Animal create(){
        return new Animal(); // returns the new Animal object without allocating space in memory
    }


}
