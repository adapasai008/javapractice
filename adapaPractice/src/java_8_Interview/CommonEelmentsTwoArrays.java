package java_8_Interview;

import java.util.Arrays;
import java.util.List;

public class CommonEelmentsTwoArrays {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(11,22,33,44,55,66);
		List<Integer> list2 = Arrays.asList(11,22,3,4,55,6);
		
		list1.stream().filter(list2::contains).forEach(e -> System.out.print(e+" "));

	}

}
