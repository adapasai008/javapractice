package java8_features;

import java.util.Arrays;
import java.util.List;

public class ArrayListSort {

	public static void main(String[] args) {
		
		List<Integer> listSort = Arrays.asList(2,5,3,4,1);
		listSort.stream().sorted().forEach(i-> System.out.print(i+" "));

	}

}
