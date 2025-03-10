package practices.day03;

public class C03_ForLoops {
    public static void main(String[] args) {
        //TASK: Print this pattern on the console.
        /*
            * * * * * .
            * * * * . .
            * * * . . .
            * * . . . .
            * . . . . .
        */

        int rows = 5;

        for (int i = 0; i < rows; i++){//print 5 lines
            int asteriskCount = rows - i;
            for (int j = 0; j < asteriskCount; j++){
                System.out.print("* ");
            }

            for (int j = 0; j <= i; j++){
                System.out.print(". ");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++){
            for (int j = i; j < rows; j++){
                System.out.print("* ");
            }

            for (int j = 0; j <= i; j++){
                System.out.print(". ");
            }
            System.out.println();
        }

        //HW: Print letter A made of asterisks in the console:
        /*
                *
               * *
              *****
             *     *
        */
    }
}
