package geeksForGeeksCode.String;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	static String removeDups(String str) {
		Set<Character> seen = new HashSet<Character>();
		StringBuilder result = new StringBuilder();
		for (char ch : str.toCharArray()) {

			if (seen.add(ch)) {
				result.append(ch);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String str = "zvvo";
		String removeDup = removeDups(str);
		
		System.out.println(removeDup);
	}

}
