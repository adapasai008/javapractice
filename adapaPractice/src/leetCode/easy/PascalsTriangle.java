package leetCode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
	
		int num = 4;
		
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		
		List<Integer> firstRow = new ArrayList<Integer>();
		firstRow.add(1);
		triangle.add(firstRow);
		
		for(int i=1;i<num;i++) {
			List<Integer> preRow = triangle.get(i-1);
			List<Integer> currentRow = new ArrayList<>();
			
			currentRow.add(1);
			
			for(int j=1;j<i;j++) {
				int sum = preRow.get(j-1) + preRow.get(j);
				currentRow.add(sum);
			}
			currentRow.add(1);
			triangle.add(currentRow);
		}
		
		
		triangle.stream().forEach(i -> System.out.println(i));
		
		
		
	}
}
