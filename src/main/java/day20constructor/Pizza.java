package day20constructor;

public class Pizza {


    String size;
    String base;
    int quantity;
    String toppings;

    // Constructor


    public Pizza(int quantity , String size, String base, String toppings) {
        this.size = size;
        this.base = base;
        this.quantity = quantity;
        this.toppings = toppings;
    }
}
