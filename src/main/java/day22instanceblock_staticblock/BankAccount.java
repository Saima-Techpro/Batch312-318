package day22instanceblock_staticblock;

public class BankAccount {

    // instance variables
    public String ownerName;
    public int accountNumb;
    public double balance;

    // static variable
    public static int accountCount = 0;  // to count the accounts


    // instance block

    {
        this.accountNumb = ++accountCount; // pre-increment
        this.balance = 100;
        System.out.println("Instance block is executed here!");
    }

    // static block
    static {
        accountCount = 1000;
        System.out.println("Static block is executed here!");
    }


    // constructor
    public BankAccount(String nameOfOwner){
        this.ownerName = nameOfOwner;
        System.out.println("Constructor is executed here!");
    }

    // Method to display the account details
    public void displayAccount(){
        System.out.println("accountNumb = " + accountNumb);
        System.out.println("balance = " + balance);
        System.out.println("ownerName = " + ownerName);
    }



    public static void main(String[] args) {
        // NOTE: Order of execution:  static block => instance block => constructor => class members

        BankAccount account1 = new BankAccount("Elyas");
        account1.displayAccount();

        System.out.println("=======================");

        BankAccount account2 = new BankAccount("Alperen");
        account2.displayAccount();

        System.out.println("=======================");

        BankAccount account3 = new BankAccount("Saima");
        account3.displayAccount();


    }

}
