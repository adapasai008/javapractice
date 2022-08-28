package java8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Products {

	int id;
	String name;
	double salary;

	public Products(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class StreamAPIfilterDemo {

	public static void main(String[] args) {

		List<Products> productsList = new ArrayList<Products>();

		productsList.add(new Products(1, "Adapa", 25000));
		productsList.add(new Products(2, "Sai", 10000));
		productsList.add(new Products(3, "Naga", 75000));
		productsList.add(new Products(4, "Hari", 35000));
		productsList.add(new Products(5, "Ramu", 55000));

		productsList.forEach(i -> System.out.println(i));

		System.out.println("salary lesser than 50000");

		// filtering the data without stream api's

		List<String> productsName = new ArrayList<String>();
		for (Products products : productsList) {

			if (products.salary <= 50000) {

				productsName.add(products.name + " = " + products.salary);
			}

		}
		productsName.forEach(i -> System.out.println(i));

		System.out.println("salary grater than 50000");
		// filtering the data with stream api's

		List<String> productsName2 = productsList.stream()
				.filter(p -> p.salary >= 50000)
				.map(p -> p.name +" = " + p.salary)
				.collect(Collectors.toList());
		productsName2.forEach(i -> System.out.println(i));

	}

}

