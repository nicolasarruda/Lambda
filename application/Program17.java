package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;
import entities.ProductFunction;

// Function: upperCase name with Class ProductFunction

public class Program17 {

	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 2000.00));
		list.add(new Product("Cell phone", 500.00));
		list.add(new Product("Headphone", 100.00));
		
	List<String> listString = list.stream().map(new ProductFunction()).collect(Collectors.toList());

		listString.forEach(System.out::println);
	}
}
