package leetCode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating_3 {

	public static int subString(String s) {

		if (s == null || s.length() == 0) {
			return 0;
		}

		Set<Character> seen = new HashSet<Character>();

		int result = 1;
		int right = 0;
		int left = 0;

		while (right < s.length()) {
			if (seen.contains(s.charAt(right))) {
				seen.remove(s.charAt(left));
				left++;
			} else {
				seen.add(s.charAt(right));
				int len = seen.size();
				result = Math.max(len, right - left);
				right++;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		String str = "pwwkeaw";

		int result = subString(str);
		System.out.println(result);

	}

}
/* Here i have used the sliding window technique to solve this problem where it will use only loop to iterate 
 * And used the hashset to store the char
 * If there no repeating char in the set assining that value to the result variable
 * If there are repeating values in set removing the values except the right index value
 * By using only single while loop that time complexit is O(n)
 * And the space complexity is  O(min(n, m)) where 'n' is the length of the string and 'm' is the size of char set*/
