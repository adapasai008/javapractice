package java_8_Interview;

import java.util.Map;
import java.util.stream.Collectors;

public class CharFrequency {

	public static void main(String[] args) {
		String str = "adapa Sai Naga";
		
		Map<Character, Long> count = str.chars().mapToObj(e -> (char) e).filter(c -> c != ' ')
				.collect(Collectors.groupingBy(e -> e,Collectors.counting()));
		
		System.out.println(count);

	}

}
