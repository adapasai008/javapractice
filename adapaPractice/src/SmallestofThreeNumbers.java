import java.util.Scanner;

public class SmallestofThreeNumbers {

	public static void main(String[] args) {
		
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        // DONE 2: Applied logic to find the smallest number out of the three input numbers and printed it
        if (n1 < n2) {
            if (n1 < n3) {
                System.out.println(n1);
            }
            else {
               System.out.println(n3);
            }
        }
        else {
            if(n2 < n3) {
                System.out.println(n2);
            }
            else {
               System.out.println(n3);
            }
        }
	}

}
