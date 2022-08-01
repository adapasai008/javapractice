package variablesAndDatatypes;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a, b; 
		a = 1; 
		b = 2; 

		int swap = b;

		b = a;
		a = swap;

		System.out.println("a = " + a);
		System.out.println("b = " + b); 

	}

}
