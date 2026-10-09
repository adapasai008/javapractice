package interview_prep_2026;

public class Find_Missing_Number_22 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 6, 3, 7, 8 };

		int N = 8;

		/* formula for adding numbers 1 to N. */
		int expcted_sum = N * (N + 1) / 2; 
		int actul_sum = 0;
		for (int i : arr) {
			actul_sum += i;
		}

		int result = expcted_sum - actul_sum;

		System.out.println("Missing Number : " + result);

	}

}
