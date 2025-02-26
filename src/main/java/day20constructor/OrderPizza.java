package day20constructor;

public class OrderPizza {
    public static void main(String[] args) {


        Pizza order1 = new Pizza(1, "large", "thin crust", "pepproni");
        System.out.println(order1.quantity + " "+ order1.size  + " "+  order1.base + " "+ order1.toppings  + " pizza ");


        Pizza order2 = new Pizza(2, "small", "stuffed", "chicken");
        System.out.println(order2.quantity + " "+ order2.size  + " "+  order2.base + " "+ order2.toppings  + " pizza ");


    }
}
