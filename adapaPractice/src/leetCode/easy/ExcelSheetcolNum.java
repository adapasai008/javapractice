package leetCode.easy;

public class ExcelSheetcolNum {

	public static void main(String[] args) {
		
		String str = "ABC";//refer the leetcode problem 171;
		char[] ch = str.toCharArray();
		
		int result = 0;
		
		for(char c : ch) {
			result = result * 26 + (c - 'A' + 1);
		}
		System.out.println(result);
	}

}
