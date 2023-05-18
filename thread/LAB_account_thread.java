package thread;

// public class LAB_account_thread {
	
	class Account {

	//initial account balance

	int balance = 20000;

	//synchronized withdraw method

	synchronized void withdraw(int amount)
	{
	System.out.println("Starting withdrawl..."); 
	if(this.balance<amount)
	{
		System.out.println("Balance is insufficient!!");
		try
		{
			wait();
		}
		catch (InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	}
		
		this.balance = balance-amount; //ctrl+alt+4($) 
			
		System.out.println("(Rs.) "+amount+" withdrawn successfully.");
	}
		
	//synchronized deposit method
	
	//synchronized display method
	
	public class LAB_account_thread {
		public static void main(String[] args) { 
			Account acc = new Account();

		// anonymous class

	new Thread()
	{
		public void run()
		{
			acc.withdraw(30000);
		}
	}	.start(); //starting the thread
	
	//depositThread.start();
	//displayThread.strat();
	
	}
	}
}
