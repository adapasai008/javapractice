package java_interview_code;

import java.util.Arrays;

public class ArrayFirstAndSecondLargest {

	public static void main(String[] args) {
	
		int arr[] = {100,23,12,43,95};
		Arrays.sort(arr);
		int n = arr.length;
		int max = 0;
		//One way of finding first largest and second largest number in an array.
		System.out.println("Largest number = "+arr[n-1]+" Second largest number = "+arr[n-2]);
		
		//Adding i<n-1 will print the second largest number and removing "-1" will print will the largest.
		for(int i=0;i<n-1;i++) {
			
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Second largest number = "+max);

	}

}
