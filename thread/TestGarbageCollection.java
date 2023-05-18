package thread;

public class TestGarbageCollection {
	
	public void finalize()
	{
		System.out.println("All objects are collected for Garbage Collection. ");
		
	}
	
	public static void main(String[] args) {
		TestGarbageCollection t1=new TestGarbageCollection();
		TestGarbageCollection t2=new TestGarbageCollection();
		TestGarbageCollection t3=new TestGarbageCollection();
		
		t1=null; //setting it to be null or null referancing
		t2=null;
		System.gc();
		System.out.println("All are unreferrenced");
	}

}
