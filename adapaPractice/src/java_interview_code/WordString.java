package java_interview_code;

public class WordString {

	public static void main(String[] args) {
		
		String str = "Adapa Sai 1233";
		str = convert(str);
		
		System.out.println(str);

	}

	public static String convert(String str) {

		StringBuffer sb = new StringBuffer(str);
		 
		for(int i=0;i<sb.length();i++) {
			
			//check ASCII table values
			if(sb.charAt(i) < 65 || sb.charAt(i) > 90 && sb.charAt(i) < 97 || sb.charAt(i) > 122) {
				
				sb.deleteCharAt(i);
				i--;//this function will decrease the value so that it's won't miss the values.
				
			}
			
		}
		return sb.toString();
		
	}

}
