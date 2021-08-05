package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import entities.ProductConsumer;

// Consumer: using the instance of ProductConsumer

public class Program12 {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 2000.00));
		list.add(new Product("Cell phone", 500.00));
		list.add(new Product("Headphone", 100.00));
		
		list.forEach(new ProductConsumer());
		for(Product p : list) {
			System.out.println(p);
		}
		
		
	}

}
