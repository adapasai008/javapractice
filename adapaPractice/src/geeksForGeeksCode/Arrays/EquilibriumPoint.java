package geeksForGeeksCode.Arrays;

public class EquilibriumPoint {

	static int equilibriumPoint(int[] arr) {
		long totalSum = 0;
		long leftSum = 0;
		int n = arr.length;

		for (int i = 0; i < n; i++) {//1, 3, 5, 2, 2
			totalSum += arr[i];
		}

		for (int i = 0; i < n; i++) {
			if (leftSum == totalSum - leftSum - arr[i]) {
				return i + 1;
			}
			leftSum += arr[i];
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 2, 2 };
		int result = equilibriumPoint(arr);

		System.out.println(result);
	}

}
