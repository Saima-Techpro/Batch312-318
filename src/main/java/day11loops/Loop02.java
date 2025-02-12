package day11loops;

public class Loop02 {
    public static void main(String[] args) {

        /*
          Task 1: Put * between two consecutive characters and at the end of the String
          Example:  Java => J*a*v*a*
         */

        String str = "Java";
//        System.out.println(str.indexOf("J")); // 0
//        System.out.println(str.charAt(0)); // J
//        System.out.println(str.charAt(1)); // a
//        System.out.println(str.charAt(0) + "*"); // J*
//        System.out.println(str.charAt(1) + "*"); // a*

        System.out.println("========= Task 1 ==========");

        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + "*");
        }
        System.out.println();
        System.out.println("========= Task 2 =========");


        // Task 2: Print all the words before 'm' in the given String.
        // Example: "Miami" => "Mia"   "wisdom" => "wisdo"

        String s = "Miami";

        for (int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);

            if (ch == 'm'){
                break; // break keyword can be used at any point inside the loop
            }
            System.out.print(ch);
        }

        System.out.println();
        System.out.println("========= Task 3 =========");
        // Task 3: Print all the characters from a given string except the lowercase
        // Example: PassWord12?!  => PW12?!

        String st  = "PassWord12?!";

        for (int i = 0; i < st.length(); i++){
            if (! (st.charAt(i) >= 'a' && st.charAt(i) <= 'z')){
                System.out.print(st.charAt(i));

            }
        }
        System.out.println();
        System.out.println("======================");
        // Another way:

        for (int i = 0; i < st.length(); i++){
            char ch = st.charAt(i);
            if ( ch >= 'a' && ch <= 'z'){
                continue; // continue keyword means skip that value when is given condition is met
            }
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("============ INTERVIEW QUESTION ============");

        // Reverse the given String  => "java" => "avaj"
        String s1 = "java";

        System.out.println(s1.charAt(0)); // j
        System.out.println(s1.charAt(s1.length() - 1)); // a


        String reversed = "";

        for (int i = s1.length()-1; i >=0 ; i--){
             reversed = reversed + s1.charAt(i);
        }
        System.out.print("reversed = " + reversed); // avaj

        System.out.println();
        System.out.println("============");

        for (int i = 1; i <= s1.length(); i++) {
            char ch = s1.charAt(s1.length() - i);
            System.out.print(ch); // avaj

        }

        System.out.println();
        System.out.println("============ 2nd INTERVIEW QUESTION ============");

        // Check if the given String is a Palindrome or not
        // mom => mom    , ana => ana
        // level => level

        String s2 = "level";
        String reversedS2 = "";

        for (int i = s2.length()-1; i >= 0; i--){
             // System.out.println(s2.charAt(i));
             reversedS2 = reversedS2 + s2.charAt(i);
        }

        // System.out.println("reversedS2 = " + reversedS2); // mom

        if (reversedS2.equals(s2)){
            System.out.println("It is a Palindrome");
        }else {
            System.out.println("It is not a Palindrome");
        }


    }
}
