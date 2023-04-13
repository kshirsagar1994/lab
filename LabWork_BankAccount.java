package Abstraction;


abstract class BankAccount { //abstract class
    private int accountNumber; //attributes 
    protected double balance;//attributes 

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount); //abstract methods
    public abstract void withdraw(double amount);//abstract methods
}

class CheckingAccount extends BankAccount { //subclass 
    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) { //implements the "deposit"  methods
        double currentBalance = getBalance();
        double newBalance = currentBalance + amount;
        super.balance = newBalance;
        System.out.println(" Rs:" + amount + " deposited. \n New balance: " + newBalance);
    }

    @Override
    public void withdraw(double amount) { //implements the "withdraw" methods
        double currentBalance = getBalance();
        if (currentBalance < amount) {
            System.out.println("Insufficient funds. Withdrawal not possible.");
        } else {
            double newBalance = currentBalance - amount;
            super.balance = newBalance;
            System.out.println("\n Rs:" + amount + " withdrawn.\n New balance: " + newBalance);
        }
    }
}

public class LabWork_BankAccount {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(112233, 10000); //object 
        account.deposit(5500);
        account.withdraw(2200);
    }
}

