package day21stringbuilder;

public class StringBuilder03 {
    public static void main(String[] args) {

       StringBuilder sb = new StringBuilder("Java is object-oriented language");
       System.out.println("sb = " + sb);

       // append()
        sb.append(".");
        System.out.println("sb = " + sb);

        // replace() operates with 3 parameters
        // starting index => inclusive
        // ending index => exclusive
        // String => that you want to add

        sb.replace(0, 4, "Python");
        System.out.println("sb = " + sb); // Python is object-oriented language.


        // delete() operates with 2 parameters
        // starting index => inclusive
        // ending index => exclusive
        sb.delete(0, 6);
        System.out.println("sb = " + sb); // is object-oriented language.

        sb.deleteCharAt(0);
        System.out.println("sb = " + sb); //is object-oriented language.

        // insert() skips the index and adds the given value at the given index
        sb.insert(3, "SQL ");
        System.out.println("sb = " + sb); //is SQL object-oriented language.

        // What's the difference between replace() and insert()?
        // replace() method removes the given string from the given index
        // insert() does NOT remove anything; just adds the value at the given index


        // reverse()
        sb.reverse();
        System.out.println("sb = " + sb); //.egaugnal detneiro-tcejbo LQS si

        // We DO NOT have reverse() method for String data type


        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");

        System.out.println(sb1.equals(sb2)); // false
        // equal() method checks the value as well reference of the objects

        System.out.println(sb1 == sb2); // false
        // == checks reference equality (whether both references point to the same object).
        //sb1 and sb2 are two different StringBuilder objects,
        // so they do not refer to the same memory location.


        StringBuilder sb3 = new StringBuilder("Java");
        StringBuilder sb4 = new StringBuilder("Lava");

        System.out.println(sb3.equals(sb4)); // false
        System.out.println(sb3 == sb4); // false

        // How to compare the content of StringBuilder?
        System.out.println(sb1.toString().equals(sb2.toString())); // true
        System.out.println(sb3.toString().equals(sb4.toString())); // false


        // compareTo()
        System.out.println(sb1.compareTo(sb2)); // 0
        System.out.println(sb3.compareTo(sb4)); // -2


        // compareTo() method returns int value.
        // It checks the ASCII values of the characters
        // If the two StringBuilder objects are equal, it returns 0.
        // If the first StringBuilder object comes before the second, it returns negative value showing the difference between the characters on ASCII Chart
        // If the first StringBuilder object comes AFTER the second, it returns positive value showing the difference between the characters on ASCII Chart



    }
}
