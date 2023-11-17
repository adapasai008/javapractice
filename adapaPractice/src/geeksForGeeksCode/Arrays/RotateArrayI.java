package geeksForGeeksCode.Arrays;

public class RotateArrayI {

	static void rotate(int[] arr) {
		int last = arr[arr.length-1];
		
		for(int i=arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];//shifting right by one position
		}
		arr[0] = last;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		rotate(arr);
		
		for(int n : arr) {
			System.out.print(n+" ");
		}

	}

}
