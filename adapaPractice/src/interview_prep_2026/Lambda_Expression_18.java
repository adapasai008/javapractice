package interview_prep_2026;

interface Cal_001 {

	int add(int a, int b);

}

public class Lambda_Expression_18 {

	public static void main(String[] args) {

		Cal_001 multi = (int a, int b) -> a * b;
		Cal_001 add = (int a, int b) -> a + b;

		System.out.println(multi.add(10, 5));
		System.out.println(add.add(10, 5));

	}

}
