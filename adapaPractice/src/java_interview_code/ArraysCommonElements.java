package java_interview_code;

import java.util.Arrays;

public class ArraysCommonElements {

	public static void main(String[] args) {
	
		int[] array1 = {11,12,13,14,15};
		int[] array2 = {11,51,12,65,14};
		
		for(int i=0;i<array1.length;i++) {//Using for loop to print the array values.
			System.out.print(array1[i]+ " ");
		}
		System.out.println();
		System.out.print(Arrays.toString(array2));//Using the Arrays.toString() method the values.
		System.out.println();
		System.out.println("Common elements from array1 and array2");
		
		for(int i=0;i<array1.length;i++) {
			
			for(int j=0;j<array2.length;j++) {
				
				if(array1[i]==array2[j]) {
					
					System.out.print(array1[i]+ " ");
				}
				
				
			}
			
		}

	}

}
