import java.util.Scanner;

public class CountDigitsinNumber {

	public static void main(String[] args) {
	
        // TODO 1: Get the number as input from the user
        int count=0;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        // TODO 2: Apply logic to count the number of digits in the input number
        while(num>0){
            int lastDigit = num%10;
            count++;
            num = num/10;
            
        }
        
        // TODO 3: Print the desired output
        System.out.println(count);
	}

}
