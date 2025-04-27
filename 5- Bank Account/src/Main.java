/*
Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the
account balance falls below one hundred.
*/

public class Main {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(823);
        SavingsAccount savings = new SavingsAccount(824);
        bank.deposit(100);
        savings.deposit(100);
        System.out.println();
        bank.withdraw(800);
        savings.withdraw(800);

    }
}