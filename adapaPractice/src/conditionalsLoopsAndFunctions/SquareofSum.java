package conditionalsLoopsAndFunctions;

import java.util.Scanner;

public class SquareofSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num1 & num2 values: ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
        System.out.print(squareOfSum(number1, number2));
		
	}

	public static int squareOfSum(int num1, int num2) {

		int sum = num1+num2;
		
		int square = sum *sum;
		
		return square;
		
	}
	
}
