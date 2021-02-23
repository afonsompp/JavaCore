package JavaCore.synchronizedBlocks;

public class SimpleRunnable implements Runnable {

	private String name;
	private int[] num;
	private static Calculator calc;

	public SimpleRunnable(String name, int[] num) {
		this.name = name;
		this.num = num;
		calc = new Calculator();
		new Thread(this, name).start();
	}

	@Override
	public void run() {

		System.out.println(name + ": iniciada");
		System.out.println("O resultado da soma é: " + calc.somar(num));
		System.out.println(name + ": finalizada");

	}

}
