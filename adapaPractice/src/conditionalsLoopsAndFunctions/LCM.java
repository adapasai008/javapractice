package conditionalsLoopsAndFunctions;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// Enter the two numbers in the input console
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		System.out.print(lcm(number1, number2));

	}

	public static int lcm(int a, int b) {

		int max;
		int step;
		if (a > b) {
			max = step = a;
		} else {
			max = step = b;
		}

		while (a != 0) {
			if (max % a == 0 && max % b == 0) {
			int	lcm = max;
				break;
			}
			max += step;
		}
		
		return max;
	}

}
