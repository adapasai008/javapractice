package java_interview_code;

public class StringComparison {
//Asked me to tell the output of this code.
//Output: 1,3
	public static void main(String[] args) {
		String s1 = "abc";
		String s3 = new String("abc");
		String s2 = "abc";
		
		if(s1==s3) {
			
			System.out.println(5);
		}
		if(s1==s2) {
			System.out.println(1);
		}else {
			System.out.println(2);
		}
		if(s1.equals(s2)) {
			System.out.println(3);
		}else {
			System.out.println(4);
		}

	}

}
