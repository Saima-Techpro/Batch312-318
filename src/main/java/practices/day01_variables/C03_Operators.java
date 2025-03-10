package practices.day01_variables;

public class C03_Operators {
    public static void main(String[] args) {

        boolean result1 = 5 > 4 && 7 < 9 && 6 + 3 == 9 && 5 + 2 != 8; // True
        System.out.println(result1);

        boolean result2 = 5 > 4 && 7 > 9 && 6 + 3 == 9 && 5 + 2 != 8; // False
        System.out.println(result2);

        boolean result3 = 5 > 4 & 7 > 9 & 6 + 3 == 9 & 5 + 2 != 8; // False
        System.out.println(result3);

        boolean result4 = 5 > 4 | 7 > 9 | 6 + 3 == 9 & 5 + 2 != 8; // True
        System.out.println(result4);


        int number1 = 40;
        int number2 = 60;
        int number3 = 30;

        System.out.println(number1 > 30 && number1 < 70); // True
        System.out.println(number3 < 100 || number2 > 80); // True
        System.out.println(number2 >= 60 && number3 != 70); // True
        System.out.println(number3 != number2 && number2 > number1); // True
        System.out.println(number3 < 30 || number2 > 50 && number2 != 70); // True

    }
}
