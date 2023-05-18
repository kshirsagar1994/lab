//Question 2: Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
package thread;

public class LAB_ThreadEx2 {
	public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                System.out.println("Good morning");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                System.out.println("Welcome");
                try {
                    Thread.sleep(500);
                    step(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    private static void step(int delayMs) throws InterruptedException {
        Thread.sleep(delayMs);
    }
}

