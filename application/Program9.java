package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

// Interface funcional: Predicate with nonstatic method

public class Program9   {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Teclado", 70.00));
		list.add(new Product("HD", 350.00));
		list.add(new Product("Memória", 250.00));
		
		// reference method
		list.removeIf(Product::nonStaticProductPredicate);
		
		for(Product p : list) {
			System.out.println(p);
		}
		
		
		
	}

}
