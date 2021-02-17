package JavaCore.javaLangSystem;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Date;

public class app {

	public static void main(String[] args) {
		// Input and Output
		System.out.println("some message");

		try {
			// Redireciona o local de impressão da mensagem desejada
			System.setOut(
				new PrintStream("src\\main\\java\\JavaCore\\javaLangSystem\\File.txt"));
			System.out.println("some message");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// System.err é muito parecido com o System.out, porém ele representa um
		// standard erro, então tem uma saida específica para mensagens de erro.
		System.err.println("Some error log");
		try {
			// var user = readUsername(6);
			// System.out.println("User 1: " + user);

			// var user2 = readUsername();
			// System.out.println("User 2: " + user2);
		} catch (Exception e) {
		}

		// Acessando o console
		// var user = readUsernameConsole();
		// System.out.println("Console: " + user);

		// copiando arrays
		int[] a = {34, 22, 44, 2, 55, 3};
		int[] b = new int[a.length];

		System.arraycopy(a, 0, b, 0, a.length);

		// Observar as horas
		System.out.println(System.currentTimeMillis() + 3600 * 1000L);
		System.out.println(new Date(System.currentTimeMillis()).toString());

		//Manipular properties
		System.setProperty("casa", "casa ao lado");

		System.out.println(System.getProperty("casa", "casa ao lado"));

		// Acessar variáveis de ambiente
		System.out.println(System.getenv("PATH"));

		//Administrar o garbage collector
		System.gc();

		// Finalizar o programa
		var erro = false;
		if (erro) {
			System.exit(1);
		} else {
			System.exit(0);
		}
	}

	// IO
	public static String readUsername(int length) throws IOException {
		byte[] name = new byte[length];
		System.in.read(name, 0, length);
		return new String(name);
	}

	// IO
	public static String readUsername() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return reader.readLine();
	}

	// Console
	public static String readUsernameConsole() {
		Console console = System.console();

		return console == null ? null :
		  console.readLine("%s", "Digite seu nome: ");
	}

}
