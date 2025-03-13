package day29exceptions;

public class E09 {
    public static void main(String[] args) {

          /*
          finally block

    1) The 'finally block' is commonly used for:
    a) Releasing resources: (disconnecting database connections, using the close() method),
       Especially before Java 7, resources like database connections had to be closed manually.
       Such resources, if left open for too long, would occupy unnecessary space in the system
       and could lead to potential performance issues.
       This became automated post-Java 7 (with the try-with-resources statement).

    b) Closing files: (we had just made a file connection. it could be closed with fis.close();)
      It's necessary to close files after reading or writing operations are done. Otherwise,
      file handles unnecessarily occupy space in the system.

    c) Cleanup operations that must run in all cases:
      (Some operations, whether successful or not, should always be performed at the end of a certain process.
      For example, logging the start and end times of each operation to a log file. With BufferedWriter)

         */

        // Get a specific element from a given String Array

        String[] arr = {"Java", "is", "not", "easy."};


        // method call
        getElementFromArray(arr, 6, 2);
        System.out.println("============");
        getElementFromArray(arr, 8, 2);
        System.out.println("============");
        getElementFromArray(arr, 4, 0);



    }

    public static void getElementFromArray(String[] str , int a, int b){

        try {
            int idx = a / b;
            String element = str[idx];
            System.out.println("element = " + element);
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Index can't be greater than the length of the array");
        }catch (ArithmeticException e){
            System.out.println("Division is not possible by zero.");
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally { // works every time the code is executed
            // close the connection
            // connection.close();
            System.out.println("Close the connection with the DataBase.");
        }


    }
}
