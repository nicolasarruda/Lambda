package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

// Lambda expression inline

public class Program16 {

	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 2000.00));
		list.add(new Product("Cell phone", 500.00));
		list.add(new Product("Headphone", 100.00));
		
		list.forEach(p1 -> p1.setPrice(p1.getPrice() * 1.1));

		for(Product p : list) {
			System.out.println(p);
		}
	}

}
