package day34lambda;

@FunctionalInterface
public interface Greeting {

    // Interfaces are like contracts. Any class that implements this interface, MUST implement the abstract method
    // Greeting is a functional interface because it has ONE abstract method.
    // Can it have other regular methods?
    // Yes, by using 'default' or 'static' keyword.

     void sayHello(String name); // Abstract method


}
