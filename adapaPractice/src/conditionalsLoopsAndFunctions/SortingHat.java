package conditionalsLoopsAndFunctions;

import java.util.Scanner;

public class SortingHat {

	public static void main(String[] args) {
	
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value: ");
		n = input.nextInt();

		switch (n) {
		case 1: {

			System.out.println("Hufflepuff");
		}
			break;
		case 2: {

			System.out.println("Gryffindor");
		}
			break;
		case 3: {

			System.out.println("Slytherin");
		}
			break;
		case 4: {

			System.out.println("Ravenclaw");
		}
			break;
		default:
			System.out.println("Please enter the valied value");
		}

	}

}
