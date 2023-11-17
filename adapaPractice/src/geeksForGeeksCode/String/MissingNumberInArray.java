package geeksForGeeksCode.String;

public class MissingNumberInArray {

	public static int missingNum(int[] arr,int n) {
		int xor = 0;
		
		int xorFrom = 0;
		
		for(int i=1;i<=n;i++) {
			xorFrom = xorFrom ^ i;
		}
		
		for(int i=0;i<n-1;i++) {
			xor = xor ^ arr[i];
		}
		return (xor^xorFrom);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,4,3,5};
		int n = 5;
		
		System.out.println(missingNum(arr, n));

	}

}
