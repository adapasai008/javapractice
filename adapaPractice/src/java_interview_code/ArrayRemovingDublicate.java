package java_interview_code;

import java.util.HashSet;

public class ArrayRemovingDublicate {

	public static void main(String[] args) {

		int[] arr = {11,12,13,13,14,11};
		//with out sorting we cannot remove the duplicate elements from array
	/*	Arrays.sort(arr);

		int[] temp = new int[arr.length];
		int k = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] != arr[i+1]) {
				temp[k] = arr[i];
				k++;
			}
		}
		temp[k++] = arr[arr.length - 1];

		for (int i = 0; i < k; i++) {
			arr[i]=temp[i];
			System.out.print(temp[i]+" ");
		}*/
		
		
		//Another way of removing the duplicate elements form array.
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i:arr) {
			set.add(i);
		}
		set.forEach(i->System.out.print(i+" "));

	}

}
