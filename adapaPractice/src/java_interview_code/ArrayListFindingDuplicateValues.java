package java_interview_code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListFindingDuplicateValues {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(11,23,44,55,11,44,64);
		
		//To remove duplicate values form the ArrayList
		/*Set<Integer> set1 = new HashSet<Integer>(list);
		set1.stream().sorted().forEach(i->System.out.print(i+" "));*/
		
		//To find only the duplicate values from the ArrayList
	/*	Set<Integer> set = new HashSet<Integer>();
		for(int i:list) {
			if(set.add(i)==false) {
				System.out.print(i+" ");
			}
		}*/
		
		//To find duplicate values using Java 8 Streams
		/*
		Set<Integer> set2 = new HashSet<Integer>();
		list.stream().filter(i->!set2.add(i)).forEach(i->System.out.print(i+" "));
		*/
		
		//To Remove duplicate values using Java 8 Streams
		/*Set<Integer> set3 = new HashSet<Integer>(list);
		set3.stream().sorted().forEach(i->System.out.print(i+" "));*/
		
	}

}
