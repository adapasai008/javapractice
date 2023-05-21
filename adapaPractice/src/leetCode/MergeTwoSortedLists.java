package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		
		//merging two sorted lists
		
		List<Integer> list1 = Arrays.asList(2,4,7,3);
		List<Integer> list2 = Arrays.asList(1,5,9,6,8);
		
		List<Integer> sortList1 = list1.stream().sorted().collect(Collectors.toList());
		List<Integer> sortList2 = list2.stream().sorted().collect(Collectors.toList());
		
		System.out.println("List : "+sortList1);
		System.out.println("List : "+sortList2);
		
		List<Integer> mergedList = new ArrayList<>();
		
		int i = 0;//pointer of l1
		int j = 0;//pointer of l2
		
		while(i<sortList1.size() && j<sortList2.size()) {
			if(sortList1.get(i)<=sortList2.get(j)) {
				mergedList.add(sortList1.get(i));
				i++;
			}else {
				mergedList.add(sortList2.get(j));
				j++;
			}
		}
		
		while(i<sortList1.size()) {
			mergedList.add(sortList1.get(i));
			i++;
		}
		while(j<sortList2.size()) {
			mergedList.add(sortList2.get(j));
			j++;
		}
		
		System.out.println("Merged List "+mergedList);
		
	}
	
}
