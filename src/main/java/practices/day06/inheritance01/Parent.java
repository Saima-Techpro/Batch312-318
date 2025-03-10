package practices.day06.inheritance01;

public class Parent {
    //TASK
    //Create fields: firstName and lastName
    //Create static methods: method1 and method2
    //Create an instance variable: age
    //Create instance methods: method3 and method4
    //Use the variables and call the methods in a child class.
    //Create an empty and a parameterized constructor.

    public static String firstName = "Bob";
    public static String lastName = "Smith";

    public static void method1(){
        System.out.println("method1 in the parent class");
    }

    public static void method2(){
        System.out.println("method2 in the parent class");
    }

    public int age = 25;

    public void method3(){
        System.out.println("method3 in the parent class");
    }

    public void method4(){
        System.out.println("method4 in the parent class");
    }

    public Parent() {
    }

    public Parent(int age) {
        this.age = age;
    }
}
