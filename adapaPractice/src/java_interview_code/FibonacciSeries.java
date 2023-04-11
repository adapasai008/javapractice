package java_interview_code;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Fibonacci series is the sum of previous two numbers 1,1,2,3,5,8,13,21,34
		
		int num = 20;
		int fib = 0;
		
		for(int i=0;i<num;i++) {
			fib = fib+i;
			System.out.print(fib+" ");
		}

	}

}
