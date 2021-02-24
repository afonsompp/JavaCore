package JavaCore.TicTacThread;

public class TicTacThread implements Runnable {

	TicTac tt;
	Thread t;

	public TicTacThread(String name, TicTac tt) {
		this.tt = tt;

		t = new Thread(this, name);
		t.start();
	}

	@Override
	public void run() {
		if (t.getName().equalsIgnoreCase("Tic")) {
			for (int i = 0; i < 5; i++) {
				tt.tic(true);
			}
			tt.tic(false);
		} else {
			for (int i = 0; i < 5; i++) {
				tt.tac(true);
			}
			tt.tac(false);
		}
	}

}
