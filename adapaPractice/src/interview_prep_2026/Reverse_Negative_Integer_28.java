package interview_prep_2026;

public class Reverse_Negative_Integer_28 {

	public static void main(String[] args) {
		int number = -987654321;
		int num = Math.abs(number);
		int result = 0;

		while (num > 0) {
			int temp = num % 10;
			result = result * 10 + temp;
			num = num / 10;
		}

		if (number < 0) {
			result = -result;
			System.out.println(result);
		}
	}

}
