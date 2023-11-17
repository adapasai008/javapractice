package geeksForGeeksCode.Arrays;

import java.util.HashMap;

public class ArraySubset {
	
	static String isSubset(long[] arr1,long[] arr2) {
		HashMap<Long, Integer> seen = new HashMap<Long, Integer>();
		
		for(long l : arr1) {//Inserting all the values into the hashmap along wiht the frequesncies
			if(seen.containsKey(l)) {
				seen.put(l, seen.get(l)+1);
			}else {
				seen.put(l, 1);
			}
		}
		
		for(long ln : arr2) {
			if(seen.containsKey(ln)) {//checking weather the values is present or not.
				if(seen.get(ln) == 1) {//removing the value it the frequency is 1;
					seen.remove(ln);
				}else {//here decreasing the frequency if it's grater than 1 
					seen.put(ln, seen.get(ln)-1);
				}
			}else {//returing NO if the value is not present in the map
				return "No";
			}
		}
		return "Yes";
		
	}

	public static void main(String[] args) {
		long[] arr1 = {11, 7, 1, 13, 21, 3, 7, 3};
		long[] arr2 = {11, 3, 7, 1, 7};
		
		String isSub = isSubset(arr1, arr2);
		
		System.out.println(isSub);
	}

}
