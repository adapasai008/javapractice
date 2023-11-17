package leetCode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		
		//should convert Roman values into numbers.
		//Here it should print 19.
		
		Map<Character, Integer> values = new HashMap<Character, Integer>();
		values.put('I',1);
		values.put('V',5);
		values.put('X',10);
		values.put('L',50);
		values.put('C',100);
		values.put('D',500);
		values.put('M',1000);
		
		String s = "IXX";
		int result = 0;
		int previousValue = 0;
		
		
		for(int i=s.length()-1;i>=0;i--) {
			char roman = s.charAt(i);
			int currentValue = values.get(roman);
			
			if(currentValue >= previousValue) {
				result +=currentValue;
			}else {
				result-=currentValue;
			}
			previousValue = currentValue;
		}
		
		System.out.println(result);
	}

}
