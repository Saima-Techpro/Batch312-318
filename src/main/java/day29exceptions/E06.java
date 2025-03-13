package day29exceptions;

public class E06 {
    public static void main(String[] args) {

        // Count the number of characters in a String
        String s = "Java is interesting!";

        String st = null;

        // method call

        numbOfChars(s); // 20
        numbOfChars(st); // NullPointerException
    }



    public static void numbOfChars(String s ){
        try{
        int length = s.length();
        System.out.println("length = " + length);
        } catch (NullPointerException npe){
            System.out.println(npe.getMessage());
            System.err.println("Can't count the length of a null variable");
            npe.printStackTrace();
        }

    }
}
