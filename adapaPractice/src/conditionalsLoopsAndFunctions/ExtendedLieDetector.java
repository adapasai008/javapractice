package conditionalsLoopsAndFunctions;

import java.util.Scanner;

public class ExtendedLieDetector {

	public static void main(String[] args) {

		int X, Y, A, B, heartRate;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the X value:");
		X = input.nextInt();
		System.out.println("Enter the Y value:");

		Y = input.nextInt();
		System.out.println("Enter the A value:");
		A = input.nextInt();
		System.out.println("Enter the B value:");
		B = input.nextInt();
		System.out.println("Enter the HearRate value:");
		heartRate = input.nextInt();

		if (((X + Y) > 30) && ((A > 3 || B < 6)) && (heartRate == 70)) {

			System.out.println("The person is telling the truth.");

		}

		else {

			System.out.println("The person is telling the lie");

		}

	}

}
