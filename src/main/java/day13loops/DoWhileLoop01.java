package day13loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        /*
          ***** Syntax for WHILE LOOP *****

            startingValue is declared outside the loop
                 while(condition){
                   loop body (codes)

                   increment / decrement  // INFINITE LOOP will be created if we don't add increment / decrement

                 }

            ***** Syntax for DO WHILE LOOP *****

             startingValue is declared outside the loop
             do{

                loop body

             }while(condition);

         */

        /*
        NOTES about while loop:

        => While loop checks the condition first, if it is true, it executes the codes inside the body.
           While loop is WISE =>  it thinks first, acts later

        RULE: ZERO EXECUTION IS POSSIBLE IN WHILE LOOPS


         */
        int i = 1;

        while (i < 1){
            System.out.println("while loop");
        }

        System.out.println("==================");
         /*
        NOTES about do while loop:

        => Do While loop executes the codes inside the body first and then checks the condition.
           Even if the condition is false, the codes inside the body get executed at least once.

           Do While loop is NOT WISE =>  it acts first, thinks later

           It is commonly used in ATM machines or games.

        RULE: ZERO EXECUTION IS NOT POSSIBLE IN DO WHILE LOOPS
         */
        int x = 1;

        do{
            System.out.println("do while loop");
        }while (x < 1);

        System.out.println("=========================");
        // Print the numbers from 9 to 18

        int y = 9;

        do{
            System.out.print( y + " ");

            y++;

        }while (y < 19);


    }
}
