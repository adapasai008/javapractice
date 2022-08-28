package java_interview_code;


public class StringVowelCount {

	public static void main(String[] args) {

		String str = "Adapa Sai";

		countVowel(str);

	}

	private static void countVowel(String str) {
		int vowelCount = 0;
		int consonantCoutn = 0;

		for (int i = 0; i<str.length(); i++) {

			if (isVowel(str.charAt(i))) {

				++vowelCount;
			} else {
				++consonantCoutn;
			}

		}
		System.out.println("Total Vowels = "+vowelCount);
		System.out.println("Total Consonant = "+consonantCoutn);

	}

	private static boolean isVowel(char ch) {

		ch = Character.toUpperCase(ch);
		
		return (ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U');  
		
	}

}
