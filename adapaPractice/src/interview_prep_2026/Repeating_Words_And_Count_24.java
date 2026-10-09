package interview_prep_2026;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Repeating_Words_And_Count_24 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "spring", "java", "docker", "spring", "java", "kafka", "docker");

		Map<String, Integer> count = new HashMap<String, Integer>();

		for (String word : words) {

			if (count.containsKey(word)) {
				count.put(word, count.get(word) + 1);
			} else {
				count.put(word, 1);
			}
		}

		for (Map.Entry<String, Integer> map : count.entrySet()) {

			if (map.getValue() > 1) {
				System.out.println(map.getKey() + " : " + map.getValue());
			}

		}

		/* Java 8 code solution */
		System.out.println("---Java 8 solution---");
		Map<String, Long> count8 = words.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		count8.entrySet().stream().filter(w -> w.getValue() > 1)
				.forEach(w -> System.out.println(w.getKey() + " : " + w.getValue()));

	}

}
