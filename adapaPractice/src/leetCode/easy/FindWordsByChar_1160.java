package leetCode.easy;

public class FindWordsByChar_1160 {

	public static int countSharacter(String[] words,String chars) {
		int result = 0;
		
		char[] ch = new char[26];
		
		for(char c : chars.toCharArray()) {
			ch[c - 'a']++;
		}
		
		for(String word : words) {
			char[] chWord = new char[26];
			boolean id = true;
			for(char c : word.toCharArray()) {
				chWord[c - 'a']++;
				if(chWord[c - 'a'] > ch[c - 'a']) {
					id = false;
					break;
				}
			}
			if(id) {
				result+=word.length();
			}
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		String[] words = {"cat","bt","hat","tree"};
		String chars = "atach";
		
		int result = countSharacter(words, chars);
		
		System.out.println(result);

	}

}
