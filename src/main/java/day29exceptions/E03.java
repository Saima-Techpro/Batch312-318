package day29exceptions;

public class E03 {
    public static void main(String[] args) {
        // Get a specific character from the String

        String s = "Java is easy!";
        System.out.println(s.length()); // 13

        // method call

        getChar(s, 3); // a
        getChar(s, 0); // J
        getChar(s, 10); // s
        getChar(s, 13); // StringIndexOutOfBoundsException is thrown when a non-existing index is looed for
    }



    public static void getChar(String str, int idx){
        try {
            char ch = str.charAt(idx);
            System.out.println("ch = " + ch);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Use index within the length of the String");
            System.out.println("Don't use index out of bound");
            System.out.println(e.getMessage());
            e.printStackTrace(); // when developers want to see the actual error
            System.out.println("Hello again!");

        }
    }
}
