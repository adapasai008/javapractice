package starNumPatterns;

public class ZeroOneTriangle {

	public static void main(String[] args) {
		
		int num = 4;
		
		for(int i=1;i<=num;i++) {
			int value = i%2;
			
			for(int j=1;j<=i;j++) {
				System.out.print(value + " ");
				value = 1 - value;
			}
			System.out.println();
		}

	}

}
