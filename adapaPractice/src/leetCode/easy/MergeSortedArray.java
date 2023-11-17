package leetCode.easy;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		//should merge two sorted arrays.
		
		int[] arr1 = {2,4,6,3};
		int[] arr2 = {1,8,7,5};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int[] mergeArray = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] <= arr2[j]) {
				mergeArray[k] = arr1[i];
				i++;
			}else {
				mergeArray[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i < arr1.length) {
			mergeArray[k] = arr1[i];
			i++;
			k++;
		}
		while(j < arr2.length) {
			mergeArray[k] = arr2[j];
			j++;
			k++;
		}
		
		for(int m : mergeArray) {
			System.out.print(m+" ");
		}
	}
}
