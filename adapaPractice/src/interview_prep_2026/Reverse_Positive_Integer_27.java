package interview_prep_2026;

public class Reverse_Positive_Integer_27 {

	public static void main(String[] args) {
		int num = 987654321;
		int result = 0;
		while (num > 0) {
			int tNum = num % 10;// this will print the remind.
			result = result * 10 + tNum;//multiplying  to add the number next to it

			num = num / 10;// it will remove the last number.
		}
		System.out.println(result);
	}

}
