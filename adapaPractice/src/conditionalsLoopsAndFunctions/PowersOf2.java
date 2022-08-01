package conditionalsLoopsAndFunctions;

import java.util.Scanner;

public class PowersOf2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// Enter the number
		System.out.println("Enter the value: ");
		int number = scan.nextInt();
		int result = 1;
		int res = 1;
		int res1 = 0;
		if (number >= 2) {

			while (result <= number) {
				if (result % 2 == 0) {
					res = res * 2;
					if (res < number) {
						res1 = res;
					} else {
						break;
					}
				}
				result++;

			}

			System.out.print(res1);

		} else {
			System.out.print("Please enter an integer >= 2");
		}
		scan.close();

	}

}
