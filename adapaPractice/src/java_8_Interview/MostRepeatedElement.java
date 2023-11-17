package java_8_Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostRepeatedElement {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

		Map<String, Long> wordCount = listOfStrings.stream()
				.collect(Collectors.groupingBy(e -> e,Collectors.counting()));
		
		Map.Entry<String,Long> frequent = wordCount.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println("most frequent element = "+frequent.getKey());
		System.out.println("count = "+ frequent.getValue());
	}

}
