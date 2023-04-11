package geeksForGeeksCode;

import java.util.HashMap;

public class FirstElementToOccureKtimes {

	public static void main(String[] args) {

		int[] arr = { 1, 7, 4, 3, 4, 8, 7 };

		
		System.out.println(firstElementKtimes(arr));

	}

	private static int firstElementKtimes(int[] arr) {
		
		HashMap<Integer, Integer> first = new HashMap<Integer, Integer>();
		int k = 2;
		for(int i : arr) {
			if(first.containsKey(i)) {
				first.put(i, first.get(i)+1);
				if(first.get(i)==k) {
					return i;
				}
			}else {
				first.put(i, 1);
				if(first.get(i)==k) {
					return i;
				}
			}
		}
		return -1;
		

	}

}
