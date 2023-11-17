package geeksForGeeksCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class pair{
	long first;
	long second;
	
	public pair(long first, long second) {
		this.first = first;
		this.second = second;
	}
}

public class FindPairsOfSum {

	static pair[] allPairs(long[] arr1, long[] arr2,int num) {
		Set<Long> seen = new HashSet<Long>();
		ArrayList<pair> li = new ArrayList<pair>();
		
		for(long x : arr2) {
			seen.add(x);
		}
		Arrays.sort(arr1);
		for(long x : arr1){
			if(seen.contains(num-x)) {
				pair res = new pair(x, num-x);
				li.add(res);
			}
		}
		pair[] ans = new pair[li.size()];
		int j = 0;
		for(pair p : li) {
			ans[j++] = p;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		long[] arr1 = {1, 2, 4, 5, 7};
		long[] arr2 = {5, 6, 3, 4, 8};
		int num = 9;
		
		pair[] result = allPairs(arr1, arr2, num);
		
		for(pair n : result) {
			System.out.println(n.first+" "+n.second);
		}
		
	}

}
