package java_interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Comparable and Comparator both are interfaces and can be used to sort collection elements.
 
Comparable provides the single sorting sequence. In other words we can sort the collections on
on the basis of a single element such as id,name and price.

Comparable effects the original class i.e the actual class is modified.

Comparable provides the compareTo() method to sort the elements.

Comparable is present in java.lang package.

We can sort the list of elements of comparable type by Collections.sort(List) method
*/
class Laptop implements Comparable<Laptop> {

	private String lapNmae;
	private int price;
	private int ram;

	public Laptop(String lapNmae, int price, int ram) {
		super();
		this.lapNmae = lapNmae;
		this.price = price;
		this.ram = ram;
	}

	public String getLapNmae() {
		return lapNmae;
	}

	public void setLapNmae(String lapNmae) {
		this.lapNmae = lapNmae;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Laptop [lapNmae=" + lapNmae + ", price=" + price + ", ram=" + ram + "]";
	}

	@Override
	public int compareTo(Laptop lap) {

		if (this.getRam() < lap.ram) {

			return 1;
		} else {

			return -1;
		}
	}

}

public class ComparableDemo {

	public static void main(String[] args) {

		List<Laptop> lap = new ArrayList<Laptop>();
		lap.add(new Laptop("Dell", 75000, 4));
		lap.add(new Laptop("HP", 65000, 12));
		lap.add(new Laptop("ACER", 50000, 8));
		lap.add(new Laptop("LENOVO", 95000, 16));

		Collections.sort(lap);

		lap.forEach(i -> System.out.println(i));

	}

}
