package java_interview;

public class ExceptionDemo {

//	1) Checked Exception
//	The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions.
//	For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.
//
//	2) Unchecked Exception
//	The classes that inherit the RuntimeException are known as unchecked exceptions.
//	For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.
//	Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
//
//	3) Error
//	Error is irrecoverable. Some example of errors are OutOfMemoryError, 
//	VirtualMachineError, AssertionError etc.
//	
	public static void main(String[] args){

		int i,j,k = 0;
		i = 16;
		j = 4;
		
		//With the help of try catch we can handle the exceptions.
		//Here it is unchecked exception.
		//And we can have multiple catch blocks with one try statement
		try {
			 
			k = i/j;
		}
		catch (ArithmeticException a) {
			System.out.println("cannot divided by Zero " +a);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println(k);
	}
}
