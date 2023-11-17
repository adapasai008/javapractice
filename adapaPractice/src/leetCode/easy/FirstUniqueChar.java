package leetCode.easy;

public class FirstUniqueChar {

	public static void main(String[] args) {
		String str = "leetcode";
		int[] count = new int[26];
		
		for(char c : str.toCharArray()) {
			count[c-'a'] += 1;
		}
		
		for(int i=0;i<str.length();i++){
			if(count[str.charAt(i)-'a'] == 1) {
				System.out.println(i);
				break;
			}
		}
	}

}
