package java_interview_code;

public class StringReverse {

	public static void main(String[] args) {

		//one way of reversing the string.
		String str = "Adapa";
		String rev = "";
		
		int len = str.length();
		
		for(int i = len-1;i>=0;i--) {
			
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		
		
		//String reverse using the StringBuffer.
		
		StringBuffer sb = new StringBuffer("Sai");
		System.out.println(sb.reverse());
	}

}
