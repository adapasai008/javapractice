package java_8_Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<String> listStr = Arrays.asList("Adapa","Sai","Adapa","Naga","Sai");
		
		List<String> result = listStr.stream().distinct().collect(Collectors.toList());
		
		System.out.println(result);

	}

}
