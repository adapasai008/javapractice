package geeksForGeeksCode.String;

import java.util.HashSet;
import java.util.Set;

public class LongestDistinctChar {

	static int longestChar(String str) {
		Set<Character> seen = new HashSet<Character>();
		int start = 0;
		int maxLength = 0;
		
		for(int end=0;end<str.length();end++) {//geeksforgeeks
			char ch = str.charAt(end);
			
			if(seen.contains(ch)) {
				while(str.charAt(start) != ch ) {
					seen.remove(str.charAt(start));
					start++;
				}
				start++;
			}else {
				seen.add(ch);
				maxLength = Math.max(maxLength, end - start +1);
			}
		}
		
		return maxLength;
	}
	
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		int num = longestChar(str);
		
		System.out.println(num);
	}

}
