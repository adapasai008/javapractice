package java_interview_code;

public class RemoveHashAndChar {

	public static void main(String[] args) {

		String str = "abe#dc#";// output should be abd
		String result = removeHash(str);

		System.out.println(result);

	}
	
	public static String removeHash(String str) {
		
		StringBuilder strb = new StringBuilder();
		
		
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i) == '#' && str.length() > 0) {
				strb.deleteCharAt(strb.length()-1);
			}else if(str.charAt(i) != '#') {
				strb.append(str.charAt(i));
			}
		}
		
		return strb.toString();
	}

}
