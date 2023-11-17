package geeksForGeeksCode.String;

public class PerfectNumbers {

	public static void main(String[] args) {
		int num = 6;
		int total = 0;
		for (int i=1;i < Math.sqrt(num);i++) {
			if (num % i == 0) {
				total += i;
				if(i != num / i) {
					total += num / i;
				}	
			}
		}
		total -= num;

		if (num == total) {
			System.out.println(total + " num and total are equal 1");
		} else {
			System.out.println(total + " num and total are not equal 0");
		}

	}

}
