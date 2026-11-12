package interview_prep_2026;

import java.util.HashSet;
import java.util.Set;

public class Possible_Sequence_Dup_04 {

	static void premutDup(char[] chars, int index) {
		if (index == chars.length) {
			System.out.println(chars);
			return;
		}

		Set<Character> dup = new HashSet<Character>();

		for (int i = index; i < chars.length; i++) {

			if (dup.add(chars[i])) {
				swap(chars, index, i);
				premutDup(chars, index + 1);
				swap(chars, index, i);
			}

		}
	}

	static void swap(char[] chars, int start, int end) {
		char temp = chars[start];
		chars[start] = chars[end];
		chars[end] = temp;
	}

	public static void main(String[] args) {
		String str = "abb";
		premutDup(str.toCharArray(), 0);
	}

}
