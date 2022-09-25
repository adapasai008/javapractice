package geeksForGeeksCode;

import java.util.Scanner;

class Solution {
	int binarysearch(int arr[], int n, int key) {

		int indexValue = -1;

		for (int i = 0; i < arr.length; i++) {

			if (key == arr[i]) {
				indexValue = i;
			}
		}

		return indexValue;

	}
}

public class BinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the T value");

		int T = sc.nextInt();

		while (T > 0) {
			System.out.println("Enter the N value");
			int n = sc.nextInt();
			System.out.println("Enter the list of N value");
			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the number to find the index value");
			int key = sc.nextInt();
			Solution g = new Solution();
			System.out.println("index value of " + key + " is " + g.binarysearch(arr, n, key));

			T--;

		}

	}

}
