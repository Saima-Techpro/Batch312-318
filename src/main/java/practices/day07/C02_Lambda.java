package practices.day07;

import java.util.List;

public class C02_Lambda {
    public static void main(String[] args) {
        //TASK: Create a method that will print the squares of all the elements in the list that are
        // less than 10 with spaces in the middle.
        List<Integer> myList = List.of(1, 7, 11, 23, 12, 14, 47, 8, 35, 9, 4, 41);
        printSquaresOfItemsLessThanTen(myList);
    }

    private static void printSquaresOfItemsLessThanTen(List<Integer> list){
        //list.stream().filter(number -> number < 10).forEach(number -> System.out.print(number * number + " "));
        list.stream().filter(number -> number < 10).map(number -> number * number).forEach(number -> System.out.print(number +
                " "));
        System.out.println(list.stream().filter(number -> number < 10).map(number -> number * number).reduce(0, Integer::sum));
    }
}
