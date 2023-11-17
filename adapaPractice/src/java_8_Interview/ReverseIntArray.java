package java_8_Interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntArray {

	public static void main(String[] args) {
		int[] nums = {11,22,33,44,55};
		
		int[] rev = IntStream.rangeClosed(1, nums.length).map(i -> nums[nums.length-i]).toArray();
		
		System.out.println(Arrays.toString(rev));

	}

}
