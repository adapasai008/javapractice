package leetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {


	public static int romanToInt(String str) {
		
		int result = 0;
		
		Map<Character, Integer> roman = new HashMap<Character, Integer>();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
		
		int previous = 0;
		
		for(int i=str.length()-1;i>=0;i--) {
			int current = roman.get(str.charAt(i));
			
			if(current >= previous) {
				result += current;
			}else {
				result -= current;
			}
			previous = current;
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str = "IXX";
		int values = romanToInt(str);
		System.out.println(values);
	}

}
