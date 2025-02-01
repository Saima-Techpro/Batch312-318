package day02variables;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Concatenation01 {
    public static void main(String[] args) {


        String greetings; // uninitialised variable

        greetings = "Hello World!";
        System.out.println("greetings = " + greetings); // Hello World!


        // Update the value of greetings

        greetings = "Hello TechPro Family,";
        System.out.println("greetings updated = " + greetings);  // Hello TechPro Family,


        String greetings1 = "Java is fun!";

        // CONCATENATION => Joining two or more Strings together

        System.out.println(greetings + greetings1); // Hello TechPro Family, Java is fun!

        // If we want to store the concatenated value
        String classGreetings = greetings + greetings1;
        System.out.println("classGreetings = " + classGreetings);


        /*
        NOTE:
        When plus '+' sign is used between two String variables, it concatenates (joins them together)
        When plus '+' sign is used between two numerical variables, it adds them
        When plus '+' sign is used between one String and one numerical variable, the position of String
                      variable and the priority of mathematical operation will determine the result
        When plus '+' sign is used between one char and one numerical variable, it adds them


         */

        String str = "Apple" , s = "Orange";
        int x = 14 , y = 8;

        System.out.println(str + s); // AppleOrange
        System.out.println(x + y); // 22
        System.out.println(str + x); // Apple14 => CONCATENATION
        System.out.println(x + str); // 14Apple => CONCATENATION

        System.out.println(x + y + str); // 22Apple => addition first then CONCATENATION
        System.out.println(str + x + y); // Apple148 => CONCATENATION because JAVA sees String value first and then plus sign
        System.out.println(str + (x + y)); // Apple22 => addition first because of () and then CONCATENATION

        System.out.println(x + str + y); // 14Apple8 =>CONCATENATION
//        System.out.println(x*y+str);
//        System.out.println(str + x*y);
//        System.out.println(str + (x*y));
//        System.out.println((x*y) + str);

        char ch = 'A';
        System.out.println(ch + x); // 79 => addition happens because JAVA takes ASCII value of char data type
                                    // ASCII value of 'A' is 65 and value of x is already a number 14
                                    // so only addition happens .. NO CONCATENATION



    }
}
