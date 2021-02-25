package JavaCore.Predicate;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate {

	@Override
	public boolean test(Object o) {

		Product p = (Product) o;
		return p.getPrice() >= 2000.0;
	}

}
