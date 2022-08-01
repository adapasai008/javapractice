package conditionalsLoopsAndFunctions;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {

	     int n;
	     Scanner input= new Scanner(System.in);
	     System.out.println("Enter the value: ");
	     n=input.nextInt();
	     int counter=n;
	     int i=0;
	     
	     do {
	    	 int sum =counter - i;
			System.out.println(sum);
			i++;
		} while (i<=n);
		
	}

}
