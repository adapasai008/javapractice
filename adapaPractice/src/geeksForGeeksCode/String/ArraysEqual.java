package geeksForGeeksCode.String;

import java.util.Arrays;
import java.util.Scanner;

class Solution1{
    
    public static boolean check(long A[],long B[])
    {
        
    	Arrays.sort(A);
    	Arrays.sort(B);
   
    	return Arrays.equals(A, B);
    	
    }
}

public class ArraysEqual {

	public static void main(String[] args) {
		long[] A = {1,2,3,4,5};
		long[] B = {1,4,3,2,5};
		
		boolean result = Solution1.check(A, B);
		System.out.println(result);

	}

}
