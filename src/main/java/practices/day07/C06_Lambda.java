package practices.day07;

public class C06_Lambda {
    public static void main(String[] args) {
        //varargs
        sum(3,5,1000000, 98, 543, 278, 8, 1, 0, 23, 31, 45, 4500000);
    }

    private static void sum(int... numbers){
        int sum = 0;
        for (int n : numbers){
            sum += n;
        }
        System.out.println("sum = " + sum);
    }
}
