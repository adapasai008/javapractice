package java_interview_code;

import java.util.HashSet;

public class ArrayFindDuplicateValues {

	public static void main(String[] args) {

		int[] arr = {11, 34, 54, 34, 11, 45, 54,};
		
	/*	boolean status = false;
		
		for(int i=0;i<arr.length;i++) {
			//j=i+1 here it will check weather the next element is equal or not 
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]+" ");
					status = true;
				}
				
			}
		}
		System.out.println();
		
		if(status == false) {
			System.out.println("No duplicate elements found...");
		}else {
			System.out.println("Duplicate elements are found...");
		}*/
		
		//Another way of find the duplicate values using HashSet
		
		HashSet<Integer> set = new HashSet<Integer>();

		for (Integer i : arr) {

			//If array contains duplicate values it will give false. 
			//If there are no duplicates it will give true.
			//Here we are printing only duplicate values.
			if(set.add(i)==false) {
				System.out.print(i+" ");
			}
		}
		

	}

}
