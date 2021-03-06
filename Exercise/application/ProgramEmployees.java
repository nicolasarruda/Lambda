package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employees;

public class ProgramEmployees {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path:");
		String path = sc.nextLine();
		
		List<Employees> list = new ArrayList<>();
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while(line != null) {
				String []fields = line.split(",");
				list.add(new Employees(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			Comparator<String> comp = (s1, s2) -> s1.compareTo(s2);
			
			System.out.println("Enter salary:");
			double salary = sc.nextDouble();
			
			List<String> orderName = list.stream()
					.filter(p -> p.getSalary() > salary)
					.map(p -> p.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			System.out.println("Email of people whose salary "
					+ "is more than " + salary);
			
			orderName.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(p -> p.getName().toUpperCase().charAt(0) == 'M')
					.map(p -> p.getSalary())
					.reduce(0.0, (x, y) -> x + y);
					
			System.out.println("Sum of salary "
					+ "of people whose name "
					+ "starts with 'M': " + String.format("%.2f", sum));
			
		} catch (IOException e) {
			e.getMessage();
		}

		sc.close();

	}

}
