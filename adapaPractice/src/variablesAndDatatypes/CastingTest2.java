package variablesAndDatatypes;

import java.util.Scanner;

public class CastingTest2 {

	public static void main(String[] args) {

	    Scanner input= new Scanner(System.in);
	    
	    System.out.println("Enter the value");
	       int a=input.nextInt();
	       float f=input.nextFloat();
	       double d=input.nextDouble();
	       
	       double x = a;
	       int y = (int) f;
	       float z = (float) d;
	       
	       System.out.println("x="+x+" "+"y="+y+" "+"z="+" "+z);
	       
		
		
	}

}
