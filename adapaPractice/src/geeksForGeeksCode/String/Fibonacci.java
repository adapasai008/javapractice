package geeksForGeeksCode.String;

public class Fibonacci {

	public static void main(String[] args) {
		int num = 5;//should print 1,1,2,3,5
		int[] result = new int[num];
 		int first = 0;
		int second = 1;
		
		for(int i=0;i<num;i++) {
			if(i > 0) {
				int next = first + second;
				first = second;
				second = next;
				result[i] = second;
			}else {
				result[i] = second;
			}

		}

		for(int n : result) {
			System.out.print(n+" ");
		}
		
		
		
	}

}
