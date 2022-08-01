package conditionalsLoopsAndFunctions;

import java.util.Scanner;

public class RectangleOrSquare {

	public static void main(String[] args) {

		int length, breadth;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length: ");
		length = input.nextInt();
		System.out.println("Enter the breadth: ");
		breadth = input.nextInt();

		if (length == breadth) {

			System.out.println("Square");
		} else {

			System.out.println("Rectangle");

		}

	}

}
