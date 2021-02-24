package JavaCore.ThreadStopSuspendResume;

public class App {
	public static void main(String[] args) {
		var t1 = new MyThread("#1");
		var t2 = new MyThread("#2");

		t1.suspend();

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.suspend();

		t1.resume();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.stop();

	}
}
