package java_interview;

public class FinalVariable {

	public static void main(String[] args) {

		//Once the value is assigned to the final variable it cannot be changed.
		//final variable value will be constant.
		final int i;
		
		i = 10;
		i = 20;//here it's showing error.
		System.out.println(i);

	}

}
