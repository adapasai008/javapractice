package interview_prep_2026;

import java.util.stream.IntStream;

public class Possible_Sub_Palindrome_11 {

	public static void main(String[] args) {
		String str = "adaaaba";

		
		/* solution using normal code */ 
		for (int i = 0; i < str.length() - 2; i++) {

			String sub = str.substring(i, i + 3);

			StringBuilder rev = new StringBuilder(sub);
			rev.reverse();

			if (sub.equals(rev.toString())) {
				System.out.println(sub);
			}
		}
		
		/* solution using Java 8 */ 

		System.out.println("---Java 8 code solution---");
		
		IntStream.range(0, str.length()-2).mapToObj(i -> str.substring(i, i+3)).filter(sub -> sub.equals(new StringBuilder(sub)
				.reverse().toString())).forEach(System.out::println);
	}

}
