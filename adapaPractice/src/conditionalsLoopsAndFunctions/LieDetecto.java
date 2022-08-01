package conditionalsLoopsAndFunctions;

import java.util.Scanner;

public class LieDetecto {

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
		
		if((X+Y) > 30 ) {
			
			System.out.println("The person is telling the truth.");
			
		}
		else if (A>3 || B<6) {
			
			System.out.println("The person is telling the truth");
			
		}
		
		else if((heartRate == 70) && (X>3)) {
			
			System.out.println("The person is telling the truth");
			
		}
		else {
			
			System.out.println("The person is telling the lie");
			
		}
		
	}

}

//Sum of amounts of X and Y is greater than 30
//Either A is greater than 3 or B is less than 6
//Heart rate is equal to 70 and X is greater than 3
