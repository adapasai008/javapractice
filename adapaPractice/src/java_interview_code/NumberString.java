package java_interview_code;

public class NumberString {

	public static void main(String[] args) {
		
		String num = "561adfsd25dd8ff43";
		num = convert(num);
		
		System.out.println(num);

	}

	public static String convert(String num) {
		
		StringBuffer sb = new StringBuffer(num);
		
		for(int i=0;i<sb.length();i++){
			
			if (sb.charAt(i) < 48 || sb.charAt(i)> 57 ) {//check ASCII table values
				
				sb.deleteCharAt(i);
				
				i--;
				
			}
			
		}
		return sb.toString();
		
	}

}
