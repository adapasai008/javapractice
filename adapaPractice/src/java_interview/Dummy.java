package java_interview;

public class Dummy {
	public static void main(String[] args) {

		String word = "sai";

		String check = "kcb";

		char[] ch = new char[26];

		for (char c : word.toCharArray()) {
			ch[c - 'a']++;
		}

		char[] chword = new char[26];

		boolean result = true;

		for (char c : check.toCharArray()) {
			chword[c - 'a']++;
			if (chword[c - 'a'] > ch[c - 'a']) {
				result = false;
				break;
			}
		}

		System.out.println(result);

	}
}

/*
 * for(int i=0;i<ch.length;i++) { if(ch[i] > 0) { System.out.print((char)
 * (i+'a') +" "); } }
 */