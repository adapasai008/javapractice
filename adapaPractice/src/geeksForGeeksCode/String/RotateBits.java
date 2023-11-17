package geeksForGeeksCode.String;

import java.util.ArrayList;

public class RotateBits {

	static ArrayList<Integer> rotate(int num,int r){
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		result.add((num << r) | num >> (16-r));
		result.add((num >> r) | num << (16-r));	
		
		return result;
	}
	
	public static void main(String[] args) {
		int num = 10;
		int r = 8;
		ArrayList<Integer> val = rotate(num, r);
		
		val.stream().forEach(i -> System.out.print(i+" "));

	}

}
