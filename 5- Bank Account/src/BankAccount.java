/*
Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the
account balance falls below one hundred.
*/


public class BankAccount {
    protected double balance;



    public BankAccount(double balance) {
        this.balance = balance;
    }


    public void deposit( double amount ){
        System.out.println(amount + " was deposited");

    }

    public void withdraw( double amount ){
        System.out.println(amount + " was withdrawn");
    }
}
