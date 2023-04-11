package HackerRank;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String str = "ADAPA";
		String str1 = "DAAAP";
		
		str = str.replaceAll(" ", "").toLowerCase();
		str1 = str1.replaceAll(" ", "").toLowerCase();
		
		
		char[] strArray1 = str.toCharArray();
		char[] strArray2 = str1.toCharArray();
		
		Arrays.sort(strArray1);
		Arrays.sort(strArray2);
		
		if(Arrays.equals(strArray1, strArray2)) {
			System.out.println(str+" & "+str1+" is "+"Anagrams");
		}else {
			System.out.println("Not Anagrams");
		}

	}

}
