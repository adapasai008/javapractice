package leetCode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating_3 {

	public static String subString(String s) {

		int len = s.length();
		int maxlen = 0;
		int start = 0; int end = 0;
		int i=0; int j = 0;
		
		Set<Character> seen = new HashSet<Character>();
		
		while(i < len && j < len) {
			if(!seen.contains(s.charAt(j))) {
				seen.add(s.charAt(j++));
				if(j - i > maxlen) {
					maxlen = j-i;
					start = i;
					end = j;
				}
			}else {
				seen.remove(s.charAt(i++));
			}
		}
		return s.substring(start,end);
	}

	public static void main(String[] args) {

		String str = "pwwkeaw";

		String result = subString(str);
		int len = result.length();
		
		System.out.println(result+", count: "+len);

	}

}
/* Here i have used the sliding window technique to solve this problem where it will use only loop to iterate 
 * And used the hashset to store the char
 * If there no repeating char in the set assining that value to the result variable
 * If there are repeating values in set removing the values except the right index value
 * By using only single while loop that time complexit is O(n)
 * And the space complexity is  O(min(n, m)) where 'n' is the length of the string and 'm' is the size of char set*/
