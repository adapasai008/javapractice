package geeksForGeeksCode.String;

import java.util.HashMap;
import java.util.Map;

public class MinIndexChar {

	public static int minIndex(String str, String patt) {
		
		Map<Character,Integer> mapStr = new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			mapStr.putIfAbsent(ch, i);
		}
		int minIndex = Integer.MAX_VALUE;
		char val = '\0';
		
		for(int i=0;i<patt.length();i++) {
			char ch = patt.charAt(i);
			
			if(mapStr.containsKey(ch) && mapStr.get(ch) < minIndex) {
				minIndex = mapStr.get(ch);
				val = ch;
			}
			
		}
		System.out.println(val);
		return minIndex;
		
	}
	
	public static void main(String[] args) {
		String str1 = "geeksforgeeks";
		String patt = "set";
		
		int result = minIndex(str1, patt);
		System.out.println(result);

	}

}
