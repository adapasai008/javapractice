package geeksForGeeksCode;

import java.util.Arrays;
import java.util.Scanner;

class Solution1{
    
    public static boolean check(long A[],long B[],int N)
    {
        
    	Arrays.sort(A);
    	Arrays.sort(B);
   
    	return Arrays.equals(A, B);
    	
    }
}

public class ArraysEqual {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value to start");
		long t = sc.nextLong();
		
		while(t-->0) {
			System.out.println("Enter Array size");
			int n = sc.nextInt();
			long arr[] = new long[n];
			long brr[] = new long[n];
			System.out.println("Enter Array1 values");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextLong();
			}
			System.out.println("Enter Array2 values");
			for(int j=0;j<n;j++) {
				brr[j]=sc.nextLong();
			}
			Solution1 ob = new Solution1();
			System.out.println(Solution1.check(arr, brr, n)==true?"1":"0");
			
		}
		

	}

}
