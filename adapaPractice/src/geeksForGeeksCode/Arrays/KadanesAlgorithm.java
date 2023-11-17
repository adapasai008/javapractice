package geeksForGeeksCode.Arrays;

public class KadanesAlgorithm {

	static long maxSum(int[] arr) {
		
		long curr = 0; 
		long max = Long.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			curr = curr + arr[i];
			
			if(curr > max) {
				max = curr;
			}
			if(curr < 0) {
				curr = 0;
			}
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,-2,5};
		long result = maxSum(arr);
		
		System.out.println(result);
				

	}

}
