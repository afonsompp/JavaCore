package JavaCore.TicTacThread;

public class App {
	public static void main(String[] args) {
		TicTac tt = new TicTac();
		TicTacThread tic = new TicTacThread("Tic", tt);
		TicTacThread tac = new TicTacThread("Tac", tt);

	}
}
