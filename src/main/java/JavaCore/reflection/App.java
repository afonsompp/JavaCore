
package JavaCore.reflection;

import java.lang.reflect.InvocationTargetException;

public class App {

	// reflection é um recurso do java que possibilita o acesso e a modificação de
	// classes em tempo de execução através da JVM. através de reflections uma
	// classe pode acessar outra em tempo de execução sem necessáriamente saber que
	// ela exista no momento da compilação.
	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		try {

			// A JVM através do java.lang.Class provê métodos que permitem o acesso as
			// propriedades de uma classe em tempo de execução.
			var arquivoFromReflection = Class.forName("JavaCore.reflection.Arquivo").getDeclaredConstructor()
					.newInstance();
			System.out.println("Nome da classe: " + arquivoFromReflection.getClass().getSimpleName());

			System.out.println("\n Métodos da classe: " + arquivoFromReflection);
			for (var m : arquivoFromReflection.getClass().getMethods()) {
				System.out.println(m.getName());
			}

			System.out.println("\n Atributos da classe: " + arquivoFromReflection);
			for (var m : arquivoFromReflection.getClass().getDeclaredFields()) {
				System.out.println(m.getName());
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
