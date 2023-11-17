package leetCode.easy;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] num = {0,1};
		Arrays.sort(num);
		
		int missing = num.length;
		
		for(int i=0;i<=num.length-1;i++) {
			if(num[i] != i) {
				missing = i;
				break;
			}
		}
		System.out.println(missing);

	}

}
