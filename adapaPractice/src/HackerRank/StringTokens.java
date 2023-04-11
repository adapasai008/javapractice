package HackerRank;

public class StringTokens {

	public static void main(String[] args) {
		
		//counting the total number of words present in the given string
		String str = "He is a very very good boy, isn't he?";
		
		String[] word = str.split("[^a-zA-Z]+");
		
		int tokens =0;
		
		for(int i=0;i<word.length;i++) {
			if(word[i].length() > 0) {
				tokens++;
			}
		}
		
		System.out.println(tokens);
		
		for(String c : word) {
			System.out.println(c);
		}

	}

}
