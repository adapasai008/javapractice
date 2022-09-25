package java_interview;

public class ThrowDemo {

	public static void main(String[] args) {
		
		int a= 4;
		int k = 0;
		
	/*
	 Throw keyword is used to throw the exception inside the function or the block of the code.
	 
	 And it is used for the unchecked exception
	 
	 Throwable is the super class for all the exception and error classes.
	 */
		
		if(k==0){
			
			throw new ArithmeticException("k value should not be zero");
		}else {
			int j = a/k;
			
			System.out.println(j);
		}
		

	}

}
