package JavaCore.synchronizedBlocks;

public class Calculator {

	private int soma;

	public synchronized int somar(int... num) {
		soma = 0;
		for (int i : num) {
			soma += i;

			System.out.println("Executando a soma: " + Thread.currentThread().getName() + " somando o valor: " + i
					+ " com o total de: " + soma);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return soma;
	}

}
