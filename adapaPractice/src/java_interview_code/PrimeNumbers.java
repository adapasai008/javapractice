package java_interview_code;

public class PrimeNumbers {

	public static void main(String[] args) {
		//The number which is divisible by itself and 1 is called the prime numbers;
		
		int num = 10;
		
		for(int i=0;i<num;i++) {
			
			boolean prime = true;
			if(i>1) {
				
				for(int j =2;j<i;j++) {//Here it will check weather the  "i" value can be divided with the any other value.
					
					if(i%j == 0) {
						prime = false;
					}
					
				}
				
			}else {
				prime = false;
			}
			if(prime) {//if prime = true it will print the i value;
				System.out.print(i+" ");
			}
			
		}
		
		
		
		


	}

}
