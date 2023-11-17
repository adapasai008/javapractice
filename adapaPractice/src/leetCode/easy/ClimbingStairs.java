package leetCode.easy;

public class ClimbingStairs {

	public static void main(String[] args) {
	
		//given stairs can be climbed in two ways 1 step or 2 steps at a time.
		//should find how many possible ways to climb the given stairs
		
		int stairs = 3;
		
		int[] nways = new int[stairs+1];
		     nways[1] = 1;
		     nways[2] = 2;
 		
		for(int i=3;i<=stairs;i++) {
			nways[i] = nways[i-1] + nways[i-2];
		}
		
		System.out.println(nways[stairs]);
		
	
		
		
		
		
	}
}
