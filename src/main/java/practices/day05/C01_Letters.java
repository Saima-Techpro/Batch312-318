package practices.day05;

public class C01_Letters {
    public static void main(String[] args) {
        /*
            TASK: Print letter E made of asterisks on the console. use a row count integer. Example:
            int rowCount = 7;
            output:

            * * * * * * *
            *
            *
            * * * * * * *
            *
            *
            * * * * * * *
        */

        int rowCount = 5;

        for (int i = 1; i <= rowCount; i++){
            if (i == 1 || i == rowCount / 2 + 1 || i == rowCount){
                for (int j = 1; j <= rowCount; j ++){
                    System.out.print("* ");
                }
            }else {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("======================================================");
        /*
            TASK: Print letter F made of asterisks on the console. use a row count integer. Example:
            int rowCount = 7;
            output:

            * * * * * * *
            *
            *
            * * * * * * *
            *
            *
            *
        */

        for (int i = 1; i <= rowCount; i++){
            if (i == 1 || i == rowCount / 2 + 1){
                for (int j = 1; j <= rowCount; j ++){
                    System.out.print("* ");
                }
            }else {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
