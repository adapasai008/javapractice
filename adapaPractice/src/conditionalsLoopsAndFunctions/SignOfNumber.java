package conditionalsLoopsAndFunctions;

import java.util.Scanner;

public class SignOfNumber {

	public static void main(String[] args) {

		int n;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the value:");
		n = input.nextInt();

		if (n >= 1) {
			System.out.println("The number entered is positive");

		} else {
			System.out.println("The number entered is negative");
		}

	}

}
