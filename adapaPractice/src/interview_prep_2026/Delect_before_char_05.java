package interview_prep_2026;

public class Delect_before_char_05 {

	public static void main(String[] args) {
		String str = "abe#dc#";
		StringBuilder result = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			
			if(result.length() > 0 && str.charAt(i)=='#') {
				result.deleteCharAt(result.length()-1);
			}else {
				result.append(str.charAt(i));
			}
		}
		
		System.out.println(new String(result));

	}

}
