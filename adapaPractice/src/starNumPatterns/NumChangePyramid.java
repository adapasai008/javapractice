package starNumPatterns;

import java.util.Scanner;

public class NumChangePyramid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num = ");
		int num = sc.nextInt();
		
		int count = 1;

		for (int i = 1; i <= num; i++) {

			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
			
		}
		sc.close();

	}

}
