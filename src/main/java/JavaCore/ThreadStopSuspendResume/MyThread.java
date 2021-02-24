package JavaCore.ThreadStopSuspendResume;

public class MyThread implements Runnable {

	private String name;
	private boolean suspend;
	private boolean stop;

	public MyThread(String name) {
		this.name = name;
		this.suspend = false;
		new Thread(this, name).start();
	}

	@Override
	public void run() {
		System.out.println("Executando:" + name);
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(name + ": Num:" + i);
				Thread.sleep(300);
				synchronized (this) {
					while (suspend) {
						wait();
					}
					if (stop) {
						break;
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread " + name + " Terminada");
	}

	void suspend() {
		suspend = true;
	}

	synchronized void resume() {
		suspend = false;
		notify();
	}

	synchronized void stop() {
		stop = true;
		notify();
	}

}
