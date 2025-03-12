package day29exceptions;

public class E02 {
    public static void main(String[] args) {

      // Convert a string to int
      String s = "12345";

      String st = "3456xy!";

      // method call
        convertStringToInt(s); // 12345
        convertStringToInt(st); // NumberFormatException is thrown when a String has a mix of numbers,
                                // letters, symbols etc. Java tells us that those characters other than numbers can't be changed into int data type

    }

    public static void convertStringToInt(String s){

        try{
           Integer numbers =  Integer.valueOf(s);
            System.out.println("numbers converted to int data type= " + numbers);
        }catch (NumberFormatException e){
            System.out.println("Strings mixed with numbers and characters can't be formatted");
            System.out.println(e.getMessage());
        }

    }




}
