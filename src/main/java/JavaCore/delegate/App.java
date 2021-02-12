package JavaCore.delegate;

public class App {
	public static void main(String[] args) {

		Account account = new Account(10.9);

		System.out.println(account.getBallance(new ConversionDolar()));

		// Delegation pattern é uma forma de trabalhar com várias variações de um mesmo
		// método de forma desacoplada, permitindo a usabilidade desses métodos e não
		// deixando uma classe com muitas responsábilidades.

	}
}
