package leetCode;

public class TwoSum {

	public static void main(String[] args) {
		
		//Here it should print the index values of the sum numbers in the given array.
		//Here is should print 1,2 because 4+5 = 9;
		
		int[] num = {3,4,5,2,3};
		int target = 9;
		
		for(int i =0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]+num[j] == target) {
					System.out.println(j+" "+i);
				}
			}
		}
	}
}
