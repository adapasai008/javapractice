package java8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Cars {

	private String name;
	private int quantity;
	private int price;

	public Cars(String name, int quantity, int price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car name= " + name + ", quantity= " + quantity + ", price= " + price;
	}

}
public class StreamsMapDemo {

	public static void main(String[] args) {

		List<Cars> cars = new ArrayList<Cars>();
		cars.add(new Cars("AUDI", 5, 10000));
		cars.add(new Cars("BMW", 9, 15000));
		cars.add(new Cars("VOLVO", 15, 18000));
		cars.add(new Cars("HONDA", 50, 9000));
		
		cars.forEach(i -> System.out.println(i));
		
		System.out.println("cars which are less that 10 quantity");
		
		List<String> quant = cars.stream().
				filter(q -> q.getQuantity()<10)
				.map(n -> n.getName()+", quanity = "+n.getQuantity()).
				collect(Collectors.toList());
		
		quant.forEach(i -> System.out.println(i));
		
		

	}

}
