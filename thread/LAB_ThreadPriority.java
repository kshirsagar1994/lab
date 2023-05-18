//Question 3: Demonstrate getPriority() and setPriority() methods in Java threads.
package thread;

public class LAB_ThreadPriority {
	public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 executing");
            System.out.println("Thread 1 priority: " + Thread.currentThread().getPriority());
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 executing");
            System.out.println("Thread 2 priority: " + Thread.currentThread().getPriority());
        });

        // set priorities for threads
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        // start threads
        thread1.start();
        thread2.start();
    }
}
