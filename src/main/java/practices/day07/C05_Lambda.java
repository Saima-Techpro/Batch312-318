package practices.day07;

import java.util.List;

public class C05_Lambda {
    public static void main(String[] args) {
        //TASK: Print the multiplication of square roots of all the unique elements in a list that are
        // divisible by 4.

        List<Integer> myList = List.of(4, 8, 16, 64, 16, 64, 35, 19, 21, 1);

        //myList.stream().distinct().filter(n -> n % 4 == 0).map(n -> Math.pow(n, 0.5));
        double result =  myList.stream().distinct().filter(n -> n % 4 == 0).map(Math::sqrt).reduce(1.0,
                (n1, n2) -> n1 * n2);
        System.out.println("result = " + String.format("%.2f", result));
    }
}
