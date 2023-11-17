package leetCode.easy;

import java.util.ArrayList;
import java.util.List;

public class Fizz_Buzz {

	public static void main(String[] args) {

		int num = 15;// output should be "1","2","Fizz"
		List<String> result = new ArrayList<String>();

		for (int i = 1; i <= num; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				result.add("FizzBuzz");
			} else if (i % 5 == 0) {
				result.add("Buzz");
			} else if (i % 3 == 0) {
				result.add("Fizz");
			} else {
				result.add(String.valueOf(i));
			}
		}

		result.stream().forEach(j -> System.out.print(j + " "));

	}

}
