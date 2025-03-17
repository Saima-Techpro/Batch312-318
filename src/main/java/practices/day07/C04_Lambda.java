package practices.day07;

import java.util.List;

public class C04_Lambda {
    public static void main(String[] args) {
        //TASK: Print the sum of the cubes of all elements that are divisible by 3.
        List<Integer> myList = List.of(1, 7, 11, 23, 12, 14, 47, 8, 35, 9, 4, 41, 23, 47, 9);

        double sum =myList.stream().filter(n -> n % 3 == 0).map(n -> Math.pow(n, 3)).reduce(0.0, Double::sum);
        System.out.println("sum = " + sum);
    }
}
