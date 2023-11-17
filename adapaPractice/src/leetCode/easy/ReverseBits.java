package leetCode.easy;

public class ReverseBits {

	public static void main(String[] args) {
		
		int num = 43261596;
		
		int rev = 0;
		
		for(int i=0;i<32;i++) {
			rev <<= 1;
			
			rev += num & 1;
			
			num >>= 1;
		}
		
		System.out.println(rev);
		
	}

}
