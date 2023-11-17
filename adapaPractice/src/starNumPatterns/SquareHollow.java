package starNumPatterns;

import java.util.Scanner;

public class SquareHollow {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int stars = sc.nextInt();

		for(int i=0;i<stars;i++) {
			
			for(int j=0;j<stars;j++) {
				
				if(i == 0 || j == 0 || i == stars-1 || j == stars-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
