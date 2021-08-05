package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

// Function: upperCase name with lambda declared expression

public class Program20 {

	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 2000.00));
		list.add(new Product("Cell phone", 500.00));
		list.add(new Product("Headphone", 100.00));
		
		Function<Product, String> func = p -> {
			return p.getName().toUpperCase();
		};
		
	List<String> listString = list.stream().map(func).collect(Collectors.toList());

		listString.forEach(System.out::println);
	}
}
