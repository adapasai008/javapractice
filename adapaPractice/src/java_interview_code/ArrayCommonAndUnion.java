package java_interview_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayCommonAndUnion {

	public static void main(String[] args) {
		int[] arary1 = {15,78,32,95,44};
		int[] array2 = {55,15,44,32,63};
		
		System.out.println("Common values in array");
		commonArray(arary1, array2);
		
		System.out.println();
		
		System.out.println("Union of two arrays");
		unionArray(arary1, array2);
		

	}
	static void unionArray(int[] arr1,int[] arr2) {//To union the two arrays.
		
		Set<Integer> arr = new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++) {
			arr.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			arr.add(arr2[i]);
		}
//		arr.forEach(i -> System.out.print(i+ " "));
		
		List<Integer> list = new ArrayList<Integer>(arr);
		Collections.sort(list);//To sort the array.
		System.out.println(list);
		
	}
	static void commonArray(int[] arr1,int[] arr2) {//To find the common elements in 2 arrays
		
		Set<Integer> arr = new HashSet<Integer>();
		
		for(int i=0;i<arr1.length;i++) {
			arr.add(arr1[i]);
		}
		for(int j=0; j<arr2.length;j++) {
			
			if(arr.contains(arr2[j])) {
				System.out.print(arr2[j]+" ");
			}
		}
		
	}

}
