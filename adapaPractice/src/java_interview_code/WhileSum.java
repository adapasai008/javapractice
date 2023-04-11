package java_interview_code;

public class WhileSum {

	public static void main(String[] args) {

		//Asked me to tell the output of this code.
		int x=5, y=0;
		
		while(++x<7) {//Here "x" will increment until the x = 7 and then it will exit the loop
			          //So here x value is 7 and y value is 2 7+2=9 and the out put is 9
			y =2;
		}
		System.out.println(x+y);
	}

}
