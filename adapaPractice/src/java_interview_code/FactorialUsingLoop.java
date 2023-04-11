package java_interview_code;

public class FactorialUsingLoop {

	public static void main(String[] args) {
		
		//Factorial of n is the product of all positive descending integer values. Factorial of n is denoted by n!.
		//4! = 4*3*2*1 = 24

		int num = 4;
		int value = 1;
		
		for(int i=1;i<=num;i++) {
			
			value = value*i;
		}
		System.out.println("Factorial of "+num+" is = "+value);

	}

}
