package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

// Comparator express�o lambda "direto no argumento"

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}

}
