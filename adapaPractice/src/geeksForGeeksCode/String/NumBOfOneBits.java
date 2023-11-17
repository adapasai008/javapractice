package geeksForGeeksCode.String;

public class NumBOfOneBits {

	public static void main(String[] args) {
		int n = 34;
		int bits = 0;
		
		while(n>0) {
			bits += n&1;
			n >>= 1;
		}
		
		System.out.println(bits);

	}

}
