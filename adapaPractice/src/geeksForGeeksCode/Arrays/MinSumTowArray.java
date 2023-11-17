package geeksForGeeksCode.Arrays;

import java.util.Arrays;

public class MinSumTowArray {

	static long minSum(long[] arr1, long[] arr2) {
		long result = 0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		reverse(arr2);
		
		for(int i=0;i<arr1.length;i++) {
			result = result + (arr1[i]*arr2[i]);
		}

		return result;
		
	}
	static void reverse(long[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(end > start) {
			long temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			end--;
			start++;
		}
	}
	
	public static void main(String[] args) {
		long[] arr1 = {6, 5, 4};
		long[] arr2 = {3, 1, 1};

		long minSum = minSum(arr1, arr2);
		System.out.println(minSum);
	}

}
