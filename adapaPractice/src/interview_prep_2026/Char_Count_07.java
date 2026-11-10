package interview_prep_2026;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Char_Count_07 {

	public static void main(String[] args) {
		char[] ch = { 'a', 'f', 'a', 'f', 'a', 'f', 't' };

		Map<Character, Long> count = new String(ch).chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(count);

	}

}
