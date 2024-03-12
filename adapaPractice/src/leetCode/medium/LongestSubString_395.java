package leetCode.medium;

import java.util.HashMap;

public class LongestSubString_395 {

	public static int longestSubstring(String str,int k) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        // Count the frequency of each character in the string
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Find the first character with frequency less than k
        int splitIndex = 0;
        while (splitIndex < str.length() && charFrequency.get(str.charAt(splitIndex)) >= k) {
            splitIndex++;
        }

        // If all characters have frequency greater than or equal to k, return the length of the string
        if (splitIndex == str.length()) {
            return str.length();
        }

        // Recursively calculate the length of the longest substring for each part
        int left = longestSubstring(str.substring(0, splitIndex), k);
        int right = longestSubstring(str.substring(splitIndex + 1), k);

        return Math.max(left, right);
		
	}
	
	public static void main(String[] args) {
		
		String str = "aaaaabb";
		int k = 3;
		
		int result = longestSubstring(str, k);
		
		System.out.println(result);

	}

}
