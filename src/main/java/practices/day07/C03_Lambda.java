package practices.day07;

import java.util.List;

public class C03_Lambda {
    public static void main(String[] args) {
        //TASK: Print the sum of the squares of all unique integers greater than 7 in a list.
        List<Integer> myList = List.of(1, 7, 11, 23, 12, 14, 47, 8, 35, 9, 4, 41, 23, 47, 9);

        int sum =myList.stream().distinct().filter(number -> number > 7).map(t -> t*t).reduce(0, Integer::sum);

        System.out.println("sum = " + sum);
    }

}
