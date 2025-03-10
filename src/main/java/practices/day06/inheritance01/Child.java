package practices.day06.inheritance01;

public class Child extends Parent {

    public static String firstName = "Mike";
    public static Integer age = 4;

    public void method4(){
        System.out.println("method4 in the child class " + this.age);
    }

    public static void main(String[] args) {
        System.out.println(firstName);
        System.out.println(Parent.firstName);

        method1();
        method2();

        Parent parent = new Parent();
        System.out.println(parent.age);

        Child child = new Child();
        System.out.println(child.age);

        Parent parent1 = new Child();
        System.out.println(parent1.age); //25 or 4?

        parent1.method4();
        parent1.method3();
        parent.method4();
    }
}
