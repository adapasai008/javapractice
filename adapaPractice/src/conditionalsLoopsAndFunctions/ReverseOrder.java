package conditionalsLoopsAndFunctions;

import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {

		  int n;
		     Scanner input= new Scanner(System.in);
		     System.out.println("Enter the value: ");
		     n=input.nextInt();
		        
		for(int i=0;i<=n;i++) {
			
			int y = n-i;
			System.out.println(y);
		}
	}

}
