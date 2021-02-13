package JavaCore.Assert;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner read = null;

		assert read != null : "read is null";
	}
	/**
	 * Boas práticas em relação ao uso do assert:
	 *
	 * Por ele vir desabilidado na JVM o mesmo só deve ser utilizado quando nós
	 * assumirmos que ele não será executado
	 *
	 * Sempre que formos checar se um valor é nulo, é mais recomendável a utilização
	 * de Options
	 *
	 * Evitar a utilização dos asserts para a verificação de inputs publicos, nesse
	 * caso é mais recomendado utilizar uma exceção inespera como por exemplo:
	 * IllegalArgumentException or NullPointerException
	 *
	 * Não executar funções em asserts
	 *
	 * Para a utilização dos asserts, é recomendável utilizalos em locais onde o
	 * código nunca irá ser executado, como por exemplo depois de um while(true) ou
	 * no bloco default de um switch
	 */
}
