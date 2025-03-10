package practices.day03;

public class C01_StringManipulations {
    public static void main(String[] args) {
        //TASK: Print all the unique characters (the ones with only 1 occurrence) in a string.
        String string1 = "Bob, can you pass me the pen?";
        String string2 = "The quick brown fox jumps over the lazy dog.";
        // bob
        for (int i = 0; i < string1.length(); i++){
            if (string1.indexOf(string1.charAt(i)) == string1.lastIndexOf(string1.charAt(i))){
                System.out.print(string1.charAt(i));
            }
        }
        System.out.println();
        for (int i = 0; i < string2.length(); i++){
            if (string2.indexOf(string2.charAt(i)) == string2.lastIndexOf(string2.charAt(i))){
                System.out.print(string2.charAt(i));
            }
        }
    }
}
