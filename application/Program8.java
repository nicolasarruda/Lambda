package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import entities.Product2;

// Interface funcional: Predicate with static method

public class Program8   {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Teclado", 70.00));
		list.add(new Product("HD", 350.00));
		list.add(new Product("Memory", 250.00));
		
		// reference method
		list.removeIf(Product2::staticProductPredicate);
		
		for(Product p : list) {
			System.out.println(p);
		}
		
		
		
	}

}
