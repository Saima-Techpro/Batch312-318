package practices.day07;

import java.util.List;

public class C01_Lambda {
    public static void main(String[] args) {
        //TASK: Create a method that will print all the odd numbers of a list with space in between each character
        // on the same line.

        List<Integer> myList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printOddsNonLambda(myList);
        printOddsLambda(myList);
    }

    private static void printOddsNonLambda(List<Integer> list){
        for (int number : list){
            if (number % 2 != 0){
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void printOddsLambda(List<Integer> list){
        list.stream().filter(item -> item % 2 != 0).forEach(item -> System.out.print(item + " "));
        System.out.println();
    }
}
