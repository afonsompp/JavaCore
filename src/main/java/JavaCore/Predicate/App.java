package JavaCore.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {
	public static void main(String[] args) {
		List<Product> prod = new ArrayList<>();

		prod.add(new Product("Notebook", 2444.99));
		prod.add(new Product("Teclado", 244.99));
		prod.add(new Product("TV", 2000.99));
		prod.add(new Product("Iphone", 3999.99));

		// Utilização da interface funcional utilizando implementação em classe concreta
		var predicateClass = new ProductPredicate();
		prod.removeIf(predicateClass);

		//Utilização de método estático
		prod.removeIf(Product::staticTest);

		// Utilização de método não estático
		prod.removeIf(Product::nonStaticTest);

		// Utilização de expressão lambda declarada
		Predicate<Product> predicate = p -> p.getPrice() > 2000.0;
		prod.removeIf(predicate);

		// Expressão Lambda declarada de forma inline
		prod.removeIf(p -> p.getPrice() >= 2000.0);

		for (Product p : prod) {
			System.out.println(p.getName());
		}
	}

}
