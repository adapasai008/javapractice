package conditionalsLoopsAndFunctions;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int number = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= number; i++) {
			sum = sum + i;

		}

		System.out.print(sum);
	}

}
