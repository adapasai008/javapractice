package leetCode.medium;

import java.util.Arrays;

public class PrintPrimes_204 {
	
	public static int[] primeCount(int num) {
		
		int[] result = new int[num+1];
		
		if(num <= 2) {
			return new int[0];
		}
		
		int count = 0;
		
		boolean[] check = new boolean[num+1];
		
		for(int i=2;i<=num;i++) {
			check[i] = true;
		}
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			
			if(check[i] == true) {
				
				for(int j=i*i;j<=num;j+=i) {
					check[j] = false; 
				}
			}
		}
		
		for(int i=2;i<num;i++) {
			if(check[i]) {
				result[count++] = i;
			}
		}
		return Arrays.copyOf(result, count);
	}

	public static void main(String[] args) {
		int num = 10;
		
		int[] result = primeCount(num);
		int len = result.length;
		
		System.out.println(Arrays.toString(result));
		System.out.println("len = "+ len);
		

	}

}
