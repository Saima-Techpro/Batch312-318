package day02variables;

public class Variables02 {
    public static void main(String[] args) {

        /*
               NON-PRIMITIVE DATA TYPE

            - Primitive data types have 'Values' only. NON-PRIMITIVES have values AS WELL AS methods.
            - Primitive data types are created by JAVA. We cannot create them. NON-PRIMITIVES can be created by us.
            - Primitive data types use lowercase in their names. NON-PRIMITIVES use UPPERCASE in their names
            - Memory usage in Primitive data types change from one data type to the other.
              the use of memory of NON-PRIMITIVES depends upon various factors like length of the values


              String is a NON-PRIMITIVE data type created by JAVA
              It can store value as well as methods
              String is used to store text / character sequence
              Its default value is null


         */

        // Data type    nameOfVariable  assignment Operator   "value"        semicolon
        String             name              =              "John Smith"       ;

        System.out.println(name); // John Smith
        System.out.println(name.toLowerCase()); // john smith
        System.out.println(name.toUpperCase()); // JOHN SMITH

        System.out.println("name = " + name); // John Smith

        String newName = name.toUpperCase();
        System.out.println("newName = " + newName);

        System.out.println("name = " + name); // John Smith - the original value of the name variable still stays the same


        // If we need to change the value of original variable, then we must re-assign it
        name = name.toUpperCase();

        System.out.println("after re-assigning to name variable = " + name);

        String firstName = "";
        System.out.println( firstName);



    }
}
