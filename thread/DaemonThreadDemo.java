package thread;

public class DaemonThreadDemo extends Thread {
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Thread is daemon!");
		}
		else
			System.out.println("Thread us User-Thread");
		
	}
	public static void main(String[] args) {
		DaemonThreadDemo d1=new DaemonThreadDemo();
		DaemonThreadDemo d2=new DaemonThreadDemo();
		
		d1.setDaemon(true); //now it is daemon thread
		
		d1.start();
		d2.start();
		
	}

}
