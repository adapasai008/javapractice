package java_interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dummy {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(2,4,3,6,8,4);
		num.stream().sorted().forEach(i ->System.out.print(i+" "));
		
		System.out.println();
		
		//Another way of sorting and printing the ArrayList.
		Collections.sort(num);
//		for(int one:num) {
//			System.out.print(one+" ");
//		}
		//print values in reverse order 
		for(int i=num.size()-1;i>=0;i--) {
			
			System.out.print(num.get(i)+" ");
		}
		
		
	}

}
