package day34lambda;

public class LambdaDemo {
    public static void main(String[] args) {

        // After Java 8, we don't need to create Anonymous inner class to implement a functional interface
        // Instead we can use LAMBDA expressions  (arrow function)
        // Lambda makes it much shorter!

      Greeting greeting = name -> System.out.println("Hello " + name);
      greeting.sayHello("Bob");
      greeting.sayHello("Emily");

      // name -> System.out.println("Hello " + name) (Lambda expression is automatically implementing sayHello())



        Calculator add = (t, u) -> t + u;
        Calculator multiply = (a , b) -> a * b;

        /*
        Lambda Expression replaces the need for an anonymous class.
        (t, u) -> t + u means:  a and b are input parameters.
                  t + u is the operation performed (returns t + u).

        Similarly, (a, b) -> a * b implements the multiplication logic.
         */

        System.out.println(add.operate(5, 9));

        System.out.println(multiply.operate(4, 5));
        multiply.showMessage();

        /*
        Internally, Java does the following:

        1. It sees that Calculator is a functional interface.
        2. The lambda expression automatically provides an implementation for operate(int a, int b).
        3. At runtime, Java treats add and multiply as instances of an anonymous class implementing Calculator.

        Equivalent Anonymous Class Implementation (Before Java 8):

            Calculator calculator = new Calculator() {
                @Override
                public int operate(int a, int b) {
                    return a + b;
                }
            };

            System.out.println(calculator.operate(3, 8));

             => Lambda expressions are just a shorter way of writing this!
             => The lambda acts as an instance of the functional interface and can be used like a normal object.
         */


    }
}
