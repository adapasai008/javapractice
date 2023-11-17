package java_8_Interview;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrams {

	public static void main(String[] args) {
		String a = "ias";
		String b = "Sai";
		
		a = Stream.of(a.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		b = Stream.of(b.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		
		if(a.equals(b)) {
			System.out.println("Two string are Anagrams");
		}else {
			System.out.println("Not Anagrams");
		}

	}

}
