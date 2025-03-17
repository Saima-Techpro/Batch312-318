package day31lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 5, 2, 11, 5, 3, 34));

        sumOfElements(numbers);

        sumOfUniqueElements(numbers);

        sumOfUniqueOddElements(numbers);

        multiplyUniqueEvenElements(numbers);



    }


    // Create a method to calculate the sum of all the elements
    public static void sumOfElements(List<Integer> list){

//        int sum = 0; // where 0 is identity element
//        for (Integer w : list){
//            sum += w;
//        }
//        System.out.println("sum = " + sum);

        int result = list.stream().reduce(0, (a, b) -> a+b);
        System.out.println("result = " + result);

        /*
        NOTES:
        reduce() function reduces the elements to a single element result
        after performing mathematical operation like addition or multiplication.
        It uses 0 or 1 as its identity element (like int sum = 0; in loops)

        Integer::sum => is the method reference for (a, b) -> a+b
         */

    }

    // Create a method to calculate the sum of all the elements AFTER removing duplicates

    public static void sumOfUniqueElements(List<Integer> list){

        int result = list.
                stream().
                distinct().
                reduce(0, Integer::sum);
        System.out.println("result = " + result);


    }

    // Create a method to calculate the sum of unique odd elements
    public static void sumOfUniqueOddElements(List<Integer> list){
        int result = list.stream().distinct().filter(t -> t %2 !=0).reduce(0, Integer::sum);

        System.out.println("result = " + result);
    }


    // Create a method to multiply unique even elements

    public static void multiplyUniqueEvenElements(List<Integer> list){
        int result = list.stream().distinct().filter(t -> t %2 ==0).reduce(1, (t, u) -> t*u);
        System.out.println("result = " + result);
    }


}
