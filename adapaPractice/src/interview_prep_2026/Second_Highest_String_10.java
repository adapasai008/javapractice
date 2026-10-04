package interview_prep_2026;

import java.util.Arrays;

public class Second_Highest_String_10 {

	public static void main(String[] args) {

		String[] str = { "Sai", "Keerthi", "Adapa", "Koteswararao" };

		String first = "";
		String second = "";

		for (String s : str) {

			if (s.length() > first.length()) {
				second = first;
				first = s;
			} else if (first.length() > s.length() && second.length() < s.length()) {
				second = s;
			}

		}

		System.out.println(second);

		/* solution using Java 8 */

		System.out.println("---Java 8 solution---");
		
		/*
		 * Integer.compare(s1.length(), s2.length())) this will give Assending order
		 * Integer.compare(s2.length(), s1.length())) this will give Desending order
		 */
		
		String second_8 = Arrays.stream(str).sorted((s1, s2) -> Integer.compare(s2.length(), s1.length())).skip(1)
				.findFirst().orElseThrow();

		System.out.println(second_8);
	}

}
