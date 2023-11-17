package java_8_Interview;

import java.util.stream.IntStream;

public class EvenNums {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10).map(i -> i*2).forEach(e -> System.out.print(e+" "));

	}

}
