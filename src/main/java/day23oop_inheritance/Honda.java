package day23oop_inheritance;

public class Honda extends Car{

    public int torque = 130;

    // non-parameterised constructor
    public Honda(){
        super();
        System.out.println("this.torque = " + this.torque);
        System.out.println("Civic");
    }
}
