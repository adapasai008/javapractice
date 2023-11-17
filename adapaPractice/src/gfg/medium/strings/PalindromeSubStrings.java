package gfg.medium.strings;

public class PalindromeSubStrings {

	public static void findAllPalindromes(String str) {
		int n = str.length();
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 2; j <= n; j++) {
				String substring = str.substring(i, j);
				if (isPalindrome(substring)) {
					System.out.println(substring);
					count++;
				}
			}
		}
		if(count > 0) {
			System.out.println("count = "+count);
		}
	}

	public static boolean isPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		// String str = "abaab";// possible palindromes "aba","aa","baab" count 3;

		String str = "abaab";
		findAllPalindromes(str);

	}

}
