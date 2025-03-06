package day25oop_interface;

public class Toyota implements Brake, Engine, AirCond{

    public void digital() {
        System.out.println("Toyota uses digit AC system");
    }

    public void esp(int a) {
        System.out.println("Toyota uses esp brake system");
    }

    public void turbo() {
        System.out.println("Turbo is embedded in Toyota's engine system");
    }

    public void eco() {
        System.out.println("Toyota uses eco-friendly engine.");
    }

    public void run() {
        System.out.println("Toyota runs hybrid engine.");
    }
}
