package variablesAndDatatypes;

import java.util.Scanner;

public class LieDetector01 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value x:");
		x = sc.nextInt();
		System.out.println("Enter the value y:");
		y = sc.nextInt();
		
		boolean reuslt = x+y >= 30;
		
		System.out.println("The statement said by the person is "+reuslt);
		
		

	}

}
