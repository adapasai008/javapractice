package interview_prep_2026;

public class String_Vowels_Remove_45 {

	public static void main(String[] args) {

		String str = "Hello";
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {

			char c = Character.toLowerCase(str.charAt(i));

			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
				result.append(c);
			}
		}
		
		System.out.println(result);
		
	}

}
