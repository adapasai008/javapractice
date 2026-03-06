package leetCode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Partition_Labels_763 {

	public static List<Integer> partitionLabels(String s) {
		Map<Character, Integer> last = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			last.put(ch, i);
		}

		List<Integer> ans = new ArrayList<Integer>();
		int prev = -1;
		int max = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			max = Math.max(max, last.get(ch));

			if (max == i) {
				ans.add(max - prev);
				prev = max;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String s = "ababcbacadefegdehijhklij";
		System.out.println(partitionLabels(s));

	}

}
