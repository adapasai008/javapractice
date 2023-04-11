package HackerRank;

public class Loop2 {

	public static void main(String[] args) {
		
		//Java Loop II
		//inputs a=0, b=2, n-10;
		//OutPut  2 6 14 30 62 126 254 510 1022 2046
		
		int a = 0;
		int b = 2;
		int n = 10;
		
		for(int i=0;i<n;i++) {
			a = a+b;
			System.out.print(" "+a);
			b=b*2;
		}

	}

}
