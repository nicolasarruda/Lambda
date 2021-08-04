package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

// Predicate with lambda declare expression

public class Program10 {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Teclado", 70.00));
		list.add(new Product("HD", 350.00));
		list.add(new Product("Memória", 250.00));

		// lambda
		
		Predicate<Product> prod = (p1) -> {
			return p1.getPrice() >= 100.0;
		};
		
		list.removeIf(prod);

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
