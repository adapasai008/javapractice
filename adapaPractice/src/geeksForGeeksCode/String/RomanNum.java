package geeksForGeeksCode.String;

import java.util.HashMap;

public class RomanNum {

	static int romanToDecimal(String str) {
		HashMap<Character,Integer> values = new HashMap<Character, Integer>();
		values.put('I',1);
		values.put('V',5);
		values.put('X',10);
		values.put('L',50);
		values.put('C',100);
		values.put('D',500);
		values.put('M',1000);
		
		int result = 0;
		int prev = 0;
		
		for(int i=str.length()-1;i>=0;i--) {
			char ch = str.charAt(i);
			int curr = values.get(ch);
			
			if(curr >= prev) {
				result = result + curr;
			}else {
				result = result - curr;
			}
			prev = curr;
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str = "XVX";
		int value = romanToDecimal(str);
		System.out.println(value);
	}

}
