package starNumPatterns;

import java.util.Scanner;

public class NumIncTringale {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num = ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}
