package leetCode.easy;

import java.util.HashSet;

class Solution{
	
	public static boolean isHappy(int n) {
		HashSet<Integer> seen = new HashSet<Integer>();
		
		while(n != 1 && !seen.contains(n)) {
			seen.add(n);
			
			n = getNumber(n);
		}
		
		return n == 1;
		
	}
	
	
	private static int getNumber(int n) {
		int sum = 0;
		
		while(n > 0) {
			int digit = n % 10;
			
			sum += digit * digit;
			
			n /= 10;
		}
		
		return sum;
	}
	
}

public class HappyNumber {

	public static void main(String[] args) {
		
		int num = 44;
		
		boolean result = Solution.isHappy(num);
		
		System.out.println(result);
			

	}

}
