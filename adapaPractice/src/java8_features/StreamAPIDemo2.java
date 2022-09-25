package java8_features;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo2 {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(20,8,12,4,36,2,9);
		
		//Without using streamAPI
		System.out.println("Grater than 10");
		for(int i : num) {
			
			if(i > 10) {
				
				System.out.println(i);
			}
		}
		//WitH using streamAPI
		System.out.println("Lesser than 10");
		
		List<Integer> num2 = num.stream().filter(n->(n<10)).toList();
		
		num2.forEach(i->System.out.println(i));

		System.out.println("All values.........");
		num.forEach(i->System.out.println(i));
		
		System.out.println(num.toString());
	}

}
