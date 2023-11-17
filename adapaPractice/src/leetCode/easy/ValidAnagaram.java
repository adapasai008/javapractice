package leetCode.easy;

import java.util.Arrays;

public class ValidAnagaram {

	public static void main(String[] args) {

		String str = "ABB";
		String str1 = "BAB";

		char[] ch = str.toCharArray();
		char[] ch1 = str1.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		boolean result = Arrays.equals(ch, ch1);
		
		System.out.println("Given strings are anagaram = "+ result);
	}

}
