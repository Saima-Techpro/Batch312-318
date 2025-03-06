package day25oop_interface;

public class Audi5 implements AirCond, Engine, Brake {

       /*
        Full Abstraction => Interface

     a) We use 'implements' keyword inside the child to establish parent-child relation with interfaces.

    b) 'extends' is not used because it is used between two classes.
        NOTE: but an interface can use 'extends' keyword for an interface parent

    c) The AudiA5 Class is obliged to override all methods in the Brake/Engine interface.

    d) Since the AudiA5 Class must override all methods from parent interface, it is not necessary
       to write '@Override' at the beginning of the methods, so we do not write it.

    e) If the access modifier is not written inside the class, it is considered default, hence we must write public.
       but now you don't have to mention 'public' as well. It's 'public' by default
       (because access modifier in child class can NOT be narrower than the parent.)


    - An interface can be thought of as an agreement/ requirement that classes have to implement.
    -  An interface contains abstract methods with or without method signature (name and parameter) but does NOT
       define its implementation (does not have body)
    - Classes which have inheritance relation with these interfaces have to implement these methods.
    - abstract methods are incomplete methods which MUST be completed by a child class
    - Methods inside an interface are automatically 'public' and 'abstract' so we don't need to use these keywords
      while creating these methods.



    - 'static' methods are not allowed in interfaces

    // Can we create concrete methods in interface?
    // Yes, we can.






     */







    // overrides methods from AirCond interface
    @Override // OPTIONAL to use @Override when methods are inherited from Interfaces
    public void digital() {
        System.out.println("Audi uses digital AC");
    }

    // overrides methods from Engine interface
    @Override
    public void turbo() {
        System.out.println("Turbo is embedded in Audi's engine");
    }

    @Override
    public void eco() {
        System.out.println("Audi 5 has eco-friendly engine");
    }

    @Override
    public void esp(int a) {
        System.out.println("Audi 5 uses esp brake system");
    }

    @Override
    public void run() {
        System.out.println("runs air condition");
    }




}
