package day12loops;

public class Loop01 {
    public static void main(String[] args) {

        /*
        There are three types of variables:
        1. Local variable => very limited scope => created inside any if, switch or loop
        2. Class Variable => scope is wider than local => it's available for the whole class
        3. Static variable => the widest scope => it's available across the project
         */

        /*
        for (dataType startingValue; condition / limit to break the loop; increment/decrement){
           loop  body => codes go here
        }
         */


        // Task: Find the sum of the digits from 3 to 9 (where 9 is inclusive)
        // 3+4+5+6+7+8+9 = 42

        // sum is a class variable
        int sum  = 0; // We create this variable to store the result of ANY mathematical operation
                      // where 0 is called "identity element" for addition operations

        for (int x = 3; x < 10; x++){  // x is local variable
            sum = sum + x;
            // System.out.println("sum = " + sum);
        }



        System.out.println("sum = " + sum); // 42

        System.out.println("===================");

        // Task: Find the multiplication of the digits from 3 to 9 (where 9 is inclusive)
        // 3*4*5*6*7*8*9 = 181440

        int multiplication  = 1 ; // class variable => can't use the same name
        // identity element" for multiplication operations MUST be 1 => 0 * any num = 0; but 1 * any num = that num


        for (int x = 3; x < 10; x++){
            multiplication = multiplication * x;

            // System.out.println("multiplication = " + multiplication);
        }
        System.out.println("multiplication = " + multiplication);

        System.out.println("========= INTERVIEW QUESTION ==========");

        // Calculate the total value of the digits in the given integer
        // 568 => 5+6+8 = 19

        int total = 0;
        for (int i = 568; i > 0; i /= 10  ){ // same as  i = i/10
             total = total + i % 10;
        }
        System.out.println("total = " + total);



    }
}
