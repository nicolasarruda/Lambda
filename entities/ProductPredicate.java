package entities;

import java.util.function.Predicate;

// Implementa��o da interface Predicate

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
	
		if (p.getPrice() >= 100.0) {
			return true;
		}
		
		return false;
	}

	
}
