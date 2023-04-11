package java8_features;

import java.util.Arrays;
import java.util.List;

public class StreamDistinctDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,1,2,3,4,4,5);
		list.stream().distinct().forEach(i -> System.out.print(i+" "));

		//distinct() will return a stream of consists distinct elements in a stream (duplicate values)
		//This method will uses the hashCode() and equals() method to get the distinct element.
		
	}

}
