package day21stringbuilder;

public class StringBuilder02 {
    public static void main(String[] args) {

         /*
         length() method provides character count whereas capacity() method indicates the size of places
        being allocated but unused.

           ==> Initially, Java gives you a default capacity of 16.
                If you exceed this given capacity, Java adjusts the new capacity : default*2+2

                NOTE: Capacity growth can reach OPTIMIZATION after the capacity has doubled a few times.

                Optimization means it will stop following this rule => default*2+2 of increasing the allocation
                of more spaces after some point, and it will start allocating ONLY that many places that are added.
         */

        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        System.out.println("length = " + sb.length()); // 0
        System.out.println("capacity = " + sb.capacity()); // 16


        sb.append("Java");
        System.out.println("length = " + sb.length()); // 4
        System.out.println(" default capacity = " + sb.capacity()); //16


        sb.append(" is easy?");
        System.out.println("length = " + sb.length()); // 13
        System.out.println("capacity = " + sb.capacity()); // 16

        sb.append(" It is OOP.");
        System.out.println("length = " + sb.length()); // 24
        System.out.println("capacity = " + sb.capacity()); // 34

        // new capacity = default * 2 + 2  => 16 * 2 + 2 = 34


        sb.append(" But it is driving me crazy. All concepts are muddled.");
        System.out.println("sb = " + sb);
        System.out.println("length = " + sb.length()); // 78
        System.out.println("capacity = " + sb.capacity()); // 78


        System.out.println("=============== Customise capacity ================= ");

        StringBuilder stringBuilder = new StringBuilder(5);
        System.out.println(stringBuilder); // empty
        System.out.println("length = " + stringBuilder.length()); // 0
        System.out.println("Customised capacity() = " + stringBuilder.capacity()); // 5

        stringBuilder.append("Customise");
        System.out.println(stringBuilder); // Customise
        System.out.println("length = " + stringBuilder.length()); // 9
        System.out.println("Customised capacity() = " + stringBuilder.capacity()); // 12


    }
}
