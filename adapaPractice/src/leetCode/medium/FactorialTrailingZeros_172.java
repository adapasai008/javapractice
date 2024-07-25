package leetCode.medium;

public class FactorialTrailingZeros_172 {

	public static int trailingZeros(int num) {

		int count = 0;

		while (num >= 5) {

			count += num / 5;

			num /= 5;
		}
		return count;
	}

	public static void main(String[] args) {
		
		int num = 5;
		
		int zeros = trailingZeros(num);
		
		System.out.println(zeros);

	}

}
/*
 * I have used the Kadane's algorithm to solve this problme Time comeplexity of
 * this code is O(log(num)) becuse the while loop runs until the num value
 * become lesser than 5 Space complexity O(1) becuase it's just using the
 * constant face
 */