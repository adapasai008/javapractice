package geeksForGeeksCode.String;

public class ImplementStrstr {

	static int strstr(String str, String patt) {
		int l1 = str.length();
		int f1 = patt.length();
		
		for(int i=0;i<=l1-f1;i++) {
			int j = 0;
			
			for(j=0;j<f1;j++) {
				if(str.charAt(i+j) != patt.charAt(j)) {
					break;
				}
			}
			if(j == f1) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		String str = "abcabcabcd";
		String patt = "abcd";

		int val = strstr(str, patt);
		System.out.println(val);
	}

}
