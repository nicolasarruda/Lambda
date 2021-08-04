package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

// Comparator objeto de express�o lambda com chaves

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		Comparator<Product> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};

		list.sort(comp);
		
		for (Product p : list) {
			System.out.println(p);
		}

	}

}
