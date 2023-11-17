package java_8_Interview;

import java.util.Arrays;
import java.util.List;

public class FindNumsStartWithOnes {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(11,22,13,44,14);
		
		nums.stream().filter(i -> i.toString().startsWith("1")).forEach( e -> System.out.print(e+" "));

	}

}
