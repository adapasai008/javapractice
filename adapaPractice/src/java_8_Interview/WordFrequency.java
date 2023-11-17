package java_8_Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Adapa","Sai","Naga","Sai","Adapa");
		
		Map<String,Long> count = names.stream().collect(Collectors.groupingBy(s -> s,Collectors.counting()));

		System.out.println(count);
	}

}
