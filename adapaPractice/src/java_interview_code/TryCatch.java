package java_interview_code;

public class TryCatch {

	public static void main(String[] args) {

		System.out.println("1");
		TryCatch.print();
		System.out.println("2");
	}

	static void print() {

		try {
			System.out.println("3");
			int sum = 9 / 0;
		} catch (ArithmeticException e) {
			System.out.println("4");
		} catch (Exception e) {
			System.out.println("5");
		} finally {
			System.out.println("6");
		}

		//out put will be 1,3,4,6,2
		//Asked to me to tell what is the out put of this code.
	}

}
