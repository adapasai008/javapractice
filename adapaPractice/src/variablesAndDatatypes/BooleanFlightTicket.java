package variablesAndDatatypes;

import java.util.Scanner;

public class BooleanFlightTicket {

	public static void main(String[] args) {

		int myAge;
		int ageOfBrother;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your Age: ");
		myAge = input.nextInt();
		System.out.println("Enter your Brother: ");
		ageOfBrother = input.nextInt();
		
		boolean discount = (myAge + ageOfBrother) < 25;
		
		System.out.println("your are eligable for discount "+ discount);

	}

}

