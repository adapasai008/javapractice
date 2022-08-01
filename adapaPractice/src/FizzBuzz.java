import java.util.Scanner;

public class FizzBuzz {

	
    public static void fizzBuzz(int[] numbers) {
        // write your code here
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%3==0 && numbers[i]%5!=0 ){
                System.out.print("Fizz"+" ");
            }
            else if(numbers[i]%3!=0 && numbers[i]%5==0){
                System.out.print("Buzz"+" ");
            }
            else if(numbers[i]%3==0 && numbers[i]%5==0){
                System.out.print("FizzBuzz"+" ");
            }
            else if(numbers[i]%3!=0 && numbers[i]%5!=0){
                System.out.print(numbers[i]+" ");
            }

        }
    }
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        fizzBuzz(numbers);
		
	}

}
