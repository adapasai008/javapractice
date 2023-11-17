package java_8_Interview;

import java.util.stream.IntStream;

public class SumOfRange {

	public static void main(String[] args) {
		int sum = IntStream.range(1, 11).sum();
		System.out.println(sum);

	}

}
