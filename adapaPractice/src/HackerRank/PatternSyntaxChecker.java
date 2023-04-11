package HackerRank;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		
		String str = "([A-Z])";
		
		try {
			Pattern.compile(str);
			System.out.println("Valid");
		} catch (PatternSyntaxException e) {
			System.out.println("Invalid");
		}

	}

}
