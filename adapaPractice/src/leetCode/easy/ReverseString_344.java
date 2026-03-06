package leetCode.easy;

public class ReverseString_344 {

	public static void reverseString(char[] s) {
		int left = 0;
		int right = s.length - 1;

		while (right > left) {
			char temp = s[right];
			s[right] = s[left];
			s[left] = temp;
			right--;
			left++;
		}
	}

	public static void main(String[] args) {

		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		reverseString(s);

		System.out.println(s);
	}

}
