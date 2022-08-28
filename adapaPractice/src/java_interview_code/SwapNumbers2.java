package java_interview_code;

public class SwapNumbers2 {

	public static void main(String[] args) {

		// swapping numbers with third variable
		int i = 2;
		int j = 6;

		int swap = j;

		j = i;
		i = swap;

		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		// swapping numbers with-out third variable
		System.out.println("-------------------");
        int k = 2;
        int m = 1;
        
        k = k+m;
        m = k-m;
        k = k-m;
        
		System.out.println("k = " + k);
		System.out.println("m = " + m);
		
	}

}
