package leetCode.easy;

import java.util.HashMap;

public class LongestPalindrome_409 {

    public int longestPalindrome(String s) {
        HashMap<Character, Integer> charCoutn = new HashMap<Character, Integer>();
        
        for(char c : s.toCharArray()) {
        	charCoutn.put(c, charCoutn.getOrDefault(c, 0)+1);
        }
        int length = 0;
        boolean hasOdd = false;
        
        for(int count : charCoutn.values()) {
        	if(count % 2 == 0) {
        		length += count;
        	}else {
        		length += count-1;
        		hasOdd = true;
        	}
        }
        
        if(hasOdd) {
           length += 1;
        }
        
        return length;
    }
	
	public static void main(String[] args) {
		String s = "abccccdd";
		LongestPalindrome_409 result = new LongestPalindrome_409();
		int value = result.longestPalindrome(s);
		
		System.out.println(value);
		
	}

}
