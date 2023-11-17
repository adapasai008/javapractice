package geeksForGeeksCode.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UncommonCharacters {

	static String uncommon(String a, String b) {
		
		Map<Character, Integer> seen1 = new HashMap<>();
		Map<Character, Integer> seen2 = new HashMap<>();
		
		for(char c : a.toCharArray()) {
			seen1.put(c, seen1.getOrDefault(c, 0)+1);
		}
		
		for(char c : b.toCharArray()) {
			seen2.put(c, seen2.getOrDefault(c, 0)+1);
		}
		
		StringBuilder result = new StringBuilder();
		
		for(char c : seen1.keySet()) {
			if(!seen2.containsKey(c)) {
				result.append(c);
			}
		}
		
		for(char c : seen2.keySet()) {
			if(!seen1.containsKey(c)) {
				result.append(c);
			}
		}
		
		char[] uncommonCharsArray = result.toString().toCharArray();
        Arrays.sort(uncommonCharsArray);
        
        if(uncommonCharsArray.length <= 0){
            return "-1";
        }
        
        return new String(uncommonCharsArray);
		
	}
	
	public static void main(String[] args) {
		String a = "characters";
		String b = "alphabets";
		
		String result = uncommon(b, a);
		
		System.out.println(result);
		

	}

}
