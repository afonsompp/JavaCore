package JavaCore.threads;

public class SimpleRunnable implements Runnable {

	private String name;
	private int time;

	public SimpleRunnable(String name, int time) {
		this.name = name;
		this.time = time;

	}

	@Override
	public void run() {
		try {
			for (int i = 1; i < 5; i++) {
				System.out.println(name + ": " + i);
				Thread.sleep(time);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
