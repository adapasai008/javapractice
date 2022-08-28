package java_interview;

class StringVowel {

	static boolean checkIf(String str) {

		return str.toLowerCase().matches(".*[aeiou]");

	}

}

public class Dummy {

	public static void main(String[] args) {
		System.out.println(StringVowel.checkIf("Adapa"));
	}

}
