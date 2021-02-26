package JavaCore.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {
	public static void main(String[] args) {
		List<Product> prod = new ArrayList<>();

		prod.add(new Product("Notebook", 2444.99));
		prod.add(new Product("Teclado", 244.99));
		prod.add(new Product("TV", 2000.99));
		prod.add(new Product("Iphone", 3999.99));

		prod.forEach(new PriceUpdate());

		prod.forEach(Product::staticAccept);

		prod.forEach(Product::nonStaticAccept);

		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);

		prod.forEach(cons);

		prod.forEach(p -> p.setPrice(p.getPrice() * 1.1));

		prod.forEach(System.out::println);

	}
}
