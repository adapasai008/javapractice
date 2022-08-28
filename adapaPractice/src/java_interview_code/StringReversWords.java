package java_interview_code;

public class StringReversWords {

	public static void main(String[] args) {

		String str = "Hi this is Adapa Sai";
		String rev = "";
		
		String a[] = str.split(" ");
		
		for(int i = a.length-1;i>=0;i--) {
			
			rev = rev+a[i]+" ";
		}
		System.out.println(rev);
		
	}

}
