package day22instanceblock_staticblock;

public class InstanceBlock01 {

//    public static String name ; // static variable
//    int year = 2025; // instance variable


       /*
       What is an instance?
       An object of a class.

       How many types of variables?
       1. local variable (inside the main method)
       2. instance variable
       3. static variable

       What is instance block?
       An instance block is a code of block that runs EVERY time an instance (object) is created.
        (It works like an id of that instance)

        SYNTAX: {}

         Main characteristics of Instance block:

        1- Runs for Every Instance: The instance block runs every time a new instance of a class is created.
           That means, for every new object, this block is executed again. (like an id)
        2- Prevents Code Repetition: By using instance blocks, you avoid repeating the initialization
            processes or specific pieces of code for every object.

        Analogy:
        An instance block in Java is like a special recipe you follow whenever you bake a cake, no matter what
        kind of cake it is. Each time you make a cake (create an object), you perform a set of steps (instance block)
        that you always need, like preheating the oven or greasing the pan, before adding any specific ingredients
        (constructors or fields). So, even though every cake might have different ingredients (object properties),
        those essential steps (instance block) are always followed whenever a new cake (object) is baked (created).




        */

    {
        System.out.println("Hello! Instance block is being executed!");
    }


    public static void main(String[] args) {

//        int age = 12; // local variable
//
//        for (int i = 0; i < 5; i++) { // local variable
//            System.out.println(i);
//        }

        InstanceBlock01 obj1 = new InstanceBlock01();

        InstanceBlock01 obj2 = new InstanceBlock01();

        InstanceBlock01 obj3 = new InstanceBlock01();

        InstanceBlock01 obj4 = new InstanceBlock01();




    }

    /*

Local Variables (Declared inside a method)

Exist only within the method.
Cannot have an access modifier like private, protected, or public.
Must be explicitly initialized before use.
Stored in the stack memory.

Instance Variables (Declared inside a class but outside any method)

Belong to an instance of the class (i.e., an object).
Can have access modifiers (private, protected, public).
Have default values if not explicitly initialized.
Stored in the heap memory as part of the object.

     */

}
