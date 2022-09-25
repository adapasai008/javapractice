package java_interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 Comparable and Comparator both are interfaces and can be used to sort collection elements.
 
 Comparator provides the multiple sorting sequences. In other words we can sort the collections on the basis
 of multiple elements such as id, name and price etc.
 
 Comparator does not affect the original class i.e the actual class is not modified.
 
 Comparator provides the compare() method to sort the elements.
 
 Comparator is present in the java.util package.
 
 We can sort the list elements of comparator type by Collections.sort(List, Comparator) method.
 */

class SportsBikes{
	
	private String name;
	private int price;
	private int bikeCc;
	
	public SportsBikes(String name, int price, int bikeCc) {
		super();
		this.name = name;
		this.price = price;
		this.bikeCc = bikeCc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBikeCc() {
		return bikeCc;
	}

	public void setBikeCc(int bikeCc) {
		this.bikeCc = bikeCc;
	}

	@Override
	public String toString() {
		return "SportsBikes [name=" + name + ", price=" + price + ", bikeCc=" + bikeCc + "]";
	}
	
	
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		
		List<SportsBikes> sp = new ArrayList<SportsBikes>();
		sp.add(new SportsBikes("KTM", 250000, 399));
		sp.add(new SportsBikes("TVS", 200000, 200));
		sp.add(new SportsBikes("HONDA", 275000, 300));
		sp.add(new SportsBikes("SUZUKI", 230000, 250));
		
		Comparator<SportsBikes> com = new Comparator<SportsBikes>() {// It's a Anonymous class 
			//Class that has no name is called the anonymous class.
			@Override
			public int compare(SportsBikes b1, SportsBikes b2) {
				
				if(b1.getBikeCc() < b2.getBikeCc()) {
					
					return 1;
					
				}else {
					return -1;
				}
			}
		};
		
		Collections.sort(sp, com);
		
		sp.forEach(i -> System.out.println(i));
		
		

	}

}
