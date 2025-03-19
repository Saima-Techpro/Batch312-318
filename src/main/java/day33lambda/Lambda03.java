package day33lambda;

import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {

           /*
          a) IntStream - Allows for sequential operations on primitive int values. (There's also LongStream, DoubleStream)
          b) range - Creates a stream that represents consecutive numbers between specified start (inclusive) and end
                    values (exclusive).
          c) rangeClosed - Creates a stream that represents consecutive numbers between specified start (inclusive) and end
                    values (inclusive).
          d) addExact - Adds two int or long values exactly. This method is in the Math class.
          e) getAsInt - A method found in the OptionalInt class. If a value is present, this method returns it.
                        (We use this when we use IntStream)
                        If a value is not present, it throws a NoSuchElementException.
         */

        // Method call
        System.out.println(getSumBetweenGivenIntegers());
        System.out.println(multiplyGivenIntegers());

        System.out.println(getFactorial(6));
        System.out.println(getFactorial(1));
        System.out.println(getFactorial(0));
        System.out.println(getFactorial(-4));

        System.out.println(getSumOfEvens(2, 10));
        System.out.println(getSumOfEvens(12, 4));


    }


    // Create a method to calculate the sum of all integers from 7 to 70
    public static int getSumBetweenGivenIntegers() {
        return IntStream.rangeClosed(7, 70).reduce(Math::addExact).getAsInt();
    }

    // Create a method to multiply all integers from 7 to 15
    public static int multiplyGivenIntegers() {
        return IntStream.rangeClosed(7, 15).reduce(Math::multiplyExact).getAsInt();
    }


    // Create a method to get factorial of the given number

    public static int getFactorial(int a) {
        if (a == 0) {
            return 1;
        } else if (a < 0) {
            System.out.println("Invalid number for Factorials");
            return a;
        } else {
            int factorial = IntStream.rangeClosed(1, a).reduce(Math::multiplyExact).getAsInt();
            return factorial;
        }


    }


    // Create a method to get the sum of EVENS
//    public static int getSumOfEvens(int a, int b){
//        return IntStream.range(a, b).filter(t-> t%2 ==0).reduce(Math::addExact).getAsInt();
//    }


    // NOTE:  if a is bigger than b, range() and rangeClosed() methods can NOT return the range
    // because these methods always go from smaller to bigger value. They return 0 if we
    // start with bigger value

//    public static int getSumOfEvens(int a, int b){
//        if (a>b){
//            int temp = a;
//            a = b;
//            b = temp;
//        }
//        return IntStream.range(a, b).filter(t-> t%2 ==0).reduce(Math::addExact).getAsInt();
//    }


    // Using Utils method
    public static int getSumOfEvens(int a, int b){
        if (a>b){
            int temp = a;
            a = b;
            b = temp;
        }
        return  IntStream.range(a, b).filter(Utils::isNumEven).sum();
    }
}

