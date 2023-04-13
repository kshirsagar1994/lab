package Abstraction;

interface BankAccount2 { //Create an interface
    void deposit(double amount); // methods called
    void withdraw(double amount); // methods called
}

class CheckingAccount2 implements BankAccount2 { // Create a class
    private double balance;

    public CheckingAccount2(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) { //implementation
        balance += amount;
        System.out.println("The Deposited " + amount + ".The New balance is " + balance);
    }

    public void withdraw(double amount) { //implementation
        if (amount > balance) {
            System.out.println("The Insufficient funds. The Current balance is " + balance);
        } else {
            balance -= amount;
            System.out.println("The Withdrawn " + amount + ".The New balance is " + balance);
        }
    }
}

//public interface LabWork_BankAccountEg2 {

public class LabWork_BankAccountEg2 {
    public static void main(String[] args) {
        CheckingAccount2 acc = new CheckingAccount2(1000.0); //object 
        acc.deposit(1500.0);
        acc.withdraw(1200.0);
    }
}



