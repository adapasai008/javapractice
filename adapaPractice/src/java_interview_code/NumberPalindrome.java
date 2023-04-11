package java_interview_code;

public class NumberPalindrome {

	public static void main(String[] args) {

		int num =  323;
		int rev = 0;
		int temp = num;
		
		//using for loop
//		for(int i=0;i<=num+1;i++) {//if i = 1 and num = 1 loop is not working that's why I have incremented the num value;
//			int reminder = num%10;
//			rev = rev*10+reminder;
//			num = num/10;
//		}
		//using while loop
		while(num!=0) {
			
			int reminder = num%10;
			rev = rev*10+reminder;
			num = num/10;
		}
		
		System.out.println("reverse value of the given number is = "+rev);
		
		if(temp == rev) {
			System.out.println("it's palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
