package leetCode.easy;

public class PowerOfThree {

	public static void main(String[] args) {
		
		int n = 27;
		
		while(n % 3 ==0) {
			n /= 3;
		}
		
		System.out.println(n == 1);

	}

}
