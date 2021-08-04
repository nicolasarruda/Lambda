package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

// Lambda inline

public class Program11 {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Teclado", 70.00));
		list.add(new Product("HD", 350.00));
		list.add(new Product("Memória", 250.00));

		// lambda inline

		list.removeIf(p1 -> p1.getPrice() >= 100);

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
