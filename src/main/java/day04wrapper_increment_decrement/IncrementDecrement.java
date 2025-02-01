package day04wrapper_increment_decrement;

public class IncrementDecrement {
    public static void main(String[] args) {

        // INCREMENT
        int s = 8;
        System.out.println("original = " + s);

        // Increase the value by 2
        // increasing and assigning the increased value back to the variable will increase the original value
        // 1st way:
         s = s + 2;
        System.out.println("original = " + s);

        // 2nd way:
        s += 2;
        System.out.println("original = " + s);

        // DECREMENT
        // decreasing and assigning the decreased value back to the variable will decrease the original value
        int d = 15;
        System.out.println("original = " + d); // 15

        // Decrease the value by 2
        // 1st way:
        d = d - 2 ;
        System.out.println("original = " + d); // 13

        // 2nd way:
        d -= 2;
        System.out.println("original = " + d); // 11

        // Increment by multiplication
        // Increase by 5

        int a = 3;
        a = a*5;
        System.out.println("a= " + a); // 15
        a *= 5;
        System.out.println("a= " + a); // 75

        // Decrement by division
        // Decrease by 5

        int b = 100;
        b = b/5;
        System.out.println("b= "+ b); // 20

        b /= 5;
        System.out.println("b= "+ b); // 4

        // Increase by 1

        int x = 33;
        System.out.println("original x: "+x); // 33
        x ++;
        System.out.println("x increased by 1: "  +x); // 34



        // Decrease by 1
        int y = 12;
        System.out.println("original y: "+y); // 12
        y --;
        System.out.println("y decreased by 1: "+y); // 11
        y --;
        y --;
        y --;
        y --;
        y --;
        System.out.println("y decreased by 1: "+y); // 6


        // INCREMENT/DECREMENT and assign it to another variable

        // INCREMENT
        int l = 7 ;
        int m = l++; // assign first, increase later => Post Assignment Increment
        System.out.println("Post Assignment Increment: " +l); //8
        System.out.println("Post Assignment Increment: " +m); // 7

        int g = 16;
        int h = ++g; // increase first, assign later => Pre Assignment Increment

        System.out.println("Pre Assignment Increment: "+g); // 17
        System.out.println("Pre Assignment Increment: "+h); // 17


        // DECREMENT
        int q = 68;
        int r = q--;
        System.out.println("Post Assignment Decrement: " + q);
        System.out.println("Post Assignment Decrement: " + r);

        int t = 99;
        int u = --t;
        System.out.println("Pre Assignment Increment: "+t); // 98
        System.out.println("Pre Assignment Increment: "+u); // 98




    }
}
