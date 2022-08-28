package java_interview_code;

class StringVowelCheck {

	static boolean checkIf(String str) {

		return str.toLowerCase().matches(".*[aeiou]");

	}

}

public class StringVowel {

	public static void main(String[] args) {
		System.out.println(StringVowelCheck.checkIf("Adapa"));
	}

}