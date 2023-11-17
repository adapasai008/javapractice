package geeksForGeeksCode.String;

import java.util.HashSet;
import java.util.Set;

public class FirstRepetedChar {

	static String firstRepChar(String s) {

		Set<Character> seen = new HashSet<Character>();
		char ch = '\0';

		for (char c : s.toCharArray()) {
			if (seen.contains(c)) {
				ch = c;
				break;
			}
			seen.add(c);
		}

		String result = "-1";

		if (ch != '\0') {
			result = Character.toString(ch);
		}

		return result;

	}

	public static void main(String[] args) {
		String S = "geeaks";
		String firstRep = firstRepChar(S);

		System.out.println(firstRep);
	}

}
