package leetCode.easy;

public class NumOf1Bit {

	public static void main(String[] args) {
		
		int num = 5;
		
		int bitNum = 0;
		
		for(int i=0;i<32;i++) {
			bitNum += num & 1;
			num >>=1;
		}
		
		System.out.println(bitNum);

	}

}
