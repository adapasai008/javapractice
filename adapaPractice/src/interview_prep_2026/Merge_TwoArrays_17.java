package interview_prep_2026;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge_TwoArrays_17 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { 2, 4, 6 };
		int[] mergeArr = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {
				mergeArr[k] = arr1[i];
				k++;
				i++;
			} else {
				mergeArr[k] = arr2[j];
				k++;
				j++;
			}

		}

		while (i < arr1.length) {
			mergeArr[k] = arr1[i];
			k++;
			i++;
		}

		while (j < arr2.length) {
			mergeArr[k] = arr2[j];
			k++;
			j++;
		}

		System.out.println(Arrays.toString(mergeArr));

		/* Java 8 code solution */

		int[] mergeArr8 = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();

		System.out.println(Arrays.toString(mergeArr8));
	}

}
