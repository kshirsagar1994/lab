package String;

	abstract class BankAccount {
	    String accountNumber;
	    double balance;

	    BankAccount(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    abstract void deposit(double amount);
	    abstract void withdraw(double amount);
	}

	class CheckingAccount extends BankAccount {

	    CheckingAccount(String accountNumber, double balance) {
	        super(accountNumber, balance);
	    }

	    @Override
	    void deposit(double amount) {
	        balance += amount;
	        System.out.println("$" + amount + " deposited into account " + accountNumber);
	    }

	    @Override
	    void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("$" + amount + " withdrawn from account " + accountNumber);
	        } else {
	            System.out.println("Insufficient funds in account " + accountNumber);
	        }
	    }
	}

	public class BankAccount_Lab {
	    public static void main(String[] args) {
	        CheckingAccount account = new CheckingAccount("112233", 1200.0);
	        account.deposit(400.0);
	        account.withdraw(150.0);
	    }
}