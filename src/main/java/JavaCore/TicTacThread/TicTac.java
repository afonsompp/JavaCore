package JavaCore.TicTacThread;

public class TicTac {
	private boolean tic;

	synchronized void tic(boolean running) {
		if (!running) {
			tic = true;
			notify();
			return;
		}

		System.out.print("Tic ");

		tic = true;
		notify();
		try {
			while (tic) {
				wait();
			}
		} catch (InterruptedException e) {
		}
	}

	synchronized void tac(boolean running) {
		if (!running) {
			tic = false;
			notify();
			return;
		}

		System.out.println("Tac");

		tic = false;
		notify();
		try {
			while (!tic) {
				wait();
			}
		} catch (InterruptedException e) {
		}
	}
}
