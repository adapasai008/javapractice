package leetCode.easy;

public class ValidPalindrome_125 {

	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (right > left) {
			while (right > left && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			while (right > left && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}

			if (Character.toLowerCase(s.charAt(right)) != Character.toLowerCase(s.charAt(left))) {
				return false;
			}
			right--;
			left++;
		}

		return true;
	}

	public static void main(String[] args) {

		String s = "A man, a plan, a canal: Panama";

		System.out.println(isPalindrome(s));

	}

}
