package java_interview_code;

public class TryCatch2 {

	public static String message(int a, int c) {

		int b = a / c;//here it will throgh the runtime exception.

		try {

			if (b < 5)

				return "b < 5";

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {

			System.out.println("In finally");

		}

		return "b > 5";

	}

	public static void main(String[] args) {
		
		System.out.println(message(0, 0));		

		System.out.println(message(10, 2));

		System.out.println(message(8, 2));

	}

}
//Interviewer asked to provide the out-put. I have told output is this and that, but what ever I said is wrong.
//Actually the code will throw the run time exception at line 7 because dividing any number with zero it will lead to the "Artehmaticexcepiton"
//To handel that exception we should perform that division inside the try catch block. In this code it's performing the division operation outside the try catch block
//So when we run the this code it will throw the ArithmeticException and will terminate the code.
//if we exclude the first execution the remaining two exeuetion will work's fine.
//At first if will print the "In finally" and then it will print the return statement, because the return will excute afte all the funcition are executed.
