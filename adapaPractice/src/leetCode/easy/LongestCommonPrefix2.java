package leetCode.easy;

public class LongestCommonPrefix2 {

	public static String longestCommonPrifx(String[] str){
		String result = str[0];
		
		for(int i=1;i<str.length;i++) {
			result = common(result, str[i]);
		}
		return result;
	}

	public static String common(String str1,String str2) {

		int n = Math.min(str1.length(), str2.length());
		
		StringBuilder result = new StringBuilder();
		
  		for(int i=0;i<n;i++) {
			if(str1.charAt(i) == str2.charAt(i)) {
				result.append(str1.charAt(i));
			}else {
				break;
			}
		}
		return result.toString();
		
	}
	
	public static void main(String[] args) {
		

		String[] str1 = {"flower","flow","flight"};
		
		String result = longestCommonPrifx(str1);
		System.out.println(result);

	}

}
