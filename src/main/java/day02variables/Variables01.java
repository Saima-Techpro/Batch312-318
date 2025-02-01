package day02variables;

public class Variables01 {

    public static void main(String[] args) {

     // Task: Create a variable to store the cells of a human body. Print it on the console.

     long numbOfCells = 30000000000000L;
     // We must add 'L' in the end because initially Java takes that value as int
     // We have to insist on using long as our data type

        System.out.println("numbOfCells = " + numbOfCells);


     // Task: Create two float variables and print their total value on the console
        // 1st way:
        //float num1 = 14.70f;
        // float num2 = 23.50f;

        float num1 = 14.70f , num2 = 23.50f;
        System.out.println((num1 + num2)); // 38.2

        // 2nd way:
        float sum = num1 + num2;

        System.out.println("sum = " + sum); // 38.2


        // Task: Create an int and a char variable and print their total on the console

        int a = 12;
        char b = 'Z';  // ASCII value of 'Z' is 90

        System.out.println((a + b)); // 102 because char data type deals with single characters and
                                    // Java converts them to ASCII values and then adds the two values together


        // Task: Create an int and a double variable and print their total on the console
        int c = 34;
        double d = 69.90;

        System.out.println((c + d)); // 103.9

        int x = 12;
        float y = 10.5f;


        System.out.println((x + y)); // 22.5

        // NOTE: If we add two different data types, one being bigger than the other, Java shows result in the bigger data type

        // What if we add long and float data type?
        System.out.println(numbOfCells + num1); // 3.0E13 => prints float result because float is bigger data type than long




    }

}
