package geeksForGeeksCode.Arrays;

import java.util.HashMap;

public class LargestSubarrayZero {
	
	static int subArry(int[] arr) {
        int maxLength = 0;
        int sum = 0;
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++) {
        	sum = sum + arr[i];
        	
        	if(map.containsKey(sum)) {
        		int len = i - map.get(sum);
        		maxLength = Math.max(maxLength, len);
        	}else {
        		map.put(sum, i);
        	}
        	
        }

        return maxLength;
	}
	
	public static void main(String[] args) {
		int[] arr = {15,-2,2,-8,1,7,10,23};
		
		int result = subArry(arr);
		
		System.out.println(result);

	}

}
