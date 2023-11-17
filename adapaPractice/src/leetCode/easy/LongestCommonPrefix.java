package leetCode.easy;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		//Here I should print the common characters form the given strings
		//Here "fl" are the common characters.
		
		String[] str = {"flower","flow","flight"};
		
		String prefix = str[0];
		
		for(int i=0;i<str.length;i++) {
			while(str[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length()-1);
			}
		}
		
		System.out.println(prefix);
		
	}
	
}
