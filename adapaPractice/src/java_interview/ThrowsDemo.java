package java_interview;

class division {

	/*
	 Throws keyword is used in the method signature to declare the exception which might be thrown by 
	 the function while execution of the code.
	 
	 with Throws we can declare both checked and unchecked exceptions. However the "throws" keyword can be
	 used to propagate checked exception only.
	 */
	
	static void reminder(int a, int i) throws ArithmeticException {
		int k = a / i;

		System.out.println(k);

	}
}

public class ThrowsDemo {

	public static void main(String[] args) {

		try {

			division.reminder(9, 0);

		} 
		catch (ArithmeticException e){
			
			System.out.println("value should not be zero");
		}

	}
}