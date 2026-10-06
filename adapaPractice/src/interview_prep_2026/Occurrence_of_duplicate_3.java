package interview_prep_2026;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Occurrence_of_duplicate_3 {

	public static void main(String[] args) {

		String str = "Sahoo";
		
		Map<Character, Integer> count = new HashMap<Character, Integer>();
		
		for(char s : str.toCharArray()) {
			
			if(count.containsKey(s)) {
				count.put(s, count.get(s)+1);
			}else {
				count.put(s, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> word : count.entrySet()) {
			if(word.getValue() > 1) {
				System.out.println(word.getKey() +":"+word.getValue());
			}
		}
		
		     /* Java 8 code solution */
		Map<Character, Long> count_8 = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		
		count_8.entrySet().stream().filter(s -> s.getValue()>1).forEach(s -> System.out.println(s.getKey() +":"+s.getValue()));
	}

}
