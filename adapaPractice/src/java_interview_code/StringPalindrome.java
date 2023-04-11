package java_interview_code;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str = "adda";
		String rev = "";
		boolean palindrome = false;
		
		
		for(int i=str.length()-1;i>=0;i--) { 
			rev = rev+str.charAt(i);
		}

		if(str.equals(rev)) {//.equals will compare the values of the object
			palindrome = true;
			System.out.println("Given string is palindrome : "+palindrome);
		}else {
			System.out.println("Given string is palindrome : "+palindrome);
		}
		

	}

}
