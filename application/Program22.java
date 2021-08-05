package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.services.ProductService;

// Function: function over other function

public class Program22 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 2000.00));
		list.add(new Product("Cell phone", 500.00));
		list.add(new Product("Headphone", 100.00));
		list.add(new Product("Tablet", 350.00));
	
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list,p -> p.getName().charAt(0) == 'T' );
		
		System.out.println("Sum = " + String.format("%.2f", sum));
	}
}
