package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

// Comparator objeto de classe separada

public class Program2 {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		list.sort(new MyComparator());
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
	
	
	
	

}
