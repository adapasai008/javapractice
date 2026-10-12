package interview_prep_2026;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Reverse_Each_Word_43 {

	public static void main(String[] args) {

		String s = "Adapa Sai Naga";
		String[] str = s.split(" ");
		StringBuffer strRev = new StringBuffer();

		for (String w : str) {

			for (int i = w.length() - 1; i >= 0; i--) {
				strRev.append(w.charAt(i));
			}
			strRev.append(" ");
		}

		System.out.println(strRev);

		/* Java 8 code solution */
		String rev = Arrays.stream(s.split(" ")).map(word -> new StringBuffer(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(rev);

	}

}
