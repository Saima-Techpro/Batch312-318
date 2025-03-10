package practices.day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C04_ArrayContainsInteger {
    public static void main(String[] args) {
        //TASK: Create a list with 200 integers that are less than 1000. Ask a user for a number.
        //If the entered number exists in the list, print success message, or fail message if not.
        //Clue: Use Random class.
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number;
        List<Integer> integerList = new ArrayList<>();

        /*
        //For loop cycles 200 times, however random object may create the same number multiple times, so we do not know
        //the exact cycle count that we need to have exactly 200 numbers in the list.
        for (int i = 0; i < 200; i++){
            number = random.nextInt(1000);

            if (!integerList.contains(number)){
                integerList.add(number);
            }
        }*/

        while (integerList.size() < 200){
            number = random.nextInt(1000);

            if (!integerList.contains(number)){
                integerList.add(number);
            }
        }

        int enteredNumber;

        System.out.println("Guess a number!");
        enteredNumber = input.nextInt();
        input.nextLine();

        if (integerList.contains(enteredNumber)){
            System.out.println("You win! The number you entered exists in the list!");
        }else {
            System.out.println("Try again! Maybe you will win next time!");
        }
    }
}
