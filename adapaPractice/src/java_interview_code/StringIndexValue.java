package java_interview_code;

public class StringIndexValue {

	public static void main(String[] args) {
	
		String str = new String("Sai");
		
		int k = 2;
		int length = str.length();
		
		for(int i=0;i<length;i++) {
		
			if(i==k) {
				System.out.println("character of given index : "+str.charAt(i));
			}
			
			
		}
		//last character of the given string 
		int last = str.length()-1;
		
		System.out.println("last character : "+str.charAt(last));

	}

}
