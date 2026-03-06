package leetCode.easy;

public class ReverseString {

	public static void main(String[] args) {
		
		char[] str = {'a','d','a','p','a'};
		
		int start = 0;
		int end = str.length-1;
		
		while(start <= end) {
			char ch = str[start];
			str[start] = str[end];
			str[end] = ch;
			start++;
			end--;
		}
		
		
		System.out.println(str);
	}

}
