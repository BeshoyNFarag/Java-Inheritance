/*
Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the
account balance falls below one hundred.
*/

public class SavingsAccount extends BankAccount{

    public SavingsAccount(double balance) {
        super(balance);
    }


    @Override
    public void withdraw( double withdraw ){
        if (withdraw > balance){
            System.out.println("you have insuffecient amount");
        }
        else {
            balance -= withdraw;
            System.out.println("your amount has been withdrawn you now have: " + balance);
        }
    }

}
