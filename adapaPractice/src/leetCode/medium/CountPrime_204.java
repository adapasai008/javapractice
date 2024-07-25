package leetCode.medium;

public class CountPrime_204 {

	public static int countPrime(int num) {
		if(num <= 2) {
			return 0;
		}
		boolean[] check = new boolean[num+1];
		int count = 0;
		
		for(int i=2;i<=num;i++) {
			check[i] = true;
		}
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			
			if(check[i] == true) {
				
				for(int j=i*i;j<=num;j+=i) {
					check[j] = false;
				}
				
			}
			
		}
		
		for(int i=2;i<=num;i++) {
			if(check[i] == true) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int num = 10;
		
		int result = countPrime(num);
		
		System.out.println("Total Prime numbers count = "+result);

	}

}

/*To solve this problme I have used the Sieve of Eratosthenes algorithm
 *Time complexity of this code is O(n log log n)
 *Space complexity is O(n) because we are using the chek array to tract the value is ture or false*/
