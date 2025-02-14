package day13loops;

public class WhileLoop01 {
    public static void main(String[] args) {


        /*
                 ***** Syntax for FOR LOOP *****

                for(startingValue; condition to break the loop; increment/decrement){
                    loop body
                  }

                   for (int i = 0; i < 5; ) { // INFINITE LOOP will be created if we don't add increment / decrement
                    System.out.println("Hi");
                   }

                 ***** Syntax for WHILE LOOP *****

                 startingValue is declared outside the loop
                 while(condition){
                   loop body (codes)

                   increment / decrement // INFINITE LOOP will be created if we don't add increment / decrement

                 }
         */


        // Task 1: Print numbers from 5 to 9

        int startingValue = 5; // class variable

        while (startingValue < 10){
            System.out.println(startingValue);
            startingValue++;

        }

        // Task 2: Print all the even numbers from 56 to 28 on the same line

        int x = 56; // startingValue

        while (x > 27){
            if (x % 2 == 0){
                System.out.print(x + " ");
            }
            x--;
        }

        System.out.println();
        System.out.println("====== Task 3 ========");
        // Task 3: Print the sum of integers from 12 to 24
        // 12+13+14+15.... = 234

        int y = 12; // startingValue

        int sum = 0;
        while (y < 25){  //OR ( y > 11 && y < 25)
           sum = sum + y;
           y++;
        }
        System.out.println(sum); // 234


    }
}
