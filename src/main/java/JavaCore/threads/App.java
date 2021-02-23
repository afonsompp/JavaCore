package JavaCore.threads;

public class App {
	public static void main(String[] args) {
		SimpleRunnable thread1 = new SimpleRunnable("#1", 200);
		SimpleRunnable thread2 = new SimpleRunnable("#2", 700);
		SimpleRunnable thread3 = new SimpleRunnable("#3", 1300);
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();
		try {

			t1.join();
			t3.join();
			t2.join();
		} catch (InterruptedException e) {
		}

		System.out.println("terminou");
	}
}
