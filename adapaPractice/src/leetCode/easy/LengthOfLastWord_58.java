package leetCode.easy;

public class LengthOfLastWord_58 {

	public static int lastWordLength(String str) {
		String[] words = str.split(" ");
		String result = words[words.length-1];
		return result.length();
	}
	
	public static void main(String[] args) {
		String str = "Hello World";
		int len = lastWordLength(str);
		System.out.println(len);

	}

}
