package leetCode.easy;

public class ValidPalindrome {

	public static void main(String[] args) {
		String str = "m,ad a   ,m";
		String cleanStr = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		boolean palindrome = false;
		
		char[] s = cleanStr.toCharArray();
		String rev = "";
		for(int i = s.length-1;0<=i;i--) {
			rev += cleanStr.charAt(i); 
		}
		
		if(cleanStr.equals(rev)) {
			palindrome = true;
		}
		
		System.out.println("String Palindrome = "+ palindrome);
		System.out.println("cleanStr = "+cleanStr);
		System.out.println("rev = "+rev);
		
	}
}
