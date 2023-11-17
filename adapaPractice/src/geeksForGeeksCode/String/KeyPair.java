package geeksForGeeksCode.String;

import java.util.HashSet;

public class KeyPair {

	public static void main(String[] args) {
		int[] num = { 2, 4, 6, 4, 9 };
		int value = 8;
		boolean isPresent = false;

//using hashset is the better optimized code and it's provides the less time complaxity.
		HashSet<Integer> seen = new HashSet<Integer>();
		
		for(int i=0;i<num.length;i++) {
			int target = value - num[i];
			
			if(seen.contains(target)) {
				isPresent = true;
			}
			seen.add(num[i]);
		}
		
		System.out.println(isPresent);
		
//    solution using the for loop and it's not that optimized		
//		for (int i = 0; i < num.length; i++) {
//			for (int j = i + 1; j < num.length; j++) {
//				if (num[i] + num[j] == value) {
//					System.out.println(i + " " + j);
//					break;
//				}
//			}
//		}

	}

}
