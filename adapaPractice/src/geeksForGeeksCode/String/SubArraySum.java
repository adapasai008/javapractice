package geeksForGeeksCode.String;

import java.util.ArrayList;

public class SubArraySum {

	public static ArrayList<Integer> sumPosition(int[] arr, int sum) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int temp = 0;

		for (int j = 0; j < arr.length; j++) {
			for (int i = j; i < arr.length; i++) {
				temp = temp + arr[i];
				if (temp == sum) {
					result.add(j+1);
					result.add(i + 1);
					break;
				}
			}
			if (temp == sum) {
				break;
			} else {
				temp = 0;
				result.clear();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 7, 5 };// output sum form position 2 to 4;
		int sum = 12;
		ArrayList<Integer> result = sumPosition(arr, sum);

		result.stream().forEach(n -> System.out.print(n + " "));

	}

}
