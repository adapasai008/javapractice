package conditionalsLoopsAndFunctions;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {

		   String name;
	       int marks;
	       Scanner input = new Scanner(System.in);
	       System.out.println("Enter the student Name");
	       name = input.nextLine();
	       System.out.println("Enter the student Marks");
	       marks = input.nextInt();
	       
	       if (marks > 100) {
	    	   
	    	   System.out.println("The grade scored by "+name+ " is A");
	       }
	       else if ((marks >80) && (marks <=100) ) {
			
	    	   System.out.println("The grade scored by "+name+ " is B");
	    	   
		}
	       else if ((marks >60) && (marks <=80) ) {
				
	    	   System.out.println("The grade scored by "+name+ " is C");
	    	   
		}
	       else if ((marks >40) && (marks <=60) ) {
				
	    	   System.out.println("The grade scored by "+name+ " is D");
	    	   
		}
	       else {
	    	   System.out.println("The grade scored by "+name+ " is E");
		}
		
	}



}





