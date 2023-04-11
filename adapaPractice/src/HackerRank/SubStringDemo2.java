package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class SubStringDemo2 {

	public static void main(String[] args) {
		
		//wel,elc,lco,com,ome,met,toj,ava
		
		String str = "welcometojava";
		List<String> newStr = new ArrayList<String>();
		
		for(int i=0;i<=str.length()-3;i++) {
			
			String str1 = str.substring(i,i+3);
			newStr.add(str1);
			System.out.print(str1+" ");
		}
		System.out.println();
		
//		Collections.sort(newStr);
		
		List<String> newStr1 = newStr.stream().sorted().toList();
		
		String first = newStr1.get(0);
		String last = newStr1.get(newStr1.size()-1);
		
		System.out.println("first : "+first);
		System.out.println("last : "+last);

	}

}
