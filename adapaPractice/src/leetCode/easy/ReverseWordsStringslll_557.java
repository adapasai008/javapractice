package leetCode.easy;

public class ReverseWordsStringslll_557 {

	public static String reverseWords(String s) {

		char[] chars = s.toCharArray();
		int start = 0;
		int end = 0;

		while (end < chars.length) {
			// Move end pointer until a space or end of string
			while (end < chars.length && chars[end] != ' ') {
				end++;
			}

			// Reverse the word from start to end-1
			reverse(chars, start, end - 1); // end is currently at the ' ' so we are removing the space 

			// Move start pointer to position after the space
			start = end + 1;
			end++;//End is currently at the ' ' so we increamenting it's position
		}

		// Reverse the last word (if any)
		reverse(chars, start, chars.length - 1);

		return new String(chars);

	}

	private static void reverse(char[] chars, int start, int end) {
		while (start < end) {
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		String str = "Let's take LeetCode contest";

		String rev = reverseWords(str);

		System.out.println(rev);

	}

}
/*
I used the two pointers technique to solve this problem.
Time complexity is O(n)
Space complexity is O(1)
 */