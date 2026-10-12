package interview_prep_2026;

public class String_Vowels_Reverse_46 {

	public static void main(String[] args) {

		String str = "Hello";

		char[] ch = str.toCharArray();

		int start = 0;
		int end = ch.length - 1;

		while (start < end) {

			while (start < end && !isVowel(ch[start])) {
				start++;
			}

			while (start < end && !isVowel(ch[end])) {
				end--;
			}

			char temp = ch[end];
			ch[end] = ch[start];
			ch[start] = temp;
			start++;
			end--;

		}

		System.out.println(new String(ch));

	}

	private static boolean isVowel(char c) {
		return "AEIOUaeiou".indexOf(c) != -1;
	}

}
