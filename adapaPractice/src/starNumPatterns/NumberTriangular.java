package starNumPatterns;

import java.util.Scanner;

public class NumberTriangular {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			for(int j=num;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print(" "+i);
			}
			
			System.out.println();
			
		}
		
		sc.close();

	}

}
