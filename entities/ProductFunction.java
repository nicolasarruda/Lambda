package entities;

import java.util.function.Function;

public class ProductFunction implements Function<Product, String>{

	// to Uppercase
	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
