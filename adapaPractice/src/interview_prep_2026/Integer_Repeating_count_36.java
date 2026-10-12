package interview_prep_2026;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Integer_Repeating_count_36 {

	public static void main(String[] args) {

		List<Integer> list = List.of(10, 20, 30, 10, 20, 40, 30, 50);

		Map<Integer, Integer> count = new HashMap<Integer, Integer>();

		for (Integer i : list) {

			if (count.containsKey(i)) {
				count.put(i, count.get(i) + 1);
			} else {
				count.put(i, 1);
			}

		}

		for (Map.Entry<Integer, Integer> map : count.entrySet()) {

			if (map.getValue() > 1) {
				System.out.println(map.getKey() + " : " + map.getValue());
			}
		}
		
		/* Java 8 code solution */
		
		System.out.println("--Java 8 solution--");
		
		Map<Integer, Long> count8 = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		count8.entrySet().stream().filter(n -> n.getValue() > 1).forEach(n -> System.out.println(n.getKey() +" : "+n.getValue()));
	}
}
