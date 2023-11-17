package geeksForGeeksCode.String;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static String commonPrefix(String[] str) {
		StringBuilder result = new StringBuilder();
		Arrays.sort(str);
		
		char[] first = str[0].toCharArray();
		char[] last = str[str.length-1].toCharArray();
		
		for(int i=0;i<first.length;i++) {
			if(first[i] != last[i]) {
				break;
			}
			result.append(first[i]);
		}
		
		
		return result.toString();
		
	}
	
	public static void main(String[] args) {
		String[] str = {"geeksforgeeks", "geeks", "geek",
		         "geezer"};
		String result = commonPrefix(str);
		
		System.out.println(result);
	}

}
