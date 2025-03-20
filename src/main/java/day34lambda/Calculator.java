package day34lambda;

@FunctionalInterface
public interface Calculator {

    int operate(int a , int b); // Abstract method

    default void showMessage(){
        System.out.println("Performing calculation ... ");
    }

}
