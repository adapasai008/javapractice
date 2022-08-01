package conditionalsLoopsAndFunctions;

import java.util.Scanner;

public class AveragOfNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n = input.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {

			System.out.println("Enter the sum value: ");
			int y = input.nextInt();

			if(y!=0) {
				
				sum = sum+y;
			}
		
		}
		int result = sum / n;
		System.out.println(result);
		
	

	}

}
