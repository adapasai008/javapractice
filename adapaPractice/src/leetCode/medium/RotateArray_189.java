package leetCode.medium;

public class RotateArray_189 {

	public static void rotate(int[] arr,int k) {
	
		reverse(arr, 0, arr.length-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, arr.length-1);
		
	}
	
	public static void reverse(int[] arr,int start,int end) {
		while(end>start) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(arr, k);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}

	}

}
/* 
 * The time complexity of this code is "O(n)" because it's useing only one while loop in the reverse method
 * The space complexity is "O(1)" because it's not using any extra data structure
 */ 
