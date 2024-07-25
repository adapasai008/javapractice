package leetCode.easy;

import java.util.HashMap;

public class IsomorphicStrings_205 {

	public static boolean isIsomorphic(String s, String t) {

		if(s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Character> scheck = new HashMap<Character, Character>();
		HashMap<Character, Character> tcheck = new HashMap<Character, Character>();
		
		for(int i=0;i<s.length();i++) {
			char sch = s.charAt(i);
			char tch = t.charAt(i);
			
			if(scheck.containsKey(sch)) {
				if(scheck.get(sch) != tch) {
					return false;
				}
			}else {
				scheck.put(sch, tch);
			}
			
			if(tcheck.containsKey(tch)) {
				if(tcheck.get(tch) != sch) {
					return false;
				}
			}else {
				tcheck.put(tch, sch);
			}
		}
		return true;
		
	}

	public static void main(String[] args) {

		String s = "egg";
		String t = "add";

		boolean result = isIsomorphic(s, t);

		System.out.println(result);

	}

}
/* boht space and time complexity of this code is O(n) it's using only one for loope and the constant space
 * here it's storing the both strings as the key value in two hashmap and it's checking weather the key value pairs
   are mapped correctly or not (https://www.youtube.com/watch?v=6Qkail843d8&ab_channel=Pepcoding) refer this */
