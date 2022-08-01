package variablesAndDatatypes;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Celsius value: ");
//		double C = sc.nextInt();
//		double F = (9 * C) / 5 + 32;
		
		int C = sc.nextInt();
		int F = (9 * C) / 5 + 32;

		System.out.println(F);

	}

}
