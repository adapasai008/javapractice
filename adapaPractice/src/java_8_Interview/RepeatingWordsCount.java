package java_8_Interview;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatingWordsCount {

	public static void main(String[] args) {
		String str = "Adapa Sai Naga sai";

		Map<String, Long> repeat = Arrays.stream(str.split("\\s+")).map(String::toLowerCase).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		
		repeat.entrySet().stream().filter(e -> e.getValue() > 1).forEach(e -> System.out.println(e.getKey()+" : "+e.getValue()));

	}

}
